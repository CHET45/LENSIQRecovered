package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes8.dex */
public class ge8 extends Handler {

    /* JADX INFO: renamed from: b */
    public static final int f39618b = -1;

    /* JADX INFO: renamed from: a */
    public final WeakReference<C11006b> f39619a;

    public ge8(C11006b c11006b) {
        super(Looper.getMainLooper());
        this.f39619a = new WeakReference<>(c11006b);
    }

    @Override // android.os.Handler
    public void handleMessage(@efb Message message) {
        C11006b c11006b = this.f39619a.get();
        if (c11006b == null) {
            return;
        }
        if (message.what == -1) {
            c11006b.invalidateSelf();
            return;
        }
        Iterator<InterfaceC9035ly> it = c11006b.f71254C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCompleted(message.what);
        }
    }
}
