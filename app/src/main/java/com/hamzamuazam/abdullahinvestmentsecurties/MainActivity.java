package com.hamzamuazam.abdullahinvestmentsecurties;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hamzamuazam.abdullahinvestmentsecurties.fragments.AccoutFragment;
import com.hamzamuazam.abdullahinvestmentsecurties.fragments.FinanceFragment;
import com.hamzamuazam.abdullahinvestmentsecurties.fragments.OrderFragment;
import com.hamzamuazam.abdullahinvestmentsecurties.fragments.SharesFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentcalling();

    }

    private void fragmentcalling() {

        openFragment(new SharesFragment());

        bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
//                        Toast.makeText(MainActivity.this, "reselected do nothing", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.navigation_order:
//                        openFragment(new HomeFragment());
//                        Toast.makeText(MainActivity.this, "reselected do nothing", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigation_finance:
//                        Toast.makeText(MainActivity.this, "reselected do nothing", Toast.LENGTH_SHORT).show();

//                        openFragment(new HomeFragment());
                        break;
                    case R.id.navigation_account:
//                        Toast.makeText(MainActivity.this, "reselected do nothing", Toast.LENGTH_SHORT).show();

//                        openFragment(new HomeFragment());
                        break;


                }
            }
        });

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        openFragment(new SharesFragment());
                        break;
                    case R.id.navigation_order:
                        openFragment(new OrderFragment());
                        break;

                    case R.id.navigation_finance:
                        openFragment(new FinanceFragment());
                        break;
                    case R.id.navigation_account:
                        openFragment(new AccoutFragment());

                        break;


                }
                return true;
            }
        });


    }

    public void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framlayout, fragment).commit();

    }


}
