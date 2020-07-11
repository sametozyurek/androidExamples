package com.sametozyurek.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        String[] dizi=new String[3];
        dizi[0]="Samet";
        dizi[1]="Ozyurek";
        dizi[2]="btbs";

        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(dizi[2]);

        int[] numberArray=new int[5];
        numberArray[2]=5;

        System.out.println(numberArray[2]);

        // List

        ArrayList<String> benKimim=new ArrayList<String>();
        benKimim.add("Samet");
        benKimim.add("Ozyurek");
        benKimim.add(1,"Özyürek");

        System.out.println(benKimim.get(0));
        System.out.println(benKimim.get(1));
        System.out.println(benKimim.get(2));


        // Set array gibi fakat icerisinde aynı elemandan sadece 1 tanesini tutar mesela array içerisinde "Samet" varsa 2. kez "Samet" eklenmeyecektir.
        // asagidaki kod da olusturulan newSet in size ını 1 verecektir yani 2. kez "Samet" degerini almayacak.

        HashSet<String> newSet=new HashSet<String>();
        newSet.add("Samet");
        newSet.add("Samet");

        System.out.println(newSet.size());


        // Map

        HashMap<String, String> newMap=new HashMap<String, String>();
        newMap.put("name","Samet");
        newMap.put("mission","Vokal");

        System.out.println(newMap.get("name"));

    }
}
