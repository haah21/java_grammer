// 예외처리 엄청 중요
package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) throws SQLException {
//        System.out.println("나눗셈 프로그램입니다");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("분자 입력");
//        int head = Integer.parseInt(sc.nextLine());
//        System.out.println("분모 입력");
//        int tail = Integer.parseInt(sc.nextLine());
//        System.out.println("나눈 결과값은 "+(head/tail)); // 분모에 0 넣으면 error 뜸
//        int result = head/tail;
//        System.out.println("나눈 결과값은 "+result);

        // 예외가 발생할 것으로 예상되는 코드에 try로 감싸고
        // 예외가 발생했을 때 대응하는 코드를 catch에 작성한다.
//        try{
//            System.out.println("분자 입력");
//            int head2 = Integer.parseInt(sc.nextLine());
//            System.out.println("분모 입력");
//            int tail2 = Integer.parseInt(sc.nextLine());
//            int result2 = head2/tail2;
//            System.out.println("나눈 결과값은 "+result2);
//        // 예외는 catch 구문 순차적으로 검사
//            // 따라서 Exception을 맨마지막에 둬야해
//        }catch (ArithmeticException e){ //unchecked
//            System.out.println("0으로 나누시면 안됩니다");
//            // 예외가 발생된 내역을 로그로 남기기 위함
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }catch (NumberFormatException e){ //조상
//            System.out.println("숫자에 맞는 값을 입력해주세요");
//        // Exception은 모든 예외의 조상 클래스
//            // 그래서 무조건 걸림, 대신 앞에거가 먼저 걸리고 그다음에 Exception
//        }catch (Exception e){
//            System.out.println("예외가 발생했습니다.");
//        } finally {
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다.");

        // throws : 예외 처리 위임을 명시하는 것
//        login("1234");
        //login2("1234");
        //checked exception 예시
        try {
            login2("1234");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //checked : 예상 가능한 예외(다른 시스템과의 네트워크, 타 시스템과의 통신) ex DB 조회, java에서 disk 조회 후 작업
        //unchecked : 예상 불가능한 예외(프로그램 자체의 이슈)

    }

    static void login2(String password) throws SQLException {
        //DB에서 조회한다고 가정
        //방법 1 직접 예외처리
//        try {
//            if (password.length() < 10) {
//                throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
        //방법 2 메서드를 호출할 쪽에 위임 throws
        if (password.length() < 10) {
            throw new SQLException("DB조회 상황에서 예외가 발생했습니다.");
        }

        //unchecked 예외에서는 throws 키워드가 예외사항을 명시하는 용도로만 사용된다.
    }

    static void login(String password) throws IllegalArgumentException, RuntimeException{ // 예외처리가 강제가 아니니깐 throws 가 장식임
        //IllegalArgumentException = RuntimeException에 포함됨 -> 생략가능
        if(password.length()<10){
            // throw new : 예외를 강제로 발생
            // 예외는 기본적으로 메서드를 호출한 쪽에 전파
            // unchecked 예외는 예외처리가 강제되지 않음
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        if(password.contains("*")){
            throw  new RuntimeException(("예외발생"));
        }
    }
}

