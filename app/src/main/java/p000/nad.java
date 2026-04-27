package p000;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class nad<T> extends z6c<T> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final T f63810a;

    public nad(T reference) {
        this.f63810a = reference;
    }

    @Override // p000.z6c
    public Set<T> asSet() {
        return Collections.singleton(this.f63810a);
    }

    @Override // p000.z6c
    public boolean equals(@wx1 Object object) {
        if (object instanceof nad) {
            return this.f63810a.equals(((nad) object).f63810a);
        }
        return false;
    }

    @Override // p000.z6c
    public T get() {
        return this.f63810a;
    }

    @Override // p000.z6c
    public int hashCode() {
        return this.f63810a.hashCode() + 1502476572;
    }

    @Override // p000.z6c
    public boolean isPresent() {
        return true;
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public T mo17830or(T defaultValue) {
        v7d.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.f63810a;
    }

    @Override // p000.z6c
    public T orNull() {
        return this.f63810a;
    }

    @Override // p000.z6c
    public String toString() {
        return "Optional.of(" + this.f63810a + c0b.f15434d;
    }

    @Override // p000.z6c
    public <V> z6c<V> transform(lz6<? super T, V> lz6Var) {
        return new nad(v7d.checkNotNull(lz6Var.apply(this.f63810a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public z6c<T> mo17832or(z6c<? extends T> secondChoice) {
        v7d.checkNotNull(secondChoice);
        return this;
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public T mo17831or(lfg<? extends T> supplier) {
        v7d.checkNotNull(supplier);
        return this.f63810a;
    }
}
