package delivery.food.designpatterndemo.facade;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import delivery.food.designpatterndemo.R;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    List<Filling> fillings;

    public DataAdapter(List<Filling> fillings) {
        this.fillings = fillings;
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recyclver_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(fillings.get(position).getImage());
        holder.tvTitle.setText(fillings.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return fillings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivThumbnail);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            ;
        }
    }
}
