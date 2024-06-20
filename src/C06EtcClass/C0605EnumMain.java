package C06EtcClass;

public class C0605EnumMain {
    public static void main(String[] args) {
        EnumStrudent s1 = new EnumStrudent();
        s1.setName("hong1");
        s1.setClassGrade(ClassGrade.c1);

        EnumStrudent s2 = new EnumStrudent();
        s2.setName("hong2");
        s2.setClassGrade(ClassGrade.c2);
        s1.setRole(Role.GENERAL_USER);
        //System.out.println(s1.getRole());
        //여전히 타입이 String 타입이므로 임의 클래스변수 사용하지 않을 수 있음
        //s2.setClassGrade("secondgrade");//사용가능

        //role의 경우 enum 설정시 위와 같은 실수를 방지할 수 있음.
        //s2.setRole("GENERAL_USER"); //안됨 //타입불일치
        s2.setRole(Role.ADMIN_USER);
        System.out.println(s2.getRole());
        System.out.println(s2.getRole().getClass());

        //enum 값 : 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s2.getRole().ordinal());
    }
}
class ClassGrade{
    static final String c1 = "first_grade";
    static final String c2 = "second_grade";
    static final String c3 = "third_grade";
}

enum Role{
    //각 열거형 상수는 콤마로 구분하고, 상수목록 끝에 세미콜론으로 마무리
    //static final 생략되어있는 형식
    GENERAL_USER, ADMIN_USER;
    //각각의 숫자값 가지고 있지만 그 숫자값으로 응용하는건 좋지 않다
    //ex)DB에 Role 저장할때 general_user의 숫자값 저장하는 방식 사용 -> 가독성 떨어짐
}

class EnumStrudent{
    private String name;
    private String classGrade;
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}