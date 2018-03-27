package delivery.food.designpatterndemo.factory;

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return "34 kcal";
    }
}
