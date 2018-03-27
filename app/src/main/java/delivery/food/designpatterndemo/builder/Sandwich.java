package delivery.food.designpatterndemo.builder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private static final String DEBUG_TAG="tag";

    private List<Ingredient> ingredients = new ArrayList<>();

    public void getCalories(){
        int c=0;
        for(Ingredient i:ingredients){
            c+=i.calories();
        }
        Log.d(DEBUG_TAG, "Total calories : "+ c+" kcal");
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public void getSandwich(){
        for(Ingredient i:ingredients){
            Log.d(DEBUG_TAG, i.name()+" : "+ i.calories());
        }
    }
}
