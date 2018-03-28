package delivery.food.designpatterndemo.builder;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.builder.fragment.ContentFragment;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main_layout);
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


        ContentFragment contentFragment= new ContentFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment, contentFragment);
        ft.addToBackStack(null);
        ft.commit();

    }
}
