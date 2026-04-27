package p000;

import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xt6 extends t1h {

    /* JADX INFO: renamed from: f */
    public final t1h f99225f;

    public xt6(t1h t1hVar) {
        this.f99225f = t1hVar;
    }

    @Override // p000.t1h
    public int getFirstWindowIndex(boolean z) {
        return this.f99225f.getFirstWindowIndex(z);
    }

    @Override // p000.t1h
    public int getIndexOfPeriod(Object obj) {
        return this.f99225f.getIndexOfPeriod(obj);
    }

    @Override // p000.t1h
    public int getLastWindowIndex(boolean z) {
        return this.f99225f.getLastWindowIndex(z);
    }

    @Override // p000.t1h
    public int getNextWindowIndex(int i, int i2, boolean z) {
        return this.f99225f.getNextWindowIndex(i, i2, z);
    }

    @Override // p000.t1h
    public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
        return this.f99225f.getPeriod(i, c12849b, z);
    }

    @Override // p000.t1h
    public int getPeriodCount() {
        return this.f99225f.getPeriodCount();
    }

    @Override // p000.t1h
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        return this.f99225f.getPreviousWindowIndex(i, i2, z);
    }

    @Override // p000.t1h
    public Object getUidOfPeriod(int i) {
        return this.f99225f.getUidOfPeriod(i);
    }

    @Override // p000.t1h
    public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
        return this.f99225f.getWindow(i, c12851d, j);
    }

    @Override // p000.t1h
    public int getWindowCount() {
        return this.f99225f.getWindowCount();
    }
}
