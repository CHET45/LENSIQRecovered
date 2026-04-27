package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class fbb extends du2<rbb> {
    public fbb(Context context, ong taskExecutor) {
        super(s7h.getInstance(context, taskExecutor).getNetworkStateTracker());
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: a */
    public boolean mo3470a(@efb oqi workSpec) {
        return workSpec.f68346j.getRequiredNetworkType() == wbb.CONNECTED;
    }

    @Override // p000.du2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo3471b(@efb rbb state) {
        return (state.isConnected() && state.isValidated()) ? false : true;
    }
}
