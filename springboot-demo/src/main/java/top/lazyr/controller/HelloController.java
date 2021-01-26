package top.lazyr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(@RequestParam(defaultValue = "游客") String name){
        return "<h1 align='center'><span style='color: blue'>"+name+"</span>,你好（这是版本2.0）</h1>";
    }
}
