package com.invent.fcis_dagger.CIS;

import android.util.Log;

import javax.inject.Inject;

public class SE implements SpecialPrograms {
    private static final String TAG = "SE";

    @Inject
    public SE() {
    }


    @Override
    public void print() {
        Log.d(TAG,TAG+" department ....................");
    }
}
