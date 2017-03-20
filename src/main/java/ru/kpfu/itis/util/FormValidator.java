package ru.kpfu.itis.util;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.model.MathOperation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidator implements Validator {

    static Pattern p = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");

    @Override
    public boolean supports(Class<?> aClass) {
        return MathOperation.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        MathOperation mathOperation = (MathOperation) o;

        Matcher m = p.matcher(mathOperation.getDigit());

        if (!m.matches()) {
            errors.rejectValue("digit", "", "Тут можно только цифру");
        }

    }
}
