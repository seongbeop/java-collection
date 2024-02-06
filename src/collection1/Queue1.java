package collection1;

import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        LinkedList<String> qu = new LinkedList<String>(); //큐의 생성
        //Deque<String> qu = new ArrayDeque<String>

        //add 메소드를 통한 요소의 저장
        qu.add("넷");
        qu.add("둘");
        qu.add("셋");
        qu.add("하나");

        System.out.println("peek 메소드를 이용한 요소의 반환");
        System.out.println(qu.peek());
        System.out.println(qu);

        System.out.println("poll 메소드를 이용한 반환 및 제거");
        System.out.println(qu.poll());
        System.out.println(qu);

        System.out.println("remove 메소드를 이용한 요소의 제거");
        qu.remove("하나");
        System.out.println(qu);

    }
}
