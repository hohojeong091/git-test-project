package com.ohgiraffers.section03.copy;

public class Application04 {
    public static void main(String[] args) {
        /* 향상된 for문을 이해하고 활용할 수 있다
        * for문 = 반복 횟수가 정해져 있을 때, 배열 인덱스 값 구할 때 사용
        * -> for each문, 향상된 for문 등으로 활용됨*/

        int[] arr1 = {1,2,3,4,5} ;
        int[] arr2 = arr1.clone() ;
        /* for문을 이용해 인덱스에 값을 10씩 누적 증가*/
        for(int i = 1 ; i < arr1.length ; i ++){
            arr1[i] += 10;

        }
        for(int i = 0 ; i< arr1.length ; i++ ){
            System.out.println(arr1[i] + " ");
            }
        System.out.println();

        /*향상된 for문 : jdk 1.5 버전부터 추가된 문법
        * 배열 인덱스에 차례로 접근해서 임시로 사용할 변수에 값을 담고 반복문으로 실행한다*/
        for(int i : arr2 ){
            i+=10;
        //for(레퍼런스의 변수 타입 : 반복할 레퍼런스 변수명) {}
        }

        /* 향상 된 for문은 배열 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만,
        * 값을 변경할 수 없다
        * -> 인덱스에 접근해서 값을 변경한게 아니라 꺼낸 값을 복사해서 사용하기 때문에.
        * 대신 변경이 아니라 사용이 목적일 경우 더 편리하게 사용할 수 있다*/
        for(int i : arr2) {
            System.out.println(i + " ");
            }
        System.out.println();
        double[] darr = {1.0, 2.0, 3.0, 4.0, 5.0};
        for(double num : darr) {
            System.out.println(num + " ");
        }
    }
}
