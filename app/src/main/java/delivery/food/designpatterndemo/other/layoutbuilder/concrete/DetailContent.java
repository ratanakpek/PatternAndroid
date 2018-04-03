package delivery.food.designpatterndemo.other.layoutbuilder.concrete;

import android.view.ViewGroup;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.layoutbuilder.Content;

public class DetailContent extends Content {
    @Override
    public ViewGroup.LayoutParams layoutPrams() {
        int width=ViewGroup.LayoutParams.MATCH_PARENT;
        int height=ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 12;
    }

    @Override
    public int content() {
        return R.string.longstring;
    }

    @Override
    public int[] padding() {
        return new int[]{12, 12, 12, 12};
    }
}
