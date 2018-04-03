package delivery.food.designpatterndemo.other.select;

import delivery.food.designpatterndemo.R;

public class Cheddar extends Cheese implements Filling {


    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return R.drawable.apple;
    }

    @Override
    public int getKcal() {
        return 130;
    }

    @Override
    public boolean getVeg() {
        return true;
    }



    @Override
    public int getPrice() {
        return 75;
    }
}
