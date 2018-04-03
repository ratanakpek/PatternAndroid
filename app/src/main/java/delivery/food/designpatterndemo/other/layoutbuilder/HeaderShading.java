package delivery.food.designpatterndemo.other.layoutbuilder;

import delivery.food.designpatterndemo.R;

public class HeaderShading implements Shading {
    @Override
    public int shade() {
        return R.color.colorAccent;
    }

    @Override
    public int background() {
        return R.color.cardview_dark_background;
    }
}
