package C02ClassBasic;
//어떤 숫자값이 소수인지 아닌지를 판별하는 메서드 생성
//=> 리턴타입은 boolean, 매개변수는 int 숫자

public class C0201MethodPractice {
    public static void main(String[] args) {
        is_prime(10);
    }

    public static void is_prime(int num){
        //소수 : true, 소수 아니면 false;
        if (num ==0 || num ==1) {
            System.out.println("소수가 아닙니다.");
            return ;
        }
        for (int i=2; i*i<=num; i++){
            if(num % i ==0 ){
//                checked = false;
//                break;
                //메소드는 retrun 만나면 바로 종료
                //void 리턴타입에서도 메서드 강제 종료를 위해 return 사용
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
        return ;
    }

}
