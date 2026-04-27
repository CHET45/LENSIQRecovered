package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class eic<ReqT, RespT> extends w22<ReqT, RespT> {
    /* JADX INFO: renamed from: a */
    public abstract w22<?, ?> mo9654a();

    @Override // p000.w22
    public void cancel(@eib String str, @eib Throwable th) {
        mo9654a().cancel(str, th);
    }

    @Override // p000.w22
    public sc0 getAttributes() {
        return mo9654a().getAttributes();
    }

    @Override // p000.w22
    public void halfClose() {
        mo9654a().halfClose();
    }

    @Override // p000.w22
    public boolean isReady() {
        return mo9654a().isReady();
    }

    @Override // p000.w22
    public void request(int i) {
        mo9654a().request(i);
    }

    @Override // p000.w22
    public void setMessageCompression(boolean z) {
        mo9654a().setMessageCompression(z);
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo9654a()).toString();
    }
}
