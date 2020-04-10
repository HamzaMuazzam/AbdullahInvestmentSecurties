package com.hamzamuazam.abdullahinvestmentsecurties.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.hamzamuazam.abdullahinvestmentsecurties.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FinanceFragment extends Fragment {
    private View view;


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_finance, container, false);

        return view;
    }
}
