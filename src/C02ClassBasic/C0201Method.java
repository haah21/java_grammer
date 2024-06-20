package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
        //for문 이용해서 1-10까지 total값 출력
        int total = 0;
        for(int i=0; i<10; i++){
            total += i;
        }
        System.out.println(total);

        //for문 이용해서 10~20까지 total값 출력 -> 중복 발생
        int total2 = 0;
        for(int i=0; i<10; i++){
            total2 += i;
        }
        System.out.println(total2);

        //코드의 중복이 발생하므로, 반복을 피하기 위해 위 기능을 분리
        System.out.println(sumAcc(100,200));
        //클래스명, 메서드 : 기본방식
        //같은 클래스 내에서의 클래스 메서드 호출은 클래스명 생략가능
        System.out.println(C0201Method.sumAcc(100,200));
    }
    //main method 밖에서 새로운 class(기능집합) 생성
    //int라는 return type가짐
    //input(매개변수) 값을 int 2개로 정의
    //메서드 구성요소 : 매개변수, 리턴타입, 접근제어자(pulblic), 클래스메서드여부(static)

    public static int sumAcc(int start, int end){
        int total = 0;
        for(int i=start; i<end; i++){
            total += i;
        }
        return total;
    }
}
