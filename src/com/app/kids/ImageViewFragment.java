package com.app.kids;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.Util.KidsLog;

/**
 * A ImageViewFragment containing a simple view to display the images.
 */
public class ImageViewFragment extends Fragment {

    private static String TAG = "ImageViewFragment";
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String IMG_RES_ID = "IMG_RES_ID";

    /* KEY_IMG_NUM key is used for save the image number and retrive during recreation of activity 
     */
    private static final String KEY_IMG_NUM = "IMAGE_NUM";

    /* Displaying the image on activity - Here bitmap is used for reading the images in resources 
     * */
    ImageView mImageView = null;
    private int mImageNum = 0;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ImageViewFragment newInstance(int sectionNumber) {
        ImageViewFragment fragment = new ImageViewFragment();
        Bundle args = new Bundle();
        args.putInt(IMG_RES_ID, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ImageViewFragment() {
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
        KidsLog.i(TAG, "onCreate Called ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        KidsLog.i("onCreateView Called ");
        View rootView = inflater.inflate(R.layout.fragment_kids, container, false);
        /*Find the image view for the created Fragment */
        mImageView = (ImageView)rootView.findViewById(R.id.imageShow);
        if (savedInstanceState != null) {
            mImageNum = savedInstanceState.getInt(KEY_IMG_NUM, 0);
        }
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        KidsLog.i(TAG, "onActivityCreated Called ");
        final int resId = KidsMainActivity.imageResIds[mImageNum];
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
        outState.putInt(KEY_IMG_NUM, mImageNum);
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
