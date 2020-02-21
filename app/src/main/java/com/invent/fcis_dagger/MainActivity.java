package com.invent.fcis_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.invent.fcis_dagger.CIS.CIS;
import com.invent.fcis_dagger.dagger.CisDepartments;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    CIS cis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CisDepartments department = DaggerCisDeparments.create();
        //cis = department.getCis();
        //cis.printCIS();
        department.inject(this);

    }
}
