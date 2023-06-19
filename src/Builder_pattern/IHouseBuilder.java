package Builder_pattern;

public interface IHouseBuilder {
    IHouseBuilder buildFoundation();
    IHouseBuilder buildStructure();
    IHouseBuilder buildRoof();
    IHouseBuilder paintHouse();
    IHouseBuilder furnishHouse();
    House getHouse();

}
