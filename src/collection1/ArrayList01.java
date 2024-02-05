package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();


        //add() 메소드를 이용한 요소의 저장
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(10);


        System.out.println("for 문과 get() 메소드를 이용한 요소의 출력");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");

        }

        //remove() 메소드를 이용한 요소의 제거
        System.out.println("remove() 메소드를 이용한 요소의 제거");
        arrayList.remove(1); // 1번째 인덱스 제거


        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("Enhanced for 문과 get() 메소드를 이용한 요소의 출력");
        for (int e : arrayList) {
            System.out.println(e + " ");
        }

        //Collection.sort() 메소드를 이용한 요소의 정렬
        System.out.println("Collection.sort() 메소드를 이용한 요소의 정렬");
        Collections.sort(arrayList);

        //iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        System.out.println("iterator() 메소드와 get() 메소드를 이용한 요소의 출력");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        //set() 메소드를 이용한 요소의 변경
        System.out.println("set() 메소드를 이용한 요소의 변경");
        arrayList.set(0, 20); //0번째를 20으로

        for (Integer i : arrayList) {
            System.out.println(i + " ");
        }


        //size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + arrayList.size());

    }
}
