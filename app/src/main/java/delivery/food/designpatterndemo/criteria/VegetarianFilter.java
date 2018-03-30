package delivery.food.designpatterndemo.criteria;

import java.util.ArrayList;
import java.util.List;

public class VegetarianFilter implements Filter {


    @Override
    public List<Ingredients> meetCriteria(List<Ingredients> ingredients) {
        List<Ingredients> ingredientsArrayList= new ArrayList<>();

        for(Ingredients item: ingredients){
            if(item.isVegetarian()){
                ingredientsArrayList.add(item);
            }
        }
        return ingredientsArrayList;
    }



}
