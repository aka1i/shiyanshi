package com.example.androidforjava;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yjn
 * @create 2019/11/7 - 16:41
 */
public class MainActivityPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();

    private FragmentManager fm;
    public MainActivityPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fm = fm;
    }
    public void addFragment(Fragment fragment) {
        fragments.add(fragment);
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}
