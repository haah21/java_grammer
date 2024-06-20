package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
//        //map : 중복 없음, 덮어쓰기 됨
//        myMap.put("baseball","크리켓");
//        //baseball을 map에서 겁색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
//        System.out.println(myMap);
//        //putIfAbsent : 비어있으면 put, 있으면 넣지 않음
//        myMap.putIfAbsent("basketball","배구");
//        System.out.println(myMap);
//        //getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("baseball","비어있음"));
        //있는지 확인
//        System.out.println(myMap.containsKey("baseball"));

//        Map<String, Integer> myMap = new HashMap<>();
//        String[] arr = {"농구","농구","배구","야구","배구"};
//        //방법 1
////        for(String a :arr){
////            if (myMap.containsKey(a)){
////                myMap.put(a, myMap.get(a)+1);
////            }else {
////                myMap.put(a,1);
////            }
////        }
////        System.out.println(myMap);
//
//        //방법2 //중요 외워두기
//        for(String a :arr){
//            myMap.put(a, myMap.getOrDefault(a,0)+1);
//        }
//        System.out.println(myMap);
//
//        //keySet() : 키목록 반환
//        //values() : value목록 반환
//        //index로 접급 못함 -> enhanced for문을 통해 key값 하나씩 출력
//        for (String a : myMap.keySet()){
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        }
//        for (int a : myMap.values()){
//            System.out.println(a);
//        }
//
//        //iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
//        //next()메서드는 데이터를 하나씩 소모시키면서 return
////        System.out.println(myIter.next());
////        System.out.println(myIter);
//        //순서 x, index x
//
//        //hasNext() : iterator를 통해 key값 하나씩 출력
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

        //문제풀이 : 완주하지 못한 선수

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa", "vinko"};
//        String[] completion = {"josipa", "filipa", "marina", "vinko"};

        //list로 풀이
//        List<String> partiList = new ArrayList<>(Arrays.asList(participant));
//        List<String> compleList = new ArrayList<>(Arrays.asList(completion));
//        for (String c : compleList){ //O(n^2)
//            partiList.remove(c);
//        }
//        System.out.println(partiList);
        //list로 풀이 2
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        for(int i=0; i<completion.length; i++){
//            if (!participant[i].equals(completion[i])) return participant[i];
//        }

        //Map으로 풀이
//        Map<String, Integer> partiMap = new HashMap<>();
//        String answer = "";
//        for (String p : participant){
//            partiMap.put(p, partiMap.getOrDefault(p, 0)+1);
//        }
//        for (String c : completion){
//            if (partiMap.containsKey(c)){
//                partiMap.remove(c);
//            }else {
//                partiMap.put(c, partiMap.get(c)-1);
//            }
//        }for (String a : partiMap.keySet()){
//            answer = a;
//        }
//        System.out.println(answer);

        //문제 풀이 : 의상
//        class Solution {
//            public int solution(String[][] clothes) {
//                Map<String, Integer> map = new HashMap<>();
//                int answer = 1;
//                for(int i = 0; i < clothes.length; i++) {
//                    // 의상 종류 별로 몇개씩 있는지 hash에 저장해주기
//                    map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
//                }
//                for(String key : map.keySet()) {
//                    answer *= (map.get(key) + 1);   // 조합 -> 안입는 경우도 고려하기 위해 + 1
//                }
//                answer -= 1; // 모두 '안입음'일 경우 -1 해주기
//                return answer;
//            }
//        }

//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, Integer> clothesMap = new HashMap<>();
//        int answer = 1;
//        for(int i=0; i<clothes.length;i++){
//            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1],0)+1);
//        }
//        for (String key : clothesMap.keySet()){
//            answer *= (clothesMap.get(key) + 1);
//        }
//        answer -= 1;
//        System.out.println(answer);

        //LinkedHashMap : 데이터 삽입순서 유지
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",1);
//        linkedMap.put("hello3",1);
//        linkedMap.put("hello2",1);
//        linkedMap.put("hello1",1);
//        System.out.println(linkedMap);
//
//        //TreeMap : key를 통해 데이터를 정렬(최적화)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",1);
//        treeMap.put("hello3",1);
//        treeMap.put("hello2",1);
//        treeMap.put("hello1",1);
//        System.out.println(treeMap);

        //문제 풀이 : 문자열 내 마음대로 정렬하기
//        class Solution {
//            public String[] solution(String[] strings, int n) {
//                String[] answer = new String[strings.length];
//
//                HashMap<Integer, String> map = new HashMap<Integer, String>();
//
//                for(int i=0; i<strings.length; i++) {
//                    map.put(i, strings[i].substring(n, n+1));
//                }
//
//                String[] str = new String[strings.length];
//
//                for(int j=0; j<map.size(); j++) {
//                    str[j] = map.get(j);
//                }
//
//                Arrays.sort(str);
//
//                for(int k=0; k<map.size(); k++) {
//                    List<Integer> keyList = new ArrayList<Integer>();
//
//                    for(Map.Entry<Integer, String> entry : map.entrySet()){
//                        if(entry.getValue().equals(str[k]) ){
//                            keyList.add(entry.getKey());
//                        }
//                    }
//                    if(keyList.size() == 1) {
//                        answer[k] = strings[keyList.get(0)];
//                    } else {
//                        String[] s = new String[keyList.size()];
//                        for(int t=0; t<keyList.size(); t++) {
//                            s[t] = strings[keyList.get(t)];
//                        }
//                        Arrays.sort(s);
//                        for(int t=0; t<s.length;t++) {
//                            answer[k++] = s[t];
//                        }
//                        k--;
//                    }
//                }
//
//                return answer;
//            }
//        }
        String[] strings = {"sun", "bed", "car"};
        int n=1;
        Map<String,String> map = new TreeMap<>();
        for(String a : strings){
            map.put(a.charAt(n)+a,a);
        }
        String[] answer = new String[strings.length];
        int count=0;
        for(String a : map.values()) {
            answer[count] = a;
            count++;
        }

        System.out.println(Arrays.toString(answer));



        }

    }
