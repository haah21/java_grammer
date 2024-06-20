package C05AnonymousLambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C0503ComparableComparator {
    public static void main(String[] args) {
        //자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
        //Comparable 인터페이스에는 compareTo 메서드
        //Comparator 인터페이스에는 compare 메서드 선언

        //String 클래스에 compareTo 내장(comparable 구현 = 오버라이딩 중)
        //String 클래스외에 java 많은 내장클래스에서 Comparable 구현
//        String a = "hello";
//        String b = "horld";
//        //두 문자열의 각 자리를 순차적으로 비교
//        //문자열의 비교는 유니코드 값의 차이를 반환
//        System.out.println(a.compareTo(b));
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);
//        System.out.println(myList); //comparable의 compareTo 메서드를 구현하여 정렬
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());


        //student 객체 5개 담기
//        List<Student> Students = new ArrayList<>();
//        Students.add(new Student("kim", 24));
//        Students.add(new Student("lee", 43));
//        Students.add(new Student("park", 22));
//        Students.add(new Student("choi", 15));
//        Students.add(new Student("hwang", 30));

        //Collections.sort(Students); //error -> 뭐로 정렬해야하는지 모름
        //Students.sort(Comparator.reverseOrder()); //error -> 뭐로 정렬해야하는지 모름

        //객체 정렬
        //방법 1 Student 객체에서 comparable 구현해야함 -> compareTo 메서드 오버라이딩
//        Collections.sort(Students);
//        for (Student s : Students){
//            System.out.println(s.getName() + " " + s.getAge());
//        }
        //방법 1 개선
//        for(Student s: Students){
//            System.out.println(s.toString());
//        }
//
//        //방법 2 Comparator를 구현한 익명객체를 sort에 주입
//        //Comparator 객체 생성
//        Comparator<Student> myComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return o1.getAge() - o2.getAge();
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//
//        Students.sort(myComparator);
//                for (Student s : Students){
//            System.out.println(s.getName() + " " + s.getAge());
//        }


//        Comparator<Student> myComparator2 = (a,b) ->a.getName().compareTo(b.getName());
//        for (Student s : Students){
//            System.out.println("이름은 "+ s.getName() +" 나이는 "+ s.getAge());
//        }
//        System.out.println(Students);

        //아래 문자열을 글자길이 순서로 내림차순 정렬하여라
//        String[] stArr = {"hello","java","C++","world2"};
//        Arrays.sort(stArr,Comparator.reverseOrder()); //reverseOrder : 내림차순
//        Arrays.sort(stArr, (a,b)-> b.length()-a.length());
//        System.out.println(Arrays.toString(stArr));

        //[4,5],[1,2],[5,0],[3,1]
        //위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째를 기준으로 배열을 내림차순 정렬
        //만약 1번째가 같으면 0번째로 내림차순
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4, 5});
//        myList.add(new int[]{1, 2});
//        myList.add(new int[]{5, 5});
//        myList.add(new int[]{3, 1});
//        myList.sort((a,b)->b[1]-a[1]);

        //comparator 방법 1
//        Comparator<int[]> myComparator = new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[1]==o2[1]){
//                    return o2[0]-o1[0];
//                }
//                else {
//                    return o2[1]-o1[1];
//                }
//            }
//        };

        //comparator 방법 2
//        Comparator<int[]> myComparator = (o1,o2) ->{
//            if (o1[1]==o2[1]){
//                    return o2[0]-o1[0];
//                }
//                else {
//                    return o2[1]-o1[1];
//                }
//        };
//
//        myList.sort(myComparator);

//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }

        //Priority Queue 중요
        String[] stArr = {"hello","java","C++","world2"};
//        Queue<String> pq = new PriorityQueue<>();
////        Queue<String> pq = new PriorityQueue<>(Comparator.reverseOrder()); //내림차순 정렬
//        for (String s :stArr){
//            pq.add(s);
//        }
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }


        //글자 길이 내림차순 PQ
//        Queue<String> pq = new PriorityQueue<>((o1,o2)->o2.length()-o1.length());
//        for (String s : stArr){
//            pq.add(s);
//        }
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        // 문제 풀이 : 가장 큰 수
//        int[] numbers = {3, 30, 34, 5, 9};
//        String[] arr = new String[numbers.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = String.valueOf(numbers[i]);
//        }
//        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
//        if (arr[0].equals("0")) {
////            return "0";
//        }
//        StringBuilder answer = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            answer.append(arr[i]);
//        }
//        System.out.println(Arrays.toString(arr));

        // 가장 큰 수 : pq
//        int[] numbers={3,30,34,5,9};
//        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->(b+a).compareTo(a+b));
//        for(int n:numbers) pq.add(String.valueOf(n));
//        StringBuilder sb = new StringBuilder();
//        while(!pq.isEmpty()) {
//            sb.append(pq.poll());
//        }
//        String answer = sb.toString();
//        if(answer.charAt(0) == '0')
//            return "0";
//
//        return answer;

        //runnable 인터페이스 : threads 구현
        //thread 구현 방법 : thread 상속, runnable 주입

        //생성 방법 - runnable 인터페이스 주입을 통한 thread 생성
        Thread t1 = new Thread(new Runnable() {
            //runnable 객체 들어가게 약속되어 있음.
            @Override
            public void run() {
                System.out.println("새로 생성한 Thread1 입니다.");
            }
        });
        t1.start(); //thread 시작

        //생성 방법 - 람다 함수를 이용해 구현
        Thread t2 = new Thread(()->{
            System.out.println("새로 생성한 Thread2 입니다.");
        });
        t2.start();

        new Thread(()->System.out.println("새로 생성한 Thread3 입니다.")).start();
        System.out.println("main thread입니다.");







    }
}

//class Student implements Comparable<Student>{
class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//  모든 클래스의 조상클래스인 Object 클래스의 toString 매서드를 Overriding하여 객체 호출시에 자동으로 toString메서드 호출
    @Override
    public String toString(){
        return "이름 : " + this.name + " 나이 : " + this.age;
    }
//    @Override
//    public int compareTo(Student s) {
//        //오름차순 정렬
////        return this.age - s.getAge();
//        //이름 오름차순
//        return  this.name.compareTo(s.getName());

    }
