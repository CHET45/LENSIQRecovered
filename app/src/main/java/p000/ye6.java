package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class ye6<T> extends hj6<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f101291c;

    /* JADX INFO: renamed from: d */
    public final T f101292d;

    public ye6(boolean hasDefault, T defaultItem) {
        this.f101291c = hasDefault;
        this.f101292d = defaultItem;
    }

    @Override // p000.hj6
    /* JADX INFO: renamed from: a */
    public void mo12424a(fdg s) {
        s.request(Long.MAX_VALUE);
    }

    @Override // p000.ycg
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t = this.f43804b;
        m12426c();
        if (t != null) {
            complete(t);
        } else if (this.f101291c) {
            complete(this.f101292d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        this.f43804b = t;
    }
}
