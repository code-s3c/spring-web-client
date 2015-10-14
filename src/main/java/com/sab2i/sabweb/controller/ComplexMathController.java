/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sab2i.sabweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sab2i.demo.service.IComplexMathService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author martinsa
 */
@Controller
public class ComplexMathController {
    
    @Autowired
    private IComplexMathService calculator;
    
    @RequestMapping(path="/welcome.do", method = RequestMethod.GET)
    public ModelAndView hello() {
        String message = String.valueOf(calculator.doComplexMath(10, 5));
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}
