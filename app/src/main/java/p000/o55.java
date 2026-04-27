package p000;

/* JADX INFO: loaded from: classes5.dex */
public class o55<T> {

    /* JADX INFO: renamed from: a */
    public final Class<T> f66492a;

    /* JADX INFO: renamed from: b */
    public final T f66493b;

    public o55(Class<T> cls, T t) {
        this.f66492a = (Class) w7d.checkNotNull(cls);
        this.f66493b = (T) w7d.checkNotNull(t);
    }

    public T getPayload() {
        return this.f66493b;
    }

    public Class<T> getType() {
        return this.f66492a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f66492a, this.f66493b);
    }
}
