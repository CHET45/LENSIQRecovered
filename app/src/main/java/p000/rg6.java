package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rg6<T> extends m86<T> implements ndd<T, T>, lj6<T> {
    @cib
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    @bfb
    @by1
    public final rg6<T> toSerialized() {
        return this instanceof p1f ? this : new p1f(this);
    }
}
