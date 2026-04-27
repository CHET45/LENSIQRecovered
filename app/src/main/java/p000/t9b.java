package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(serializable = true)
@tx4
public final class t9b extends s7c<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: e */
    public static final t9b f84051e = new t9b();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient s7c<Comparable<?>> f84052c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient s7c<Comparable<?>> f84053d;

    private t9b() {
    }

    private Object readResolve() {
        return f84051e;
    }

    @Override // p000.s7c
    public <S extends Comparable<?>> s7c<S> nullsFirst() {
        s7c<S> s7cVar = (s7c<S>) this.f84052c;
        if (s7cVar != null) {
            return s7cVar;
        }
        s7c<S> s7cVarNullsFirst = super.nullsFirst();
        this.f84052c = s7cVarNullsFirst;
        return s7cVarNullsFirst;
    }

    @Override // p000.s7c
    public <S extends Comparable<?>> s7c<S> nullsLast() {
        s7c<S> s7cVar = (s7c<S>) this.f84053d;
        if (s7cVar != null) {
            return s7cVar;
        }
        s7c<S> s7cVarNullsLast = super.nullsLast();
        this.f84053d = s7cVarNullsLast;
        return s7cVarNullsLast;
    }

    @Override // p000.s7c
    public <S extends Comparable<?>> s7c<S> reverse() {
        return k9e.f53375c;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // p000.s7c, java.util.Comparator
    public int compare(Comparable<?> left, Comparable<?> right) {
        v7d.checkNotNull(left);
        v7d.checkNotNull(right);
        return left.compareTo(right);
    }
}
