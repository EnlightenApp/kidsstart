package com.app.kids;

import com.app.Util.KidsLog;

import android.support.v13.app.FragmentPagerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class KidsMainActivity extends Activity {

    private static String TAG = "KidsActivity";
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    ImageViewPageAdapter mImageViewPagerAdapter;

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
        mImageViewPagerAdapter = new ImageViewPageAdapter(getFragmentManager(), imageResIds.length);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(mImageViewPagerAdapter);
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        KidsLog.i(TAG, "onSaveInstanceState Called ");
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
}
