package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements m1 = new MyImplements();
        m1.mehtodA();
        //MyImplements에 my_constant변수가 상속(static final)
        System.out.println(MyImplements.my_constant);
    }
}
interface MyInterface{
    //아래 변수는 컴파일 타임에 static final 키워드가 붙음
    int my_constant = 10;
    void  mehtodA();
}
class MyImplements implements MyInterface{

    @Override
    public void mehtodA() {
        System.out.println("hello world");
    }
}