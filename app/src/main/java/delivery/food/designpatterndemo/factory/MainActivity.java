package delivery.food.designpatterndemo.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import delivery.food.designpatterndemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BreadFactory breadFactory= new BreadFactory();

        Bread bag = breadFactory.getBread("BAG");

        Bread bri= breadFactory.getBread("BRI");

        Bread rol = breadFactory.getBread("ROL");




        TextView tvResult=findViewById(R.id.tvResult);
        tvResult.setText(new StringBuilder().append(bag.name()).append(bri.name()).append(rol.name()).toString());
    }
}
