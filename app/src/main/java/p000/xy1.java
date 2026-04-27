package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xy1 extends rj8 implements wy1 {

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public final yy1 f99649e;

    public xy1(@yfb yy1 yy1Var) {
        this.f99649e = yy1Var;
    }

    @Override // p000.wy1
    public boolean childCancelled(@yfb Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return true;
    }

    @Override // p000.wy1
    @yfb
    public jj8 getParent() {
        return getJob();
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        this.f99649e.parentCancelled(getJob());
    }
}
