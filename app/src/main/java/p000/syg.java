package p000;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class syg {
    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
