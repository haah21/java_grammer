package C07ExceptionFileParsing;

import board.Post;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //json 데이터를 http 요청을 통해 받아와야함
        //parsing 통해 객체 생성
        //http 클라이언트가 java에 내장
        //Spring에서는 RestTemplate을 통해 Http 요청하고, 여기서는 java에 내장된 http 클라이언트 사용
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response =
        client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonList = objectMapper.readTree(posts);
        List<Post1> postList = new ArrayList<>();
        for (JsonNode j : jsonList){
            postList.add(objectMapper.readValue(j.toString(), Post1.class));
        }

        //List<Post1>객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);

        System.out.println(postList);
    }
}

class Post1{
    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString(){
        return "id : "+ this.id + " title : " +this.title;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}