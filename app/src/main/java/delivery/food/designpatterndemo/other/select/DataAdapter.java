package delivery.food.designpatterndemo.other.select;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import delivery.food.designpatterndemo.R;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Cheese> cheeseList;

    public DataAdapter(List<Cheese> cheeseList) {
        this.cheeseList = cheeseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.select_item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cheese cheese= cheeseList.get(position);
        holder.imageView.setImageResource(cheese.getImage());
        holder.textView.setText(cheese.getName());
    }

    @Override
    public int getItemCount() {
        return cheeseList.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.item_image);
            textView=itemView.findViewById(R.id.item_name);
        }
    }

    public void removeItem(int position){
        cheeseList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, cheeseList.size());
    }
}
