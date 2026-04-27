package p000;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class q5h {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final q5h f73293a = new q5h();

    /* JADX INFO: renamed from: b */
    public static final int f73294b = 0;

    private q5h() {
    }

    @gib
    public final Object beginSection(@yfb String str) {
        Trace.beginSection(str);
        return null;
    }

    public final void endSection(@gib Object obj) {
        Trace.endSection();
    }
}
