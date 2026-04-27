package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public final class qq1 extends ni2 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75098c = AtomicIntegerFieldUpdater.newUpdater(qq1.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public qq1(@yfb zy2<?> zy2Var, @gib Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + zy2Var + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }

    private final /* synthetic */ int get_resumed$volatile() {
        return this._resumed$volatile;
    }

    private final /* synthetic */ void set_resumed$volatile(int i) {
        this._resumed$volatile = i;
    }

    public final boolean makeResumed() {
        return f75098c.compareAndSet(this, 0, 1);
    }
}
