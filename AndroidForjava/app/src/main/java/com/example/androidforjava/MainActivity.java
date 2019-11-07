package com.example.androidforjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends BaseActivity {
    final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"onDestroy()");
        super.onDestroy();
    }


    private void init(){
        MainActivityPagerAdapter adapter = new MainActivityPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new FindFragment());
        adapter.addFragment(new OrderFragment());
        adapter.addFragment(new MineFragment());
        final ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.navigation_find:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.navigation_order:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.navigation_mine:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });

    }
}
