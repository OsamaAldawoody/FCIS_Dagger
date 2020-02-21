package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.SE;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  abstract class SEModule {
    @Binds
    abstract SE provideSE(SE se );
}
