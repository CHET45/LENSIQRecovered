package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j28 {

    /* JADX INFO: renamed from: a */
    public static final long f49419a = 9223372034707292159L;

    /* JADX INFO: renamed from: b */
    public static final long f49420b = 2139095040;

    /* JADX INFO: renamed from: c */
    public static final long f49421c = 9187343241974906880L;

    /* JADX INFO: renamed from: d */
    public static final long f49422d = 9205357640488583168L;

    /* JADX INFO: renamed from: e */
    public static final long f49423e = -9223372034707292160L;

    /* JADX INFO: renamed from: f */
    public static final long f49424f = -9223372034707292160L;

    /* JADX INFO: renamed from: g */
    public static final long f49425g = 4294967297L;

    /* JADX INFO: renamed from: h */
    public static final long f49426h = 9187343246269874177L;

    public static final void checkPrecondition(boolean z, @yfb ny6<String> ny6Var) {
        if (z) {
            return;
        }
        throwIllegalStateException(ny6Var.invoke());
    }

    public static final void throwIllegalStateException(@yfb String str) {
        throw new IllegalStateException(str);
    }
}
