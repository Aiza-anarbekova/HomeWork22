package com.compan;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        ArrayList<Integer> array1=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>();
        Random ran=new Random();

        for (int i = 0; i <=50 ; i++) {
            int a= ran.nextInt(1,101);
            array.add(a);
            if (a%2==0){
                array1.add(a);
            } else {
                array2.add(a);
            }
        }
        System.out.println("Numbers: "+array);
        System.out.println("jup sandar: "+array1);
        System.out.println("tak  sandar: "+array2);
        
    }
}
