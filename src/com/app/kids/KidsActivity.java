package com.app.kids;

import java.util.Locale;

import com.app.Util.KidsLog;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class KidsActivity extends FragmentActivity {

    private static String TAG = "KidsActivity";
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    // A static dataset to back the ViewPager adapter
    public final static Integer[] imageResIds = new Integer[] {
            R.drawable.a_img, R.drawable.b_img, R.drawable.c_img, R.drawable.d_img,
            R.drawable.e_img, R.drawable.f_img, R.drawable.g_img, R.drawable.h_img,
            R.drawable.i_img, R.drawable.j_img, R.drawable.k_img, R.drawable.l_img,
            R.drawable.m_img, R.drawable.n_img, R.drawable.o_img, R.drawable.p_img,
            R.drawable.q_img, R.drawable.r_img, R.drawable.s_img, R.drawable.t_img,
            R.drawable.u_img, R.drawable.v_img, R.drawable.w_img, R.drawable.x_img,
            R.drawable.y_img, R.drawable.z_img };

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager(), imageResIds.length);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        KidsLog.i(TAG, "Onstart Called ");
    }

    @Override
    public void onResume() {
        super.onResume();
        KidsLog.i(TAG, "onResume Called ");
    }

    @Override
    public void onPause() {
        super.onPause();
        KidsLog.i(TAG, "onPause Called ");
    }

    @Override
    public void onStop() {
        super.onStop();
        KidsLog.i(TAG, "onStop Called ");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        KidsLog.i(TAG, "onRestart Called ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KidsLog.i(TAG, "onDestroy Called ");
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private int mSize = 0;

        public SectionsPagerAdapter(FragmentManager fm, int size) {
            super(fm);
            mSize = size;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show all pages.
            return mSize;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
            case 0:
                return getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        private static String TAG = "Fragment";
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String IMG_RES_ID = "IMG_RES_ID";
        /* Displaying the image on activity - Here bitmap is used for reading the images in resources 
         * */
        ImageView mImageView = null;
        private int mImageNum;

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(IMG_RES_ID, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            KidsLog.i(TAG, "onAttach Called ");
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mImageNum = getArguments() != null ? getArguments().getInt(IMG_RES_ID) : -1;
            mImageNum--; // Start from 'A' Letter
            KidsLog.i(TAG, "onCreate Called ");
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            KidsLog.i("onCreateView Called ");
            View rootView = inflater.inflate(R.layout.fragment_kids, container, false);
            /*Find the image view for the created Fragment */
            mImageView = (ImageView)rootView.findViewById(R.id.imageShow);
            return rootView;
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            KidsLog.i(TAG, "onActivityCreated Called ");
            final int resId = KidsActivity.imageResIds[mImageNum];
            mImageView.setImageResource(resId); // Load image into ImageView
        }

        @Override
        public void onStart() {
            super.onStart();
            KidsLog.i(TAG, "Onstart Called ");
        }

        @Override
        public void onResume() {
            super.onResume();
            KidsLog.i(TAG, "onResume Called ");
        }

        @Override
        public void onPause() {
            super.onPause();
            KidsLog.i(TAG, "onPause Called ");
        }

        @Override
        public void onStop() {
            super.onStop();
            KidsLog.i(TAG, "onStop Called ");
        }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            KidsLog.i(TAG, "onSaveInstanceState Called ");
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            KidsLog.i(TAG, "onDestroyView Called ");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            KidsLog.i(TAG, "onDestroy Called ");
        }

        @Override
        public void onDetach() {
            super.onDetach();
            KidsLog.i(TAG, "onDetach Called ");
        }
    }

}
