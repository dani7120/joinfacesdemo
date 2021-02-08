package com.example.demo.view;

import com.example.demo.view.base.ViewController;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@ViewController
public class WelcomeViewController implements Serializable {

    @Getter
    @Setter
    private String message;

    public WelcomeViewController(){
        this.message = "Hello world";
    }

}
