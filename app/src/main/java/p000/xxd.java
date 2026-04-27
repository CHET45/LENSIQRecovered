package p000;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xxd<T> extends vkb<T> implements uu2<T> {
    public abstract void accept(@cfb T t);

    public abstract boolean hasObservers();

    @cfb
    @cy1
    public final xxd<T> toSerialized() {
        return this instanceof q1f ? this : new q1f(this);
    }
}
