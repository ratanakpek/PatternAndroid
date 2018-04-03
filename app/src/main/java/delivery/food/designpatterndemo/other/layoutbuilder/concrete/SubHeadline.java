package delivery.food.designpatterndemo.other.layoutbuilder.concrete;

import android.view.View;
import android.view.ViewGroup;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.layoutbuilder.Header;

public class SubHeadline extends Header {
    @Override
    public ViewGroup.LayoutParams layoutPrams() {
        int width=ViewGroup.LayoutParams.MATCH_PARENT;
        int height= ViewGroup.LayoutParams.WRAP_CONTENT;

        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 18;
    }

    @Override
    public int content() {
        return R.string.sub_head;
    }

    @Override
    public int[] padding() {
        return new int[]{32, 0, 16, 8};
    }
}
