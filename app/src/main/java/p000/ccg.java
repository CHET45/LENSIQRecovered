package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ccg {

    /* JADX INFO: renamed from: a */
    public static final boolean f16247a;

    static {
        f16247a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean isStylusHandwritingSupported() {
        return f16247a;
    }
}
