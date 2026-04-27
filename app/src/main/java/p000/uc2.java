package p000;

import java.lang.Comparable;
import p000.r5c;

/* JADX INFO: loaded from: classes7.dex */
public class uc2<T extends Comparable<? super T>> implements r5c<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final T f87488a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final T f87489b;

    public uc2(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "start");
        md8.checkNotNullParameter(t2, "endExclusive");
        this.f87488a = t;
        this.f87489b = t2;
    }

    @Override // p000.r5c
    public boolean contains(@yfb T t) {
        return r5c.C11895a.contains(this, t);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof uc2) {
            if (!isEmpty() || !((uc2) obj).isEmpty()) {
                uc2 uc2Var = (uc2) obj;
                if (!md8.areEqual(getStart(), uc2Var.getStart()) || !md8.areEqual(getEndExclusive(), uc2Var.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000.r5c
    @yfb
    public T getEndExclusive() {
        return this.f87489b;
    }

    @Override // p000.r5c
    @yfb
    public T getStart() {
        return this.f87488a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // p000.r5c
    public boolean isEmpty() {
        return r5c.C11895a.isEmpty(this);
    }

    @yfb
    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
