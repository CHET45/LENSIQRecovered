package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class pc6<T> extends hj6<T> {

    /* JADX INFO: renamed from: c */
    public final boolean f70312c;

    /* JADX INFO: renamed from: d */
    public final T f70313d;

    public pc6(boolean hasDefault, T defaultItem) {
        this.f70312c = hasDefault;
        this.f70313d = defaultItem;
    }

    @Override // p000.hj6
    /* JADX INFO: renamed from: a */
    public void mo12424a(fdg s) {
        s.request(1L);
    }

    @Override // p000.ycg
    public void onComplete() {
        if (isDone()) {
            return;
        }
        m12426c();
        if (this.f70312c) {
            complete(this.f70313d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        complete(t);
    }
}
