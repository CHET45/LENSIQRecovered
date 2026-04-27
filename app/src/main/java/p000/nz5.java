package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes5.dex */
public final class nz5 {
    private nz5() {
    }

    public static void popTrace() {
        Trace.endSection();
    }

    public static void pushTrace(String str) {
        Trace.beginSection(str);
    }
}
