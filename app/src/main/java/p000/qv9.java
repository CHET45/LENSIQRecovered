package p000;

import java.util.Objects;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class qv9 extends rri {

    /* JADX INFO: renamed from: M1 */
    public boolean f75910M1;

    /* JADX INFO: renamed from: N */
    public final boolean f75911N;

    /* JADX INFO: renamed from: Q */
    public final q1h.C11272d f75912Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f75913V1;

    /* JADX INFO: renamed from: X */
    public final q1h.C11270b f75914X;

    /* JADX INFO: renamed from: Y */
    public C11712a f75915Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public ov9 f75916Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f75917Z1;

    /* JADX INFO: renamed from: qv9$a */
    public static final class C11712a extends yt6 {

        /* JADX INFO: renamed from: h */
        public static final Object f75918h = new Object();

        /* JADX INFO: renamed from: f */
        @hib
        public final Object f75919f;

        /* JADX INFO: renamed from: g */
        @hib
        public final Object f75920g;

        private C11712a(q1h q1hVar, @hib Object obj, @hib Object obj2) {
            super(q1hVar);
            this.f75919f = obj;
            this.f75920g = obj2;
        }

        public static C11712a createWithPlaceholderTimeline(nfa nfaVar) {
            return new C11712a(new C11713b(nfaVar), q1h.C11272d.f72961q, f75918h);
        }

        public static C11712a createWithRealTimeline(q1h q1hVar, @hib Object obj, @hib Object obj2) {
            return new C11712a(q1hVar, obj, obj2);
        }

        public C11712a cloneWithUpdatedTimeline(q1h q1hVar) {
            return new C11712a(q1hVar, this.f75919f, this.f75920g);
        }

        @Override // p000.yt6, p000.q1h
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            q1h q1hVar = this.f102944e;
            if (f75918h.equals(obj) && (obj2 = this.f75920g) != null) {
                obj = obj2;
            }
            return q1hVar.getIndexOfPeriod(obj);
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            this.f102944e.getPeriod(i, c11270b, z);
            if (Objects.equals(c11270b.f72945b, this.f75920g) && z) {
                c11270b.f72945b = f75918h;
            }
            return c11270b;
        }

        @Override // p000.yt6, p000.q1h
        public Object getUidOfPeriod(int i) {
            Object uidOfPeriod = this.f102944e.getUidOfPeriod(i);
            return Objects.equals(uidOfPeriod, this.f75920g) ? f75918h : uidOfPeriod;
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            this.f102944e.getWindow(i, c11272d, j);
            if (Objects.equals(c11272d.f72971a, this.f75919f)) {
                c11272d.f72971a = q1h.C11272d.f72961q;
            }
            return c11272d;
        }
    }

    /* JADX INFO: renamed from: qv9$b */
    @fdi
    public static final class C11713b extends q1h {

        /* JADX INFO: renamed from: e */
        public final nfa f75921e;

        public C11713b(nfa nfaVar) {
            this.f75921e = nfaVar;
        }

        @Override // p000.q1h
        public int getIndexOfPeriod(Object obj) {
            return obj == C11712a.f75918h ? 0 : -1;
        }

        @Override // p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            c11270b.set(z ? 0 : null, z ? C11712a.f75918h : null, 0, -9223372036854775807L, 0L, C9343mf.f60836l, true);
            return c11270b;
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return 1;
        }

        @Override // p000.q1h
        public Object getUidOfPeriod(int i) {
            return C11712a.f75918h;
        }

        @Override // p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            c11272d.set(q1h.C11272d.f72961q, this.f75921e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c11272d.f72981k = true;
            return c11272d;
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return 1;
        }
    }

    public qv9(una unaVar, boolean z) {
        super(unaVar);
        this.f75911N = z && unaVar.isSingleWindow();
        this.f75912Q = new q1h.C11272d();
        this.f75914X = new q1h.C11270b();
        q1h initialTimeline = unaVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f75915Y = C11712a.createWithPlaceholderTimeline(unaVar.getMediaItem());
        } else {
            this.f75915Y = C11712a.createWithRealTimeline(initialTimeline, null, null);
            this.f75917Z1 = true;
        }
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.f75915Y.f75920g == null || !this.f75915Y.f75920g.equals(obj)) ? obj : C11712a.f75918h;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.f75915Y.f75920g == null || !obj.equals(C11712a.f75918h)) ? obj : this.f75915Y.f75920g;
    }

    @g5e({"unpreparedMaskingMediaPeriod"})
    private boolean setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        ov9 ov9Var = this.f75916Z;
        int indexOfPeriod = this.f75915Y.getIndexOfPeriod(ov9Var.f68941a.f88603a);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j2 = this.f75915Y.getPeriod(indexOfPeriod, this.f75914X).f72947d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ov9Var.overridePreparePositionUs(j);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // p000.rri
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9030F(p000.q1h r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.qv9.mo9030F(q1h):void");
    }

    @Override // p000.rri, p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return this.f79175L.canUpdateMediaItem(nfaVar);
    }

    public q1h getTimeline() {
        return this.f75915Y;
    }

    @Override // p000.rri
    public void prepareSourceInternal() {
        if (this.f75911N) {
            return;
        }
        this.f75910M1 = true;
        m21501H();
    }

    @Override // p000.rri, p000.una
    public void releasePeriod(mja mjaVar) {
        ((ov9) mjaVar).releasePeriod();
        if (mjaVar == this.f75916Z) {
            this.f75916Z = null;
        }
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        this.f75913V1 = false;
        this.f75910M1 = false;
        super.releaseSourceInternal();
    }

    @Override // p000.rri, p000.una
    public void updateMediaItem(nfa nfaVar) {
        if (this.f75917Z1) {
            this.f75915Y = this.f75915Y.cloneWithUpdatedTimeline(new u1h(this.f75915Y.f102944e, nfaVar));
        } else {
            this.f75915Y = C11712a.createWithPlaceholderTimeline(nfaVar);
        }
        this.f79175L.updateMediaItem(nfaVar);
    }

    @Override // p000.rri
    @hib
    /* JADX INFO: renamed from: z */
    public una.C13612b mo9031z(una.C13612b c13612b) {
        return c13612b.copyWithPeriodUid(getExternalPeriodUid(c13612b.f88603a));
    }

    @Override // p000.rri, p000.una
    public ov9 createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        ov9 ov9Var = new ov9(c13612b, interfaceC5892fn, j);
        ov9Var.setMediaSource(this.f79175L);
        if (this.f75913V1) {
            ov9Var.createPeriod(c13612b.copyWithPeriodUid(getInternalPeriodUid(c13612b.f88603a)));
        } else {
            this.f75916Z = ov9Var;
            if (!this.f75910M1) {
                this.f75910M1 = true;
                m21501H();
            }
        }
        return ov9Var;
    }
}
