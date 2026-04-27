package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yt2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yt2 f102935a = new yt2();

    /* JADX INFO: renamed from: b */
    @un8
    public static final double f102936b = Math.log(2.0d);

    /* JADX INFO: renamed from: c */
    @un8
    public static final double f102937c;

    /* JADX INFO: renamed from: d */
    @un8
    public static final double f102938d;

    /* JADX INFO: renamed from: e */
    @un8
    public static final double f102939e;

    /* JADX INFO: renamed from: f */
    @un8
    public static final double f102940f;

    /* JADX INFO: renamed from: g */
    @un8
    public static final double f102941g;

    static {
        double dUlp = Math.ulp(1.0d);
        f102937c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f102938d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f102939e = dSqrt2;
        double d = 1;
        f102940f = d / dSqrt;
        f102941g = d / dSqrt2;
    }

    private yt2() {
    }
}
