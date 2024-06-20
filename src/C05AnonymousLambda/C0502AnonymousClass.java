package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
        //AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고, 익명의 클래스가 만들어집과 동시에 익명 개체 생성
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound2() {

            }
        };

        //익명객체에 구현메서드가  1개밖에 없을 때에 람다 표현식(화살표함수)로 표현가능
        //()안에 매개변수를 지정하여 구현체에서 활용
        //변수의 개수와 순서에 맞춰서 지정
        Animal a2 = () -> System.out.println("동물소리를 냅니다.");
//        Animal a2 = (a, b) -> System.out.println("동물소리를 냅니다." + a+b);
//        a2.makeSound(10,20);

        //Animal2 : 익명객체 만들어서 Input1 + input2 + input3을 더해서 return하는 메서드 정의
        //위에서 return 문자열 출력
//        Animal2 a3 = new Animal2() {
//            @Override
//            public String makeSound(String a, String b, int c) {
//                return a+b+c;
//            }
//        };

        Animal2 a3 = (input1, input2, input3) -> {return input1+input2+input3; };
        System.out.println(a3.makeSound("월","멍",1));
        //실행문이 한줄일때는 {}, return 생략 가능. 2줄 이상일때는 {}를 사용해서 return 처리
        Animal2 a4 = (a,b,c) ->{
                if (c>10){
                    return a+b;
                }else {
                    return a;
                }
        };
        System.out.println(a4.makeSound("hello","java",15));


    }
}
interface Animal{
    //    void makeSound(int a, int b);
    void makeSound();
}
interface Animal2{
    //    void makeSound(int a, int b);
    String makeSound(String a, String b, int c);
}
abstract class AbstractAnimal{
    void makeSoud1(){

    }
    abstract void makeSound2();
}