package Builder_pattern;

public class PrefabricatedIHouseBuilder implements IHouseBuilder {

    private House house;
    public PrefabricatedIHouseBuilder() {
        this.house = new House();
    }
    @Override
    public IHouseBuilder buildFoundation() {
        house.setFoundation("Wood, laminate, and PVC flooring");
        System.out.println("PrefabricatedHouseBuilder: Foundation complete...");
        return this;
    }
    @Override
    public IHouseBuilder buildStructure(){
        house.setStructure("Structural steels and wooden wall panels");
        System.out.println("PrefabricatedHouseBuilder: Structure complete...");
        return this;
    }
    @Override
    public IHouseBuilder buildRoof(){
        house.setRoof("Roofing sheets");
        System.out.println("PrefabricatedHouseBuilder: Roof complete...");
        return this;
    }
    @Override
    public IHouseBuilder paintHouse(){
        house.setPainted(false);
        System.out.println("PrefabricatedHouseBuilder: Painting not required...");
        return this;
    }
    @Override
    public IHouseBuilder furnishHouse(){
        house.setFurnished(true);
        System.out.println("PrefabricatedHouseBuilder: Furnishing complete...");
        return this;
    }
    public House getHouse() {
        System.out.println("PrefabricatedHouseBuilder: Prefabricated house complete...");
        return this.house;
    }
}
