package com.sasi.calculator.simplecalculator.service;

import com.sasi.calculator.simplecalculator.dto.Result;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Result<Integer> addIntegers(int arg1, int arg2) {
        Result<Integer> result = new Result<>();
        result.setArgument1(arg1);
        result.setArgument2(arg2);
        result.setResult(arg1+arg2);

        return result;
    }

    public Result<Integer> subtractIntegers(int arg1, int arg2) {
        Result<Integer> result = new Result<>();
        result.setArgument1(arg1);
        result.setArgument2(arg2);
        result.setResult(arg1-arg2);

        return result;
    }

    public Result<Integer> multiplyIntegers(int arg1, int arg2) {
        Result<Integer> result = new Result<>();
        result.setArgument1(arg1);
        result.setArgument2(arg2);
        result.setResult(arg1 * arg2);

        return result;
    }
    public Result<Integer> divideIntegers(int arg1, int arg2) {
        Result<Integer> result = new Result<>();
        result.setArgument1(arg1);
        result.setArgument2(arg2);
        if (arg2 == 0) {
            result.setResult(Integer.MIN_VALUE);
        } else {
            result.setResult(arg1 / arg2);
        }
        return result;
    }



}
