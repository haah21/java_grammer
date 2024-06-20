package C03Inheritance;

import java.util.List;

//상속 불가
//public class C0305thers extends FinalParents{
public class C0305thers{
    public static void main(String[] args) {

        //추상클래스와 인터페이스는 구현없이 객체생성 불가
        //AbstractAnimal a = new  AbstractAnimal();
        //List<Integer> myList = new List<Integer>();

    }
}

//final을 클래스에 붙이면 상속 불가한 클래스 생성
final class FinalParents{

}

//추상클래스
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물 소리를 냅니다.1");
    }
    //메서드 앞에 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물 소리를 냅니다.2");
    }
    //abstract 키워드는 자식클래스로 하여금 오버라이딩 강제
    //abstract 메소드가 하나라도 있으면 클래스에도 abstract 키워드가 붙어야함
    //리턴 타입과 매개변수만 정의
    abstract void makeSound3();
}
class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound3() {
        System.out.println("멍멍3");
    }
//    @Override
//    void makeSound2(){
//        System.out.println("멍멍2");
//    }
}