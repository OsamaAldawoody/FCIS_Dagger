package com.invent.fcis_dagger.CIS;

import javax.inject.Inject;

public class CS {
    private AI ai;
    private ML ml;
    private NLP nlp;

    @Inject
    public CS(AI ai, ML ml, NLP nlp) {
        this.ai = ai;
        this.ml = ml;
        this.nlp = nlp;
    }
}
