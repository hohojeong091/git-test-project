package com.ohgiraffers.section01.array;

public class Application03 {
    public static void main(String[] args) {
        /* 배열에 초기화 되는 자료형별 기본 값을 이해할 수 있다*/

        /* 배열의 각 인덱스에는 자바에서 지정한 기본 값으로 초기화된 값이 담긴다
        * heap 영역은 값이 없는 빈 공간이 존재할 수 없다
        *  정수 : 0
        *  실수 : 0.0
        *  논리 : false
        *  문자 : /u0000 (반대짝대기)
        *  참조 : null > 주소값을 저장하는 친구
        * */

        // 코딩에서 사용되는 인덱스는 주소값인가?
        int[] iarr = new int[5];
         for(int i = 0; i<iarr.length; i++){
          //   System.out.println("iarr [ " + i + " ]의 값 : " + iarr[i]);

         }

         /* 자바에서 지정한 기본 값 외의 값으로 초기화 하고 싶은 경우 블럭을 이용한다
         * 블럭을 사용하는 경우 new 연산자를 사용하지 않아도 되며,
         * 값의 개수만큼 자동으로 크기가 설정된다 */
         int[] iarr2 = {11, 22, 33, 44, 55};
         //중괄호 안에 쓰고 싶은 수를 쓰면 그대로 선언과 할당과 초기화가 한 번에
        for(int i = 0; i<iarr.length; i++) {
            // System.out.println("iarr [ " + i + " ]의 값 : " + iarr[i]);
        }
            /* 문자열도 배열로 사용할 수 있다*/
            String[] sarr = {"apple" , "banana" , "grape" , "orange"};
            for(int i = 0; i<sarr.length; i++){
                System.out.println("sarr [ " + i + " ]의 값 : " + iarr[i]);




                   }
    }
}
