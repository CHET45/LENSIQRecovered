package p000;

import android.os.Looper;

/* JADX INFO: renamed from: zv */
/* JADX INFO: loaded from: classes.dex */
public final class C16260zv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
