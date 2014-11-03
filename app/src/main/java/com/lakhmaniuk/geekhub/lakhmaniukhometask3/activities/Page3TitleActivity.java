package com.lakhmaniuk.geekhub.lakhmaniukhometask3.activities;

import com.lakhmaniuk.geekhub.lakhmaniukhometask3.R;
import com.lakhmaniuk.geekhub.lakhmaniukhometask3.fragments.DetailsFragment;
import com.lakhmaniuk.geekhub.lakhmaniukhometask3.fragments.TitleFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Page3TitleActivity extends FragmentActivity implements
        TitleFragment.onItemClickListener {

    int position = 0;
    boolean withDetails = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3_layout);
        if (savedInstanceState != null)
            position = savedInstanceState.getInt("position");
        withDetails = (findViewById(R.id.cont) != null);
        if (withDetails)
            showDetails(position);
    }

    void showDetails(int pos) {
        if (withDetails) {
            DetailsFragment details = (DetailsFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.cont);
            if (details == null || details.getPosition() != pos) {
                details = DetailsFragment.newInstance(pos);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.cont, details).commit();
            }
        } else {
            startActivity(new Intent(this, Page4DetailsActivity.class).putExtra("position", position));
        }
    }

    @Override
    public void itemClick(int position) {
        this.position = position;
        showDetails(position);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position", position);
    }
}