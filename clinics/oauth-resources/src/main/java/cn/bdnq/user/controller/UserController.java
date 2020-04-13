package cn.bdnq.user.controller;

import cn.bdnq.user.entity.User;
import cn.bdnq.user.service.UserServer;
import cn.clinic.response.RequesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/content")
public class UserController {
    @Autowired
    UserServer userServer;

    @GetMapping("/list")
    @ResponseBody
    public RequesBean finUserById(@RequestParam("id") Integer userId) {
        List<User> users = userServer.finAll(userId);
        return RequesBean.ok(users);
    }
}
