public class Application01 {
    public static void main(String[] args) {
        /* 변수를 이용한 회원 데이터 관리 시 단점
         * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
         * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
         * 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
         * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.
         * (서로 다른 자료형들이기 때문)
         * */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};
        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("hobby : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
        chap06-class-and-object-lecture-source
    }

    /* 사용자 정의 자료형 사용하기*/

    public class member {
        /* 클래스 내에 메소드를 작성하지 않고 바로 변수를 선언할 수도 있다
        * 이것을 전역변수(필트 == 인스턴스변수 == 속성)이라고 부른다*/

        String id ;
        String pwd ;
        String name ;
        int age ;
        char gender ;
        String hobby ;
    }







}
