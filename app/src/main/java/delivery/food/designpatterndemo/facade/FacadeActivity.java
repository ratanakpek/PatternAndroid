package delivery.food.designpatterndemo.facade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import delivery.food.designpatterndemo.R;

public class FacadeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);


        List<Filling> fillings = new ArrayList<>();
        fillings.add(new Filling(R.drawable.ic_launcher_foreground, R.string.card));
        fillings.add(new Filling(R.drawable.ic_launcher_background, R.string.coupon));
        fillings.add(new Filling(R.drawable.ic_search, R.string.cash));

        adapter = new DataAdapter(fillings);

        recyclerView = findViewById(R.id.rvRTK);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);






        ImageView imageView= findViewById(R.id.ivImage);
        Facade facade= new Facade();
        imageView.setImageResource(facade.dispenseFruit());



    }

}
