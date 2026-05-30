package Recursion;

import java.util.Scanner;

public class PrintNNumber{

    static int count =0;
/* 
    public static void print(){
        if(count > 10){
            return ;
        }
        System.out.println(count++  + " Coding--");
        print();
    }

    */

    public static void print(int i , int n){
        if(i>n){
            return;
        }
        System.out.println(i++ + " Number");
        print(i,   n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        print(0, 6);


    }
}