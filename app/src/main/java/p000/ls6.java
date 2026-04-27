package p000;

import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
public abstract class ls6 extends zb9 {
    /* JADX INFO: renamed from: a */
    public abstract zb9 mo16339a();

    @Override // p000.zb9
    public boolean canHandleEmptyAddressListFromNameResolution() {
        return mo16339a().canHandleEmptyAddressListFromNameResolution();
    }

    @Override // p000.zb9
    public void handleNameResolutionError(n4g n4gVar) {
        mo16339a().handleNameResolutionError(n4gVar);
    }

    @Override // p000.zb9
    public void handleResolvedAddresses(zb9.C16072i c16072i) {
        mo16339a().handleResolvedAddresses(c16072i);
    }

    @Override // p000.zb9
    @Deprecated
    public void handleSubchannelState(zb9.AbstractC16073j abstractC16073j, xs2 xs2Var) {
        mo16339a().handleSubchannelState(abstractC16073j, xs2Var);
    }

    @Override // p000.zb9
    public void requestConnection() {
        mo16339a().requestConnection();
    }

    @Override // p000.zb9
    public void shutdown() {
        mo16339a().shutdown();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo16339a()).toString();
    }
}
