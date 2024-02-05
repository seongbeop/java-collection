package collection1;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // add() 메소드를 이용한 요소의 저장

        linkedList.add("넷");

        linkedList.add("둘");

        linkedList.add("셋");

        linkedList.add("하나");

        // for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("for 문과 get() 메소드를 이용한 요소의 출력");
        for (int i = 0; i < linkedList.size(); i++) {

            System.out.println(linkedList.get(i) + " ");

        }

        // remove() 메소드를 이용한 요소의 제거
        System.out.println("remove() 메소드를 이용한 요소의 제거");
        linkedList.remove(1);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("Enhanced for 문과 get() 메소드를 이용한 요소의 출력");
        for (String s : linkedList) {
            System.out.println(s + " ");
        }

        //set 메소드를 이용한 요소의 변경
        System.out.println("set 메소드를 이용한 요소의 변경");
        linkedList.set(2, "둘");
        for (String s : linkedList) {
            System.out.println(s + " ");
        }

        System.out.println("리스트의 크기 : " + linkedList.size());

    }
}
