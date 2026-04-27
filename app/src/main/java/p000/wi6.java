package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class wi6<T> extends hj6<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f94305c;

    /* JADX INFO: renamed from: d */
    public final T f94306d;

    public wi6(boolean hasDefault, T defaultItem) {
        this.f94305c = hasDefault;
        this.f94306d = defaultItem;
    }

    @Override // p000.hj6
    /* JADX INFO: renamed from: a */
    public void mo12424a(fdg s) {
        s.request(2L);
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
        } else if (this.f94305c) {
            complete(this.f94306d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f43804b == null) {
            this.f43804b = t;
        } else {
            this.f43804b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
