package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public final class xe8 extends rj8 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f97591f = AtomicIntegerFieldUpdater.newUpdater(xe8.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e */
    @yfb
    public final qy6<Throwable, bth> f97592e;

    /* JADX WARN: Multi-variable type inference failed */
    public xe8(@yfb qy6<? super Throwable, bth> qy6Var) {
        this.f97592e = qy6Var;
    }

    private final /* synthetic */ int get_invoked$volatile() {
        return this._invoked$volatile;
    }

    private final /* synthetic */ void set_invoked$volatile(int i) {
        this._invoked$volatile = i;
    }

    @Override // p000.rj8
    public boolean getOnCancelling() {
        return true;
    }

    @Override // p000.rj8
    public void invoke(@gib Throwable th) {
        if (f97591f.compareAndSet(this, 0, 1)) {
            this.f97592e.invoke(th);
        }
    }
}
