package com.example.dell.test_android;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class CustomViewPagerDetail extends FragmentPagerAdapter {
    List<Fragment> fragmentList=new ArrayList<>();
    List<String>listName=new ArrayList<>();
    public CustomViewPagerDetail(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void AddFrag(Fragment fragment,String name)
    {
        fragmentList.add(fragment);
        listName.add(name);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listName.get(position);
    }
}
