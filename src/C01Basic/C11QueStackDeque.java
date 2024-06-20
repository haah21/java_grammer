package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); //값을 꺼냈다가 다시 넣음
//        System.out.println(myQue);
//        System.out.println(myQue.poll()); //값을 꺼내버림
//        System.out.println(myQue);
//
//        Queue<Integer> myList = new LinkedList<>();
        //myList.get Queue이기 때문에 사용불가

        //LinkedList와 ArrayList비교
        //LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i=0; i<10000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList의 중간 삽입 시간: " + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i=0; i<10000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 시간: " + (endTime2-startTime2));
//
//        //조회 성능 비교
//        long startTime3 = System.currentTimeMillis();
//        for (int i=0; i<10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList의 중간 조회 시간: " + (endTime3-startTime3));
//
//        ArrayList<Integer> list4 = new ArrayList<>();
//        long startTime4 = System.currentTimeMillis();
//        for (int i=0; i<10000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 조회 시간: " + (endTime4-startTime4));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

        //ArrayBlockingQueue : 길이제한큐 , 활용도 엄청 높음
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        //우선순위큐 : 데이터를 꺼낼 때 정렬된 데이터 pop
//        //add를 사용하면 길이제한 초과시 예외 발생
////        queue.add("10");
////        queue.add("20");
////        queue.add("30");
////        queue.add("40");
////        System.out.println(queue);
//        //->error
//
//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);
//        //우선순위 큐: 데이터를 꺼낼때 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        //System.out.println(pq);
//        //오름차순 정렬해서 출력
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//        //pq활용 문제풀이 : 더 맵게
//
//                int[] scoville = {1,2,3,9,10,12};
//                int K = 7;
//                int answer = 0;
//                PriorityQueue<Integer> que = new PriorityQueue<>();
//
//                for (int i = 0; i < scoville.length; i++) {
//                    que.add(scoville[i]);
//                }
//                while(que.peek() < K) {
//                    if (que.size() == 1)
//                        break;
//                    que.add(que.poll() + que.poll() * 2);
//                    answer++;
//                }
//
//                //stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//
//        //pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//        System.out.println(st1.peek());
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

        //String 객체 5개정도 추가 후 while 문을 통해 출력
//        Stack<String> st2 = new Stack<>();
//        st2.push("I");
//        st2.push("wanna");
//        st2.push("go");
//        st2.push("home");
//
//        while (!st2.isEmpty()){
//            System.out.println(st2.pop());
//        }

        //문제풀이 : 같은 숫자는 싫어
//        int[] arr = {1, 1, 3, 3, 0, 1, 1};
//        int n = 0;
////        int[] answer = {};
////        //integer를 담는 Stack 선언
//        Stack<Integer> st = new Stack<Integer>();

//        for(int i=0; i<arr.length; i++){
//            if(i==0) st.push(arr[i]);
//            else if(st.peek() !=arr[i]) st.push(arr[i]);
//        }
//
//        answer = new int[st.size()];
//        for(int i=st.size()-1; i >= 0;i--){
//            answer[i] = st.pop();
//        }
//
//        System.out.println(Arrays.toString(answer));

//        for(int a: arr){
//            if (st.isEmpty()){
//                st.push(a);
//            }else {
//                if (st.peek() != a){
//                    st.push(a);
//                }
//            }
//        }
//
////        int[] answer = new int[st.size()];
//////        방법1
//////        for(int a: st){
//////            System.out.println(a);
//////        }
////        for(int i= answer.length-1; i>=0; i++){
////            answer[i] = st.pop();
////        }
////        System.out.println(Arrays.toString(answer));
//
//        List<Integer> myList = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(i==0 || arr[i-1] != arr[i]){
//                myList.add(arr[i]);
//            }
//        }
//        System.out.println(myList);

        //문제풀이 : 올바른 괄호

//         class Solution {
//
//            boolean solution(String s) {
//                Stack<Character> stack = new Stack<>();
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) == '(') {
//                        stack.push('(');
//                    } else if (s.charAt(i) == ')') {
//                        if (stack.isEmpty()) {
//                            return false;
//                        }
//                        stack.pop();
//                    }
//                }
//                return stack.isEmpty();
//            }
//        }

        //Deque : Interface, queue/stack 대신 이걸로 씀 //중요
        Deque<Integer> d1 = new ArrayDeque<>();
         d1.addLast(10);
         d1.addLast(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());
        System.out.println(d1.pollFirst()); //poll
        System.out.println(d1.pollLast()); //pop

        //문제 추천 : 다리를 지나는 트럭 deque로 풀어보기

    }
}
