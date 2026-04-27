package p000;

import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class qri extends vm2<Void> {

    /* JADX INFO: renamed from: M */
    public static final Void f75481M = null;

    /* JADX INFO: renamed from: L */
    public final vna f75482L;

    public qri(vna vnaVar) {
        this.f75482L = vnaVar;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final long mo20627q(Void r1, long j) {
        return m20632z(j);
    }

    /* JADX INFO: renamed from: B */
    public int m20622B(int i) {
        return i;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int mo3298r(Void r1, int i) {
        return m20622B(i);
    }

    /* JADX INFO: renamed from: D */
    public void mo10627D(t1h t1hVar) {
        m10220l(t1hVar);
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void lambda$prepareChildSource$0(Void r1, vna vnaVar, t1h t1hVar) {
        mo10627D(t1hVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m20625F() {
        m24067t(f75481M, this.f75482L);
    }

    /* JADX INFO: renamed from: G */
    public final void m20626G() {
        m24068u(f75481M);
    }

    @Override // p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        return this.f75482L.createPeriod(c14175b, interfaceC6430gn, j);
    }

    @Override // p000.vna
    @hib
    public t1h getInitialTimeline() {
        return this.f75482L.getInitialTimeline();
    }

    @Override // p000.vna
    public aga getMediaItem() {
        return this.f75482L.getMediaItem();
    }

    @Override // p000.vna
    public boolean isSingleWindow() {
        return this.f75482L.isSingleWindow();
    }

    @Override // p000.vm2, p000.es0
    /* JADX INFO: renamed from: k */
    public final void mo2648k(@hib pdh pdhVar) {
        super.mo2648k(pdhVar);
        prepareSourceInternal();
    }

    public void prepareSourceInternal() {
        m20625F();
    }

    @Override // p000.vna
    public void releasePeriod(nja njaVar) {
        this.f75482L.releasePeriod(njaVar);
    }

    /* JADX INFO: renamed from: v */
    public final void m20628v() {
        m24065n(f75481M);
    }

    /* JADX INFO: renamed from: w */
    public final void m20629w() {
        m24066o(f75481M);
    }

    @hib
    /* JADX INFO: renamed from: x */
    public vna.C14175b mo20630x(vna.C14175b c14175b) {
        return c14175b;
    }

    @Override // p000.vm2
    @hib
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final vna.C14175b mo2649p(Void r1, vna.C14175b c14175b) {
        return mo20630x(c14175b);
    }

    /* JADX INFO: renamed from: z */
    public long m20632z(long j) {
        return j;
    }
}
