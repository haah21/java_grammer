package C08Thread;

public class LibraryThread2 implements Runnable {

    @Override
    public void run() {
        Library.borrow();
        System.out.println("LibraryThread2 start");
    }
}
