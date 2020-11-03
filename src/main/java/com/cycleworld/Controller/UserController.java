package com.cycleworld.Controller;

import com.cycleworld.Model.UserDetails;
import com.cycleworld.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService userServices;

    @PostMapping("/api/user/register")
    public UserDetails createuser(@RequestBody UserDetails userDetails) {
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

    @PostMapping(value = "/User/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public UserDetails loginUser(@RequestBody UserDetails userDetails)  {
        String TempEmailId = userDetails.getGmailId();
        String TempPassword = userDetails.getPassworld();
        UserDetails userDetails1 =null;
        if (TempEmailId != null && TempPassword != null) {
           userDetails1 = userServices.factchBypasswordandemailid(TempEmailId ,TempPassword);
        }

        if (userDetails1 == null){
            System.out.println("error   ");
        }
        return userDetails1;
    }

}
