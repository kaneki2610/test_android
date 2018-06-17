package com.example.dell.test_android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.dell.test_android.Fragment.FragmentPhim;
import com.example.dell.test_android.Fragment.FragmentSach;
import com.example.dell.test_android.Fragment.FragmentTrangChu;
import com.example.dell.test_android.Fragment.FragmentTroChoi;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    CustomViewPagerAdapter viewPagerAdapter;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout_menu);
        viewPager=findViewById(R.id.viewPager);
        drawerLayout=findViewById(R.id.drawerLayout);
        toolbar=findViewById(R.id.toolbar);
        DisplayTabLayout();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        actionBarDrawerToggle.syncState();
    }

    private void DisplayTabLayout() {
        viewPagerAdapter=new CustomViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFrag(new FragmentTrangChu(),"TRANG CHỦ");
        viewPagerAdapter.AddFrag(new FragmentTroChoi(),"TRÒ CHƠI");
        viewPagerAdapter.AddFrag(new FragmentPhim(),"PHIM");
        viewPagerAdapter.AddFrag(new FragmentSach(),"SÁCH");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
