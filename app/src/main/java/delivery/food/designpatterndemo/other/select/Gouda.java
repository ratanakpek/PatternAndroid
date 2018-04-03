
package delivery.food.designpatterndemo.other.select;



import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.select.Cheese;
import delivery.food.designpatterndemo.other.select.Filling;

public class Gouda extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Gouda";
    }

    @Override
    public int getImage() {
        return R.drawable.gouda;
    }

    @Override
    public int getKcal() {
        return 117;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
