package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class ro1 {
    private ro1() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static Handler m21446a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
