package delivery.food.designpatterndemo.facade;

import delivery.food.designpatterndemo.R;

public class Drink implements Product {
    @Override
    public int dispense() {
        return R.drawable.drink;
    }
}
