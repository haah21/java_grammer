package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//        //참조 자료형 : 기본 자료형을 제외한 모든 자료형
//        //WrapperClass : 기본형 타입을 Wrapping한 클래스
//        //int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // auto unboxing : integer -> int 형변환
//        int c = b; //문제 안생김
//        // auto boxing
//        Integer d = a;

        //String과 int의 형변화
        //int -> String
        int a =10;
        String st1 = Integer.toString(a);
        String st2 = String.valueOf(a);

        //Strin -> int
        int b = Integer.parseInt(st1);

        //참조자료형에 원시자료형을 담을때는 Wrapper클래스를 써야한다.
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

//        //String 변수 생성 방법
//        //객체 생성방식
//        String st1 = new String("hello");
//        //리터럴 생성방식
//        String st2 = "hello";
//
////        List<int> myList = new ArrayList<Int>(); 이렇게 쓰면 안됨


    }
}
