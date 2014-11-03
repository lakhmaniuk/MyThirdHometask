package com.lakhmaniuk.geekhub.lakhmaniukhometask3.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lakhmaniuk.geekhub.lakhmaniukhometask3.R;

public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.button_layout, container, false);
    }
}
