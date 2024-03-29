package com.lakhmaniuk.geekhub.lakhmaniukhometask3.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.lakhmaniuk.geekhub.lakhmaniukhometask3.fragments.DetailsFragment;

public class Page4DetailsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_LANDSCAPE
                && isLarge()) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            DetailsFragment details = DetailsFragment.newInstance(getIntent()
                    .getIntExtra("position", 0));
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, details).commit();
        }
    }

    boolean isLarge() {
        return (getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

}