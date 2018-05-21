package com.job.ethereumstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EthereumController {

    @GetMapping
    public String get() {
        return "get";
    }
}
