package com.hamzamuazam.abdullahinvestmentsecurties.sharesmainscreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;

import java.util.List;

public class SharesAdapter extends RecyclerView.Adapter<SharesViewHolder> {
    private Context context;
    private List<SharesModel> list;

    public SharesAdapter(Context context, List<SharesModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SharesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SharesViewHolder(LayoutInflater.from(context).inflate(R.layout.shares_item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SharesViewHolder holder, int position) {

        SharesModel model = list.get(position);

        holder.tv_sharepriceName.setText(model.getSharePrice());

        holder.btn_buyShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                context.startActivity(new Intent(context, BuySharesActivity.class));

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
