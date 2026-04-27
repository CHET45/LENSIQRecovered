package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public class u6e {

    /* JADX INFO: renamed from: a */
    public boolean f86901a;

    /* JADX INFO: renamed from: b */
    public final Handler f86902b = new Handler(Looper.getMainLooper(), new C13379a());

    /* JADX INFO: renamed from: u6e$a */
    public static final class C13379a implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public static final int f86903a = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((t5e) message.obj).recycle();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m23116a(t5e<?> t5eVar, boolean z) {
        try {
            if (this.f86901a || z) {
                this.f86902b.obtainMessage(1, t5eVar).sendToTarget();
            } else {
                this.f86901a = true;
                t5eVar.recycle();
                this.f86901a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
