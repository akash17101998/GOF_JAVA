package Builder_pattern;

public class ConstructionEngineer {
    private IHouseBuilder HouseBuilder;
    public ConstructionEngineer(IHouseBuilder IHouseBuilder){
        this.HouseBuilder = IHouseBuilder;
    }
    public House constructHouse(){
        return this.HouseBuilder               // this is the speciality that's why we use build pattern
                .buildFoundation()
                .buildStructure()
                .buildRoof()
                .paintHouse()
                .furnishHouse()
                .getHouse();
    }
}
