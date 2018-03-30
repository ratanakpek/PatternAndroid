package delivery.food.designpatterndemo.criteria;

import java.util.List;

public class AndCriteria implements Filter {
    Filter criteria;
    Filter otherCrieria;

    public AndCriteria(Filter criteria, Filter otherCrieria){
        this.criteria=criteria;
        this.otherCrieria=otherCrieria;
    }

    @Override
    public List<Ingredients> meetCriteria(List<Ingredients> ingredients) {
       List<Ingredients> firstC=criteria.meetCriteria(ingredients);
       return otherCrieria.meetCriteria(firstC);
    }
}
