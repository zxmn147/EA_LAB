/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 伶娸
 */
@Named(value = "calculator")
@RequestScoped
public class Calculator {

    /**
     * Creates a new instance of Calculator
     */
        private float value1 = 0;

    /**
     * Get the value of value1
     *
     * @return the value of value1
     */
    public float getValue1() {
        return value1;
    }

    /**
     * Set the value of value1
     *
     * @param value1 new value of value1
     */
    public void setValue1(float value1) {
        this.value1 = value1;
    }

    private float value2 = 0;

    /**
     * Get the value of value2
     *
     * @return the value of value2
     */
    public float getValue2() {
        return value2;
    }

    /**
     * Set the value of value2
     *
     * @param value2 new value of value2
     */
    public void setValue2(float value2) {
        this.value2 = value2;
    }
    
    private float result = 0;

    /**
     * Get the value of result
     *
     * @return the value of result
     */
    public float getResult() {
        return result;
    }

    /**
     * Set the value of result
     *
     * @param result new value of result
     */
    public void setResult(float result) {
        this.result = result;
    }

    public Calculator() {
    }
    public String sumAction(){
        result = value1 + value2;
        return "result";
    }
}
