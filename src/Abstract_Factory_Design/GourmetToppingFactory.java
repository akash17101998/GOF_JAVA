package Abstract_Factory_Design;

public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){
        return new GoatCheese();
    }
    @Override
    public Sauce createSauce(){
        return new CaliforniaOilSauce();
    }
}
