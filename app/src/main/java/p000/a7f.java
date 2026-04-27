package p000;

/* JADX INFO: loaded from: classes5.dex */
public class a7f {

    /* JADX INFO: renamed from: a */
    public final C0084b f575a;

    /* JADX INFO: renamed from: b */
    public final C0083a f576b;

    /* JADX INFO: renamed from: c */
    public final long f577c;

    /* JADX INFO: renamed from: d */
    public final int f578d;

    /* JADX INFO: renamed from: e */
    public final int f579e;

    /* JADX INFO: renamed from: f */
    public final double f580f;

    /* JADX INFO: renamed from: g */
    public final double f581g;

    /* JADX INFO: renamed from: h */
    public final int f582h;

    /* JADX INFO: renamed from: a7f$a */
    public static class C0083a {

        /* JADX INFO: renamed from: a */
        public final boolean f583a;

        /* JADX INFO: renamed from: b */
        public final boolean f584b;

        /* JADX INFO: renamed from: c */
        public final boolean f585c;

        public C0083a(boolean z, boolean z2, boolean z3) {
            this.f583a = z;
            this.f584b = z2;
            this.f585c = z3;
        }
    }

    /* JADX INFO: renamed from: a7f$b */
    public static class C0084b {

        /* JADX INFO: renamed from: a */
        public final int f586a;

        /* JADX INFO: renamed from: b */
        public final int f587b;

        public C0084b(int i, int i2) {
            this.f586a = i;
            this.f587b = i2;
        }
    }

    public a7f(long j, C0084b c0084b, C0083a c0083a, int i, int i2, double d, double d2, int i3) {
        this.f577c = j;
        this.f575a = c0084b;
        this.f576b = c0083a;
        this.f578d = i;
        this.f579e = i2;
        this.f580f = d;
        this.f581g = d2;
        this.f582h = i3;
    }

    public boolean isExpired(long j) {
        return this.f577c < j;
    }
}
