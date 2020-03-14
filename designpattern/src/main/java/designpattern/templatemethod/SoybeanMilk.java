package designpattern.templatemethod;

public class SoybeanMilk  extends SyoaMilk{
    @Override
    protected void addIngredient() {
        System.out.println("添加原料");
    }

    @Override
    protected void soak() {
        System.out.println("浸泡原料");
    }

    @Override
    protected void grindBean() {
        System.out.println("打磨豆子");
    }

    @Override
    protected void boilWater() {
        System.out.println("加热");
    }

    @Override
    protected boolean isAddSomethin() {
        return false;
    }
}
