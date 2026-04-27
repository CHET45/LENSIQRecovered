package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {yh5.class})
@jjf(version = "1.5")
public class kph implements Iterable<woh>, uo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C8493a f54928d = new C8493a(null);

    /* JADX INFO: renamed from: a */
    public final int f54929a;

    /* JADX INFO: renamed from: b */
    public final int f54930b;

    /* JADX INFO: renamed from: c */
    public final int f54931c;

    /* JADX INFO: renamed from: kph$a */
    public static final class C8493a {
        public /* synthetic */ C8493a(jt3 jt3Var) {
            this();
        }

        @yfb
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final kph m30734fromClosedRangeNkh28Cs(int i, int i2, int i3) {
            return new kph(i, i2, i3, null);
        }

        private C8493a() {
        }
    }

    public /* synthetic */ kph(int i, int i2, int i3, jt3 jt3Var) {
        this(i, i2, i3);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof kph) {
            if (!isEmpty() || !((kph) obj).isEmpty()) {
                kph kphVar = (kph) obj;
                if (this.f54929a != kphVar.f54929a || this.f54930b != kphVar.f54930b || this.f54931c != kphVar.f54931c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m30732getFirstpVg5ArA() {
        return this.f54929a;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m30733getLastpVg5ArA() {
        return this.f54930b;
    }

    public final int getStep() {
        return this.f54931c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f54929a * 31) + this.f54930b) * 31) + this.f54931c;
    }

    public boolean isEmpty() {
        if (this.f54931c > 0) {
            if (Integer.compareUnsigned(this.f54929a, this.f54930b) <= 0) {
                return false;
            }
        } else if (Integer.compareUnsigned(this.f54929a, this.f54930b) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @yfb
    public final Iterator<woh> iterator() {
        return new lph(this.f54929a, this.f54930b, this.f54931c, null);
    }

    @yfb
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f54931c > 0) {
            sb = new StringBuilder();
            sb.append((Object) woh.m33050toStringimpl(this.f54929a));
            sb.append("..");
            sb.append((Object) woh.m33050toStringimpl(this.f54930b));
            sb.append(" step ");
            i = this.f54931c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) woh.m33050toStringimpl(this.f54929a));
            sb.append(" downTo ");
            sb.append((Object) woh.m33050toStringimpl(this.f54930b));
            sb.append(" step ");
            i = -this.f54931c;
        }
        sb.append(i);
        return sb.toString();
    }

    private kph(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f54929a = i;
        this.f54930b = bqh.m28051getProgressionLastElementNkh28Cs(i, i2, i3);
        this.f54931c = i3;
    }
}
