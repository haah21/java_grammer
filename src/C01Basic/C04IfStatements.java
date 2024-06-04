package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
//        // 도어락키 if문
//        int answer = 1234;
////        if(조건식){
////            참일 경우 실행문;
////        }else{
////            거짓일 경우 실행문;
////        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("비밀번호를 입력하세요 >>>");
//        int key = sc.nextInt();
//        if(key == answer){
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

        //알파벳이 소문자인지 대문자인자 판별하는 프로그램
        //소문자 1글자 입력시 소문자입니다.
        //대문자 1글자 입력시 대문자입니다.
        //그 외 문자 입력시 알파벳이 아닙니다.
//        System.out.println((int)'a'); //97
//        System.out.println((int)'A'); //65
//        System.out.println((int)'z'); //122
//        System.out.println((int)'Z'); //90

//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자를 입력하세요 >>>");
//        char input = sc.nextLine().charAt(0);
//
//        if( input >= 'a' && input <= 'z' ){
//            System.out.println("소문자입니다.");
//        } else if (input >= 'A' && input <= 'Z' ) {
//            System.out.println("대문자입니다.");
//        }else {
//            System.out.println("알파벳이 아닙니다.");
//        }

        //택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
        //사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
        Scanner sc = new Scanner(System.in);
        System.out.println("얼마나 있으세요? >>");
        int  money = sc.nextInt();

//        if(money >= 10000){
//            System.out.println("택시를 타세요");
//        }else if( money >= 3000){
//            System.out.println("버스를 타세요");
//        } else if (money>=2000) {
//            System.out.println("킥보드를 타세요");
//        }else {
//            System.out.println("걸어가세요");
//        }
        //이렇게 쓰면 money=12000일때 모든 if문 실행
        //if문 독립적으로 존재할 경우에는 정확한 범위지정을 하지않으면, 모든 if 문이 중복되어 실행될 가능성이 존재
//        if(money >= 10000){
//            System.out.println("택시를 타세요");
//        }if( money >= 3000){
//            System.out.println("버스를 타세요");
//        }if (money>=2000) {
//            System.out.println("킥보드를 타세요");
//        }else {
//            System.out.println("걸어가세요");
//        }
    }
}
