package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println( sum(20, 15));
        System.out.println(sum(25,28));
        System.out.println(sum(15,5));
        System.out.println(sum(50,-3));
        System.out.println(sum(55,-10));

    }

    public static String sum(int age, int tem) {
        if (age>20 && age<45 && tem>-20 && tem<30)
            return "Можно идти гулять";
        else if (age<20 && tem>0 && tem<28)
            return "Можно идти гулять";
        else if (age>45 && tem>-10 && tem<25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";

    }
}



