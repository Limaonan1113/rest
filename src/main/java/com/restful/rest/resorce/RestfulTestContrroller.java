package com.restful.rest.resorce;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/userlistParam")
    public Map userlistParam(@RequestParam(required = true)String xgc){
        Map b = new HashMap();
        b.put("xgc",xgc);
        return b;
    }

 }
