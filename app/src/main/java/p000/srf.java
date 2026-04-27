package p000;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p000.eta;
import p000.srf;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class srf implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: a */
    public final List<C12760a> f82717a;

    /* JADX INFO: renamed from: srf$a */
    public static final class C12760a {

        /* JADX INFO: renamed from: d */
        public static final Comparator<C12760a> f82718d = new Comparator() { // from class: rrf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return srf.C12760a.lambda$static$0((srf.C12760a) obj, (srf.C12760a) obj2);
            }
        };

        /* JADX INFO: renamed from: a */
        public final long f82719a;

        /* JADX INFO: renamed from: b */
        public final long f82720b;

        /* JADX INFO: renamed from: c */
        public final int f82721c;

        public C12760a(long j, long j2, int i) {
            v80.checkArgument(j < j2);
            this.f82719a = j;
            this.f82720b = j2;
            this.f82721c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(C12760a c12760a, C12760a c12760a2) {
            return bd2.start().compare(c12760a.f82719a, c12760a2.f82719a).compare(c12760a.f82720b, c12760a2.f82720b).compare(c12760a.f82721c, c12760a2.f82721c).result();
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12760a.class != obj.getClass()) {
                return false;
            }
            C12760a c12760a = (C12760a) obj;
            return this.f82719a == c12760a.f82719a && this.f82720b == c12760a.f82720b && this.f82721c == c12760a.f82721c;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f82719a), Long.valueOf(this.f82720b), Integer.valueOf(this.f82721c));
        }

        public String toString() {
            return t0i.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f82719a), Long.valueOf(this.f82720b), Integer.valueOf(this.f82721c));
        }
    }

    public srf(List<C12760a> list) {
        this.f82717a = list;
        v80.checkArgument(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(List<C12760a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f82720b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f82719a < j) {
                return true;
            }
            j = list.get(i).f82720b;
        }
        return false;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || srf.class != obj.getClass()) {
            return false;
        }
        return this.f82717a.equals(((srf) obj).f82717a);
    }

    public int hashCode() {
        return this.f82717a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f82717a;
    }
}
