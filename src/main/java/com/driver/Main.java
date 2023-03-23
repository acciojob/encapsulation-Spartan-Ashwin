package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        Scanner sc=new Scanner(System.in);
        obj.setName(sc.next());
        System.out.println(obj.getName());
    }
  
}