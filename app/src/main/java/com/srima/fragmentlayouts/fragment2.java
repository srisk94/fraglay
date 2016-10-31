package com.srima.fragmentlayouts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by srima on 31-10-2016.
 */
public class fragment2 extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(

                R.layout.layout2, container, false);
    }
}
