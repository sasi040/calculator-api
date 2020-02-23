package com.sasi.calculator.simplecalculator.controller;

import com.sasi.calculator.simplecalculator.dto.Result;
import com.sasi.calculator.simplecalculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public Result<Integer> add(@RequestParam int arg1, @RequestParam int arg2) {
        return calculatorService.addIntegers(arg1, arg2);
    }
    @GetMapping("/sub")
    public Result<Integer> sub(@RequestParam int arg1, @RequestParam int arg2) {
        return calculatorService.subtractIntegers(arg1, arg2);
    }
    @GetMapping("/mul")
    public Result<Integer> mul(@RequestParam int arg1, @RequestParam int arg2) {
        return calculatorService.multiplyIntegers(arg1, arg2);
    }
    @GetMapping("/div")
    public Result<Integer> div(@RequestParam int arg1, @RequestParam int arg2) {
        return calculatorService.divideIntegers(arg1, arg2);
    }


}
