package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
        //set : 중복이 없다. 순서가 없다.
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

        //문제 풀이 : 폰켓몬
//        int[] nums = {3,3,3,2,2,4};
//        int max = nums.length/2;
//        int answer = 0;
//
//        Set<Integer> set = new HashSet<>();
//        for (int i:nums){
//            set.add(i);
//        }
//
//        if (max >= set.size()) answer = set.size();
//        else answer = max;
//
//        System.out.println(answer);

//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet);
//
//        //list를 인자값으로 받아서 초기값 세팅 가능
//
//        String[] arr = {"baseball","baseball","basketball","basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println(mySet2);

        //문제풀이 : 전화번호 목록
        String[] phone_book = {"119", "97674223", "1195524421"};
//        class Solution {
//            public boolean solution(String[] phone_book) {
//                boolean answer = true;
//                HashSet<String> set = new HashSet<>();
//
//                for (String phone : phone_book){
//                    set.add(phone);
//                }
//
//                for (String phone : phone_book){
//                    for (int i=0 ;i<phone.length(); i++){
//                        if (set.contains(phone.substring(0,i))){
//                            return false;
//                        }
//                    }
//                }
//                return answer;
//            }
//        }

        //방법2
//        class Solution {
//            public boolean solution(String[] phone_book) {
//                boolean answer = true;
//                Arrays.sort(phone_book); //Nlogn
//                for (int i = 1; i < phone_book.length; i++) {
//                    if (phone_book[i].startsWith(phone_book[i - 1])) return false;
//                }
//                return answer;
//            }
//        }

        //집합관련함수 : 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> set1 = new HashSet<>(Arrays.asList("java","python","javascripot"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java","html","css"));

        //교집합
//        set1.retainAll(set2); //-> set1자체가 교집합으로 변해버림
//        System.out.println(set1); //java

        //합집합
//        set1.addAll(set2);
//        System.out.println(set1);

//        set1.removeAll(set2);
//        System.out.println(set1);

        //문제풀이 : 뉴스 클러스터링(안풀음)

        //set = 중복제거 목적으로 사용함
        //LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello1");
        System.out.println(mySet);

        //두 개 뽑아서 더하기 ,배열, 리스트, treeSet으로 풀어보기
        class Solution {
            public int[] solution(int[] numbers) {
                Set<Integer> set = new HashSet<>();

                for(int i=0; i<numbers.length; i++) {
                    for(int j=i+1; j<numbers.length; j++) {
                        set.add(numbers[i] + numbers[j]);
                    }
                }

                return set.stream().sorted().mapToInt(Integer::intValue).toArray();
            }
        }
    }
}
