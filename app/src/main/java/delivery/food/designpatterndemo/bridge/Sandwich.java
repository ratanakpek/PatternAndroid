package delivery.food.designpatterndemo.bridge;

public class Sandwich extends AbstractSandwich {

    private String filling1, filling2;

    protected Sandwich(String filling1, String filling2, SandwichInterface sandwichInterface) {
        super(sandwichInterface);
        this.filling1=filling1;
        this.filling2=filling2;
    }

    @Override
    public void make() {
        sandwichInterface.makeSandwich(filling1, filling2);
    }
}
