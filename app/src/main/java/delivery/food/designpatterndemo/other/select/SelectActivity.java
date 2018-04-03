package delivery.food.designpatterndemo.other.select;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import delivery.food.designpatterndemo.R;

public class SelectActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter dataAdapter;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        recyclerView=findViewById(R.id.recycler_view);
        dataAdapter=new DataAdapter(buildCheeseList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new ItemDecoration(this, R.drawable.custom_divider));
        recyclerView.setAdapter(dataAdapter);
       // recyclerView.setHasFixedSize(true);



        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder= new AlertDialog.Builder(SelectActivity.this);
                LayoutInflater inflater= SelectActivity.this.getLayoutInflater();
                builder.setTitle("Check Out")
                        /*.setMessage("You are going to checkout!")
                        .setIcon(R.drawable.ic_cart_color)*/
                        .setView(inflater.inflate(R.layout.checkout_dialog, null))
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(SelectActivity.this, CheckOutActivity.class));
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })      ;
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        initiItemTouchHelper();

    }

    private ArrayList<Cheese> buildCheeseList(){
        ArrayList<Cheese> cheeses= new ArrayList<>();
        cheeses.add(new Brie());
        cheeses.add(new Camembert());
        cheeses.add(new Cheddar());
        cheeses.add(new Emmental());
        cheeses.add(new Gouda());
        cheeses.add(new Manchego());
        cheeses.add(new Roquefort());
        return  cheeses;
    }

    private void initiItemTouchHelper(){
        ItemTouchHelper.SimpleCallback callback= new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                int position=viewHolder.getAdapterPosition();
                dataAdapter.removeItem(position);
            }
        };
        ItemTouchHelper itemTouchHelper= new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);;
    }
}
