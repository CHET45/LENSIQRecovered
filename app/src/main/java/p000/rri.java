package p000;

import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class rri extends um2<Void> {

    /* JADX INFO: renamed from: M */
    public static final Void f79174M = null;

    /* JADX INFO: renamed from: L */
    public final una f79175L;

    public rri(una unaVar) {
        this.f79175L = unaVar;
    }

    @Override // p000.um2
    @hib
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final una.C13612b mo2509r(Void r1, una.C13612b c13612b) {
        return mo9031z(c13612b);
    }

    /* JADX INFO: renamed from: B */
    public long m21496B(long j, @hib una.C13612b c13612b) {
        return j;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final long mo10177s(Void r1, long j, @hib una.C13612b c13612b) {
        return m21496B(j, c13612b);
    }

    /* JADX INFO: renamed from: D */
    public int m21498D(int i) {
        return i;
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int mo2510t(Void r1, int i) {
        return m21498D(i);
    }

    /* JADX INFO: renamed from: F */
    public void mo9030F(q1h q1hVar) {
        m11123m(q1hVar);
    }

    @Override // p000.um2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void lambda$prepareChildSource$0(Void r1, una unaVar, q1h q1hVar) {
        mo9030F(q1hVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m21501H() {
        m23429v(f79174M, this.f79175L);
    }

    /* JADX INFO: renamed from: I */
    public final void m21502I() {
        m23430w(f79174M);
    }

    @Override // p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return this.f79175L.canUpdateMediaItem(nfaVar);
    }

    @Override // p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        return this.f79175L.createPeriod(c13612b, interfaceC5892fn, j);
    }

    @Override // p000.una
    @hib
    public q1h getInitialTimeline() {
        return this.f79175L.getInitialTimeline();
    }

    @Override // p000.una
    public nfa getMediaItem() {
        return this.f79175L.getMediaItem();
    }

    @Override // p000.una
    public boolean isSingleWindow() {
        return this.f79175L.isSingleWindow();
    }

    @Override // p000.um2, p000.fs0
    /* JADX INFO: renamed from: l */
    public final void mo2508l(@hib qdh qdhVar) {
        super.mo2508l(qdhVar);
        prepareSourceInternal();
    }

    public void prepareSourceInternal() {
        m21501H();
    }

    @Override // p000.una
    public void releasePeriod(mja mjaVar) {
        this.f79175L.releasePeriod(mjaVar);
    }

    @Override // p000.una
    public void updateMediaItem(nfa nfaVar) {
        this.f79175L.updateMediaItem(nfaVar);
    }

    /* JADX INFO: renamed from: x */
    public final void m21503x() {
        m23427p(f79174M);
    }

    /* JADX INFO: renamed from: y */
    public final void m21504y() {
        m23428q(f79174M);
    }

    @hib
    /* JADX INFO: renamed from: z */
    public una.C13612b mo9031z(una.C13612b c13612b) {
        return c13612b;
    }
}
