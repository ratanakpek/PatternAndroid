package delivery.food.designpatterndemo.bridge.tutorialpoint;

import android.util.Log;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e("rtk", "Draw Circle[ color : green, radius : "+ radius+", x : "+ x +", y : "+ y+"]");
    }
}
