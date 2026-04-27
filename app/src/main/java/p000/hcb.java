package p000;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class hcb extends du2<rbb> {
    public hcb(@efb Context context, @efb ong taskExecutor) {
        super(s7h.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: a */
    public boolean mo3470a(@efb oqi workSpec) {
        return workSpec.f68346j.getRequiredNetworkType() == wbb.UNMETERED || (Build.VERSION.SDK_INT >= 30 && workSpec.f68346j.getRequiredNetworkType() == wbb.TEMPORARILY_UNMETERED);
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo3471b(@efb rbb state) {
        return !state.isConnected() || state.isMetered();
    }
}
