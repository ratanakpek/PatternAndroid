package delivery.food.designpatterndemo.criteria;

import java.util.List;

public interface Filter {
    List<Ingredients> meetCriteria(List<Ingredients> ingredients);
}
