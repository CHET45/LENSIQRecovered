package com.eyevue.common.bean.update;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes4.dex */
public class VersionData {
    private String description;
    private String downloadUrl;
    private boolean needUpdate;
    private String packageName;
    private int upgradeType;
    private String version;

    public static String toJson(VersionData data) {
        return new Gson().toJson(data);
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getUpgradeType() {
        return this.upgradeType;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isNeedUpdate() {
        return this.needUpdate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setNeedUpdate(boolean needUpdate) {
        this.needUpdate = needUpdate;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setUpgradeType(int upgradeType) {
        this.upgradeType = upgradeType;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
