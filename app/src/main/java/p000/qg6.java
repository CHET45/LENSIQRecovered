package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qg6<T> extends l86<T> implements ndd<T, T>, kj6<T> {
    @dib
    @cy1
    public abstract Throwable getThrowable();

    @cy1
    public abstract boolean hasComplete();

    @cy1
    public abstract boolean hasSubscribers();

    @cy1
    public abstract boolean hasThrowable();

    @cfb
    @cy1
    public final qg6<T> toSerialized() {
        return this instanceof o1f ? this : new o1f(this);
    }
}
