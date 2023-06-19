package Factory_Method_Pattern;

import Abstract_Factory_Design.BaseToppingFactory;

public class VegPizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public VegPizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory=toppingFactory;
    }
    @Override
    public void addIngredients(){
        System.out.println("list of veg ingredients");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
