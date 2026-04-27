package p000;

import p000.drb;
import p000.jo1;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class k89 extends jo1<drb.AbstractC4925a, drb, C8231b> {

    /* JADX INFO: renamed from: C */
    public static final int f52765C = 0;

    /* JADX INFO: renamed from: F */
    public static final int f52766F = 1;

    /* JADX INFO: renamed from: H */
    public static final int f52767H = 2;

    /* JADX INFO: renamed from: L */
    public static final int f52768L = 3;

    /* JADX INFO: renamed from: M */
    public static final int f52769M = 4;

    /* JADX INFO: renamed from: m */
    public static final p4d.C10793c<C8231b> f52771m = new p4d.C10793c<>(10);

    /* JADX INFO: renamed from: N */
    public static final jo1.AbstractC7989a<drb.AbstractC4925a, drb, C8231b> f52770N = new C8230a();

    /* JADX INFO: renamed from: k89$a */
    public class C8230a extends jo1.AbstractC7989a<drb.AbstractC4925a, drb, C8231b> {
        @Override // p000.jo1.AbstractC7989a
        public void onNotifyCallback(drb.AbstractC4925a abstractC4925a, drb drbVar, int i, C8231b c8231b) {
            if (i == 1) {
                abstractC4925a.onItemRangeChanged(drbVar, c8231b.f52772a, c8231b.f52773b);
                return;
            }
            if (i == 2) {
                abstractC4925a.onItemRangeInserted(drbVar, c8231b.f52772a, c8231b.f52773b);
                return;
            }
            if (i == 3) {
                abstractC4925a.onItemRangeMoved(drbVar, c8231b.f52772a, c8231b.f52774c, c8231b.f52773b);
            } else if (i != 4) {
                abstractC4925a.onChanged(drbVar);
            } else {
                abstractC4925a.onItemRangeRemoved(drbVar, c8231b.f52772a, c8231b.f52773b);
            }
        }
    }

    /* JADX INFO: renamed from: k89$b */
    public static class C8231b {

        /* JADX INFO: renamed from: a */
        public int f52772a;

        /* JADX INFO: renamed from: b */
        public int f52773b;

        /* JADX INFO: renamed from: c */
        public int f52774c;
    }

    public k89() {
        super(f52770N);
    }

    private static C8231b acquire(int i, int i2, int i3) {
        C8231b c8231bAcquire = f52771m.acquire();
        if (c8231bAcquire == null) {
            c8231bAcquire = new C8231b();
        }
        c8231bAcquire.f52772a = i;
        c8231bAcquire.f52774c = i2;
        c8231bAcquire.f52773b = i3;
        return c8231bAcquire;
    }

    public void notifyChanged(@efb drb drbVar) {
        notifyCallbacks(drbVar, 0, (C8231b) null);
    }

    public void notifyInserted(@efb drb drbVar, int i, int i2) {
        notifyCallbacks(drbVar, 2, acquire(i, 0, i2));
    }

    public void notifyMoved(@efb drb drbVar, int i, int i2, int i3) {
        notifyCallbacks(drbVar, 3, acquire(i, i2, i3));
    }

    public void notifyRemoved(@efb drb drbVar, int i, int i2) {
        notifyCallbacks(drbVar, 4, acquire(i, 0, i2));
    }

    @Override // p000.jo1
    public synchronized void notifyCallbacks(@efb drb drbVar, int i, C8231b c8231b) {
        super.notifyCallbacks(drbVar, i, c8231b);
        if (c8231b != null) {
            f52771m.release(c8231b);
        }
    }

    public void notifyChanged(@efb drb drbVar, int i, int i2) {
        notifyCallbacks(drbVar, 1, acquire(i, 0, i2));
    }
}
