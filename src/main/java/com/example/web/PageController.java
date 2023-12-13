package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/page")
    public String page(@RequestParam String page){
        switch (page) {
            case "about":
                return "about";
            case "services":
                return "services";
            case "products":
                return "products";
            case "contact":
                return "contact";
            default:
                return "error"; // 잘못된 요청에 대한 기본 페이지
        }
    }

}
