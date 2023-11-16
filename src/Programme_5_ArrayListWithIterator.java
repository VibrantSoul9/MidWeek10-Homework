import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grape");
        fruitList.add("Mango");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("Blackberry");
        fruitList.add("Strawberry");
        fruitList.add("Cherry");
        ListIterator<String> iterate = fruitList.listIterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ,");
        }
    }
}
