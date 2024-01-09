package com.ohgiraffers.section01.array.level01.basic;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        String[] fri = {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("0부터 4까지의 정수를 입력하세요. :");


        System.out.println(fri[f]);

        if (f >= 0 && f > fri.length) ;
        else System.out.println("준비된 과일이 없습니다.");


    }


}
