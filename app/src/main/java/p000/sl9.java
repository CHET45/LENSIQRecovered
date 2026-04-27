package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class sl9 implements Iterable<Long>, uo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C12648a f82177d = new C12648a(null);

    /* JADX INFO: renamed from: a */
    public final long f82178a;

    /* JADX INFO: renamed from: b */
    public final long f82179b;

    /* JADX INFO: renamed from: c */
    public final long f82180c;

    /* JADX INFO: renamed from: sl9$a */
    public static final class C12648a {
        public /* synthetic */ C12648a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final sl9 fromClosedRange(long j, long j2, long j3) {
            return new sl9(j, j2, j3);
        }

        private C12648a() {
        }
    }

    public sl9(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f82178a = j;
        this.f82179b = red.getProgressionLastElement(j, j2, j3);
        this.f82180c = j3;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof sl9) {
            if (!isEmpty() || !((sl9) obj).isEmpty()) {
                sl9 sl9Var = (sl9) obj;
                if (this.f82178a != sl9Var.f82178a || this.f82179b != sl9Var.f82179b || this.f82180c != sl9Var.f82180c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.f82178a;
    }

    public final long getLast() {
        return this.f82179b;
    }

    public final long getStep() {
        return this.f82180c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f82178a;
        long j3 = this.f82179b;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f82180c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f82180c;
        long j2 = this.f82178a;
        long j3 = this.f82179b;
        if (j > 0) {
            if (j2 <= j3) {
                return false;
            }
        } else if (j2 >= j3) {
            return false;
        }
        return true;
    }

    @yfb
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f82180c > 0) {
            sb = new StringBuilder();
            sb.append(this.f82178a);
            sb.append("..");
            sb.append(this.f82179b);
            sb.append(" step ");
            j = this.f82180c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f82178a);
            sb.append(" downTo ");
            sb.append(this.f82179b);
            sb.append(" step ");
            j = -this.f82180c;
        }
        sb.append(j);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    @yfb
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Long> iterator2() {
        return new tl9(this.f82178a, this.f82179b, this.f82180c);
    }
}
