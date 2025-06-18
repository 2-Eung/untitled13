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

        int index = fruits.indexOf("Banana");   // () 안이 포함되어있으면 해당 인덱스 출력
        System.out.println(index);
        int index2 = fruits.indexOf("Kiwi");    // 포함되어있지않으면 -1 을 출력
        System.out.println(index2);

        fruits.set(1,"Apple");                  // 해당 인덱스 내용을 수정한다
        System.out.println(fruits.get(1));      // get() () 안의 인덱스 를 읽어온다
        int index3 = fruits.indexOf("Apple");   // 포함한 첫번째 인덱스
        System.out.println(index3);

        List<String> subFruits = fruits.subList(0, 2);  // .subList 기존리스트 를 잘라서 새로만든다
        // 입력값1 인덱스 부터 입력값2 인덱스 전 까지
        for(String subFruit: subFruits) {
            System.out.println(subFruit);
        }
    }
}