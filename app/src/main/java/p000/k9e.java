package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class k9e extends s7c<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final k9e f53375c = new k9e();
    private static final long serialVersionUID = 0;

    private k9e() {
    }

    private Object readResolve() {
        return f53375c;
    }

    @Override // p000.s7c
    public <S extends Comparable<?>> s7c<S> reverse() {
        return s7c.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(Comparable<?> left, Comparable<?> right) {
        v7d.checkNotNull(left);
        if (left == right) {
            return 0;
        }
        return right.compareTo(left);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E max(E a, E b) {
        return (E) t9b.f84051e.min(a, b);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E min(E a, E b) {
        return (E) t9b.f84051e.max(a, b);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E max(E a, E b, E c, E... rest) {
        return (E) t9b.f84051e.min(a, b, c, rest);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E min(E a, E b, E c, E... rest) {
        return (E) t9b.f84051e.max(a, b, c, rest);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E max(Iterator<E> iterator) {
        return (E) t9b.f84051e.min(iterator);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E min(Iterator<E> iterator) {
        return (E) t9b.f84051e.max(iterator);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) t9b.f84051e.min(iterable);
    }

    @Override // p000.s7c
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) t9b.f84051e.max(iterable);
    }
}
