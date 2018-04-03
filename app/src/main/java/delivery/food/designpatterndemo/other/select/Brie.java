package delivery.food.designpatterndemo.other.select;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.select.Cheese;
import delivery.food.designpatterndemo.other.select.Filling;

public class Brie extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Brie";
    }

    @Override
    public int getImage() {
        return R.drawable.brie;
    }

    @Override
    public int getKcal() {
        return 142;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 68;
    }
}
