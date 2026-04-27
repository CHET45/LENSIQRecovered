package p000;

import java.lang.Comparable;
import p000.a62;

/* JADX INFO: loaded from: classes7.dex */
public class vc2<T extends Comparable<? super T>> implements a62<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T f90584a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final T f90585b;

    public vc2(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "start");
        md8.checkNotNullParameter(t2, "endInclusive");
        this.f90584a = t;
        this.f90585b = t2;
    }

    @Override // p000.a62, p000.r5c
    public boolean contains(@yfb T t) {
        return a62.C0071a.contains(this, t);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof vc2) {
            if (!isEmpty() || !((vc2) obj).isEmpty()) {
                vc2 vc2Var = (vc2) obj;
                if (!md8.areEqual(getStart(), vc2Var.getStart()) || !md8.areEqual(getEndInclusive(), vc2Var.getEndInclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.a62
    @yfb
    public T getEndInclusive() {
        return this.f90585b;
    }

    @Override // p000.a62, p000.r5c
    @yfb
    public T getStart() {
        return this.f90584a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndInclusive().hashCode();
    }

    @Override // p000.a62, p000.r5c
    public boolean isEmpty() {
        return a62.C0071a.isEmpty(this);
    }

    @yfb
    public String toString() {
        return getStart() + ".." + getEndInclusive();
    }
}
