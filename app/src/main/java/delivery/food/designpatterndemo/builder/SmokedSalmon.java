package delivery.food.designpatterndemo.builder;

public class SmokedSalmon extends Filling {
    @Override
    public String name() {
        return "SmokeSalmon";
    }

    @Override
    public int calories() {
        return 450;
    }
}
