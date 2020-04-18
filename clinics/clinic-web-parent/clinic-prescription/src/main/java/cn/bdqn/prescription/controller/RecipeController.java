package cn.bdqn.prescription.controller;

import cn.bdqn.prescription.pojo.Recipe;
import cn.bdqn.prescription.service.RecipeService;
import cn.clinic.http.HttpClientHelper;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * api调用demo
 *
 * @author Administrator
 */
@Api
@RestController
public class RecipeController {
    @Value("${server.medicine.url}")
    private String serverMedicineUrl;

    @Value("${server.masterdata.url}")
    private String serverMasterdataUrl;

    @Autowired
    private HttpClientHelper httpClientHelper;

    @Resource
    private RecipeService recipeService;

    @ApiOperation(value = "添加处方关联表信息API", response = Response.class)
    @ApiImplicitParam(value = "recipe对象参数传递", name = "recipe")
    @PostMapping("/saveRecipe")
    public Response saveRecipe(Recipe recipe) {
        int insert = 0;
        try {
            insert = recipeService.insert(recipe);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加处方关联表信息成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.SUCCESS).setResponseBody("添加处方关联表信息失败！" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody("添加处方关联表信息失败！");
    }

//	@GetMapping("api/masterdata/users")
//	public Response getMasterdataUsers() {
//		return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/masterdata/users");
//	}
//	@GetMapping("api/medicine/users")
//	public Response getUsers() {
//		Response response = httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicine/users");
//		return response;
//	}
}
