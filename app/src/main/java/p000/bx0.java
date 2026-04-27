package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class bx0 extends du2<Boolean> {
    public bx0(Context context, ong taskExecutor) {
        super(s7h.getInstance(context, taskExecutor).getBatteryChargingTracker());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: a */
    public boolean mo3470a(@efb oqi workSpec) {
        return workSpec.f68346j.requiresCharging();
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo3471b(@efb Boolean isBatteryCharging) {
        return !isBatteryCharging.booleanValue();
    }
}
