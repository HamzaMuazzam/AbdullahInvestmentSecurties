package com.hamzamuazam.abdullahinvestmentsecurties.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hamzamuazam.abdullahinvestmentsecurties.R;
import com.hamzamuazam.abdullahinvestmentsecurties.ordershistory.OrdersAdapter;
import com.hamzamuazam.abdullahinvestmentsecurties.ordershistory.OrdersModelClass;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {

    private View view;
    private RecyclerView rv_ordershistory;
    private List<OrdersModelClass> list = new ArrayList<>();
    private OrdersAdapter ordersAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_order, container, false);
        initialViews();
        list.add(new OrdersModelClass("05", "500", "2020-01-05", "100"));
        list.add(new OrdersModelClass("25", "350", "2020-01-03", "150"));
        list.add(new OrdersModelClass("30", "330", "2020-01-22", "100"));
        list.add(new OrdersModelClass("19", "120", "2020-01-29", "50"));
        list.add(new OrdersModelClass("37", "190", "2020-01-01", "10"));
        list.add(new OrdersModelClass("18", "943", "2020-01-15", "500"));
        getOrderHistory();
        return view;
    }

    private void getOrderHistory() {

        ordersAdapter = new OrdersAdapter(getActivity(), list);
        rv_ordershistory.setAdapter(ordersAdapter);
        rv_ordershistory.setLayoutManager(new LinearLayoutManager(getActivity()));
        ordersAdapter.notifyDataSetChanged();


    }

    private void initialViews() {
        rv_ordershistory = view.findViewById(R.id.rv_ordershistory);
    }
}
