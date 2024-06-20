package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepository {
    List<Author> authorList;
    AuthorRepository(){
       authorList  = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }
    List<Author>getAuthorList(){
        return this.authorList;
    }
    public Optional<Author> findAuthorByEmail(String email) {
        return authorList.stream().filter(author -> author.getEmail().equals(email)).findFirst();
    }
}
