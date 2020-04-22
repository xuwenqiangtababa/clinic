package cn.bdqn.master.controller;


import cn.bdqn.master.pojo.Patient;
import cn.bdqn.master.service.PatientService;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import cn.clinic.util.EmptyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * api接口
 *
 * @author Administrator
 */
@Api
@RestController
@RequestMapping("/api/masterdata")
public class UserController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/user")
    public Authentication getUser(Authentication user) {
        return user;
    }

    @ApiOperation(value = "患者分页Api", response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "姓名", name = "name"),
            @ApiImplicitParam(value = "电话", name = "phone"),
            @ApiImplicitParam(value = "当前页，必填", name = "pageIndex", required = true),
            @ApiImplicitParam(value = "显示书，必填", name = "pageSize", required = true),
    })
    @GetMapping("/users")
    public Response getPage(String name, String phone, Integer pageIndex, Integer pageSize) {
        List<Patient> patients = null;
        try {
            if (!EmptyUtil.isEmpty(pageIndex)) {
                pageSize = EmptyUtil.isEmpty(pageSize) ? 2 : pageSize;
                PageHelper.startPage(pageIndex, pageSize);
                patients = patientService.finPatienAll(name, phone);
                PageInfo<Patient> patientPageInfo = new PageInfo<>(patients);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(patientPageInfo);
            } else {
                patients = patientService.finPatienAll(name, phone);
                return new Response(ResponseEnum.SUCCESS).setResponseBody(patients);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("调用患者分页Api接口失败：" + e.getMessage().toString());
        }
    }

    @ApiOperation(value = "患者信息Api", response = Response.class)
    @ApiImplicitParam(value = "患者id,必填", name = "id")
    @GetMapping("/user/{id}")
    public Response getUser(@PathVariable Integer id) {
        Patient patient = null;
        try {
            patient = patientService.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("调用患者信息Api接口失败：" + e.getMessage());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(patient);
    }
}
