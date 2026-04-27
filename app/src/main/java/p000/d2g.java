package p000;

import android.util.Log;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class d2g {

    /* JADX INFO: renamed from: a */
    public static final String f28293a = "StartupLogger";

    /* JADX INFO: renamed from: b */
    public static final boolean f28294b = false;

    private d2g() {
    }

    /* JADX INFO: renamed from: e */
    public static void m8857e(@efb String str, @hib Throwable th) {
        Log.e(f28293a, str, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m8858i(@efb String str) {
        Log.i(f28293a, str);
    }

    /* JADX INFO: renamed from: w */
    public static void m8859w(@efb String str) {
        Log.w(f28293a, str);
    }
}
