package cn.bdqn.prescription.controller;

import cn.clinic.http.HttpClientHelper;
import cn.clinic.response.Response;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api调用demo
 * @author Administrator
 *
 */
@Api
@RestController
public class TestController {
	@Value("${server.medicine.url}")
	private String serverMedicineUrl;
	@Autowired
	private HttpClientHelper httpClientHelper;
	
	@GetMapping("api/medicine/users")
	public Response getUsers() {
		Response response = httpClientHelper.get(serverMedicineUrl + "/api/medicine/users");
		return response;
	}
}
