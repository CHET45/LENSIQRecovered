package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {yh5.class})
@jjf(version = "1.5")
public class uph implements Iterable<oph>, uo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C13644a f88732d = new C13644a(null);

    /* JADX INFO: renamed from: a */
    public final long f88733a;

    /* JADX INFO: renamed from: b */
    public final long f88734b;

    /* JADX INFO: renamed from: c */
    public final long f88735c;

    /* JADX INFO: renamed from: uph$a */
    public static final class C13644a {
        public /* synthetic */ C13644a(jt3 jt3Var) {
            this();
        }

        @yfb
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final uph m32644fromClosedRange7ftBX0g(long j, long j2, long j3) {
            return new uph(j, j2, j3, null);
        }

        private C13644a() {
        }
    }

    public /* synthetic */ uph(long j, long j2, long j3, jt3 jt3Var) {
        this(j, j2, j3);
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof uph) {
            if (!isEmpty() || !((uph) obj).isEmpty()) {
                uph uphVar = (uph) obj;
                if (this.f88733a != uphVar.f88733a || this.f88734b != uphVar.f88734b || this.f88735c != uphVar.f88735c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m32642getFirstsVKNKU() {
        return this.f88733a;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m32643getLastsVKNKU() {
        return this.f88734b;
    }

    public final long getStep() {
        return this.f88735c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f88733a;
        int iM31533constructorimpl = ((int) oph.m31533constructorimpl(j ^ oph.m31533constructorimpl(j >>> 32))) * 31;
        long j2 = this.f88734b;
        int iM31533constructorimpl2 = (iM31533constructorimpl + ((int) oph.m31533constructorimpl(j2 ^ oph.m31533constructorimpl(j2 >>> 32)))) * 31;
        long j3 = this.f88735c;
        return iM31533constructorimpl2 + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        long j = this.f88735c;
        long j2 = this.f88733a;
        long j3 = this.f88734b;
        if (j > 0) {
            if (Long.compareUnsigned(j2, j3) <= 0) {
                return false;
            }
        } else if (Long.compareUnsigned(j2, j3) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @yfb
    public final Iterator<oph> iterator() {
        return new vph(this.f88733a, this.f88734b, this.f88735c, null);
    }

    @yfb
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f88735c > 0) {
            sb = new StringBuilder();
            sb.append((Object) oph.m31579toStringimpl(this.f88733a));
            sb.append("..");
            sb.append((Object) oph.m31579toStringimpl(this.f88734b));
            sb.append(" step ");
            j = this.f88735c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) oph.m31579toStringimpl(this.f88733a));
            sb.append(" downTo ");
            sb.append((Object) oph.m31579toStringimpl(this.f88734b));
            sb.append(" step ");
            j = -this.f88735c;
        }
        sb.append(j);
        return sb.toString();
    }

    private uph(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f88733a = j;
        this.f88734b = bqh.m28050getProgressionLastElement7ftBX0g(j, j2, j3);
        this.f88735c = j3;
    }
}
