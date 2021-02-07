package com.example.demo.view;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class HelloBean {

    @Getter
    @Setter
    private String message;

    public HelloBean(){
        this.message = "Hello world";
    }

}
