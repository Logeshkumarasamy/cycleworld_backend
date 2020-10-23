package com.cycleworld.Controller;

import com.cycleworld.Model.UserDetails;
import com.cycleworld.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserService userServices;

    @PostMapping("/api/user/register")
    public UserDetails createuser(@RequestBody UserDetails userDetails) {
        System.out.println(userDetails.toString());
        return userServices.createuser(userDetails);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello Logesh!";
    }

    @GetMapping("admin/showallusers")
    public List<UserDetails> getAllUsers() {

        return userServices.getAllUser();
    }

}
