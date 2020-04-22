package cn.bdqn.prescription.controller;

import cn.bdqn.prescription.pojo.Recipe;
import cn.bdqn.prescription.service.RecipeService;
import cn.clinic.http.HttpClientHelper;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    @Resource
    private RecipeService recipeService;

    @Value("${server.masterdata.url}")
    private String serverMasterdataUrl;

    @Autowired
    private HttpClientHelper httpClientHelper;

    private static final String CURRENT_SERVER_URL = "http://localhost:9005";

    @ApiOperation(value = "添加处方关联表信息API", response = Response.class)
    @ApiImplicitParam(value = "recipe对象参数传递", name = "recipe")
    @PostMapping("/addRecipe")
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

    @ApiOperation(value = "查询附加费Api", response = Response.class)
    @GetMapping("/addition/index")
    public Response getAdditionByList() {
        return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/addition/index");
    }

    @ApiOperation(value = "查询员工Api", response = Response.class)
    @GetMapping("/doctor/index")
    public Response getDoctor() {
        return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/doctor/index");
    }

    @ApiOperation(value = "嘱咐api接口", response = Response.class)
    @GetMapping("/enjoin/getEnjoin")
    public Response getEnjoin() {
        return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/enjoin/getEnjoin");
    }

    @ApiOperation(value = "疾病api接口", response = Response.class)
    @GetMapping("/enjoin/getIlless")
    public Response getIlless() {
        return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/enjoin/getIlless");
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
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("pageIndex", pageIndex);
        map.put("pageSize", pageSize);
        map.put("phone", phone);
        map.put("name", name);
        Response response = httpClientHelper.postForResponse(serverMasterdataUrl + "/api/masterdata/users", map, CURRENT_SERVER_URL);
        return response;
    }

    @ApiOperation(value = "患者信息Api", response = Response.class)
    @ApiImplicitParam(value = "患者id,必填", name = "id")
    @GetMapping("/user/{id}")
    public Response getUser(@PathVariable Integer id) {
        return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/enjoin/user/" + id);
    }
}
