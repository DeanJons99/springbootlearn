package designpattern.templatemethod;

public abstract class SyoaMilk {
    //添加配料
    protected abstract void addIngredient();

    //浸泡
    protected abstract void soak();

    //磨豆
    protected abstract void grindBean();

    //加热
    protected abstract void boilWater();

    //是否添加辅料
    protected boolean isAddSomethin() {
        return true;
    }

    //模板方法，控制流程
    public final void makebeanMilk() {
        if (isAddSomethin()) {
            addIngredient();
        }
        soak();
        grindBean();
        boilWater();
    }

}