package com.ohgiraffers.section02.looping_and_branching.level01;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            if(i % 2 == 0){
                sum += i;
            };

        }  System.out.println("sum : " + sum);



    }

}
