package com.invent.fcis_dagger.dagger;

import com.invent.fcis_dagger.CIS.AI;
import com.invent.fcis_dagger.CIS.CS;
import com.invent.fcis_dagger.CIS.ML;
import com.invent.fcis_dagger.CIS.NLP;

import dagger.Module;
import dagger.Provides;

@Module
public class CsModule {
    private static final String TAG = "CsModule";

    @Provides
    AI provideAI(){
        return new AI();
    }

    @Provides
    ML provideML(){
        ML ml = new ML();
        ml.inflate();
        return ml;
    }

    @Provides
    NLP provideNLP(){
        return new NLP();
    }

    @Provides
    CS provideCS(ML ml, AI ai, NLP nlp){
        return new CS(ai,ml,nlp);
    }
}
