package Factory_Method_Pattern;

import Abstract_Factory_Design.BaseToppingFactory;

public class CheesePizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public CheesePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory= toppingFactory;
    }
    @Override
    public void addIngredients(){
        System.out.println("list of cheese ingredients");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
