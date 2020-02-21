package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.CV;
import com.invent.fcis_dagger.CIS.IT;
import com.invent.fcis_dagger.CIS.Networking;
import com.invent.fcis_dagger.CIS.Signals;

import dagger.Module;
import dagger.Provides;

@Module
public class ItModule {
    @Provides
    Networking provideNetworking(){
        return new Networking();
    }

    @Provides
    Signals provideSignals(){
        return new Signals();
    }

    @Provides
    CV provideCV(){
        CV cv = new CV();
        cv.inflate();
        return cv;
    }

    @Provides
    IT provideIT(CV cv, Signals si, Networking net){
        return new IT(cv,net,si);
    }
}
