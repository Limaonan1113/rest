package com.restful.rest.resorce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class RestfulTestContrroller {

    @GetMapping("/userlist")
    public Map userlist(){
        String a="SB";
        Map b= new HashMap();
        b.put("xgc",a);
        return b;
    }

 }
