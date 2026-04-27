package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class j2g {

    /* JADX INFO: renamed from: A */
    public static final int f49431A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f49432B = 3;

    /* JADX INFO: renamed from: C */
    public static final int f49433C = 4;

    /* JADX INFO: renamed from: D */
    public static final int f49434D = 5;

    /* JADX INFO: renamed from: E */
    public static final int f49435E = 6;

    /* JADX INFO: renamed from: F */
    public static final int f49436F = 7;

    /* JADX INFO: renamed from: G */
    public static final int f49437G = 8;

    /* JADX INFO: renamed from: H */
    public static final int f49438H = 9;

    /* JADX INFO: renamed from: I */
    public static final int f49439I = 128;

    /* JADX INFO: renamed from: a */
    public static final int f49440a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f49441b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f49442c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f49443d = 3;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f49444e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f49445f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f49446g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f49447h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f49448i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f49449j = 4;

    /* JADX INFO: renamed from: k */
    public static final int f49450k = 5;

    /* JADX INFO: renamed from: l */
    public static final int f49451l = 6;

    /* JADX INFO: renamed from: m */
    public static final int f49452m = 7;

    /* JADX INFO: renamed from: n */
    public static final int f49453n = 8;

    /* JADX INFO: renamed from: o */
    public static final int f49454o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f49455p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f49456q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f49457r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f49458s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f49459t = 3;

    /* JADX INFO: renamed from: u */
    public static final int f49460u = 4;

    /* JADX INFO: renamed from: v */
    public static final int f49461v = 5;

    /* JADX INFO: renamed from: w */
    public static final int f49462w = 6;

    /* JADX INFO: renamed from: x */
    public static final int f49463x = 7;

    /* JADX INFO: renamed from: y */
    public static final int f49464y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f49465z = 1;

    public static String printConnectionState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.format(Locale.ENGLISH, "UNKNOWN STATE(%d)", Integer.valueOf(i)) : "CONNECTION_CONNECTED(4)" : "CONNECTION_CONNECTING(3)" : "CONNECTION_FAILED(2)" : "CONNECTION_OK(1)" : "CONNECTION_DISCONNECT(0)";
    }
}
