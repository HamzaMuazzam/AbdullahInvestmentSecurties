package com.hamzamuazam.abdullahinvestmentsecurties.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.hamzamuazam.abdullahinvestmentsecurties.AboutActivity;
import com.hamzamuazam.abdullahinvestmentsecurties.AccountActivity;
import com.hamzamuazam.abdullahinvestmentsecurties.ChatSupportActivity;
import com.hamzamuazam.abdullahinvestmentsecurties.ProfileActivity;
import com.hamzamuazam.abdullahinvestmentsecurties.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccoutFragment extends Fragment {
    private View view;
    private LinearLayout account_settings_lin, aboutus_lin,profile_lin, helpchat_lin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_accout, container, false);
        intiviews();
        gotoAccountSettings();
        gotoAccountProfile();
        gotoAccoutSupportChat();
gotoAboutUs();
        return view;
    }

    private void gotoAboutUs() {
        aboutus_lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AboutActivity.class));
            }
        });

    }

    private void gotoAccoutSupportChat() {
        helpchat_lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ChatSupportActivity.class));
            }
        });
    }

    private void gotoAccountProfile() {
        profile_lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ProfileActivity.class));

            }
        });
    }

    private void gotoAccountSettings() {
        account_settings_lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AccountActivity.class));
            }
        });
    }

    private void intiviews() {
        account_settings_lin = view.findViewById(R.id.account_settings_lin);
        profile_lin = view.findViewById(R.id.profile_lin);
        helpchat_lin = view.findViewById(R.id.helpchat_lin);
        aboutus_lin = view.findViewById(R.id.aboutus_lin);
    }
}
