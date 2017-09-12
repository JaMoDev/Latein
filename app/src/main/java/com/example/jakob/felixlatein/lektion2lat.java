package com.example.jakob.felixlatein;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jakob on 11.09.2017.
 */

public class lektion2lat extends Fragment{
    private static final String TAG = "lektion1lat";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lektion1lat, container, false);
        return view;
    }
}
