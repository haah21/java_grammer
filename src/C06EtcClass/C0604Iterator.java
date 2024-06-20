package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("cherry");
        myList.add("banana");
//
//        //enhanced for 문 : 원본변경불가
//        for(String a : myList){
//            System.out.println(a);
//        }

        //iterator는 참조하고 있는 원본데이터 삭제 가능 -> remove
        Iterator<String> iters1 = myList.iterator();
        while (iters1.hasNext()){
            //소거하면서 출력
            System.out.println(iters1.next());
        }

        Iterator<String> iters2 = myList.iterator();
        while (iters2.hasNext()){
            if(iters2.next().equals("banana")){
                iters2.remove();
            }
        }
        System.out.println(myList);
        //각 객체마자 iterator 내장함 -> 사용성 많음 -> 기억하면 좋을듯 or enhanced for 문
    }
}
