package com.example.Spring_boot_login_crud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    //    @Secured("ADMIN")
    @GetMapping("/")
    public String index(Model model) {
        log.info("estas en el home controller");
        return "home";
    }
}