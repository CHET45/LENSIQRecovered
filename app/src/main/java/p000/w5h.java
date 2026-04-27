package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w5h {
    private w5h() {
    }

    public static void beginSection(String str) {
        if (x0i.f95978a >= 18) {
            beginSectionV18(str);
        }
    }

    @c5e(18)
    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        if (x0i.f95978a >= 18) {
            endSectionV18();
        }
    }

    @c5e(18)
    private static void endSectionV18() {
        Trace.endSection();
    }
}
