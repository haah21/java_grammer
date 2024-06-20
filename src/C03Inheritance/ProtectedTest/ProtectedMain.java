package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;
import C03Inheritance.C0304ProtectedTest;
//*을 통해 패키지내에 모든 클래스 import가능
//*을 통해 패키지 내에 패키지까지 포함해서 모든 내용 import는 불가능
//즉, import java.* 이건 불가

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        //public 변수 접근 가능
        //protected, default : 안됨
        //상속관계 x
        C0304ProtectedClass c1 = new C0304ProtectedClass();
        //default 접근 불가
        //System.out.println(c1.st2);
        //protected 접근 불가
        //System.out.println(c1.st3);

        ProtectedMain p1 = new ProtectedMain();
        //default 접근 불가
        //System.out.println(p1.st2);
        //상속한 객체에서 protected 접근 가능
        System.out.println(p1.st3);

        //java.lang.String -> import 안해도 쓸 수 있음
        String a = new String("hello");

    }
}
