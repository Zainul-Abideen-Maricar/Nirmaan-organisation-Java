package com.codewithmosh;

import java.util.concurrent.Callable;

public class Conversion {

    String add(int a,int b){
        return "addition "+(a+b);
    }

      String  subtraction(int a,int b){
        return "subtraction "+(a-b);
    }

    String  mul(int a,int b){
        return "multiplication "+(a*b);
    }
    String  div(int a,int b){
        return "division "+(a/b);
    }
    String  module(int a,int b){
        return "module "+(a%b);
    }

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        String num1=conversion.add(10,20);
        String num = conversion.subtraction(10, 20);
      String num2=conversion.mul(10,20);
        String num3=conversion.div(10,20);
        String num4=conversion.module(5,20);



        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


    }
}
