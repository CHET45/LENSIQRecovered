package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p6i extends Exception {

    /* JADX INFO: renamed from: a */
    public final long f69858a;

    public p6i(String str) {
        this(str, -9223372036854775807L);
    }

    public static p6i from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public p6i(String str, long j) {
        super(str);
        this.f69858a = j;
    }

    public static p6i from(Exception exc, long j) {
        return exc instanceof p6i ? (p6i) exc : new p6i(exc, j);
    }

    public p6i(String str, Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public p6i(String str, Throwable th, long j) {
        super(str, th);
        this.f69858a = j;
    }

    public p6i(Throwable th) {
        this(th, -9223372036854775807L);
    }

    public p6i(Throwable th, long j) {
        super(th);
        this.f69858a = j;
    }
}
