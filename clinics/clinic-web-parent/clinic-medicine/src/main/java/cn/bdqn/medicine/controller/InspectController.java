package cn.bdqn.medicine.controller;

import cn.bdqn.medicine.pojo.HisInspect;
import cn.bdqn.medicine.pojo.HisInspectType;
import cn.bdqn.medicine.service.HisInspectService;
import cn.bdqn.medicine.service.HisInspectTypeService;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import cn.clinic.util.EmptyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api
@RestController
@RequestMapping("/api/inspect")
@Slf4j
public class InspectController {
    @Resource
    private HisInspectService hisInspectService;

    @Resource
    private HisInspectTypeService hisInspectTypeService;

    @ApiOperation(value = "检查项目API", response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "当前页", name = "pageIndex"),
            @ApiImplicitParam(value = "显示数", name = "pageSize"),
            @ApiImplicitParam(value = "按名称查询", name = "name"),
            @ApiImplicitParam(value = "按类型查询", name = "typeId")
    })
    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public Response getInspect(Integer pageIndex, Integer pageSize, String name, Integer typeId) {
        List<HisInspect> hisInspects = null;
        try {
            if (!EmptyUtil.isEmpty(pageIndex)) {
                pageSize = pageSize == null || pageSize.equals("") ? 2 : pageSize;
                PageHelper.startPage(pageIndex, pageSize);
                hisInspects = hisInspectService.finHisInspect(name, typeId);
                PageInfo<HisInspect> hisInspectPageInfo = new PageInfo<>(hisInspects);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(hisInspectPageInfo);
            } else {
                hisInspects = hisInspectService.finHisInspect(name, typeId);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(hisInspects);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目分页api失败！:" + e.getMessage());
        }

    }

    @ApiOperation(value = "检查项目类型名称Api", response = Response.class)
    @GetMapping("/typename")
    public Response getInspectTypeName() {
        List<HisInspectType> hisInspectTypes = null;
        try {
            hisInspectTypes = hisInspectTypeService.finInspectType();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询检查项目类型名称api失败！:" + e.getMessage());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(hisInspectTypes);
    }
}
