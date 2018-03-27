package delivery.food.designpatterndemo.builder;

class CreamCheese extends Bread {
    @Override
    public String name() {
        return "Cream Cheese";
    }

    @Override
    public int calories() {
        return 60;
    }
}
