package com.eyevue.common.bean.login;

/* JADX INFO: loaded from: classes4.dex */
public class UserBean {
    private String code;
    private String email;

    /* JADX INFO: renamed from: id */
    private long f17902id;
    private String password;
    private String phone;
    private String refreshToken;

    public String getCode() {
        return this.code;
    }

    public String getEmail() {
        return this.email;
    }

    public long getId() {
        return this.f17902id;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.f17902id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
