package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {
        //math() : 0.0-1.0미만의 임의의 double형 반환
        double randomValue = Math.random(); //static method = class method
        System.out.println(randomValue);
        for (int i = 0; i < 7; i++) {
            int random = (int) (Math.random()*100);
            System.out.println(random);
        }

        //abs() : 절대값 반환
        System.out.println(Math.abs(-5));

        //ceil() : 올림, floor() : 내림, round() : 반올림 return값 double double long
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

        //min, max
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));

        //pow(a,b) : a의 b제곱 a^b
        System.out.println(Math.pow(2,3));

        //sqrt() : 제곱근
        System.out.println(Math.sqrt(25));
        int n = 100;
        for (int i=2; i<(int)Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
    }
}
