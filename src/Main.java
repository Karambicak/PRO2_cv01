import models.Pizza;
import models.PizzaMenu;

import java.util.ArrayList;
import java.util.List;

public class Main { //langer-jaroslav
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        System.out.println("Hello again");

        int num = 10;
        int num2 = 15;

        if(num == num2)
        {
            System.out.println("num == num2");
        }
        else if (num < num2)
        {
            System.out.println("num < num2");
        }
        boolean b1 = false;
        String text1 = "aaa";
        String text2 = "aaa";

        if (text1.equals(text2))
        {
            System.out.println("text1 == text2");
        }


        Pizza item1 = new Pizza(190, "Hawai", "pineapple pizza");
        Pizza item2 = new Pizza(190, "Hawai", "pineapple pizza");

        Pizza item3 = item1;
        System.out.println("item1 price " + item1.getPrice());
        item3.setPrice(200);
        System.out.println("item1 price " + item1.getPrice());


        if(item1 != item2)
            System.out.println("item1 is not equal item2");

        if(item1 == item3)
        {
            System.out.println("item1 is equal with item3");
        }

        System.out.println(item1.toString());

        List<Pizza> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new Pizza(250, "Polo", "Chicken pizza"));

        for (Pizza item : pizzaItems)
        {
            System.out.println(item);
        }
        Pizza itemFromList = pizzaItems.get(2);
        System.out.println(itemFromList);

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new Pizza(150, "Hawai", ""));
        menu1.addItem(new Pizza(200, "Polo", ""));
        menu1.addItem(new Pizza(220, "Tuna", ""));

        PizzaMenu menu2 = new PizzaMenu();
        menu2.addItem(new Pizza(150, "Hawai", ""));
        menu2.addItem(new Pizza(200, "Polo", ""));
        menu2.addItem(new Pizza(220, "Tuna", ""));

        System.out.println(menu1.getLastUpdate());
        System.out.println("Menu size: "+menu1.getMenuSize());
        for (Pizza item : pizzaItems)
            System.out.println();

    }
}
