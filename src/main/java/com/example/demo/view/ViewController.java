package com.example.demo.view;


import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
@ViewScoped
public @interface ViewController {

    String value() default "";
}
