package delivery.food.designpatterndemo.facade;

import delivery.food.designpatterndemo.R;

public class Crips implements Product {
    @Override
    public int dispense() {
        return R.drawable.crips;
    }
}
