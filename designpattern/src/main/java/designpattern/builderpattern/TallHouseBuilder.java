package designpattern.builderpattern;

public class TallHouseBuilder extends HouseBuilder {
    private House house = new House();

    @Override
    void buildBase() {
        house.setBase("高楼的地基是5米");
    }

    @Override
    void buildWall() {
        house.setWalls("高楼的墙很高，砖很贵");

    }

    @Override
    void buildRoof() {
        house.setRoof("高楼的房顶防雷");
    }

    @Override
    House getHouse() {
        return house;
    }
}
