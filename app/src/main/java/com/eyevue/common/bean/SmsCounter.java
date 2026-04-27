package com.eyevue.common.bean;

/* JADX INFO: loaded from: classes4.dex */
public class SmsCounter {
    public static final int OP_COUNTER = 1;
    public static final int OP_IDLE = 0;
    public static final int OP_SEND_CODE = 2;
    public static final int OP_SEND_CODE_ERROR = 4;
    public static final int OP_SEND_CODE_FINISH = 3;

    /* JADX INFO: renamed from: op */
    private int f17898op;
    private int time;

    public SmsCounter() {
        this.f17898op = 0;
    }

    public int getOp() {
        return this.f17898op;
    }

    public int getTime() {
        return this.time;
    }

    public void setOp(int op) {
        this.f17898op = op;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public SmsCounter(int op, int time) {
        this.f17898op = op;
        this.time = time;
    }
}
