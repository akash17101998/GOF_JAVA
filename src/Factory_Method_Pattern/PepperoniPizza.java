package Factory_Method_Pattern;

import Abstract_Factory_Design.BaseToppingFactory;

public class PepperoniPizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public PepperoniPizza(BaseToppingFactory toppingFactory){
        this.toppingFactory=toppingFactory;
    }
    @Override
    public void addIngredients(){
        System.out.println("list of pepperoni ingredients");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
