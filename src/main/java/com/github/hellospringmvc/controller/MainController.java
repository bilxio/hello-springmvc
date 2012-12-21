package com.github.hellospringmvc.controller;

import com.github.hellospringmvc.entity.User;
import com.github.hellospringmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Bill
 * @version 2012-12-21
 */
@Controller
public class MainController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String index(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }

}
