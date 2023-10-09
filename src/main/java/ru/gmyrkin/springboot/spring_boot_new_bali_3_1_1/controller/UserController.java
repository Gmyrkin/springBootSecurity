package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.controller;


import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service.UserService;
import java.security.Principal;
import java.util.List;


@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/user")
//    public String getUserPage(Model model, Principal principal) {
//        model.addAttribute("users", userService.findByUsername(principal.getName()));
//        return "user";
//    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        model.addAttribute("users", user);
        return "user";
    }

//    @GetMapping("/user/{id}")
//    public String showUser (@PathVariable("id") Long id, Model model) {
//        System.out.println("пришел запрос на пользователя " + id);
//        model.addAttribute("users", userService.findById(id));
//        System.out.println("получил пользователя " + userService);
//        return "user";
//    }

//    @GetMapping("/user/{id}")
//    public String printWelcome(@PathVariable("id") Long id, Model model) {
//        System.out.println("пришел запрос на пользователя " + id);
//        User user = userService.findById(id);
//        model.addAttribute("user",user);
//        System.out.println("получил пользователя  " + user);
//        return "user";
//    }

//    @GetMapping(value = "/user")
//    public String userPage(Model model, Principal principal) {
//        System.out.println("пришел запрос на пользователя " + id);
//        User user = userService.findById(principal.getName());
//        model.addAttribute("user", user);
//        System.out.println("пришел запрос на пользователя " + user);
//        return "user";
//    }

//    @GetMapping("/user/{id}")
//    public String showUserInfo(@AuthenticationPrincipal User user, Model model) {
//        model.addAttribute("user", user);
//        return "user";
//    }

}


