package cn.owcjuzi.controller;

import cn.owcjuzi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * spring boot 整合jsp
 */
@Controller
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping("list")
    public String listUser(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1, "admin", "123456"));
        list.add(new User(2, "test", "123456"));
        list.add(new User(3, "demo", "123456"));
        model.addAttribute("uList", list);
        return "userList";
    }
}
