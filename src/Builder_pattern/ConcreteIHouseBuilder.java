package Builder_pattern;

public class ConcreteIHouseBuilder implements IHouseBuilder {
    private House house;

    public ConcreteIHouseBuilder(){
        this.house= new House();                 // define this because we define method for house class
    }
//    @Override
    public IHouseBuilder buildFoundation(){
        house.setFoundation("Concrete, bricks and stone");
        System.out.println("Foundation completed");
        return this;
    }
//    @Override
    public IHouseBuilder buildStructure(){
        house.setStructure("Concrete, mortar, brick, and reinforced steel");
        System.out.println("ConcreteHouseBuilder: Structure complete...");
        return this;
    }
//    @Override
    public IHouseBuilder buildRoof(){
        house.setRoof("Concrete and reinforced steel");
        System.out.println("ConcreteHouseBuilder: Roof complete...");
        return this;
    }
//    @Override
    public IHouseBuilder paintHouse(){
        house.setPainted(true);
        System.out.println("ConcreteHouseBuilder: Painting complete...");
        return this;
    }
//    @Override
    public IHouseBuilder furnishHouse(){
        house.setFurnished(true);
        System.out.println("ConcreteHouseBuilder: Furnishing complete...");
        return this;
    }
    public House getHouse() {
        System.out.println("ConcreteHouseBuilder: Concrete house complete...");
        return this.house;
    }

}
