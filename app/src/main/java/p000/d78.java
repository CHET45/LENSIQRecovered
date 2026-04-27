package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class d78 implements Iterable<Integer>, uo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C4656a f28697d = new C4656a(null);

    /* JADX INFO: renamed from: a */
    public final int f28698a;

    /* JADX INFO: renamed from: b */
    public final int f28699b;

    /* JADX INFO: renamed from: c */
    public final int f28700c;

    /* JADX INFO: renamed from: d78$a */
    public static final class C4656a {
        public /* synthetic */ C4656a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final d78 fromClosedRange(int i, int i2, int i3) {
            return new d78(i, i2, i3);
        }

        private C4656a() {
        }
    }

    public d78(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f28698a = i;
        this.f28699b = red.getProgressionLastElement(i, i2, i3);
        this.f28700c = i3;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof d78) {
            if (!isEmpty() || !((d78) obj).isEmpty()) {
                d78 d78Var = (d78) obj;
                if (this.f28698a != d78Var.f28698a || this.f28699b != d78Var.f28699b || this.f28700c != d78Var.f28700c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.f28698a;
    }

    public final int getLast() {
        return this.f28699b;
    }

    public final int getStep() {
        return this.f28700c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f28698a * 31) + this.f28699b) * 31) + this.f28700c;
    }

    public boolean isEmpty() {
        if (this.f28700c > 0) {
            if (this.f28698a <= this.f28699b) {
                return false;
            }
        } else if (this.f28698a >= this.f28699b) {
            return false;
        }
        return true;
    }

    @yfb
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f28700c > 0) {
            sb = new StringBuilder();
            sb.append(this.f28698a);
            sb.append("..");
            sb.append(this.f28699b);
            sb.append(" step ");
            i = this.f28700c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f28698a);
            sb.append(" downTo ");
            sb.append(this.f28699b);
            sb.append(" step ");
            i = -this.f28700c;
        }
        sb.append(i);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Integer> iterator() {
        return new e78(this.f28698a, this.f28699b, this.f28700c);
    }
}
