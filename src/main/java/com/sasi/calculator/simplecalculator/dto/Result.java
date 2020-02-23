package com.sasi.calculator.simplecalculator.dto;

/**
 * Result DTO to display the result to the user
 */
public  class  Result<T> {

    private T argument1;

    private T argument2;

    private T result;

    public T getArgument1() {
        return argument1;
    }

    public T getArgument2() {
        return argument2;
    }

    public void setArgument1(T argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(T argument2) {
        this.argument2 = argument2;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
