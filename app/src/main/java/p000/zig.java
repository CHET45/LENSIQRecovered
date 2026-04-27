package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zig implements h52 {
    @Override // p000.h52
    public pe7 createHandler(Looper looper, @hib Handler.Callback callback) {
        return new gjg(new Handler(looper, callback));
    }

    @Override // p000.h52
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // p000.h52
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.h52
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // p000.h52
    public void onThreadBlocked() {
    }

    @Override // p000.h52
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
