package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class j5g extends du2<Boolean> {
    public j5g(@efb Context context, @efb ong taskExecutor) {
        super(s7h.getInstance(context, taskExecutor).getStorageNotLowTracker());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: a */
    public boolean mo3470a(@efb oqi workSpec) {
        return workSpec.f68346j.requiresStorageNotLow();
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo3471b(@efb Boolean isStorageNotLow) {
        return !isStorageNotLow.booleanValue();
    }
}
