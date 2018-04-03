package delivery.food.designpatterndemo.other.layoutbuilder;

import android.view.ViewGroup;

public interface LayoutView {

    ViewGroup.LayoutParams layoutPrams();
    int textSize();
    int content();
    Shading shading();
    int[] padding();
}
