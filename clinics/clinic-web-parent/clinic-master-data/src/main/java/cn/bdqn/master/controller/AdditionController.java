package cn.bdqn.master.controller;

import cn.bdqn.master.pojo.Addition;
import cn.bdqn.master.pojo.RecipeAddition;
import cn.bdqn.master.service.AdditionService;
import cn.bdqn.master.service.RecipeAdditionService;
import cn.clinic.response.Response;
import cn.clinic.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/addition")
public class AdditionController {
    @Autowired
    private AdditionService additionService;
    @Autowired
    private RecipeAdditionService recipeAdditionService;


    @ApiOperation(value = "查询附加费Api", response = Response.class)
    @GetMapping("/index")
    public Response getAddition() {
        List<Addition> additions = null;
        try {
            additions = additionService.finAdditionAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询附加费用接口失败:" + e.getMessage());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(additions);
    }

    @ApiOperation(value = "添加附加费用api")
    @ApiImplicitParam(value = "添加附加费用，中间表", name = "recipeAddition")
    @PostMapping("/add")
    public Response finAddAddition(RecipeAddition recipeAddition) {
        int insert = 0;
        try {
            insert = recipeAdditionService.insert(recipeAddition);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加附加费用api成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加附加费用api失败！:" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加附加费用api失败！");
    }
}
