package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tsd {

    /* JADX INFO: renamed from: a */
    public static final int f85738a = 306783378;

    /* JADX INFO: renamed from: b */
    public static final int f85739b = 613566756;

    /* JADX INFO: renamed from: c */
    public static final int f85740c = -920350135;

    /* JADX INFO: renamed from: d */
    public static final int f85741d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f85742e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f85743f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f85744g = 8;

    /* JADX INFO: renamed from: h */
    public static final int f85745h = 16;

    /* JADX INFO: renamed from: i */
    public static final int f85746i = 32;

    /* JADX INFO: renamed from: j */
    public static final int f85747j = 64;

    /* JADX INFO: renamed from: k */
    @yfb
    public static final Object f85748k = new Object();

    @yjd
    public static final int updateChangedFlags(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & f85740c) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
