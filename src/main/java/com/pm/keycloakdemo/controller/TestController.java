package com.pm.keycloakdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class TestController {

    @GetMapping("")
    public ResponseEntity<?> greet() {
        Map<String, String> map = new HashMap<>();
        map.put("response", "Hello, the request is successful");
        return ResponseEntity.ok(map);
    }
}
