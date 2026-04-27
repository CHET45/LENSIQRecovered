package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x5h {
    private x5h() {
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
