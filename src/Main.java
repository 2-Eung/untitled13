import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String > fruits = new HashSet<>();
//        Set<String > fruits = new LinkedHashSet<>();
        Set<String > fruits= new TreeSet<>();           // 오름차순 정렬

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Charry");


        for (String fruit : fruits) {       // LinkedHashSet, TreeSet 일 때 순서 보장
            System.out.println(fruit);
        }

    }
}