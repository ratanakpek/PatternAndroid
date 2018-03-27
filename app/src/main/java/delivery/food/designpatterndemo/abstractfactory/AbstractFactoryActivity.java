package delivery.food.designpatterndemo.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import delivery.food.designpatterndemo.R;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

        Toolbar tb = findViewById(R.id.toolbar);
        if (tb != null) {
            setSupportActionBar(tb);
            setTitle("");
        }

        AbstractFactory bread = FactoryGenerator.getFactory("BREAD");
        Bread br = bread.getBread("BRI");
        Log.e("rtk", br.name() + " -> " + br.calories());


        AbstractFactory filling = FactoryGenerator.getFactory("FILLING");
        Filling fi = filling.getFilling("CH");
        Log.e("rtk", fi.name() + " -> " + fi.calories());

        AbstractFactory drink = FactoryGenerator.getFactory("DRINK");
        Drink dri = drink.getDrink("DRI");
        Log.e("rtk", dri.name() + " -> " + dri.calories());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }
}
