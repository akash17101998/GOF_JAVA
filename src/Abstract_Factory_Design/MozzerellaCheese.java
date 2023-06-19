package Abstract_Factory_Design;

public class MozzerellaCheese implements Cheese{
    public MozzerellaCheese(){
        prepareCheese();
    }
    @Override
    public void prepareCheese(){
        System.out.println("Preparing mozzerella cheese");
    }
}
