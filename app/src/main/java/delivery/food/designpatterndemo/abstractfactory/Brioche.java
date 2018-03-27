package delivery.food.designpatterndemo.abstractfactory;

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return " 42 kcal";
    }
}
