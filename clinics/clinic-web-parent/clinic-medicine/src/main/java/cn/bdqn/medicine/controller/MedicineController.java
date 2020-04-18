package cn.bdqn.medicine.controller;

import cn.bdqn.medicine.pojo.HisMedicine;
import cn.bdqn.medicine.pojo.HisMedicineType;
import cn.bdqn.medicine.service.HisMedicineService;
import cn.bdqn.medicine.service.HisMedicineTypeService;
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
@Slf4j
@RequestMapping("/api/medicines")
public class MedicineController {

    @Resource
    private HisMedicineService hisMedicineService;
    @Resource
    private HisMedicineTypeService hisMedicineTypeService;


    @ApiOperation(value = "调用药品api，分页查询药品列表", response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码,", name = "pageIndex"),
            @ApiImplicitParam(value = "显示数,", name = "pageSize"),
            @ApiImplicitParam(value = "药品类型ID", name = "typeId"),
            @ApiImplicitParam(value = "药品名称模糊查询", name = "name")
    })
    @RequestMapping(value = "/finbymedicine", method = {RequestMethod.GET, RequestMethod.POST})
    public Response finMedicineAll(Integer pageIndex, Integer pageSize, Integer typeId, String name) {
        List<HisMedicine> list = null;
        try {
            if (!EmptyUtil.isEmpty(pageIndex)) {
                pageSize = EmptyUtil.isEmpty(pageSize) ? 2 : pageSize;
                PageHelper.startPage(pageIndex, pageSize);
                list = hisMedicineService.finHisMedicineTypeAndMedicenName(typeId, name);
                PageInfo<HisMedicine> hisInspectPageInfo = new PageInfo<>(list);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(hisInspectPageInfo);
            } else {
                list = hisMedicineService.finHisMedicineTypeAndMedicenName(typeId, name);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询药品分页api失败！:" + e.getMessage());
        }
    }

    @ApiOperation(value = "按id药品查询", response = Response.class)
    @ApiImplicitParam(value = "药品id，必填", name = "id", required = true)
    @GetMapping("/medicinename")
    public Response finMedicineNames(Integer id) {
        HisMedicine hisMedicine = null;
        try {
            hisMedicine = hisMedicineService.selectByPrimaryKey(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询药品api失败！");
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(hisMedicine);
    }

    @ApiOperation(value = "药品类型Aip", response = Response.class)
    @GetMapping("/mdicinetype")
    public Response getMedicineType() {
        List<HisMedicineType> hisMedicineTypes = null;
        try {
            hisMedicineTypes = hisMedicineTypeService.finHisMedicineType();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询药品类型api失败！");
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(hisMedicineTypes);
    }

}
