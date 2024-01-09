package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램*/

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        //for (int i = 0; i < scores.length; i++){
        //  System.out.println((i+1) + "번째 학생의 자바 점수 입력 : ");
        //  scores[i] = sc.nextInt();

        int sum = 0;
        double avg = 0.0;
        //배열을 순회하는 과정이 들어간다면 변수.length 값이 들어가야 한다
        // 고정된 값을 지정하는 거 보다, <배열의 크기>로 지정을 해놓으면 좋다

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = (double) sum / scores.length;
        //정확한 소수점까지 계산하기 위해선 더블을 활용해야 한다
        // 1. avg 값을 더블로 만든다. /2. 합계를 더블로 선언한다

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);


    }

}

