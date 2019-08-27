package com.example.hp.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;


    public PlaceFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ParkFragment();
        } else {
            return new LocalFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.hotels_category);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants_category);
        } else if (position == 2) {
            return mContext.getString(R.string.parks_category);
        } else {
            return mContext.getString(R.string.local_category);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
