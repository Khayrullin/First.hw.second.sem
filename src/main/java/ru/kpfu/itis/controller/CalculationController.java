package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.model.MathOperation;
import ru.kpfu.itis.service.MathService;
import ru.kpfu.itis.util.FormValidator;

@Controller
@RequestMapping(value = "/calculator")
public class CalculationController {


    @Autowired
    MathService mathService;

    FormValidator validator = new FormValidator();


    @RequestMapping(value = "/")
    public String addUser(Model model) {
        MathOperation mathOperation = new MathOperation();
        model.addAttribute("mathOperation", mathOperation);
        model.addAttribute("result", mathService.getResult());
        model.addAttribute("mathaction", mathService.getAction());
        return "calculator";
    }

    @RequestMapping(value = "/operate", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute MathOperation mathOperation, BindingResult result) {


        System.out.println(mathOperation.getDigit());
        System.out.println(mathOperation.getAction());
        validator.validate(mathOperation, result);
        if (result.hasErrors()) {
            return "calculator";
        } else {
            mathService.doCalculation(mathOperation);
            return "redirect:/calculator/";
        }
    }

}
