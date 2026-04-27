package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class vq0 implements ih3 {

    /* JADX INFO: renamed from: b */
    public final boolean f91961b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<pdh> f91962c = new ArrayList<>(1);

    /* JADX INFO: renamed from: d */
    public int f91963d;

    /* JADX INFO: renamed from: e */
    @hib
    public yh3 f91964e;

    public vq0(boolean z) {
        this.f91961b = z;
    }

    @Override // p000.ih3
    public final void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        if (this.f91962c.contains(pdhVar)) {
            return;
        }
        this.f91962c.add(pdhVar);
        this.f91963d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m24112b(int i) {
        yh3 yh3Var = (yh3) x0i.castNonNull(this.f91964e);
        for (int i2 = 0; i2 < this.f91963d; i2++) {
            this.f91962c.get(i2).onBytesTransferred(this, yh3Var, this.f91961b, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24113c() {
        yh3 yh3Var = (yh3) x0i.castNonNull(this.f91964e);
        for (int i = 0; i < this.f91963d; i++) {
            this.f91962c.get(i).onTransferEnd(this, yh3Var, this.f91961b);
        }
        this.f91964e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m24114d(yh3 yh3Var) {
        for (int i = 0; i < this.f91963d; i++) {
            this.f91962c.get(i).onTransferInitializing(this, yh3Var, this.f91961b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24115e(yh3 yh3Var) {
        this.f91964e = yh3Var;
        for (int i = 0; i < this.f91963d; i++) {
            this.f91962c.get(i).onTransferStart(this, yh3Var, this.f91961b);
        }
    }
}
