//package Factory_Method_Pattern;
//
//public class PizzaFactory extends BasePizzaFactory{\
//    @Override
//    public Pizza createPizza(String type){
//    Pizza pizza;
//    switch (type.toLowerCase()){
//        case "cheese":
//            pizza = new CheesePizza();
//            break;
//        case "pepperoni":
//            pizza = new PepperoniPizza();
//            break;
//        case "veg":
//            pizza = new VegPizza();
//            break;
//        default: throw new IllegalArgumentException("No such option");
//    }
//    pizza.addIngredients();
//    pizza.bakePizza();
//    return pizza;
//    }
//}
