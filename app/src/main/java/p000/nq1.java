package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nq1<T> extends AbstractC2144c1<T> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f65254a;

    @Override // p000.AbstractC2144c1, p000.fdg
    public void cancel() {
        this.f65254a = true;
    }

    @Override // p000.AbstractC2144c1, p000.lf4
    public void dispose() {
        this.f65254a = true;
    }

    @Override // p000.AbstractC2144c1, p000.lf4
    public boolean isDisposed() {
        return this.f65254a;
    }
}
