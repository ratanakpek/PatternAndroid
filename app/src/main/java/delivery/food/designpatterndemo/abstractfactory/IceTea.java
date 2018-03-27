package delivery.food.designpatterndemo.abstractfactory;

public class IceTea implements Drink {
    @Override
    public String name() {
        return "Coffee";
    }

    @Override
    public String calories() {
        return "  63 kcal";
    }
}
