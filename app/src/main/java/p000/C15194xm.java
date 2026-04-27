package p000;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: xm */
/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class C15194xm extends s7c<Object> implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final C15194xm f98484c = new C15194xm();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f98484c;
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(@wx1 Object left, @wx1 Object right) {
        return 0;
    }

    @Override // p000.s7c
    public <E> kx7<E> immutableSortedCopy(Iterable<E> iterable) {
        return kx7.copyOf(iterable);
    }

    @Override // p000.s7c
    public <S> s7c<S> reverse() {
        return this;
    }

    @Override // p000.s7c
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return eb9.newArrayList(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
