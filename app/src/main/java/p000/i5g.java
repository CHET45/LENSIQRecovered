package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class i5g {

    /* JADX INFO: renamed from: c */
    public static final i5g f45806c = new C7155a().build();

    /* JADX INFO: renamed from: a */
    public final long f45807a;

    /* JADX INFO: renamed from: b */
    public final long f45808b;

    /* JADX INFO: renamed from: i5g$a */
    public static final class C7155a {

        /* JADX INFO: renamed from: a */
        public long f45809a = 0;

        /* JADX INFO: renamed from: b */
        public long f45810b = 0;

        public i5g build() {
            return new i5g(this.f45809a, this.f45810b);
        }

        public C7155a setCurrentCacheSizeBytes(long j) {
            this.f45809a = j;
            return this;
        }

        public C7155a setMaxCacheSizeBytes(long j) {
            this.f45810b = j;
            return this;
        }
    }

    public i5g(long j, long j2) {
        this.f45807a = j;
        this.f45808b = j2;
    }

    public static i5g getDefaultInstance() {
        return f45806c;
    }

    public static C7155a newBuilder() {
        return new C7155a();
    }

    @jhd(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.f45807a;
    }

    @jhd(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.f45808b;
    }
}
