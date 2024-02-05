package collection1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Collection01 {
    public static void main(String[] args) {
        //리스트 생성
        ArrayList<String> arrayList = new ArrayList<String>();

        //리스트에 요소의 저장

        arrayList.add("넷");
        arrayList.add("둘");
        arrayList.add("셋");
        arrayList.add("하나");

        // 리스트 요소의 출력
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (String string : arrayList) {
            System.out.println(string);
        }
        System.out.println(arrayList.contains("넷"));
        System.out.println(arrayList.contains("다섯"));

    }
}

