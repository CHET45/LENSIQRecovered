package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface gue {

    /* JADX INFO: renamed from: gue$a */
    public static final class C6548a {

        /* JADX INFO: renamed from: a */
        public final lue f41218a;

        /* JADX INFO: renamed from: b */
        public final lue f41219b;

        public C6548a(lue lueVar) {
            this(lueVar, lueVar);
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6548a.class != obj.getClass()) {
                return false;
            }
            C6548a c6548a = (C6548a) obj;
            return this.f41218a.equals(c6548a.f41218a) && this.f41219b.equals(c6548a.f41219b);
        }

        public int hashCode() {
            return (this.f41218a.hashCode() * 31) + this.f41219b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f41218a);
            if (this.f41218a.equals(this.f41219b)) {
                str = "";
            } else {
                str = ", " + this.f41219b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public C6548a(lue lueVar, lue lueVar2) {
            this.f41218a = (lue) v80.checkNotNull(lueVar);
            this.f41219b = (lue) v80.checkNotNull(lueVar2);
        }
    }

    /* JADX INFO: renamed from: gue$b */
    public static class C6549b implements gue {

        /* JADX INFO: renamed from: d */
        public final long f41220d;

        /* JADX INFO: renamed from: e */
        public final C6548a f41221e;

        public C6549b(long j) {
            this(j, 0L);
        }

        @Override // p000.gue
        public long getDurationUs() {
            return this.f41220d;
        }

        @Override // p000.gue
        public C6548a getSeekPoints(long j) {
            return this.f41221e;
        }

        @Override // p000.gue
        public boolean isSeekable() {
            return false;
        }

        public C6549b(long j, long j2) {
            this.f41220d = j;
            this.f41221e = new C6548a(j2 == 0 ? lue.f58832c : new lue(0L, j2));
        }
    }

    long getDurationUs();

    C6548a getSeekPoints(long j);

    boolean isSeekable();
}
