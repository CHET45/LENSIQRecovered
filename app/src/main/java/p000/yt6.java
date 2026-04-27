package p000;

import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class yt6 extends q1h {

    /* JADX INFO: renamed from: e */
    public final q1h f102944e;

    public yt6(q1h q1hVar) {
        this.f102944e = q1hVar;
    }

    @Override // p000.q1h
    public final boolean equals(@hib Object obj) {
        return super.equals(obj);
    }

    @Override // p000.q1h
    public int getFirstWindowIndex(boolean z) {
        return this.f102944e.getFirstWindowIndex(z);
    }

    @Override // p000.q1h
    public int getIndexOfPeriod(Object obj) {
        return this.f102944e.getIndexOfPeriod(obj);
    }

    @Override // p000.q1h
    public int getLastWindowIndex(boolean z) {
        return this.f102944e.getLastWindowIndex(z);
    }

    @Override // p000.q1h
    public int getNextWindowIndex(int i, int i2, boolean z) {
        return this.f102944e.getNextWindowIndex(i, i2, z);
    }

    @Override // p000.q1h
    public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
        return this.f102944e.getPeriod(i, c11270b, z);
    }

    @Override // p000.q1h
    public final q1h.C11270b getPeriodByUid(Object obj, q1h.C11270b c11270b) {
        return super.getPeriodByUid(obj, c11270b);
    }

    @Override // p000.q1h
    public int getPeriodCount() {
        return this.f102944e.getPeriodCount();
    }

    @Override // p000.q1h
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        return this.f102944e.getPreviousWindowIndex(i, i2, z);
    }

    @Override // p000.q1h
    public Object getUidOfPeriod(int i) {
        return this.f102944e.getUidOfPeriod(i);
    }

    @Override // p000.q1h
    public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
        return this.f102944e.getWindow(i, c11272d, j);
    }

    @Override // p000.q1h
    public int getWindowCount() {
        return this.f102944e.getWindowCount();
    }

    @Override // p000.q1h
    public final int hashCode() {
        return super.hashCode();
    }
}
