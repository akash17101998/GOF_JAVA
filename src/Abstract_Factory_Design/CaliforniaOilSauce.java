package Abstract_Factory_Design;

public class CaliforniaOilSauce implements Sauce{
    public CaliforniaOilSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce(){
        System.out.println("Preparing californiaoil sauce");
    }
}
