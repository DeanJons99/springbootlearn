package designpattern.templatemethod;

public class RedBeanMilk extends SyoaMilk {
    @Override
    protected void addIngredient() {
        System.out.println("添加红豆");
    }

    @Override
    protected void soak() {
        System.out.println("浸泡原料");
    }

    @Override
    protected void grindBean() {
        System.out.println("打磨原料");
    }

    @Override
    protected void boilWater() {
        System.out.println("加热饮用");
    }

    @Override
    protected boolean isAddSomethin() {
        return true;
    }
}
