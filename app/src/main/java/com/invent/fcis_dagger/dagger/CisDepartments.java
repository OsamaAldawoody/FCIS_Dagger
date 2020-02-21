package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.CIS;
import com.invent.fcis_dagger.dagger.CsModule;
import com.invent.fcis_dagger.dagger.IsModule;
import com.invent.fcis_dagger.dagger.ItModule;
import com.invent.fcis_dagger.MainActivity;
import com.invent.fcis_dagger.dagger.SEModule;

import dagger.Component;

@Component (modules = {CsModule.class, ItModule.class, IsModule.class,BIOModule.class})
public interface CisDepartments {
    CIS getCis();

    void inject(MainActivity mainActivity);
}
