package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
public class ni2 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f64634b = AtomicIntegerFieldUpdater.newUpdater(ni2.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final Throwable f64635a;

    public ni2(@yfb Throwable th, boolean z) {
        this.f64635a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    private final /* synthetic */ int get_handled$volatile() {
        return this._handled$volatile;
    }

    private final /* synthetic */ void set_handled$volatile(int i) {
        this._handled$volatile = i;
    }

    public final boolean getHandled() {
        return f64634b.get(this) != 0;
    }

    public final boolean makeHandled() {
        return f64634b.compareAndSet(this, 0, 1);
    }

    @yfb
    public String toString() {
        return kk3.getClassSimpleName(this) + C4584d2.f28242k + this.f64635a + C4584d2.f28243l;
    }

    public /* synthetic */ ni2(Throwable th, boolean z, int i, jt3 jt3Var) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
