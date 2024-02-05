package collection1;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        //타입 설정 int
        LinkedList<Integer> list = new LinkedList<Integer>();

        // 생성시 초기값 설정

        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1, 2));

        System.out.println("Linked-List : " + list2 );

        System.out.println("list.get(0) , 0번쨰 요소 가져오기 ");
        System.out.println(list2.get(0));

        System.out.println("addFirst(0) , 첫번째에 0 추가");
        list2.addFirst(0);
        System.out.println("Linked-List : " + list2 );

        System.out.println("addLast(3) , 마지막에 3 추가");
        list2.addLast(3);
        System.out.println("Linked-List : " + list2 );


        System.out.println("add(4, 4) , 4번째 인덱스에 4번째");
        list2.add(4, 4);
        System.out.println("Linked-List : " + list2 );

        System.out.println("removeFirst() , 첫번째 요소 삭제");
        list2.removeFirst();
        System.out.println("Linked-List : " + list2 );

        System.out.println("clear() , 모두 삭제");
        list2.clear();
        System.out.println("Linked-List : " + list2 );

    }
}
