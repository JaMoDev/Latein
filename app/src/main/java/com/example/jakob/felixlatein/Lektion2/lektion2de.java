package com.example.jakob.felixlatein.Lektion2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jakob.felixlatein.R;

/**
 * Created by Jakob on 11.09.2017.
 */

public class lektion2de extends Fragment{
    private static final String TAG = "lektion2de";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lektion2de, container, false);



        return view;
    }
}
