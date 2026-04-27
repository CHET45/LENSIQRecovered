package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class gad<Z> extends xd3<Z> {

    /* JADX INFO: renamed from: e */
    public static final int f39140e = 1;

    /* JADX INFO: renamed from: f */
    public static final Handler f39141f = new Handler(Looper.getMainLooper(), new C6185a());

    /* JADX INFO: renamed from: d */
    public final g4e f39142d;

    /* JADX INFO: renamed from: gad$a */
    public class C6185a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((gad) message.obj).m11484a();
            return true;
        }
    }

    private gad(g4e g4eVar, int i, int i2) {
        super(i, i2);
        this.f39142d = g4eVar;
    }

    public static <Z> gad<Z> obtain(g4e g4eVar, int i, int i2) {
        return new gad<>(g4eVar, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m11484a() {
        this.f39142d.clear(this);
    }

    @Override // p000.jmg
    public void onLoadCleared(@hib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onResourceReady(@efb Z z, @hib afh<? super Z> afhVar) {
        q3e request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f39141f.obtainMessage(1, this).sendToTarget();
    }
}
