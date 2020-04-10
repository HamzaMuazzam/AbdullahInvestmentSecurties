package com.hamzamuazam.abdullahinvestmentsecurties.ordershistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersViewHolder> {

    private Context context;
    private List<OrdersModelClass> list;

    public OrdersAdapter(Context context, List<OrdersModelClass> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public OrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OrdersViewHolder(LayoutInflater.from(context).inflate(R.layout.orders_history_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull OrdersViewHolder holder, int position) {
        OrdersModelClass modelClass = list.get(position);
        holder.buyDate.setText(modelClass.getBuyDate());
        holder.buyRate.setText(modelClass.getBuyRate());
        holder.id.setText(modelClass.getId());
//        holder.earnedProfit.setText(modelClass.getEarnedProfite());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
