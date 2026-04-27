package p000;

import p000.q1h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@fdi(otherwise = 3)
public final class rnf extends yt6 {

    /* JADX INFO: renamed from: f */
    public final C9343mf f78830f;

    public rnf(q1h q1hVar, C9343mf c9343mf) {
        super(q1hVar);
        v80.checkState(q1hVar.getPeriodCount() == 1);
        v80.checkState(q1hVar.getWindowCount() == 1);
        this.f78830f = c9343mf;
    }

    @Override // p000.yt6, p000.q1h
    public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
        this.f102944e.getPeriod(i, c11270b, z);
        long j = c11270b.f72947d;
        if (j == -9223372036854775807L) {
            j = this.f78830f.f60845d;
        }
        c11270b.set(c11270b.f72944a, c11270b.f72945b, c11270b.f72946c, j, c11270b.getPositionInWindowUs(), this.f78830f, c11270b.f72949f);
        return c11270b;
    }
}
