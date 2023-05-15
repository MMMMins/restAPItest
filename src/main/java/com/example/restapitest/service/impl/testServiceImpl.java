package com.example.restapitest.service.impl;

import com.example.restapitest.service.testService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class testServiceImpl implements testService {

    @Override
    public Map<String, Object> getTestData() {
        Map<String, Object> data = new HashMap<>();

        data.put("A_Data","A_Data_Q");
        data.put("B_Data","B_Data_Q");
        data.put("C_Data","C_Data_Q");

        return data;
    }
}
