package com.nahwasa.spring_security_basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoadbalancerCheckerController {
    @GetMapping("/chk")
    public ResponseEntity chk() {
        return ResponseEntity.ok().build();
    }
}
