package C08Thread;

public class Library {
    static int bookCount = 100;
//    public static void borrow(){
    //synchronized 키워드를 통해서 해당 메서드에 한해서 lock걸도록 설정
    //synchronized 없는경우 마이너스로 내려가버림
    public synchronized static void borrow(){
        if(bookCount>0){
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            bookCount-=1;
            System.out.println("대출완료");
            System.out.println("남아있는 책의 수량은 " + bookCount + " 입니다.");
        }else {
            System.out.println("대출불가");
        }
    }
}
