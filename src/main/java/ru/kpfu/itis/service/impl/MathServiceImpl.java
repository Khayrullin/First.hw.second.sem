package ru.kpfu.itis.service.impl;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.MathOperation;

import ru.kpfu.itis.service.MathService;

@Service
public class MathServiceImpl implements MathService {


    private String result;
    private String act;

    private String histDigit;
    private String histAction;


    @Override
    public String getResult() {
        return result;
    }

    @Override
    public String getAction() {
        return act;
    }

    @Override
    public void doCalculation(MathOperation mathOperation) {

        String digit = mathOperation.getDigit();
        String action = mathOperation.getAction();


        if (histDigit != null && histAction != null) {
            Double operand1 = Double.parseDouble(histDigit);
            Double operand2 = Double.parseDouble(digit);
            String mathaction = histAction;
            if (mathaction.equals("division") && operand2 == 0) {
                histAction = null;
                histDigit = null;
                digit = " ";
                action = " ";
            } else {
                if (mathaction.equals("add")) {
                    digit = Double.toString(operand1 + operand2);
                } else if (mathaction.equals("minus")) {
                    digit = Double.toString(operand1 - operand2);
                } else if (mathaction.equals("mult")) {
                    digit = Double.toString(operand1 * operand2);
                } else if (mathaction.equals("divisoin")) {
                    digit = Double.toString(operand1 / operand2);
                }
            }
        }
        if (action.equals("equal")) {
            histAction = null;
            histDigit = null;
        } else {
            histDigit = digit;
            histAction = action;
        }


        result = digit;
        act = action;

    }
}
