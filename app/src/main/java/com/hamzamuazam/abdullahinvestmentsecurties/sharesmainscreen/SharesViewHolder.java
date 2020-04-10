package com.hamzamuazam.abdullahinvestmentsecurties.sharesmainscreen;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;

public class SharesViewHolder extends RecyclerView.ViewHolder {
    TextView tv_sharepriceName,btn_buyShare;

    public SharesViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_sharepriceName=itemView.findViewById(R.id.tv_sharepriceName);
        btn_buyShare=itemView.findViewById(R.id.btn_buyShare);
    }
}
