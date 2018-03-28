package delivery.food.designpatterndemo.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import delivery.food.designpatterndemo.R;

public class StrategyActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCard, btnCash, btnCoupon;
    public BasicPrice basicPrice = BasicPrice.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);


        //View
        btnCard=findViewById(R.id.action_card);
        btnCash=findViewById(R.id.action_cash);
        btnCoupon=findViewById(R.id.action_coupon);


        btnCoupon.setOnClickListener(this);
        btnCard.setOnClickListener(this);
        btnCash.setOnClickListener(this);

        basicPrice.setPrice(1.5f);

    }

    @Override
    public void onClick(View view) {
        Payment payment;

        switch (view.getId()) {
            case R.id.action_card:
                payment = new Payment(new Card());
                break;
            case R.id.action_coupon:
                payment = new Payment(new Coupon());
                break;
            default:
                payment = new Payment((new Cash()));
                break;
        }
// Output price
        String price = new StringBuilder()
                .append("Total cost : $")
                .append(payment.employStrategy(basicPrice.getPrice()))
                .append("c")
                .toString();
        Toast toast = Toast.makeText(this, price, Toast.LENGTH_LONG);
        toast.show();

    }
}
