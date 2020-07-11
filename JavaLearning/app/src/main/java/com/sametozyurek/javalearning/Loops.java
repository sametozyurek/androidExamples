package com.sametozyurek.javalearning;

public class Loops {

    public static void main(String[] args) {

        int[] numbers=new int[6];

        int a=3;
        for (int i=0;i<numbers.length;i++){
            numbers[i]=a;
            System.out.println(numbers[i]);
            a+=3;
        }


        int[] myNumbers={3,6,9,12,15,18};

        for(int iNumbers : myNumbers){
            int b=iNumbers*2;
            System.out.println(b);
        }

    }
}
