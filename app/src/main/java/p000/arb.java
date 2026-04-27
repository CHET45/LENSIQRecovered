package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class arb<T> extends yub<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f11681c;

    /* JADX INFO: renamed from: d */
    public final T f11682d;

    public arb(boolean hasDefault, T defaultItem) {
        this.f11681c = hasDefault;
        this.f11682d = defaultItem;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t = this.f103000b;
        m26354a();
        if (t != null) {
            complete(t);
        } else if (this.f11681c) {
            complete(this.f11682d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f103000b = t;
    }
}
