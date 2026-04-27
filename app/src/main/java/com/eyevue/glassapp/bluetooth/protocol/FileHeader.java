package com.eyevue.glassapp.bluetooth.protocol;

import androidx.core.app.NotificationCompat;
import com.eyevue.glassapp.bluetooth.HexConvert;
import java.util.Arrays;
import java.util.List;
import p000.efb;

/* JADX INFO: loaded from: classes4.dex */
public class FileHeader {
    public static final int SOF_FILE = 21080;
    public int commandId;
    public List<Integer> payload;
    public int address = 0;
    public int len = 0;
    public int crc = 0;
    public int crc2 = 0;

    private String getHex(int decimal) {
        if (decimal < 0) {
            return NotificationCompat.CATEGORY_ERROR;
        }
        return "0x" + Integer.toHexString(decimal);
    }

    public void setPayload(List<Integer> payload) {
        this.len = payload.size() + 10;
        this.payload = payload;
    }

    @efb
    public String toString() {
        return "LeHeader{\nlen=" + this.len + "\n, sof=" + getHex(SOF_FILE) + "\n, payload=" + Arrays.toString(HexConvert.convertList2Array(this.payload)) + "\n, crc=" + getHex(this.crc) + "\n, crc2=" + getHex(this.crc2) + "\n}";
    }
}
