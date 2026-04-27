package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class lub<T> extends yub<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f58826c;

    /* JADX INFO: renamed from: d */
    public final T f58827d;

    public lub(boolean hasDefault, T defaultItem) {
        this.f58826c = hasDefault;
        this.f58827d = defaultItem;
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
        } else if (this.f58826c) {
            complete(this.f58827d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (this.f103000b == null) {
            this.f103000b = t;
        } else {
            this.f103000b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
