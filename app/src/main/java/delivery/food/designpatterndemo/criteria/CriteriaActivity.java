package delivery.food.designpatterndemo.criteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.builder.Ingredient;

public class CriteriaActivity extends AppCompatActivity {

    TextView tvCriteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criteria);

        List<Ingredients> ingredientsList = new ArrayList<>();
        ingredientsList.add(new Ingredients("Cheddar", "Locally produced", true));
        ingredientsList.add(new Ingredients("Ham", "Cheshire", false));
        ingredientsList.add(new Ingredients("Tomato", "Kent", true));
        ingredientsList.add(new Ingredients("Turkey", "Locally produced", false));


        //Filtering
        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter vegetarian = new VegetarianFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);


        tvCriteria=findViewById(R.id.tvCriteria);



        printIngredients(local.meetCriteria(ingredientsList),
                "LOCAL:\n");
        printIngredients(nonLocal.meetCriteria(ingredientsList),
                "\nNOT LOCAL:\n");
        printIngredients(vegetarian.meetCriteria(ingredientsList),
                "\nVEGETARIAN:\n");
        printIngredients(localAndVegetarian.meetCriteria(ingredientsList),
                "\nLOCAL VEGETARIAN:\n");
        printIngredients(localOrVegetarian.meetCriteria(ingredientsList),
                "\nENVIRONMENTALLY FRIENDLY:\n");




    }

    public void printIngredients(List<Ingredients> ingredients, String header)
    {
        tvCriteria.append(header);
        for (Ingredients ingredient : ingredients) {
            tvCriteria.append(new StringBuilder()
                    .append(ingredient.getName())
                    .append(" ")
                    .append(ingredient.getLocal())
                    .append("\n")
                    .toString());
        }
    }
}
