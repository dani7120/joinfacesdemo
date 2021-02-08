package com.example.demo.view;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ViewController
public class HelloBean implements Serializable {

    @Getter
    @Setter
    private String message;

    public HelloBean(){
        this.message = "Hello world";
    }

}
