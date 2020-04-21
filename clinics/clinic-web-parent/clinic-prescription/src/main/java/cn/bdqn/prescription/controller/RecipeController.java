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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * api调用demo
 *
 * @author Administrator
 */
@Api
@RestController
@RequestMapping("/api/recipe")
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
    private static final String CURRENT_SERVER_URL = "http://localhost:9005";

    @GetMapping("/medicines/mdicinetype")
    public Response getUsers() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        Response response = httpClientHelper.postForResponse(serverMedicineUrl + "/api/medicines/mdicinetype", map, CURRENT_SERVER_URL);
        return response;
    }
}
