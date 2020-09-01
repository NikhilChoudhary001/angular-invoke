package com.example.angulardemo.controller;

import com.example.angulardemo.model.EmployeeData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/angular/app/")
public class AngularController {

    @GetMapping(value = "getEmpData")
    public EmployeeData getEmployee (){
        System.out.println("Inside");
        EmployeeData data = new EmployeeData("f662975","Nikhil","Gachibowli");
        return data;
    }
}
