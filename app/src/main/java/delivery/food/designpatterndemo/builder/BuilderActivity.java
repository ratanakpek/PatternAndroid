package delivery.food.designpatterndemo.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import delivery.food.designpatterndemo.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        SandwichBuilder builder= new SandwichBuilder();
        Sandwich custom= new Sandwich();
        custom=builder.build(custom, new CreamCheese());
        Log.d("RTK", "Customized");
        custom.getSandwich();
        custom.getCalories();

        Sandwich offTheShelf=SandwichBuilder.readyMade();
        Log.d("RTK", "Ready made");
        offTheShelf.getCalories();
        offTheShelf.getSandwich();

    }
}
