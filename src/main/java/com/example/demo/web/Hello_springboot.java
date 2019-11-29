package com.example.demo.web;

import com.example.demo.config.BookComponent;
//import com.example.demo.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_springboot {
    @RequestMapping("/")
    public String sayHello01() {
        return "Hello,World!";
    }

    @Autowired
    BookComponent bookComponent;
    @GetMapping("/book/hello")
    public String sayHello() {
        return "Hello， " + bookComponent.getWriter() + " is writing "
                + bookComponent.getName() + " ！";
    }
}
