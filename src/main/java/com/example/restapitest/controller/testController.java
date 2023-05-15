package com.example.restapitest.controller;

import com.example.restapitest.service.testService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class testController {
    private final testService testService;
    @GetMapping("/test")
    public Map<String, Object> testRest(){
        return testService.getTestData();
    }

}
