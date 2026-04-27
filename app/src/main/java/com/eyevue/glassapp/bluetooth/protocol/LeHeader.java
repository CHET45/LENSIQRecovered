package com.eyevue.glassapp.bluetooth.protocol;

import androidx.core.app.NotificationCompat;
import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.Arrays;
import java.util.List;
import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class LeHeader {
    public List<Integer> payload;
    public int len = 0;
    public int commandId = 0;
    public int crc = 0;

    private String getHex(int decimal) {
        if (decimal < 0) {
            return NotificationCompat.CATEGORY_ERROR;
        }
        return "0x" + Integer.toHexString(decimal);
    }

    public void setPayload(List<Integer> payload) {
        this.len = payload.size() + 2;
        this.payload = payload;
    }

    @efb
    public String toString() {
        return "LeHeader{\nlen=" + this.len + "\n, commandId=" + getHex(this.commandId) + "\n, payload=" + Arrays.toString(HexConvert.convertList2Array(this.payload)) + "\n, crc=" + getHex(this.crc) + "\n}";
    }
}
