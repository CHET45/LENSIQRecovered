package com.eyevue.common.bean;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceSettingBean {
    private int intValue;
    private String settingName;
    private int settingValue;

    public DeviceSettingBean(String settingName, int settingValue, int intValue) {
        this.settingName = settingName;
        this.settingValue = settingValue;
        this.intValue = intValue;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getSettingName() {
        return this.settingName;
    }

    public int getSettingValue() {
        return this.settingValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public void setSettingValue(int settingValue) {
        this.settingValue = settingValue;
    }
}
