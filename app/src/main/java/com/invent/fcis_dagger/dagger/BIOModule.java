package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.BIO;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BIOModule {

    @Binds
    abstract BIO provideBIO(BIO bio );
}
