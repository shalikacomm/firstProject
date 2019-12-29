package com.sample.firstProject.controller;


import com.sample.firstProject.dto.UserRoleDto;
import com.sample.firstProject.model.UserRole;
import com.sample.firstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "First Page";
    }


    @GetMapping("/getUserRole")
    @ResponseBody
    public List<UserRole> findUserRole(){
    return   userService.findAllUserRole();
    }


    @PostMapping("/addUserRole")
    @ResponseBody
    public UserRole saveUserRoles(@RequestBody UserRoleDto userRoleDto){
 return userService.saveUserRole(userRoleDto);
    }

    @GetMapping("/getUserRoleById")
    @ResponseBody
    public UserRoleDto getUserRole(@RequestParam long id){
       return userService.getUserRole(id);
    }

    @PutMapping("/updateUserRole")
    @ResponseBody
    public UserRole updateUserRole(@RequestBody UserRoleDto userRoleDto){
        return userService.updateUserRole(userRoleDto);
    }


}
