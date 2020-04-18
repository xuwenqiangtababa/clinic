package cn.bdqn.master.controller;

import cn.bdqn.master.pojo.ClinicDoctor;
import cn.bdqn.master.service.ClinicDoctorService;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/doctor")
public class ClinicDoctorController {
    @Autowired
    private ClinicDoctorService clinicDoctorService;

    @ApiOperation(value = "查询员工Api", response = Response.class)
    @GetMapping("/index")
    public Response getDoctor() {
        List<ClinicDoctor> clinicDoctors = null;
        try {
            clinicDoctors = clinicDoctorService.finClinicDoctor();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("调用员工api接口失败：" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(clinicDoctors);
    }
}
