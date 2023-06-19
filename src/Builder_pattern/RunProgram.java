package Builder_pattern;

public class RunProgram {
    public static void main(String[] args) {
        IHouseBuilder concreteIHouseBuilder = new ConcreteIHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteIHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House A: "+houseA);

        IHouseBuilder prefabricatedIHouseBuilder = new PrefabricatedIHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedIHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House B: "+houseB);

    }
}
