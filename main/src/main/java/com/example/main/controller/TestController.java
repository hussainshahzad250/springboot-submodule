package com.example.main.controller;

import com.example.core.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class TestController {

    @GetMapping("/employees")
    public List<Employee> hello() {
        return Stream
                .of(new Employee(1, "Ramesh", "Kumar", "IT", 10000),
                        new Employee(2, "Suresh", "Kumar", "Finance", 20000),
                        new Employee(3, "Rohan", "Gupta", "Medical", 20000),
                        new Employee(4, "Rahul", "Gupta", "IT", 30000),
                        new Employee(5, "Sonu", "Kumar", "IT", 50000))
                .collect(Collectors.toList());
    }
}
