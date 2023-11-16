import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args){
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Green");
        colourList.add("Yellow");
        colourList.add("Black");
        colourList.add("White");
        colourList.add("Orange");
        colourList.add("Purple");
        colourList.add("Cyan");
        for (String colorList : colourList) {
            System.out.print(colourList + ", ");
        }
    }
}
