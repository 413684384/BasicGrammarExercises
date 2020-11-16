package com.glx;

public class TestOpera1 {
    public static void main(String[] args){
        byte a=10;
        //a=a+1;//执行报错
        a+=1; //扩展运算符

        System.out.println(a);

        System.out.println("==第2条分割线=======================");


        System.out.println(true?false:true?false:true);
        System.out.println(false?false:true?false:true);



        System.out.println("==第2条分割线=======================");

        int b=3;
        int c=3;
        System.out.println(b++ + c++);
        System.out.println(b++ + ++c);
        System.out.println(++b + c++);
        System.out.println(++b + ++c);

        System.out.println("==第3条分割线=======================");


    }

}
