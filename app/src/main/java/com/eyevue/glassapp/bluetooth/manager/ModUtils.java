package com.eyevue.glassapp.bluetooth.manager;

import android.content.Context;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class ModUtils {

    @igg({"StaticFieldLeak"})
    public static BleCore bleCore;
    private static ModBleResponse modBleResponse;
    private static SendCommandViaBle sendViaBle;

    public static BleCore blecore(Context context) {
        if (bleCore == null) {
            bleCore = new BleCore(context);
        }
        return bleCore;
    }

    public static ModBleResponse modBleResponse() {
        if (modBleResponse == null) {
            modBleResponse = new ModBleResponse();
        }
        return modBleResponse;
    }

    public static SendCommandViaBle sendViaBle() {
        if (sendViaBle == null) {
            sendViaBle = new SendCommandViaBle();
        }
        return sendViaBle;
    }
}
