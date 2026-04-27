package com.eyevue.glassapp.database.device;

import p000.dbd;
import p000.efb;
import p000.j35;

/* JADX INFO: loaded from: classes4.dex */
@j35(tableName = "DeviceList")
public class DeviceInfoBean {

    @dbd
    @efb
    private String mac;
    private String name;
    private String projectCompatibleSdk;
    private String projectFunctionType;
    private long updateTime = System.currentTimeMillis();

    public DeviceInfoBean(String name, String mac, String projectFunctionType, String projectCompatibleSdk) {
        this.name = name;
        this.mac = mac;
        this.projectFunctionType = projectFunctionType;
        this.projectCompatibleSdk = projectCompatibleSdk;
    }

    public String getMac() {
        return this.mac;
    }

    public String getName() {
        return this.name;
    }

    public String getProjectCompatibleSdk() {
        return this.projectCompatibleSdk;
    }

    public String getProjectFunctionType() {
        return this.projectFunctionType;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectCompatibleSdk(String projectCompatibleSdk) {
        this.projectCompatibleSdk = projectCompatibleSdk;
    }

    public void setProjectFunctionType(String projectFunctionType) {
        this.projectFunctionType = projectFunctionType;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
