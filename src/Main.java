import Abstract_Factory_Design.GourmetPizzaFactory;
import Abstract_Factory_Design.SicilianPizzaFactory;
import Factory_Method_Pattern.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Calling cheesepizza");
//        Pizza c = new CheesePizza();
//        c.bakePizza();
//        c.addIngredients();
//        System.out.println("calling veg pizza");
//        VegPizza v = new VegPizza();
//        v.bakePizza();
//        v.addIngredients();
        System.out.println("please select the option: cheese, veggie,pepperoni");
        Scanner scanner = new Scanner(System.in);
//        BasePizzaFactory basePizzaFactory = new PizzaFactory();
        String name = scanner.nextLine();
//        basePizzaFactory.createPizza(name);
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        pizzaFactory.createPizza(name);
        BasePizzaFactory basePizzaFactory = new SicilianPizzaFactory();
        basePizzaFactory.createPizza("cheese");


    }
    }