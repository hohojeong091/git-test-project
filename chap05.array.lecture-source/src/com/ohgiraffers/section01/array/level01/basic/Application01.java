package com.ohgiraffers.section01.array.level01.basic;

public class Application01 {
    public static void main(String[] args) {

        int[] num = new int [10];

        for(int i = 0 ; i < num.length ; i++ ){
            num[i] = i + 1 ;

            System.out.println(num[i] + " ");
        }

    }
}
