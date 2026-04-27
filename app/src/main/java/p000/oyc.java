package p000;

import android.os.HandlerThread;
import android.os.Looper;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@p7e({p7e.EnumC10826a.f69935b})
public final class oyc {

    /* JADX INFO: renamed from: a */
    public final Object f69203a;

    /* JADX INFO: renamed from: b */
    @xc7("lock")
    @hib
    public Looper f69204b;

    /* JADX INFO: renamed from: c */
    @xc7("lock")
    @hib
    public HandlerThread f69205c;

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public int f69206d;

    public oyc() {
        this(null);
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.f69203a) {
            try {
                if (this.f69204b == null) {
                    v80.checkState(this.f69206d == 0 && this.f69205c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f69205c = handlerThread;
                    handlerThread.start();
                    this.f69204b = this.f69205c.getLooper();
                }
                this.f69206d++;
                looper = this.f69204b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.f69203a) {
            try {
                v80.checkState(this.f69206d > 0);
                int i = this.f69206d - 1;
                this.f69206d = i;
                if (i == 0 && (handlerThread = this.f69205c) != null) {
                    handlerThread.quit();
                    this.f69205c = null;
                    this.f69204b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public oyc(@hib Looper looper) {
        this.f69203a = new Object();
        this.f69204b = looper;
        this.f69205c = null;
        this.f69206d = 0;
    }
}
