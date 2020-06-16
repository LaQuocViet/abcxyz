package com.example.moneymanager.setting;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter  extends FragmentPagerAdapter {

    private ArrayList<Fragment>mListFragment;
    public ViewPagerAdapter (FragmentManager fm, ArrayList<Fragment>mListFragment){
        super(fm);
        this.mListFragment = mListFragment;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mListFragment.get(position);
    }

    @Override
    public int getCount() {
        return mListFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Expenses";
        }
        else
            return "Income";
    }
}
