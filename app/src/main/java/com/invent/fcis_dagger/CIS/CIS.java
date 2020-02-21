package com.invent.fcis_dagger.CIS;

import android.util.Log;

import javax.inject.Inject;

public class CIS {
    private static final String TAG = "CIS";

    @Inject CS cs;
    @Inject IT it;
    @Inject IS is;
    @Inject
    SpecialPrograms specialPrograms;

    @Inject
    public CIS() {
    }

    @Inject
    void printCIS(){
        specialPrograms.print();
        Log.v(TAG, "Welcome To CIS .................... ");
    }
}
