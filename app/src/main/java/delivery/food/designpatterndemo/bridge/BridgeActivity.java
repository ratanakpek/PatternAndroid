package delivery.food.designpatterndemo.bridge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import delivery.food.designpatterndemo.R;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);


        AbstractSandwich open = new Sandwich("Cheese", "Tomato", new Open());
        open.make();

        AbstractSandwich close = new Sandwich("Ham", "Eggs", new Close());
        close.make();



    }
}
