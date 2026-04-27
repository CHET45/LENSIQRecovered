package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class bjg implements j52 {
    @Override // p000.j52
    public oe7 createHandler(Looper looper, @hib Handler.Callback callback) {
        return new fjg(new Handler(looper, callback));
    }

    @Override // p000.j52
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // p000.j52
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.j52
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // p000.j52
    public void onThreadBlocked() {
    }

    @Override // p000.j52
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
