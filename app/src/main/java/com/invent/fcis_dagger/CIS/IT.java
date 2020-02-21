package com.invent.fcis_dagger.CIS;

import javax.inject.Inject;

public class IT {
    private CV cv;
    private Networking networking;
    private Signals signals;

    @Inject
    public IT(CV cv, Networking networking, Signals signals) {
        this.cv = cv;
        this.networking = networking;
        this.signals = signals;
    }
}
