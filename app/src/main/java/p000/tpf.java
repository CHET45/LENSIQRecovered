package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class tpf<E> extends dy7<E> {

    /* JADX INFO: renamed from: f */
    public final transient E f85558f;

    public tpf(E e) {
        this.f85558f = (E) v7d.checkNotNull(e);
    }

    @Override // p000.ax7
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        dst[offset] = this.f85558f;
        return offset + 1;
    }

    @Override // p000.dy7, p000.ax7
    public kx7<E> asList() {
        return kx7.m15111of((Object) this.f85558f);
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object target) {
        return this.f85558f.equals(target);
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f85558f.hashCode();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return C4584d2.f28242k + this.f85558f.toString() + C4584d2.f28243l;
    }

    @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<E> iterator() {
        return wg8.singletonIterator(this.f85558f);
    }
}
