package com.eyevue.glassapp.bluetooth.protocol;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SppHeader {
    public List<Integer> payload;
    public int len = 0;
    public int commandId = 0;
    public int crc = 0;

    public void setPayload(List<Integer> payload) {
        this.len = payload.size() + 2;
        this.payload = payload;
    }
}
