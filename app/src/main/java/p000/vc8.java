package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class vc8<T> {

    /* JADX INFO: renamed from: a */
    public final float f90614a;

    /* JADX INFO: renamed from: b */
    public final float f90615b;

    /* JADX INFO: renamed from: c */
    @gib
    public final T f90616c;

    public vc8(float f, float f2, @gib T t) {
        this.f90614a = f;
        this.f90615b = f2;
        this.f90616c = t;
    }

    public final boolean contains(float f) {
        return f <= this.f90615b && this.f90614a <= f;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vc8 vc8Var = (vc8) obj;
            return this.f90614a == vc8Var.f90614a && this.f90615b == vc8Var.f90615b && md8.areEqual(this.f90616c, vc8Var.f90616c);
        }
        return false;
    }

    @gib
    public final T getData() {
        return this.f90616c;
    }

    public final float getEnd() {
        return this.f90615b;
    }

    public final float getStart() {
        return this.f90614a;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f90614a) * 31) + Float.hashCode(this.f90615b)) * 31;
        T t = this.f90616c;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final boolean overlaps(@yfb vc8<T> vc8Var) {
        return this.f90614a <= vc8Var.f90615b && this.f90615b >= vc8Var.f90614a;
    }

    @yfb
    public String toString() {
        return "Interval(start=" + this.f90614a + ", end=" + this.f90615b + ", data=" + this.f90616c + ')';
    }

    public final boolean overlaps(float f, float f2) {
        return this.f90614a <= f2 && this.f90615b >= f;
    }

    public /* synthetic */ vc8(float f, float f2, Object obj, int i, jt3 jt3Var) {
        this(f, f2, (i & 4) != 0 ? null : obj);
    }
}
