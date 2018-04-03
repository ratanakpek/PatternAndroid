package delivery.food.designpatterndemo.other.layoutbuilder;

import delivery.food.designpatterndemo.R;

public class ContentShading implements Shading {
    @Override
    public int shade() {
        return R.color.cardview_shadow_end_color;
    }

    @Override
    public int background() {
        return R.color.colorPrimary;
    }
}
