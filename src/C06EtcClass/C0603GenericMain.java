package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java","python","c"};
        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10,20,30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));

        //제네릭 메소드 생성 : 반환타입 왼쪽에 <T> 선언
        //유의점 : generic은 객체 타입이 들어와야함
        genericChange(stArr,1,2);
        System.out.println(Arrays.toString(stArr));

        //제네릭 클래스
        Person p1 = new Person();
        p1.setValue("hannah");

        // 클래스 선언도 중복 코드 안 하려면
        // Generic해서 하면 됨
        GenericPerson p2 = new GenericPerson<Integer>();
        p2.setValue(30);
        System.out.println(p2.value);

        //제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

        //컴파일후 제네릭 소거
        //컴파일하면 위에 코드 이렇게 됨
        //List myList = new ArrayList<>();
        //myList.add("hello");
        //myList.add("java");
    }

    //제네릭 메소드 생성 : 반환타입 왼쪽에 <T> 선언
    //유의점 : generic은 객체 타입이 들어와야함
    static <T>void genericChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void stChange(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void intChange(Integer[] arr, int a, int b){
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //generic

}

// 코드 중복을 막기 위해 타입도 넘겨주게 만드려면 제네릭
// 제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T>{
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    T value;
}

class Person{
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;

}
