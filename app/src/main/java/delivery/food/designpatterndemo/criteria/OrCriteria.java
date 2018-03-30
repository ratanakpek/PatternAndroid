package delivery.food.designpatterndemo.criteria;

import java.util.List;

public class OrCriteria implements Filter {
    Filter criteria;
    Filter otherCriteria;

    public OrCriteria(Filter criteria, Filter otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Ingredients> meetCriteria(List<Ingredients> ingredients) {
        List<Ingredients> firstCriteria=criteria.meetCriteria(ingredients);
        List<Ingredients> nextCriteria=otherCriteria.meetCriteria(ingredients);

        for(Ingredients item: nextCriteria){
            if(!firstCriteria.contains(item)){
                firstCriteria.add(item);
            }
        }


        return firstCriteria;
    }
}
