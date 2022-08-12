import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class Practice {
    public static void main(String args[]) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomato");
        produceList.add("onion");
        produceList.add("beans");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("cola");
        drinkList.add("gin");
        drinkList.add("vodka");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(2).get(2));





    }
}

