package delivery.food.designpatterndemo.bridge.tutorialpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import delivery.food.designpatterndemo.R;

public class BridgeTutoiralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge_tutoiral);

        Shape redCircle = new Circle(10, 10, 1, new RedCircle());
        Shape greenCircle= new Circle(20, 20, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
