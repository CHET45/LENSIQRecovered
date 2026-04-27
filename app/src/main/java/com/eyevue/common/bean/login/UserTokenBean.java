package com.eyevue.common.bean.login;

/* JADX INFO: loaded from: classes4.dex */
public class UserTokenBean {
    private String accessToken;
    private String refreshToken;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
