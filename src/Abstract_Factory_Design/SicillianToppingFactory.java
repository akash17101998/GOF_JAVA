package Abstract_Factory_Design;

public class SicillianToppingFactory extends BaseToppingFactory{
    @Override
    public Cheese createCheese(){
        return new MozzerellaCheese();
    }
    @Override
    public Sauce createSauce(){
        return new TomatoSauce();
    }
}
