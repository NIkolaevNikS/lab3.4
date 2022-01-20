package com.metanit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String day = reader.readLine();
        if (day.equals("понедельник"))
            System.out.println(1);
        else if (day.equals("вторник"))
            System.out.println(2);
        else if (day.equals("среда"))
            System.out.println(3);
        else if (day.equals("четверг"))
            System.out.println(4);
        else if (day.equals("пятница"))
            System.out.println(5);
        else if (day.equals("суббота"))
            System.out.println(6);
        else
            System.out.println(0);
    }
}
