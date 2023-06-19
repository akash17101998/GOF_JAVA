package Factory_Method_Pattern;

public abstract class Pizza {
   public abstract void addIngredients();

   public void bakePizza(){
      System.out.println("It will take 40 min. to bake pizza");
   }
}
