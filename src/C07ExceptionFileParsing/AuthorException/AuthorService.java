package C07ExceptionFileParsing.AuthorException;

import java.util.*;


public class AuthorService {
    private AuthorRepository authorRepository;
    AuthorService(){
       authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password){
        Author author = new Author(name, email, password);
        authorRepository.register(author);
        //검증도 여기서 해야함
    }
    public void login(String email, String password) throws IllegalArgumentException{
        //해당하는 email 있는지 author list 목록조회 -> Service에서 접근 불가 author repository에서 접근해서 줘야함
        List<Author> authorList = authorRepository.getAuthorList();
        boolean emailNotFound = false;
        boolean passwordNotEqual = false;
        for (Author a : authorList){
            if (a.getEmail().equals(email)){
                emailNotFound = true;
                if (a.getPassword().equals(password)){
                    passwordNotEqual = true;
                }
            }
        }
        //그 email에 이 password가 맞는지
        if (emailNotFound == false){
            throw  new NoSuchElementException("없는 이메일입니다.");
        }
        if(passwordNotEqual== false){
            throw new IllegalArgumentException("password가 일치하지 않습니다.");
        }
    }

    public Long login2(String email, String password) throws IllegalArgumentException {
        Optional<Author> authorOpt = authorRepository.findAuthorByEmail(email);
        Author author = authorOpt.orElseThrow(() -> new IllegalArgumentException("[Login Error] 존재하지 않는 유저입니다."));

        if(!password.equals(author.getPassword())) {
            throw new IllegalArgumentException("[Login Error] 비밀번호가 일치하지 않습니다.");
        }

        System.out.println("[Login Success] 로그인 되셨습니다.");
        return (long) author.getId();
    }

}
