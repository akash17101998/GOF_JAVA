package Abstract_Factory_Design;

public class GoatCheese implements Cheese{
    public GoatCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese(){
        System.out.println("Preparing goat cheese");
    }
}
