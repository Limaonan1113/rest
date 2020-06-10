package com.restful.rest.resorce;

import com.restful.rest.model.User;
import com.restful.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class RestfulTestContrroller {

    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    public Map userlist(){
        String a="SB";
        Map b= new HashMap();
        b.put("xgc",a);
        return b;
    }
    @GetMapping("/userlistParam")
    public Map userlistParam(@RequestParam(required = false)String xgc){
        Map b = new HashMap();
        if(xgc==null || "".equals(xgc)){
            b.put("code","fail");
        }
        b.put("xgc",xgc);
        return b;
    }

    @PostMapping("/add")
    public  Map add(@RequestBody User user){
        Map b = new HashMap();
        userService.add(user);
        b.put("test","ok");
        return b;
    }

    @GetMapping("/show")
    public List<User> show(){
        return userService.show();
    }

 }
