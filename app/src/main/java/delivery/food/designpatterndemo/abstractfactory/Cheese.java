package delivery.food.designpatterndemo.abstractfactory;

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return "45 kcal";
    }
}
