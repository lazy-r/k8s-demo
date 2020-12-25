package top.lazyr.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "<h1 align='center'><span style='color: red'>"+name+"</span>,你好</h1>";
    }
}
