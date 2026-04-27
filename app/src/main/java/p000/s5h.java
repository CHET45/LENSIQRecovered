package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
@c5e(29)
public final class s5h {
    private s5h() {
    }

    public static void beginAsyncSection(@efb String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void endAsyncSection(@efb String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public static void setCounter(@efb String str, int i) {
        Trace.setCounter(str, i);
    }
}
