package p000;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dga {

    /* JADX INFO: renamed from: a */
    public static final String f29599a = "AndroidXMedia3";

    /* JADX INFO: renamed from: b */
    public static final String f29600b = "1.8.0";

    /* JADX INFO: renamed from: c */
    public static final String f29601c = "AndroidXMedia3/1.8.0";

    /* JADX INFO: renamed from: d */
    public static final int f29602d = 1008000300;

    /* JADX INFO: renamed from: e */
    public static final boolean f29603e = true;

    /* JADX INFO: renamed from: f */
    public static final boolean f29604f = true;

    /* JADX INFO: renamed from: g */
    public static final HashSet<String> f29605g = new HashSet<>();

    /* JADX INFO: renamed from: h */
    public static String f29606h = "media3.common";

    private dga() {
    }

    public static synchronized void registerModule(String str) {
        if (f29605g.add(str)) {
            f29606h += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return f29606h;
    }
}
