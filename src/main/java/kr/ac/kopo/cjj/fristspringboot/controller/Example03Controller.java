package kr.ac.kopo.cjj.fristspringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/test")
public class Example03Controller {
    @GetMapping(value = "/exam04")
    public String requestMethod() {
        return "requestTest";
    }



}
