package designpattern.builderpattern;

public class DirectorHouse {
    private HouseBuilder houseBuilder;

    public DirectorHouse(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildRoof();
        houseBuilder.buildWall();
        System.out.println(houseBuilder.getHouse());

    }
}
