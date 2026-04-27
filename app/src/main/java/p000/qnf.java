package p000;

import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@fdi(otherwise = 3)
@Deprecated
public final class qnf extends xt6 {

    /* JADX INFO: renamed from: m */
    public final C10354of f75020m;

    public qnf(t1h t1hVar, C10354of c10354of) {
        super(t1hVar);
        u80.checkState(t1hVar.getPeriodCount() == 1);
        u80.checkState(t1hVar.getWindowCount() == 1);
        this.f75020m = c10354of;
    }

    @Override // p000.xt6, p000.t1h
    public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
        this.f99225f.getPeriod(i, c12849b, z);
        long j = c12849b.f83399d;
        if (j == -9223372036854775807L) {
            j = this.f75020m.f67461d;
        }
        c12849b.set(c12849b.f83396a, c12849b.f83397b, c12849b.f83398c, j, c12849b.getPositionInWindowUs(), this.f75020m, c12849b.f83401f);
        return c12849b;
    }
}
