package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class q6i extends Exception {

    /* JADX INFO: renamed from: a */
    public final long f73351a;

    public q6i(String str) {
        this(str, -9223372036854775807L);
    }

    public static q6i from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public q6i(String str, long j) {
        super(str);
        this.f73351a = j;
    }

    public static q6i from(Exception exc, long j) {
        return exc instanceof q6i ? (q6i) exc : new q6i(exc, j);
    }

    public q6i(String str, Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public q6i(String str, Throwable th, long j) {
        super(str, th);
        this.f73351a = j;
    }

    public q6i(Throwable th) {
        this(th, -9223372036854775807L);
    }

    public q6i(Throwable th, long j) {
        super(th);
        this.f73351a = j;
    }
}
