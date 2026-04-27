package com.watchfun.transcommon.manager;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes6.dex */
public class WakeLockManager {
    private PowerManager powerManager;
    private PowerManager.WakeLock wakeLock;
    private String wakeLockTag = "watchfun::MyWakelockTag";

    public WakeLockManager(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.powerManager = powerManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.wakeLock = powerManager.newWakeLock(10, this.wakeLockTag);
        } else {
            this.wakeLock = powerManager.newWakeLock(1, this.wakeLockTag);
        }
    }

    public void acquireWakeLock() {
        if (this.wakeLock.isHeld()) {
            return;
        }
        this.wakeLock.acquire();
    }

    public void releaseWakeLock() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }
}
