package C07ExceptionFileParsing.AuthorException;

import java.util.IllegalFormatWidthException;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true){
            //입력
            //1.회원가입 2.로그인
            System.out.println("1.회원가입 2.로그인");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1){
                //회원가입 서비스 호출
                System.out.println("이름을 입력하세요");
                String name = sc.nextLine();
                System.out.println("email을 입력하세요");
                String email = sc.nextLine();
                System.out.println("password을 입력하세요");
                String password = sc.nextLine();
                authorService.register(name, email, password);
            }else if(number == 2){
                //로그인 서비스 호출
                System.out.println("email을 입력하세요");
                String email = sc.nextLine();
                System.out.println("password을 입력하세요");
                String password = sc.nextLine();
                try{
                    authorService.login(email, password);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}
