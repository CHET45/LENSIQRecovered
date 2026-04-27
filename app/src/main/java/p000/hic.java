package p000;

import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hic<ReqT> extends w2f.AbstractC14368a<ReqT> {
    /* JADX INFO: renamed from: a */
    public abstract w2f.AbstractC14368a<?> mo12409a();

    @Override // p000.w2f.AbstractC14368a
    public void onCancel() {
        mo12409a().onCancel();
    }

    @Override // p000.w2f.AbstractC14368a
    public void onComplete() {
        mo12409a().onComplete();
    }

    @Override // p000.w2f.AbstractC14368a
    public void onHalfClose() {
        mo12409a().onHalfClose();
    }

    @Override // p000.w2f.AbstractC14368a
    public void onReady() {
        mo12409a().onReady();
    }

    public String toString() {
        return yya.toStringHelper(this).add("delegate", mo12409a()).toString();
    }
}
