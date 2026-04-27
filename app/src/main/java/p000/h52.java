package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface h52 {

    /* JADX INFO: renamed from: a */
    public static final h52 f42390a = new zig();

    pe7 createHandler(Looper looper, @hib Handler.Callback callback);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();

    void onThreadBlocked();

    long uptimeMillis();
}
