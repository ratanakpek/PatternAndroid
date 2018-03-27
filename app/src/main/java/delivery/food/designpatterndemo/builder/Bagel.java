package delivery.food.designpatterndemo.builder;

public class Bagel extends Bread {
    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public int calories() {
        return 210;
    }
}
