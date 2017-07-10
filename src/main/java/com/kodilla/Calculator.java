package com.kodilla;

/**
 * Created by Dom on 2017-07-04.
 */
public class Calculator {
    public double firstNumber;
    public double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void addNumbers() {
        System.out.println("Wynik dodawania: " + (this.firstNumber + this.secondNumber));
    }

    public void subNumbers()    {
        System.out.println("Wynik odejmowania: " + (this.firstNumber - this.secondNumber));
    }

    public static void main(String args[])  {
        Calculator calculator = new Calculator(6, 4);
        calculator.addNumbers();
        calculator.subNumbers();
    }

}

