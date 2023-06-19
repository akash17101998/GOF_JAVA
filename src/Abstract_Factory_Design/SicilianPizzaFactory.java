package Abstract_Factory_Design;

import Factory_Method_Pattern.*;

public class SicilianPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        BaseToppingFactory toppingFactory = new SicillianToppingFactory();
        switch (type.toLowerCase()){
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VegPizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }

}
