package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user/{id}")
    public String printWelcome(@PathVariable("id") Long id, Model model) {
        return "redirect:/user";
    }
}

