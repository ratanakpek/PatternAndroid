package delivery.food.designpatterndemo.builder;

public abstract class Bread implements Ingredient {
    @Override
    public abstract String name();
    @Override
    public abstract int calories();
}
