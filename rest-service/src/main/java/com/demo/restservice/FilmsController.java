package com.demo.restservice;

import org.springframework.web.bind.annotation.GetMapping;

public class FilmsController {

    @GetMapping("/films")
    public Films film(@Request)
}
