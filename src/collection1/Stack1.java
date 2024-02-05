package collection1;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();


        System.out.println("push 메소드를 이용한 요소의 저장");
        st.push(4);
        st.push(2);
        st.push(3);
        st.push(1);
        System.out.println(st);

        System.out.println("peek 메소드를 이용한 제일 상단 요소의 반환");
        System.out.println(st.peek());
        System.out.println(st);

        System.out.println("search 메소드를 이용한 요소의 위치 검색");
        System.out.println(st.search(4));
        System.out.println(st.search(3));
        System.out.println(st);

        System.out.println("pop 메소드를 이용한 제일 상단 요소의 반환 및 제거");
        System.out.println(st.pop());
        System.out.println(st);

    }
}
