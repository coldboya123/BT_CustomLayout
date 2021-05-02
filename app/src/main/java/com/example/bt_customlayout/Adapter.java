package com.example.bt_customlayout;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Object> list;

    public Adapter(List<Object> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate( R.layout.rcv_itemlayout, parent, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Object object = list.get(position);
        holder.img.setImageResource(object.getImg());
        holder.img.setClipToOutline(true);
        holder.name.setText(object.getName());
        holder.quantity.setText(object.getQuantity() + "");
        holder.price.setText("$" + object.getPrice());
        holder.btnMinus.setOnClickListener(v -> {
            int num = Integer.parseInt(holder.quantity.getText().toString());
            if (num == 1){
                list.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, getItemCount());
            } else {
                holder.quantity.setText(--num + "");
            }
        });
        holder.btnPlush.setOnClickListener(v -> {
            int num = Integer.parseInt(holder.quantity.getText().toString());
            holder.quantity.setText(++num + "");
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, quantity, price, btnMinus, btnPlush;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            quantity = itemView.findViewById(R.id.txtquantity);
            price = itemView.findViewById(R.id.price);
            btnMinus = itemView.findViewById(R.id.btn_minus);
            btnPlush = itemView.findViewById(R.id.btnplush);
        }
    }
}
