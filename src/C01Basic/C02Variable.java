package C01Basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02Variable {
    public static void main(String[] args) {
//        정수 :  byte(1byte), int(4byte), long(8byte)
//        byte a = 127;
//        byte b = -128;
//
//        System.out.println(a);
//        System.out.println(b);
//        //overflow, underflow 발생
//        a++;
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
//        int int_a = 10;
//        //long 명시적으로 L을 붙여 long 타입임을 명시하기도 함
//        long long_e = 20L;
//
//        //실수 : float double(기본)
//        float f1 = 1.123F; //무조건 F 붙여야함
//        double d1 = 1.123;
//
//        //부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//        double total = 0;
//        for(int i=0; i<1000; i++){
//            total += 0.1;
//        }
//        System.out.println(total);

//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d2-d1);
//        //BigDecimal // 참조자려형 //원리 : 저장할 때 문자열로 저장해서 연산할때 정수로 변환, 최정결과는 실수로 반환
//        BigDecimal  b1 = new BigDecimal("1.03");
//        BigDecimal  b2 = new BigDecimal("0.42");
//        double result = b1.subtract(b2).doubleValue();
//        System.out.println(result);
//
//        char m1 = '가';
//        System.out.println(m1);
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("값을 입력하세요>> ");
//        int input1 = sc.nextInt();
////        if(bool1){ //항상 true
////            System.out.println("조건식이 참입니다.");
////        }
//        //if 조건절 안에 boolean 타입값이 들어옴에 유의
//        boolean bool3 = input1 > 0;
//        if(input1>0){
//            System.out.println("입력하신 값은 0보다 큽니다.");
//        }
//
//        if(bool3){ //동적인 boolean값
//            System.out.println("입력하신 값은 0보다 큽니다.");
//        }
//
//        //타입 변환
//        //묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
//        //알파벳 비교를 위한 묵시적 타입변환 발생
//        System.out.println('a'>'b'); //false 출력 //묵시적 타입변환
//        //int에서 double 형변환은 문제 없음
//        int i1 = 10;
////        int ->double
//        double d1 = i1;
//        System.out.println(d1);
//        //double에서 int 묵시적 형변환은 불가능
//        //명시적 형변환은 가능 : 소수점이 절사
//        double d2 = 10.5;
//        int i2= (int)d2;
//        System.out.println(i2);
//
//
//        //명시적 타입 변환
//        System.out.println('a');
//        System.out.println((int)'a');
//        System.out.println((int)'b');

        //형변환 관련 나눗셈문제
        int a = 1;
        int b = 4;
        // int/int이므로 결과값을 int로 판단하여 소수점 절사
        int c = 1/4;
        System.out.println(c);
        double d = 1/4;
        System.out.println(d);

        // 두 값중에 한 값만이라도 double로 명시적 형변환 시켜주면 결과값 double
        double d1 = (double)1/4;
        System.out.println(d1);

        //변수와 상수
        int a1 = 10;
        a1 = 20;
        System.out.println(a1);

        //상수는 초기화 이후에 값이 재할당되는 것이 불가능
        //상수는 final 키워드를 통해 표현
        //일반적으로 상수값은 대문자로 표기
        final int a2 = 10;
//        a2 = 20; -> 재할당은 불가능
        final  int a3;
        a3 = 20;
//        -> 선언할 때 값 할당 x  -> 가능한 상황


    }
}
