package com.didispace.service;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@PropertySource(value="classpath:application.properties", name="application.properties")
public class TestProperites {
    @Value("${com.wangzz.properties.test1}")
    private String random1;
    @Value("${com.wangzz.name}")
    private String name;

    private String age;

    private String sex;
    @Value("${com.wangzz.title}")
    private String title;

    @Value("com.wangzz.properties.test2")
    private String random2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRandom1() {
        return random1;
    }

    public void setRandom1(String random1) {
        this.random1 = random1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRandom2() {
        return random2;
    }

    public void setRandom2(String random2) {
        this.random2 = random2;
    }
}
