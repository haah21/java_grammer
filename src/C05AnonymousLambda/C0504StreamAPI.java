package C05AnonymousLambda;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class C0504StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
//        //전통적인 방식의 데이터 접근 방식 : 메모리 주소 접금
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        //함수형 프로그래밍 방식: 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        //java에서 함수형프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        //foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//        //arr의 복제본 가져와서 가공후 출력-> 데이터의 안정성 확보
//
//        //Stream 생성
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        //stram<클래스명> : 제네릭 타입(<>)으로 stream 객체가 생성
//        Stream<String> stram1 = Arrays.stream(stArr);
//        //string -> 참조형 객체 -> 문제 x
//
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//
//        //기본형 자료는 별도의 stream 제공
//        int[] intArr = {10,20,30,40,50};
//        //Stream<Integer> stream3 = Arrays.stream(intArr); //이렇게 사용 x
//        IntStream stream3 = Arrays.stream(intArr);
//        //LongStream, DoubleStream ... 이런거들도 있음
//
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
//        //int가 아니라 Integer이기 때문에 Intstream은 사용불가
//        //IntStream stream5 = myList.stream();

        //stream 변환(중개 연산): filter, map, sorted, distinct, limit
        //String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
        //filter : 특정 기준으로 대상을 filtering 하는 것
        //stream<String> 반환
        //참조변수의 스트림 변환의 경우 제네렉의 타입소거 문제 발생
        //제네릭의 타입소거란 제네릭 타입을 런타임 시점에는 제거하는것을 의미
        //그래서 , 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야함(타입캐스팅)
        //String[] newStArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray();
        //Arrays.stream(stArr).filter(a->a.length()<=4) = Stream<String> -> to.Array에서 String인지 몰라서 에러남
        //이거도 안됨 - 컴파일 되는 시점에서 제네릭(<String>) = 다 제거됨
        //List<String>myList = new ArrayList<>();
        //String[] myArr = myList.toArray();

        //해결방법 : 타입 지정해줌, a변수에는 stream요소의 개수가 들어감
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length()<=4).toArray(a-> new String[a]);
//
//        //메소드 참조 , 매개변수가 추론 가능할 때 생략하는 형식 (클래스::메서드)
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length() <=4).toArray(String[]::new);
//
//        //출력 방법
//        Arrays.stream(stArr).forEach(System.out::println);
//        Arrays.stream(stArr).forEach(a-> System.out.println(a));
//
//        int[] intArr = {10,10,20,30,40,50};
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a<=30).toArray(); //30보다 작은 값
//
//        //distinct : 중복 제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray(); //중복제거
//        System.out.println(Arrays.toString(newIntArr));
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
//        //map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));

        //홀수찾기 filter, map
//        int[] arr1 = {1,2,3,4,5,6};
//        //홀수만 담은 배열생성
//        int[] newArr = Arrays.stream(arr1).filter(a-> (a%2==1)).toArray();
//        //홀수만 담은 배열의 값 제곱한 새로운 배열 생성
//        int[] newArr2 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(newArr));
//        //홀수만 담은 배열의 값 제곱한 새로운 배열 오름차순 정렬 생성
//        int[] newArr3 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).sorted().toArray();
//
//
//        //mapToInt : intStream 형태로 반환해주는 map
//        String[] stArr = {"HTML","CSS","JAVA","PYTHON"};
//        //각 문자열의 길이를 담은 새로운 int배열 생성
//        //int[] newArr4 = Arrays.stream(stArr).map(a->a.length()).toArray(); -> error
//        //해결방법 1
//        //Integer[] newArr4 = Arrays.stream(stArr).map(a->a.length()).toArray(a-> new Integer[a]);
//        //해결방법 2
//        int[] newArr4 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        System.out.println(Arrays.toString(newArr4));
//        int[] newArr5 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();
//        System.out.println(Arrays.toString(newArr5));

        //스트림의 소모 -> sum : 합계, reduce : 누적연산, foreach(출력) 등
//
//        //foreach
//        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        //==
//        Arrays.stream(intArr).forEach(System.out::println);
//
//        //sum
//        int intArrSum = Arrays.stream(intArr).sum();
//        //max
//        //optional 객체 : 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr).max().getAsInt(); //.or~~ : 없을 상황시 다른 방법~
//        //min
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();//.or~~ : 없을 상황시 다른 방법~
//        //형변환 필요
//        int intArrCount = (int)Arrays.stream(intArr).count();
//
//        //reduce(초기값, 연산식)
//        int intArrAllMultiply = Arrays.stream(intArr).reduce(1, (a,b) -> a*b);
//        int intArrAllAdd = Arrays.stream(intArr).reduce(0, (a,b) -> a+b);
//        System.out.println(intArrAllAdd);
//        System.out.println(intArrAllMultiply);
//
//        String[] stArr = {"hello","java","world"};
//        String stAllAdd = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(stAllAdd);

        //findFirst : 첫번째 요소 반환
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim",20));
//        students.add(new Student("lee",32));
//        students.add(new Student("park",24));
//        students.add(new Student("choi",33));
//
//
//
//        //나이가 30이 넘는 학생중에 첫번째 index값을 가지는 학생 객체 생성
//        Student student1 = students.stream().filter(a->a.getAge()>=30).findFirst().get();
//        //student 객체 실습
//        //1.모든 객체의 평균 나이 : int에 결과 담기
//        int avgageAge = (int) students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println(avgageAge);
//        //2.가장 나이 어린 사람 찾기, Student에 담기 //comparator 객체로 받을 수 있음
//        Student youngest = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//        System.out.println(youngest.getName());
//        //3.30대의 이름을 String 배열에 담기
//        String[] nameArr = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(a->new String[a]); //제네릭이 컴파일 되면 타입 소거 되므로 a->new String[a] or 메소드 참조
//        String[] nameArr2 = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);   //메소드 참조
//        System.out.println(Arrays.toString(nameArr2));

        //optional 객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현 == 값이 null일 수도 있다는 생각하면서 보기
        //ofNullable : null이 있을수도 있는 경우에 Optional객체를 생성하는 메서드
//        Optional<String> opt = Optional.ofNullable(null);
//        String st1 = null;
////        System.out.println(opt.get().compareTo("hello"));
//        if (opt.isPresent()){
//            System.out.println(opt.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다.");
//        }

        //Optional 객체 생성 3가지 방법
        //opt 자체가 null임
        Optional<String> opt1 = Optional.empty();
        Optional<String> opt2 = Optional.of("hello"); //null 못들어감
        Optional<String> opt3 = Optional.ofNullable("hello"); //null이 들어갈 수 있음 //이정도만 기억해두기

        //내가 직접 optional 객체 만들일은 거의 없음
        //return type이 optional 객체인 메서드를 사용했을 때 어떻게 할 것인가? DB조회=> optional<Author>author1=

        //Optional 객체 처리방법 4가지
        //1. isPresent() 확인후 get()
        if (opt3.isPresent()) {
            System.out.println(opt3.get().length());
        }
        //2. orElse() 값이 있으면 값 return, 없으면 지정값 return
//        System.out.println(opt3.get().length()); // String값을 그냥 꺼내오는데 String값이 없는 경우 error -> 이렇게 쓰면 안됨
        System.out.println(opt3.orElse("").length());
        //3. orElseGet() 값이 있으면 값 return, 없으면 람다함수 실행
        System.out.println(opt3.orElseGet(() -> new String("")).length());
        //4. orElseThrow() 가장중요, 값이 있으면 있는값 return, 없으면 지정된 예외 강제 발생
        System.out.println(opt3.get().length());

        //개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우도 존재
        //->적절한 코드와 메세지를 주기 위함
        System.out.println(opt3.orElseThrow(() -> new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students.stream().filter(a -> a.getAge() >= 29).mapToInt(a -> a.getAge()).average();
        if (answer.isPresent()) {
            System.out.println(answer.getAsDouble());
        } else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);

//        방법2
        double answer2 = students.stream().filter(a -> a.getAge() >= 29).mapToInt(a -> a.getAge()).average().orElseThrow(() -> new NoSuchElementException("값이 없습니다."));
        //students.stream().filter(a -> a.getAge() >= 29).mapToInt(a -> a.getAge()).average() : OptionalDouble -> orElseThrow 사용

    }
}