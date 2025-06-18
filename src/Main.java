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

        if (fruits.contains("Kiwi")) {
            System.out.println("Kiwi 는 포함되어 있습니다.");
        }
        if (fruits.contains("Banana")) {
            System.out.println("Banana 는 포함되어 있습니다.");
        }
//        fruits.get(1).equals()                // contains 는 이 원리여서 대소문자 구분함
//        fruits.get(1).equals().toUpper~~      // 이걸 따로 만들어서 대소문자 구분안하기 구현가능
    }
}