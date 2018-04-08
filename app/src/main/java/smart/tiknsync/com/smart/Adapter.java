package smart.tiknsync.com.smart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by admin on 4/4/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    Context context;
    ArrayList<String> CarData;

    public Adapter(Context _contex, ArrayList<String> _CarData) {
        this.context = _contex;
        this.CarData = _CarData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_items, null);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.tvCarName.setText(CarData.get(position));

        String url = "http://images.newcars.com/images/car-pictures/original/2011-Audi-Q5-SUV-2.0T-Premium-4dr-All-wheel-Drive-quattro-Sport-Utility-Exterior-Front-View.png";

        Picasso.get()
                .load(url)
                .placeholder(R.drawable.ic_car)
                .into(holder.ivImageHolder);

    }

    @Override
    public int getItemCount() {
        return CarData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView tvCarName, tvPrice;
        ImageView ivImageHolder;
        Button btnBook;

        public myViewHolder(View itemView) {
            super(itemView);

            tvCarName = itemView.findViewById(R.id.tvCarName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            ivImageHolder = itemView.findViewById(R.id.ivImageHolder);
            btnBook = itemView.findViewById(R.id.btnBook);
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Your Clicked on " + tvCarName.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

