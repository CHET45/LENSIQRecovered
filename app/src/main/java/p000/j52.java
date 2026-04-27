package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface j52 {

    /* JADX INFO: renamed from: a */
    public static final j52 f49539a = new bjg();

    oe7 createHandler(Looper looper, @hib Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();

    void onThreadBlocked();

    long uptimeMillis();
}
