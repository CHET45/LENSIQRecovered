package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class wq0 implements gh3 {

    /* JADX INFO: renamed from: b */
    public final boolean f95059b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<qdh> f95060c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d */
    public int f95061d;

    /* JADX INFO: renamed from: e */
    @hib
    public xh3 f95062e;

    public wq0(boolean z) {
        this.f95059b = z;
    }

    @Override // p000.gh3
    @ovh
    public final void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        if (this.f95060c.contains(qdhVar)) {
            return;
        }
        this.f95060c.add(qdhVar);
        this.f95061d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m24714b(int i) {
        xh3 xh3Var = (xh3) t0i.castNonNull(this.f95062e);
        for (int i2 = 0; i2 < this.f95061d; i2++) {
            this.f95060c.get(i2).onBytesTransferred(this, xh3Var, this.f95059b, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24715c() {
        xh3 xh3Var = (xh3) t0i.castNonNull(this.f95062e);
        for (int i = 0; i < this.f95061d; i++) {
            this.f95060c.get(i).onTransferEnd(this, xh3Var, this.f95059b);
        }
        this.f95062e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m24716d(xh3 xh3Var) {
        for (int i = 0; i < this.f95061d; i++) {
            this.f95060c.get(i).onTransferInitializing(this, xh3Var, this.f95059b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24717e(xh3 xh3Var) {
        this.f95062e = xh3Var;
        for (int i = 0; i < this.f95061d; i++) {
            this.f95060c.get(i).onTransferStart(this, xh3Var, this.f95059b);
        }
    }
}
