package C09Networking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        //mysql 드라이버가 필요
        String url = "jdbc:mysql://localhost:3307/board1?useSSL=false";
        //useSSL=false : 보안처리 x
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        //connection 실패시 runtimeError
        System.out.println("DB 연결 성공");
    }
}
