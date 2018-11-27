package com.company;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class Main {
    public static void task2() {
        int res = 0;
        for (int i = 1; i < 10001; i++) {
            if (i % 2 == 0) {
                res = res - 1 / i;
            } else {
                res = res + 1 / i;
            }
        }
        System.out.println("res=" + res);
    }



    public static void main(String[]args){

        task2();
    }
    
}