package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass pc = new C0304ProtectedClass();
        //public : 접근가능
        System.out.println(pc.st4);
        //private : 접근 불가능
        //System.out.println(pc.st1);

        //default : 접근가능
        System.out.println(pc.st2);
        //protected : 접근가능
        System.out.println(pc.st3);
    }
}
