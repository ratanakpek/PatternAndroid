package delivery.food.designpatterndemo.bridge;

import android.util.Log;

public class Open implements SandwichInterface {

    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.e("rtk", "Open Sandwich "+ filling1+", "+ filling2);
    }
}
