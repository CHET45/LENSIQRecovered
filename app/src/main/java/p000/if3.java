package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class if3<T> extends g2g<T> {

    /* JADX INFO: renamed from: b */
    public final T f46725b;

    /* JADX INFO: renamed from: c */
    public final int f46726c;

    public if3(T t, int i, int i2) {
        super(i2, null);
        this.f46725b = t;
        this.f46726c = i;
    }

    public final void checkHashCode() {
        T t = this.f46725b;
        if ((t != null ? t.hashCode() : 0) != this.f46726c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.f46726c;
    }

    public final T getValue() {
        return this.f46725b;
    }
}
