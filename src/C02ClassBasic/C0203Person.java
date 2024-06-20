package C02ClassBasic;

public class C0203Person {
    String name;
    String email;
    int age;
    //객체 메서드
    public void eating(){
        System.out.println(this.name + "이 밥을 먹는다.");
    }

    //setter
    public void setName(String name){
        this.name=name;
    }
    //getter
    public String getName(){
        return this.name;
    }
}
