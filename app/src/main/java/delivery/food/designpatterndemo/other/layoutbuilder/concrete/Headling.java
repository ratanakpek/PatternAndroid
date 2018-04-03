package delivery.food.designpatterndemo.other.layoutbuilder.concrete;

import android.view.ViewGroup;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.layoutbuilder.Header;

public class Headling extends Header {


    @Override
    public ViewGroup.LayoutParams layoutPrams() {
        int width=ViewGroup.LayoutParams.MATCH_PARENT;
        int height=ViewGroup.LayoutParams.WRAP_CONTENT;
        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 24;
    }

    @Override
    public int content() {
        return R.string.hello;
    }

    @Override
    public int[] padding() {
        return new int[]{24, 16, 16, 0};
    }
}
