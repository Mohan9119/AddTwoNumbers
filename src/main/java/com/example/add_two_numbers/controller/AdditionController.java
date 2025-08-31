package com.example.add_two_numbers.controller;

import com.example.add_two_numbers.model.AdditionRequest;
import com.example.add_two_numbers.model.AdditionResponse;
import com.example.add_two_numbers.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/add")
public class AdditionController {

    @Autowired
    private AdditionService additionService;

    @PostMapping
    public AdditionResponse addNumbers(@RequestBody AdditionRequest request) {
        int sum = additionService.addNumbers(request.getNum1(), request.getNum2());
        return new AdditionResponse(sum);
    }
}
