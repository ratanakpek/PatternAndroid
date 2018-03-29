package delivery.food.designpatterndemo.bridge;

import android.util.Log;

public class Close implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        Log.e("rtk", "Close Sandwich : "+ filling1+", "+ filling2);
    }
}
