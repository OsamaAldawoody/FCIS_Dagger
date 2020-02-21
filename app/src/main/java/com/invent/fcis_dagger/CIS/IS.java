package com.invent.fcis_dagger.CIS;

import javax.inject.Inject;

public class IS {
    private DM dm;
    private SL sl;

    @Inject
    public IS(DM dm, SL sl) {
        this.dm = dm;
        this.sl = sl;
    }
}
