package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class f1h {

    /* JADX INFO: renamed from: c */
    public static final f1h f34723c = new C5543a().build();

    /* JADX INFO: renamed from: a */
    public final long f34724a;

    /* JADX INFO: renamed from: b */
    public final long f34725b;

    /* JADX INFO: renamed from: f1h$a */
    public static final class C5543a {

        /* JADX INFO: renamed from: a */
        public long f34726a = 0;

        /* JADX INFO: renamed from: b */
        public long f34727b = 0;

        public f1h build() {
            return new f1h(this.f34726a, this.f34727b);
        }

        public C5543a setEndMs(long j) {
            this.f34727b = j;
            return this;
        }

        public C5543a setStartMs(long j) {
            this.f34726a = j;
            return this;
        }
    }

    public f1h(long j, long j2) {
        this.f34724a = j;
        this.f34725b = j2;
    }

    public static f1h getDefaultInstance() {
        return f34723c;
    }

    public static C5543a newBuilder() {
        return new C5543a();
    }

    @jhd(tag = 2)
    public long getEndMs() {
        return this.f34725b;
    }

    @jhd(tag = 1)
    public long getStartMs() {
        return this.f34724a;
    }
}
