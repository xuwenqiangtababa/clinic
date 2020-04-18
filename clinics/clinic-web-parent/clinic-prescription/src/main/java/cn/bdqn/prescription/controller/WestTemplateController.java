package cn.bdqn.prescription.controller;

import cn.bdqn.prescription.pojo.RecipeWestDrug;
import cn.bdqn.prescription.pojo.RecipeWestTemplate;
import cn.bdqn.prescription.pojo.RecipeWestTemplateDetails;
import cn.bdqn.prescription.service.RecipeWestDrugService;
import cn.bdqn.prescription.service.RecipeWestTemplateDetailsService;
import cn.bdqn.prescription.service.RecipeWestTemplateService;
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
@RequestMapping("/api/west")
public class WestTemplateController {
    @Resource
    private RecipeWestTemplateService recipeWestTemplateService;
    @Resource
    private RecipeWestTemplateDetailsService recipeWestTemplateDetailsService;
    @Resource
    private RecipeWestDrugService recipeWestDrugService;

    @ApiOperation(value = "查询西药处方模板", response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "pageIndex"),
            @ApiImplicitParam(value = "显示数", name = "pageSize"),
            @ApiImplicitParam(value = "检查项目处方类型id查找", name = "recipType"),
            @ApiImplicitParam(value = "检查项目处方编号查找", name = "recipeNumber"),
            @ApiImplicitParam(value = "检查项目处方名称查找", name = "recipeName"),
            @ApiImplicitParam(value = "模板所用查找", name = "jurisdiction"),
    })
    @GetMapping("/west")
    public Response getInsperctPage(Integer pageIndex, Integer pageSize, Integer recipType,
                                    String recipeNumber, String recipeName, String jurisdiction) {
        List<RecipeWestTemplate> recipeInspectTemplates = null;
        try {
            if (!EmptyUtil.isEmpty(pageIndex)) {
                pageSize = EmptyUtil.isEmpty(pageSize) ? 2 : pageSize;
                PageHelper.startPage(pageIndex, pageSize);
                recipeInspectTemplates = recipeWestTemplateService.finRecipeWestTemplateAll(recipType, jurisdiction, recipeNumber, recipeName);
                PageInfo<RecipeWestTemplate> recipeInspectTemplatePageInfo = new PageInfo<>(recipeInspectTemplates);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(recipeInspectTemplatePageInfo);
            } else {
                recipeInspectTemplates = recipeWestTemplateService.finRecipeWestTemplateAll(recipType, jurisdiction, recipeNumber, recipeName);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(recipeInspectTemplates);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目模板失败！");
        }
    }

    @ApiOperation(value = "按西药模板id类型查询详细信息")
    @ApiImplicitParam(value = "按查询西药模板id查询,必填", name = "recipTypeId", required = true)
    @GetMapping("/westid/{recipTypeId}")
    public Response getInsperctTypeMedicine(@PathVariable Integer recipTypeId) {
        List<RecipeWestTemplateDetails> templateDetails = null;
        try {
            templateDetails = recipeWestTemplateDetailsService.finRecipeWestTemplateDetailsPage(recipTypeId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目模板详细信息失败！");
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(templateDetails);
    }

    @ApiOperation(value = "添加西药模板信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeWestTemplate对象参数传递", name = "recipeWestTemplate")
    @PostMapping("/saveWestTemplate")
    public Response saveWestTemplate(RecipeWestTemplate recipeWestTemplate) {
        int insert = 0;
        try {
            insert = recipeWestTemplateService.insert(recipeWestTemplate);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加西药模板信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加西药模板信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加西药模板信息失败！");
    }

    @ApiOperation(value = "添加西药模板详细信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeWestTemplateDetails对象参数传递", name = "recipeWestTemplateDetails")
    @PostMapping("/saveWestTemplateDetails")
    public Response saveWestTemplateDetails(RecipeWestTemplateDetails recipeWestTemplateDetails) {
        int insert = 0;
        try {
            insert = recipeWestTemplateDetailsService.insert(recipeWestTemplateDetails);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加西药模板详细信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加西药模板详细信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加西药模板详细信息失败！");
    }

    @ApiOperation(value = "添加西药信息API", response = Response.class)
    @ApiImplicitParam(value = "recipeWestDrug对象参数传递", name = "recipeWestDrug")
    @PostMapping("/saveWestTDrug")
    public Response saveWestTDrug(RecipeWestDrug recipeWestDrug) {
        int insert = 0;
        try {
            insert = recipeWestDrugService.insert(recipeWestDrug);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加西药信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加西药信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加西药信息失败！");
    }
}
