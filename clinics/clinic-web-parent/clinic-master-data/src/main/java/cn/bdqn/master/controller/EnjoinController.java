package cn.bdqn.master.controller;

import cn.bdqn.master.pojo.Enjoin;
import cn.bdqn.master.pojo.Illness;
import cn.bdqn.master.pojo.RecipeEnjoin;
import cn.bdqn.master.pojo.RecipeIllness;
import cn.bdqn.master.service.EnjoinService;
import cn.bdqn.master.service.IllnessService;
import cn.bdqn.master.service.RecipeEnjoinService;
import cn.bdqn.master.service.RecipeIllnessService;
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
@RequestMapping("/api/enjoin")
public class EnjoinController {

    @Autowired
    private EnjoinService enjoinService;
    @Autowired
    private RecipeEnjoinService recipeEnjoinService;
    @Autowired
    private IllnessService illnessService;
    @Autowired
    private RecipeIllnessService recipeIllnessService;

    @ApiOperation(value = "嘱咐api接口", response = Response.class)
    @GetMapping("/getEnjoin")
    public Response getEnjoin() {
        List<Enjoin> enjoins = null;
        try {
            enjoins = enjoinService.finEnjoin();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("查询嘱咐API失败");
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(enjoins);
    }

    @ApiOperation(value = "添加附加嘱咐Api")
    @ApiImplicitParam(value = "添加嘱咐，中间表", name = "recipeEnjoin")
    @PostMapping("/enjoin")
    public Response addEnjoin(RecipeEnjoin recipeEnjoin) {
        int insert = 0;
        try {
            insert = recipeEnjoinService.insert(recipeEnjoin);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加嘱咐成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加嘱咐失败！:" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加嘱咐失败！");
    }

    @ApiOperation(value = "疾病api接口", response = Response.class)
    @GetMapping("/getIlless")
    public Response getIlless() {
        List<Illness> ellness = null;
        try {
            ellness = illnessService.finIllness();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("调用疾病api接口失败：" + e.getMessage());
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(ellness);
    }

    @ApiOperation(value = "添加疾病api")
    @ApiImplicitParam(value = "添加疾病，中间表", name = "recipeIllness")
    @PostMapping("/illess")
    public Response addIlless(RecipeIllness recipeIllness) {
        int insert = 0;
        try {
            insert = recipeIllnessService.insert(recipeIllness);
            if (insert > 0) {
                return new Response(ResponseEnum.SUCCESS).setResponseBody("添加疾病api成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(ResponseEnum.ERROR).setResponseBody("添加疾病api失败！:" + e.getMessage().toString());
        }
        return new Response(ResponseEnum.ERROR).setResponseBody("添加疾病api失败！");
    }
}
