package designpattern.builderpattern;

abstract public class HouseBuilder {
    abstract void buildBase();

    abstract void buildWall();

    abstract void buildRoof();

    abstract House getHouse();
}
