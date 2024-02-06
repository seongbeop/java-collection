package collection1;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        //put 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        //Enhanced for 문과 get 메소드를 이용한 요소 출력
        System.out.println("맵에 지정된 키들의 집합 : " + hm.keySet());
        for (String s : hm.keySet()) {
            System.out.println("키 : " + s + ", 값 : " + hm.get(s));

        }

        System.out.println("remove 메소드를 이용한 요소의 제거");
        hm.remove("사십");

        //iterator 메소드와 get 메소드를 이용한 요소의 출력
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println("키 : " + key + ", 값 : " + hm.get(key));
        }

        //
        System.out.println("replace 메소드를 이용한 요소의 수정");
        hm.replace("이십", 200);

        for (String s : hm.keySet()) {
            System.out.println("키 : " + s + ", 값 : " + hm.get(s));
        }

        //size
        System.out.println("맵의 크기 : " + hm.size());

    }
}
