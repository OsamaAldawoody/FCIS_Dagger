package com.invent.fcis_dagger.CIS;

import android.util.Log;

import javax.inject.Inject;

public class BIO implements SpecialPrograms {
    private static final String TAG = "BIO";

    @Inject
    public BIO() {
    }


    @Override
    public void print() {
        Log.d(TAG,TAG+" department ....................");
    }
}
