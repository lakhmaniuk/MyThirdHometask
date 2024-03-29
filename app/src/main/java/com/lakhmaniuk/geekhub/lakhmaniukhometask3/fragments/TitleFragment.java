package com.lakhmaniuk.geekhub.lakhmaniukhometask3.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lakhmaniuk.geekhub.lakhmaniukhometask3.R;

public class TitleFragment extends ListFragment {
    public interface onItemClickListener {
        public void itemClick(int position);
    }

    onItemClickListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, getResources()
                .getStringArray(R.array.headers));
        setListAdapter(adapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (onItemClickListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        listener.itemClick(position);
    }
}