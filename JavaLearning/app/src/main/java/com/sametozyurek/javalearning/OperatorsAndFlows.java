package com.sametozyurek.javalearning;

public class OperatorsAndFlows {

    public static void main(String[] args) {

        int x=5;
        int y=6;

        System.out.println(x>y);

                                                //if flows

        if(x>y){
            System.out.println("x is bigger than y");
        }

        else if(x<y){
            System.out.println("x is smaller than y");
        }

        else {
            System.out.println("x = y");
        }


                                                //switch

        int day=2;
        String dayString="";

        switch (day){

            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="Sunday";
                break;

        }
    }
}
