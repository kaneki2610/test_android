package com.example.dell.test_android.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.test_android.CustomViewPagerAdapter;
import com.example.dell.test_android.CustomViewPagerDetail;
import com.example.dell.test_android.R;

public class FragmentTrangChu extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;
    public int[]list_icon={R.mipmap.compass,R.mipmap.chart,R.mipmap.choice,R.mipmap.star,R.mipmap.chart};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.trangchu_layout,container,false);
        tabLayout=v.findViewById(R.id.tablayout_menu_detail);
        viewPager=v.findViewById(R.id.viewPager_detail);

        DisplayTablayout();
        AddIcon();
        return v;
    }

    private void AddIcon() {
        tabLayout.getTabAt(0).setIcon(list_icon[0]);
        tabLayout.getTabAt(1).setIcon(list_icon[1]);
        tabLayout.getTabAt(2).setIcon(list_icon[2]);
        tabLayout.getTabAt(3).setIcon(list_icon[3]);
        tabLayout.getTabAt(4).setIcon(list_icon[4]);

    }

    private void DisplayTablayout() {
        CustomViewPagerDetail customViewPagerDetail=new CustomViewPagerDetail(getChildFragmentManager());

        customViewPagerDetail.AddFrag(new FragmentTroChoi(),"Dành cho bạn");
        customViewPagerDetail.AddFrag(new FragmentTroChoi(),"Bảng xếp hạng");
        customViewPagerDetail.AddFrag(new FragmentPhim(),"Loại");
        customViewPagerDetail.AddFrag(new FragmentSach(),"Lựa chọn");
        customViewPagerDetail.AddFrag(new FragmentSach(),"Gia đình");
        viewPager.setAdapter(customViewPagerDetail);
        tabLayout.setupWithViewPager(viewPager);

    }
}
