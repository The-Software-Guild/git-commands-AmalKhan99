package com.sg.foundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1= inp.nextInt();
        int n2= inp.nextInt();
        int n3= inp.nextInt();

        int result=n1+n2+n3;
        System.out.println(n1+"+"+n2+"+"+n3+"="+result);
    }
}
