package designpattern.builderpattern;


public class CommonHouseBuilder extends HouseBuilder {

    private House house = new House();

    @Override
    void buildBase() {
        house.setBase("普通房子2米地基");
    }

    @Override
    void buildWall() {
        house.setWalls("普通房子便宜砖盖的墙");
    }

    @Override
    void buildRoof() {
        house.setRoof("普通房子屋顶");
    }

    @Override
    House getHouse() {
        return house;
    }
}
