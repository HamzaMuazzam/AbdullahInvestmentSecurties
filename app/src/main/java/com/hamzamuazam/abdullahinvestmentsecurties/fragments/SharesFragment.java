package com.hamzamuazam.abdullahinvestmentsecurties.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;
import com.hamzamuazam.abdullahinvestmentsecurties.sharesmainscreen.SharesAdapter;
import com.hamzamuazam.abdullahinvestmentsecurties.sharesmainscreen.SharesModel;

import java.util.ArrayList;
import java.util.List;

public class SharesFragment extends Fragment {
    View view;
    RecyclerView rv_shares;
    List<SharesModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shares, container, false);
        initviews();
        list.add(new SharesModel("5"));
        list.add(new SharesModel("20"));
        list.add(new SharesModel("50"));
        list.add(new SharesModel("100"));
        list.add(new SharesModel("200"));
        list.add(new SharesModel("300"));
        list.add(new SharesModel("500"));

        SharesAdapter sharesAdapter = new SharesAdapter(getActivity(), list);
        rv_shares.setAdapter(sharesAdapter);
        rv_shares.setLayoutManager(new LinearLayoutManager(getActivity()));
        sharesAdapter.notifyDataSetChanged();


        return view;
    }

    private void initviews() {
        rv_shares = view.findViewById(R.id.rv_shares);
    }

}
