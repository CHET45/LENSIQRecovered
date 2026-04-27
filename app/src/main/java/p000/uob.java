package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class uob<T> extends yub<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f88679c;

    /* JADX INFO: renamed from: d */
    public final T f88680d;

    public uob(boolean hasDefault, T defaultItem) {
        this.f88679c = hasDefault;
        this.f88680d = defaultItem;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (isDone()) {
            return;
        }
        m26354a();
        if (this.f88679c) {
            complete(this.f88680d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        complete(t);
    }
}
