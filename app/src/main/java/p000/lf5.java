package p000;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lf5 {

    /* JADX INFO: renamed from: a */
    public static final String f57467a = "ExoPlayerLib";

    /* JADX INFO: renamed from: b */
    public static final String f57468b = "2.19.1";

    /* JADX INFO: renamed from: c */
    public static final String f57469c = "ExoPlayerLib/2.19.1";

    /* JADX INFO: renamed from: d */
    public static final int f57470d = 2019001;

    /* JADX INFO: renamed from: e */
    public static final boolean f57471e = true;

    /* JADX INFO: renamed from: f */
    public static final boolean f57472f = true;

    /* JADX INFO: renamed from: g */
    public static final HashSet<String> f57473g = new HashSet<>();

    /* JADX INFO: renamed from: h */
    public static String f57474h = "goog.exo.core";

    private lf5() {
    }

    public static synchronized void registerModule(String str) {
        if (f57473g.add(str)) {
            f57474h += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return f57474h;
    }
}
