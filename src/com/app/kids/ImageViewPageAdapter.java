package com.app.kids;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class ImageViewPageAdapter extends FragmentPagerAdapter {
    private int mSize = 0;

    public ImageViewPageAdapter(FragmentManager fm, int size) {
        super(fm);
        mSize = size;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a ImageViewPageAdapter (defined as a static inner class below).
        return ImageViewFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        // Show all pages.
        return mSize;
    }
}
