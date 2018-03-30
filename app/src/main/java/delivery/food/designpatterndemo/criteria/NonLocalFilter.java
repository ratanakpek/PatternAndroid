package delivery.food.designpatterndemo.criteria;

import java.util.ArrayList;
import java.util.List;

public class NonLocalFilter implements Filter {
    @Override
    public List<Ingredients> meetCriteria(List<Ingredients> ingredients) {
        List<Ingredients> ingredientsList= new ArrayList<>();

        for(Ingredients item : ingredients){
            if(item.getLocal() != "Locally produced"){
                ingredientsList.add(item);
            }
        }

        return ingredientsList;
    }
}
