package com.eyevue.glassapp.bluetooth;

import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class BlueError {
    private int code;
    private String message;
    private int reason;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getReason() {
        return this.reason;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    @efb
    public String toString() {
        return "BlueError{code=" + this.code + ", message='" + this.message + "', reason=" + this.reason + '}';
    }
}
