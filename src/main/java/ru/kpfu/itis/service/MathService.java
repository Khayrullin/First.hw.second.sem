package ru.kpfu.itis.service;


import ru.kpfu.itis.model.MathOperation;

public interface MathService {

    String getResult();
    String getAction();

    void doCalculation(MathOperation mathOperation);




}
