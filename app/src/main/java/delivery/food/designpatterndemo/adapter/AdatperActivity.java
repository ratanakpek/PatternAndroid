package delivery.food.designpatterndemo.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.nio.channels.NonWritableChannelException;

import delivery.food.designpatterndemo.R;

public class AdatperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adatper);

        OldLocation oldLocation= new CustomerLocation();
        oldLocation.setBuilding("City Mall");
        oldLocation.setFloor(4);
        oldLocation.setDesk(100);

        NewLocation newLocation= new RTKAdapter(oldLocation);

        TextView tv = findViewById(R.id.tvAdapter);
        tv.setText("Building : "+ newLocation.getBuilding()+ ", floor : "+ newLocation.getFloor()+", Desk : "+newLocation.getDesk());
    }
}
