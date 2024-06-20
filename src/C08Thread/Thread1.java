package C08Thread;

//Thread 클래스엔 run 메소드가 있는데 = 빈 메서드임
//실행시 작업하고자 하는 내용을 run()메서드를 overriding을 통해 구현
//상속관계이다 보니, 다중상속 불가 : runnable과의 차이
public class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread1 실행 시작");
    }
}
