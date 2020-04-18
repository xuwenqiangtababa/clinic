package cn.bdqn.prescription.controller;

import cn.bdqn.prescription.pojo.RecipeInspectDrug;
import cn.bdqn.prescription.pojo.RecipeInspectTemplate;
import cn.bdqn.prescription.pojo.RecipeInspectTemplateDetails;
import cn.bdqn.prescription.service.RecipeInspectDrugService;
import cn.bdqn.prescription.service.RecipeInspectTemplateDetailsService;
import cn.bdqn.prescription.service.RecipeInspectTemplateService;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import cn.clinic.util.EmptyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api
@RestController
@RequestMapping("/api/insperct")
public class InsperctTemplateController {
    @Resource
    private RecipeInspectTemplateService recipeInspectTemplateService;

    @Resource
    private RecipeInspectTemplateDetailsService recipeInspectTemplateDetailsService;

    @Resource
    private RecipeInspectDrugService recipeInspectDrugService;

    @ApiOperation(value = "查询检查项目处方模板", response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "pageIndex"),
            @ApiImplicitParam(value = "显示数", name = "pageSize"),
            @ApiImplicitParam(value = "检查项目处方类型id查找", name = "recipType"),
            @ApiImplicitParam(value = "检查项目处方编号查找", name = "recipeNumber"),
            @ApiImplicitParam(value = "检查项目处方名称查找", name = "recipeName"),
            @ApiImplicitParam(value = "模板所用查找", name = "jurisdiction"),
    })
    @GetMapping("/insperc")
    public Response getInsperctPage(Integer pageIndex, Integer pageSize, Integer recipType,
                                    String recipeNumber, String recipeName, String jurisdiction) {
        List<RecipeInspectTemplate> recipeInspectTemplates = null;
        try {
            if (!EmptyUtil.isEmpty(pageIndex)) {
                pageSize = EmptyUtil.isEmpty(pageSize) ? 2 : pageSize;
                PageHelper.startPage(pageIndex, pageSize);
                recipeInspectTemplates = recipeInspectTemplateService.finRecipeInspectTemplateAll(recipType, jurisdiction, recipeNumber, recipeName);
                PageInfo<RecipeInspectTemplate> recipeInspectTemplatePageInfo = new PageInfo<>(recipeInspectTemplates);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(recipeInspectTemplatePageInfo);
            } else {
                recipeInspectTemplates = recipeInspectTemplateService.finRecipeInspectTemplateAll(recipType, jurisdiction, recipeNumber, recipeName);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(recipeInspectTemplates);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目模板失败！");
        }
    }

    @ApiOperation(value = "按检查项目模板id查询详细信息")
    @ApiImplicitParam(value = "按检查项目模板id查询,必填", name = "recipTypeId", required = true)
    @GetMapping("/Medicine/{recipTypeId}")
    public Response getInsperctTypeMedicine(@PathVariable Integer recipTypeId) {
        List<RecipeInspectTemplateDetails> templateDetails = null;
        try {
            templateDetails = recipeInspectTemplateDetailsService.finRecipeInspectTemplateDetailsAndInspet(recipTypeId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目模板详细信息失败！");
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(templateDetails);
    }

    @ApiOperation(value = "添加检查项目模板信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeInspectTemplate对象参数传递", name = "recipeInspectTemplate")
    @PostMapping("/saveInsperctTemplate")
    public Response saveInsperctTemplate(RecipeInspectTemplate recipeInspectTemplate) {
        int insert = 0;
        try {
            insert = recipeInspectTemplateService.insert(recipeInspectTemplate);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("保存检查项目模板信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目模板信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目模板信息失败！");
    }


    @ApiOperation(value = "添加检查项目模板详细信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeInspectTemplateDetails对象参数传递", name = "recipeInspectTemplateDetails")
    @PostMapping("/saveInsperctTemplateDetails")
    public Response saveInsperctTemplateDetails(RecipeInspectTemplateDetails recipeInspectTemplateDetails) {
        int insert = 0;
        try {
            insert = recipeInspectTemplateDetailsService.insert(recipeInspectTemplateDetails);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("保存检查项目模板详细信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目模板详细信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目详细模板信息失败！");
    }

    @ApiOperation(value = "添加检查项目信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeInspectDrug对象参数传递", name = "recipeInspectDrug")
    @PostMapping("/saveInsperctDrug")
    public Response saveInsperctDrug(RecipeInspectDrug recipeInspectDrug) {
        int insert = 0;
        try {
            insert = recipeInspectDrugService.insert(recipeInspectDrug);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("保存检查项目信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("保存检查项目信息失败！");
    }
}
