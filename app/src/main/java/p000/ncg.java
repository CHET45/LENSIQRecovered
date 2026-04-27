package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ncg<T> extends vkb<T> implements pxb<T> {
    @dib
    @cy1
    public abstract Throwable getThrowable();

    @cy1
    public abstract boolean hasComplete();

    @cy1
    public abstract boolean hasObservers();

    @cy1
    public abstract boolean hasThrowable();

    @cfb
    @cy1
    public final ncg<T> toSerialized() {
        return this instanceof s1f ? this : new s1f(this);
    }
}
