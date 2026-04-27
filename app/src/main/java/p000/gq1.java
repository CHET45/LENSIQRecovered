package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gq1 {

    /* JADX INFO: renamed from: a */
    public static final int f40785a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f40786b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f40787c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f40788d = 29;

    /* JADX INFO: renamed from: e */
    public static final int f40789e = 536870911;

    /* JADX INFO: renamed from: f */
    public static final int f40790f = 536870911;

    /* JADX INFO: renamed from: g */
    @un8
    @yfb
    public static final qhg f40791g = new qhg("RESUME_TOKEN");

    private static final int decisionAndIndex(int i, int i2) {
        return (i << 29) + i2;
    }

    private static final int getDecision(int i) {
        return i >> 29;
    }

    private static final int getIndex(int i) {
        return i & 536870911;
    }
}
