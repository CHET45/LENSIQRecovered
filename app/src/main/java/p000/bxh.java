package p000;

/* JADX INFO: loaded from: classes6.dex */
public class bxh extends sq0<lq7> implements lq7 {
    public lq7 getCallback() {
        if (this.f82579a.isEmpty()) {
            return null;
        }
        return (lq7) this.f82579a.get(0);
    }

    @Override // p000.lq7
    public void onCancelOTA() {
        m22184a(new qp7() { // from class: vwh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onCancelOTA();
            }
        });
    }

    @Override // p000.lq7
    public void onError(final cr0 cr0Var) {
        if (cr0Var == null) {
            return;
        }
        m22184a(new qp7() { // from class: ywh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onError(cr0Var);
            }
        });
    }

    @Override // p000.lq7
    public void onNeedReconnect(final String str, final boolean z) {
        m22184a(new qp7() { // from class: xwh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onNeedReconnect(str, z);
            }
        });
    }

    @Override // p000.lq7
    public void onProgress(final int i, final float f) {
        m22184a(new qp7() { // from class: zwh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onProgress(i, f);
            }
        });
    }

    @Override // p000.lq7
    public void onStartOTA() {
        m22184a(new qp7() { // from class: wwh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onStartOTA();
            }
        });
    }

    @Override // p000.lq7
    public void onStopOTA() {
        m22184a(new qp7() { // from class: axh
            @Override // p000.qp7
            public final void onHandle(Object obj) {
                ((lq7) obj).onStopOTA();
            }
        });
    }

    public void setUpgradeCallback(lq7 lq7Var) {
        this.f82579a.clear();
        if (lq7Var != null) {
            addCallback(lq7Var);
        }
    }
}
