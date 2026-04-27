package com.eyevue.common.bean.authcode;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CheckDeviceNameBean {
    private List<String> deviceNames;
    private boolean passed;

    public List<String> getDeviceNames() {
        return this.deviceNames;
    }

    public boolean isPassed() {
        return this.passed;
    }

    public void setDeviceNames(List<String> deviceNames) {
        this.deviceNames = deviceNames;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
