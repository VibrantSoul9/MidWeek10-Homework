import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetriveArrayListAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Cucumber");
        vegetableList.add("Potato");
        vegetableList.add("Cauliflower");
        vegetableList.add("Bringle");
        vegetableList.add("Onion");
        vegetableList.add("Beetroot");
        vegetableList.add("Mushroom");
        vegetableList.add("Bitter_gourd");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetableList.size()) {
            System.out.println(vegetableList.get(index));
        } else {
            System.out.println("Invalid Index!!");
        }
        scan.close();
    }
}
