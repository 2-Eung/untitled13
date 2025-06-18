import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("DragonFruit");
        fruits.add("Apple");
        fruits.add("Mango");

        Collections.sort(fruits);                // 알파벳 오름차순 으로 정렬 ( 유니코드 순서, 대문자가 먼저임 )
                                                 // 반복문을 통해 모든 요소의 크기를 비교함

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}