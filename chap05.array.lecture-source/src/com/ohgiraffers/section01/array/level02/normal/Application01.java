package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" 문자열을 입력해 주세요. : ");
        String str = sc.nextLine();

        System.out.print(" 검색할 문자를 입력해 주세요 : ");
        char str1 = sc.nextLine().charAt(0);

        char[] carr = str.toCharArray();
        //문자배열의 길이만큼 반복하여 carr 분자배열의 값들을 출력한다.

        int j = 0;
        for (int i = 0 ; i < carr.length ; i++) {
            if(carr[i] == str1) {
                j++;
            }

        } System.out.println(" 입력하신 문자열" + str + "에서 찾으시는 문자" + str1 + "은" + j +" 개 입니다. ");




        //지역변수 / 전역변수


    }
}
