import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<String> fruits = new HashSet<String>(); // 이것도 List 와 동일하게 뒤에 String 중복이라 생략
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");                //
        fruits.add("Apple");                // 중복은 무시한다.
        fruits.add("Banana");               // Hash : 암호화
        fruits.add("banana");               // 해시 값을 저장하는 버킷 이라는것이 있다.
        fruits.add("apple");                // 버킷에 저장된 순서대로 출력되는것
        fruits.add("Kiwi");                 // HashSet 은 버킷에 저장된 것을 조회하여 아웃풋을 만든대
        fruits.add("kiwi");                 //
                                            // HashSet 은 순서가 없다고 했다.
        for (String fruit : fruits) {       // 하지만 '입력받은 순서와 관계가 없다' 의 의미이지
            System.out.println(fruit);      // 값에 따라 따로 정렬되는 순서는 정해져 있다. (이것이 hash 와 관련이있음)
        }                                   // 즉, 순서를 보장하지 않는다.

        Iterator<String> it = fruits.iterator(); // 이는 foreach 와 비슷하므로 가능
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
// 하지만 for ( ; ; ) {} 에서 인덱스로 확인 불가능 왜?? 인덱스가 존재하지 않음.
    }
}