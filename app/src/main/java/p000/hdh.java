package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class hdh {

    /* JADX INFO: renamed from: b */
    public static final hdh f43210b = new C6811b().build();

    /* JADX INFO: renamed from: c */
    public static final int f43211c = 5;

    /* JADX INFO: renamed from: a */
    public final int f43212a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hdh.class == obj.getClass() && this.f43212a == ((hdh) obj).f43212a;
    }

    public int getMaxAttempts() {
        return this.f43212a;
    }

    public int hashCode() {
        return this.f43212a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f43212a + '}';
    }

    /* JADX INFO: renamed from: hdh$b */
    public static final class C6811b {

        /* JADX INFO: renamed from: a */
        public int f43213a;

        public C6811b() {
            this.f43213a = 5;
        }

        @efb
        public hdh build() {
            return new hdh(this.f43213a);
        }

        @efb
        public C6811b setMaxAttempts(int i) {
            if (i < 1) {
                throw new IllegalArgumentException("Max attempts must be at least 1");
            }
            this.f43213a = i;
            return this;
        }

        public C6811b(@efb hdh hdhVar) {
            this.f43213a = 5;
            this.f43213a = hdhVar.f43212a;
        }
    }

    private hdh(int i) {
        this.f43212a = i;
    }
}
