package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ye8 extends rj8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public final qy6<Throwable, bth> f101293e;

    /* JADX WARN: Multi-variable type inference failed */
    public ye8(@yfb qy6<? super Throwable, bth> qy6Var) {
        this.f101293e = qy6Var;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return false;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        this.f101293e.invoke(th);
    }
}
