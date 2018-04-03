package delivery.food.designpatterndemo.other.layoutbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import delivery.food.designpatterndemo.R;
import delivery.food.designpatterndemo.other.layoutbuilder.builder.LayoutBuilders;

public class LayoutBuilder extends AppCompatActivity {

    TextView textView;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;
        super.onCreate(savedInstanceState);


        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        setContentView(layout);
// COULD USE layoutBuilder.displaySimple() INSTEAD
        LayoutBuilders layoutBuilder = new LayoutBuilders();
        List<LayoutView> layoutViews = layoutBuilder.displayDetailed();

        for (LayoutView layoutView : layoutViews) {
            ViewGroup.LayoutParams params = layoutView.layoutPrams();
            textView = new TextView(this);
            textView.setLayoutParams(params);
            textView.setText(layoutView.content());
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,
                    layoutView.textSize());
            textView.setTextColor(layoutView.shading().shade());
            textView.setBackgroundResource(layoutView.shading().background());

            int[] pad = layoutView.padding();
            textView.setPadding(dp(pad[0]), dp(pad[1]), dp(pad[2]),
                    dp(pad[3]));
            layout.addView(textView);

        }
    }

    public int dp(int px) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (px * scale + 0.5f);
    }
}
