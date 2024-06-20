package C08Thread;

public class LibraryThread1 extends Thread{
    @Override
    public void run(){
        Library.borrow();
        System.out.println("LibraryThread1 start");
    }
}
