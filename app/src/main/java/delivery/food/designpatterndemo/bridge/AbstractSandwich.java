package delivery.food.designpatterndemo.bridge;

public abstract class AbstractSandwich {

    protected SandwichInterface sandwichInterface;

    protected  AbstractSandwich(SandwichInterface sandwichInterface){
        this.sandwichInterface=sandwichInterface;
    }

    public abstract void make();
}
