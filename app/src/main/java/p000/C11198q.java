package p000;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public final class C11198q<T> extends z6c<T> {

    /* JADX INFO: renamed from: a */
    public static final C11198q<Object> f72614a = new C11198q<>();
    private static final long serialVersionUID = 0;

    private C11198q() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> z6c<T> m19899a() {
        return f72614a;
    }

    private Object readResolve() {
        return f72614a;
    }

    @Override // p000.z6c
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // p000.z6c
    public boolean equals(@wx1 Object object) {
        return object == this;
    }

    @Override // p000.z6c
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.z6c
    public int hashCode() {
        return 2040732332;
    }

    @Override // p000.z6c
    public boolean isPresent() {
        return false;
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public T mo17830or(T t) {
        return (T) v7d.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // p000.z6c
    @wx1
    public T orNull() {
        return null;
    }

    @Override // p000.z6c
    public String toString() {
        return "Optional.absent()";
    }

    @Override // p000.z6c
    public <V> z6c<V> transform(lz6<? super T, V> function) {
        v7d.checkNotNull(function);
        return z6c.absent();
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public z6c<T> mo17832or(z6c<? extends T> secondChoice) {
        return (z6c) v7d.checkNotNull(secondChoice);
    }

    @Override // p000.z6c
    /* JADX INFO: renamed from: or */
    public T mo17831or(lfg<? extends T> lfgVar) {
        return (T) v7d.checkNotNull(lfgVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
