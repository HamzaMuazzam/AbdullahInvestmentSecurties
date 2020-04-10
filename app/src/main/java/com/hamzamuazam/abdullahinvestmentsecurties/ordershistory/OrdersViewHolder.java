package com.hamzamuazam.abdullahinvestmentsecurties.ordershistory;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;

public class OrdersViewHolder extends RecyclerView.ViewHolder {
TextView id,/*earnedProfit*/buyRate,buyDate;

    public OrdersViewHolder(@NonNull View itemView) {
        super(itemView);
        id=itemView.findViewById(R.id.tv_buyId);
//        earnedProfit=itemView.findViewById(R.id.tv_shareprice_profit);
        buyRate=itemView.findViewById(R.id.tv_shareprice_history);
        buyDate=itemView.findViewById(R.id.buydate);
    }
}
