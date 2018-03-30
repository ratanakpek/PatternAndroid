package delivery.food.designpatterndemo.criteria;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalFilter implements Filter {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public List<Ingredients> meetCriteria(List<Ingredients> ingredients) {
        List<Ingredients> ingredientsList = new ArrayList<>();

        for(Ingredients item:ingredients){
            if(Objects.equals(item.getLocal(), "Locally produced")){
                ingredientsList.add(item);
            }
        }

        return ingredientsList;
    }
}
