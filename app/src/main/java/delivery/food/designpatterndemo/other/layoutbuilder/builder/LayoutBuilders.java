package delivery.food.designpatterndemo.other.layoutbuilder.builder;

import java.util.ArrayList;
import java.util.List;

import delivery.food.designpatterndemo.other.layoutbuilder.LayoutView;
import delivery.food.designpatterndemo.other.layoutbuilder.concrete.DetailContent;
import delivery.food.designpatterndemo.other.layoutbuilder.concrete.Headling;
import delivery.food.designpatterndemo.other.layoutbuilder.concrete.SimpleContent;
import delivery.food.designpatterndemo.other.layoutbuilder.concrete.SubHeadline;

public class LayoutBuilders {

    public List<LayoutView> displayDetailed(){
        List<LayoutView> views = new ArrayList<>();
        views.add(new Headling());
        views.add(new SubHeadline());
        views.add(new DetailContent());
        return views;
    }

    public List<LayoutView> displaySimple(){
        List<LayoutView> views = new ArrayList<>();
        views.add(new Headling());
        views.add(new SimpleContent());
        return views;
    }
}
