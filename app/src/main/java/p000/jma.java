package p000;

import android.os.Messenger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jma {

    /* JADX INFO: renamed from: A */
    public static final int f51194A = 1;

    /* JADX INFO: renamed from: B */
    public static final int f51195B = 2;

    /* JADX INFO: renamed from: C */
    public static final int f51196C = 3;

    /* JADX INFO: renamed from: D */
    public static final int f51197D = 4;

    /* JADX INFO: renamed from: E */
    public static final int f51198E = 5;

    /* JADX INFO: renamed from: F */
    public static final int f51199F = 6;

    /* JADX INFO: renamed from: G */
    public static final int f51200G = 7;

    /* JADX INFO: renamed from: H */
    public static final int f51201H = 8;

    /* JADX INFO: renamed from: I */
    public static final String f51202I = "error";

    /* JADX INFO: renamed from: J */
    public static final int f51203J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f51204K = 2;

    /* JADX INFO: renamed from: L */
    public static final int f51205L = 3;

    /* JADX INFO: renamed from: M */
    public static final int f51206M = 4;

    /* JADX INFO: renamed from: N */
    public static final int f51207N = 4;

    /* JADX INFO: renamed from: O */
    public static final int f51208O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f51209P = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f51210Q = 3;

    /* JADX INFO: renamed from: R */
    public static final int f51211R = 3;

    /* JADX INFO: renamed from: S */
    public static final int f51212S = 1;

    /* JADX INFO: renamed from: a */
    public static final String f51213a = "android.media.MediaRouteProviderService";

    /* JADX INFO: renamed from: b */
    public static final int f51214b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f51215c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f51216d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f51217e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f51218f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f51219g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f51220h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f51221i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f51222j = 9;

    /* JADX INFO: renamed from: k */
    public static final int f51223k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f51224l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f51225m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f51226n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f51227o = 14;

    /* JADX INFO: renamed from: p */
    public static final String f51228p = "routeId";

    /* JADX INFO: renamed from: q */
    public static final String f51229q = "routeGroupId";

    /* JADX INFO: renamed from: r */
    public static final String f51230r = "volume";

    /* JADX INFO: renamed from: s */
    public static final String f51231s = "unselectReason";

    /* JADX INFO: renamed from: t */
    public static final String f51232t = "memberRouteIds";

    /* JADX INFO: renamed from: u */
    public static final String f51233u = "memberRouteId";

    /* JADX INFO: renamed from: v */
    public static final String f51234v = "groupableTitle";

    /* JADX INFO: renamed from: w */
    public static final String f51235w = "transferableTitle";

    /* JADX INFO: renamed from: x */
    public static final String f51236x = "groupRoute";

    /* JADX INFO: renamed from: y */
    public static final String f51237y = "dynamicRoutes";

    /* JADX INFO: renamed from: z */
    public static final int f51238z = 0;

    private jma() {
    }

    public static boolean isValidRemoteMessenger(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
