package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class dx0 extends du2<Boolean> {
    public dx0(Context context, ong taskExecutor) {
        super(s7h.getInstance(context, taskExecutor).getBatteryNotLowTracker());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: a */
    public boolean mo3470a(@efb oqi workSpec) {
        return workSpec.f68346j.requiresBatteryNotLow();
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo3471b(@efb Boolean isBatteryNotLow) {
        return !isBatteryNotLow.booleanValue();
    }
}
