package com.me.mesite.controller.upms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpmsUserController {
    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }
}
