package com.auth.authserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogController {

    @GetMapping("/log")
    public String logPage(){
        return "logpage";
    }

    @PostMapping("/log")
    public String logInPage(){
        return "redirect:/log";
    }

}
