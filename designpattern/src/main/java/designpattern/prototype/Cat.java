package designpattern.prototype;

import java.io.*;

public class Cat implements Serializable, Cloneable {
    private Fish fish;
    private String type;
    private int age;
    private final static long serialVersionUID = 20040L;

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
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

    public Cat(Fish fish, String type, int age) {
        this.fish = fish;
        this.type = type;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() {
        //将对象写到流里面：序列化
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //从流里面读出对象：反序列化
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "{ fish: " + this.fish.toString() + ",type: " + this.type + ",age: " + this.age + "}";
        return str;
    }
}
