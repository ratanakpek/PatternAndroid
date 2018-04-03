package delivery.food.designpatterndemo.other.layoutbuilder.concrete;

import android.view.ViewGroup;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.layoutbuilder.Content;

public class SimpleContent extends Content {
    @Override
    public ViewGroup.LayoutParams layoutPrams() {
        int width=ViewGroup.LayoutParams.MATCH_PARENT;
        int height=ViewGroup.LayoutParams.MATCH_PARENT;
        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.content;
    }

    @Override
    public int[] padding() {
        return new int[]{16, 18, 16, 16};
    }
}
