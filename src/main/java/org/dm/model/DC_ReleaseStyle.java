package org.dm.model;

import org.dm.Core;

public class DC_ReleaseStyle extends DC_Entity {
    public Integer idRelease;
    public Integer idReleaseDC;
    public Integer idStyle;
    public String sName;
    //----------------------------------------------------------------------------------
    public DC_ReleaseStyle() {

    }
    //----------------------------------------------------------------------------------
    public void setsName(String sValue) {
        if (sValue != null)
            this.sName = Core.truncate(Core.replace4bytesChars(sValue), 1000);
        else
            this.sName = null;
    }
}


