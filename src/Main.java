import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> fruits = new ArrayList<String>();  // ArrayList 의 <> 안은 중복되어 생략한다.
        List<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("DragonFruit");
        fruits.add("Mango");

        for(int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits[i]);     // 일반적인 배열에서는 배열명[n] (인덱스) 으로 가져오지만
            System.out.println(fruits.get(i));   // ArrayList 는 getter, setter 에서 getter인 get 을 이용하여 가져온다.
                                                 // 직접접근을 막아놓아서 메소드로 접근해야 한다.   목적 : 캡슐화
                                                 // 하지만 get() 메소드도 인덱스로 접근하는것이긴 하다.
        }
        for(String fruit : fruits) {             // foreach 로 대체 가능
            System.out.println(fruit);
        }

        Iterator<String> it = fruits.iterator();    // Iterator : 반복적인것을 다룸
        while (it.hasNext()) {                      // foreach 의 내부 구조와 매우 유사
            String item = it.next();
            System.out.println(item);
        }
    }
}