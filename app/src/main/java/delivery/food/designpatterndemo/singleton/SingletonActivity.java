package delivery.food.designpatterndemo.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import delivery.food.designpatterndemo.R;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);


        CurrentUser user = CurrentUser.getUser();
        user.setName("Pek Ratanak");
        user.outPutName();

    }
}
