package com.example.demo.view;

import com.example.demo.service.ThemeService;
import com.example.demo.view.base.ViewController;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@ViewController
@Data
public class ThemeSwitcherViewController {

    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private final ThemeService themeService;

    @Autowired
    public ThemeSwitcherViewController(ThemeService themeService){
        this.themeService = themeService;
        System.out.println("Total of themes: "+ themeService.getThemes().size());
        this.text = "Theme Switcher";
    }


}
