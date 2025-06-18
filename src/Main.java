import java.util.ArrayList;
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

        fruits.remove("DragonFruit");   // 직접 지우기
        fruits.remove(3);            // 인덱스로 지우기

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());       // 장바구니 비었는지 체크

    }
}