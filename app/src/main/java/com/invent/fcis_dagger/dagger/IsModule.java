package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.DM;
import com.invent.fcis_dagger.CIS.IS;
import com.invent.fcis_dagger.CIS.SL;

import dagger.Module;
import dagger.Provides;

@Module
public class IsModule {
    @Provides
    DM provideDM(){
        return new DM();
    }

    @Provides
    SL provideSL(){
        return new SL();
    }

    @Provides
    IS provideIS(SL sl, DM dm){
        return new IS(dm,sl);
    }
}
