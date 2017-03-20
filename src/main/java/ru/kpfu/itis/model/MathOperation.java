package ru.kpfu.itis.model;


public class MathOperation {

    private String digit;

    private String action;



    public MathOperation(String digit, String operation) {
        this.digit = digit;
        this.action = operation;
    }
    public MathOperation() {

    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


}


