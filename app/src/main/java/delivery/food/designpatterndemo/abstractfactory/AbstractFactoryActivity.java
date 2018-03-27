package delivery.food.designpatterndemo.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import delivery.food.designpatterndemo.R;

public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

        AbstractFactory bread= FactoryGenerator.getFactory("BREAD");
        Bread br= bread.getBread("BRI");
        Log.e("rtk", br.name()+" -> "+ br.calories());


        AbstractFactory filling = FactoryGenerator.getFactory("FILLING");
        Filling fi = filling.getFilling("CH");
        Log.e("rtk", fi.name()+" -> "+ fi.calories());

        AbstractFactory drink = FactoryGenerator.getFactory("DRINK");
        Drink dri = drink.getDrink("DRI");
        Log.e("rtk", dri.name()+" -> "+ dri.calories());

    }
}
