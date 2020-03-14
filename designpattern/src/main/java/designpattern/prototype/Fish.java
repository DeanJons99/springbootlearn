package designpattern.prototype;

import java.io.Serializable;

public class Fish implements Serializable {
    private int weight;
    private String type;
    private int age;
    public final static long serialVersionUID = 1L;
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Fish(int weight, String type, int age) {
        this.weight = weight;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        String str = "{" + "type:" + this.type + ",weight: " + this.weight + ",age: " + this.age +  "}";
        return str;
    }
}
