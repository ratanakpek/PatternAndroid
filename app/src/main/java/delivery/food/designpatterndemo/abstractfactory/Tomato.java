package delivery.food.designpatterndemo.abstractfactory;

public class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return " 56 kcal";
    }
}
