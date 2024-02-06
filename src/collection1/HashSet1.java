package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        //add 메소드를 이용한 요소의 저장
        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정")); //중복된 요소의 저장

        for (String s : hs01) {
            System.out.print(s + " ");
        } //중복 요소는 저장되지 않는다.

        //add 메소드를 이용한 요소의 저장
        hs02.add("임꺽정");
        hs02.add("홍길동");
        hs02.add("이순신");
        System.out.println();
        Iterator<String> iterator = hs02.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("size 메소드를 이용한 요소의 총 개수");
        System.out.println("집합의 크기 : " + hs02.size());
    }
}
