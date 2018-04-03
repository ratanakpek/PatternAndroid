package delivery.food.designpatterndemo.other.layoutbuilder;

public abstract class Content implements LayoutView {

    @Override
    public Shading shading() {
        return new ContentShading();
    }
}
