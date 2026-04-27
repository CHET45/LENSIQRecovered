package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface hue {

    /* JADX INFO: renamed from: hue$a */
    public static final class C7023a {

        /* JADX INFO: renamed from: a */
        public final kue f44907a;

        /* JADX INFO: renamed from: b */
        public final kue f44908b;

        public C7023a(kue kueVar) {
            this(kueVar, kueVar);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7023a.class != obj.getClass()) {
                return false;
            }
            C7023a c7023a = (C7023a) obj;
            return this.f44907a.equals(c7023a.f44907a) && this.f44908b.equals(c7023a.f44908b);
        }

        public int hashCode() {
            return (this.f44907a.hashCode() * 31) + this.f44908b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f44907a);
            if (this.f44907a.equals(this.f44908b)) {
                str = "";
            } else {
                str = ", " + this.f44908b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C7023a(kue kueVar, kue kueVar2) {
            this.f44907a = (kue) u80.checkNotNull(kueVar);
            this.f44908b = (kue) u80.checkNotNull(kueVar2);
        }
    }

    /* JADX INFO: renamed from: hue$b */
    public static class C7024b implements hue {

        /* JADX INFO: renamed from: d */
        public final long f44909d;

        /* JADX INFO: renamed from: e */
        public final C7023a f44910e;

        public C7024b(long j) {
            this(j, 0L);
        }

        @Override // p000.hue
        public long getDurationUs() {
            return this.f44909d;
        }

        @Override // p000.hue
        public C7023a getSeekPoints(long j) {
            return this.f44910e;
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return false;
        }

        public C7024b(long j, long j2) {
            this.f44909d = j;
            this.f44910e = new C7023a(j2 == 0 ? kue.f55383c : new kue(0L, j2));
        }
    }

    long getDurationUs();

    C7023a getSeekPoints(long j);

    boolean isSeekable();
}
