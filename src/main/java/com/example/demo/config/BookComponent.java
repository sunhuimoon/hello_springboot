package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 书属性
 *
 */
@Component
@ConfigurationProperties(prefix = "demo.book") //prefix
                                              //字符串值，绑定该名称前缀的属性对象。
@Validated //pring Boot 初始化时会验证类的字段。
public class BookComponent {
    /**
     * 书名
     */
    @NotEmpty //验证字符串非空
    private String name;

    /**
     * 作者
     */
    @NotNull //验证 非NULL
    private String writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
