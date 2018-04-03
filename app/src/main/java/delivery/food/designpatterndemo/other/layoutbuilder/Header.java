package delivery.food.designpatterndemo.other.layoutbuilder;

public abstract class Header implements LayoutView {

    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}
