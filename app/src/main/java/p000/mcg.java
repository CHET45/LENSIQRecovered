package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mcg<T> extends Observable<T> implements oxb<T> {
    @cib
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasObservers();

    public abstract boolean hasThrowable();

    @bfb
    public final mcg<T> toSerialized() {
        return this instanceof r1f ? this : new r1f(this);
    }
}
