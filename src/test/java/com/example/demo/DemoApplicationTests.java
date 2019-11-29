package com.example.demo;

import com.example.demo.config.BookComponent;
//import com.example.demo.config.BookProperties;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    BookComponent bookComponent;

    @Test
    public void testBookProperties() {
        Assert.assertEquals(bookComponent.getName(),"[Spring Boot 2.x Core Action]");
        Assert.assertEquals(bookComponent.getWriter(),"BYSocket");
    }
//    @Test
//    void contextLoads() {
//    }

}
