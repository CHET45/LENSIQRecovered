package p000;

import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rv9 extends qri {

    /* JADX INFO: renamed from: M1 */
    public boolean f79743M1;

    /* JADX INFO: renamed from: N */
    public final boolean f79744N;

    /* JADX INFO: renamed from: Q */
    public final t1h.C12851d f79745Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f79746V1;

    /* JADX INFO: renamed from: X */
    public final t1h.C12849b f79747X;

    /* JADX INFO: renamed from: Y */
    public C12315a f79748Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public pv9 f79749Z;

    /* JADX INFO: renamed from: Z1 */
    public boolean f79750Z1;

    /* JADX INFO: renamed from: rv9$a */
    public static final class C12315a extends xt6 {

        /* JADX INFO: renamed from: F */
        public static final Object f79751F = new Object();

        /* JADX INFO: renamed from: C */
        @hib
        public final Object f79752C;

        /* JADX INFO: renamed from: m */
        @hib
        public final Object f79753m;

        private C12315a(t1h t1hVar, @hib Object obj, @hib Object obj2) {
            super(t1hVar);
            this.f79753m = obj;
            this.f79752C = obj2;
        }

        public static C12315a createWithPlaceholderTimeline(aga agaVar) {
            return new C12315a(new C12316b(agaVar), t1h.C12851d.f83407M1, f79751F);
        }

        public static C12315a createWithRealTimeline(t1h t1hVar, @hib Object obj, @hib Object obj2) {
            return new C12315a(t1hVar, obj, obj2);
        }

        public C12315a cloneWithUpdatedTimeline(t1h t1hVar) {
            return new C12315a(t1hVar, this.f79753m, this.f79752C);
        }

        @Override // p000.xt6, p000.t1h
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            t1h t1hVar = this.f99225f;
            if (f79751F.equals(obj) && (obj2 = this.f79752C) != null) {
                obj = obj2;
            }
            return t1hVar.getIndexOfPeriod(obj);
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            this.f99225f.getPeriod(i, c12849b, z);
            if (x0i.areEqual(c12849b.f83397b, this.f79752C) && z) {
                c12849b.f83397b = f79751F;
            }
            return c12849b;
        }

        @Override // p000.xt6, p000.t1h
        public Object getUidOfPeriod(int i) {
            Object uidOfPeriod = this.f99225f.getUidOfPeriod(i);
            return x0i.areEqual(uidOfPeriod, this.f79752C) ? f79751F : uidOfPeriod;
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            this.f99225f.getWindow(i, c12851d, j);
            if (x0i.areEqual(c12851d.f83434a, this.f79753m)) {
                c12851d.f83434a = t1h.C12851d.f83407M1;
            }
            return c12851d;
        }
    }

    /* JADX INFO: renamed from: rv9$b */
    @fdi
    public static final class C12316b extends t1h {

        /* JADX INFO: renamed from: f */
        public final aga f79754f;

        public C12316b(aga agaVar) {
            this.f79754f = agaVar;
        }

        @Override // p000.t1h
        public int getIndexOfPeriod(Object obj) {
            return obj == C12315a.f79751F ? 0 : -1;
        }

        @Override // p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            c12849b.set(z ? 0 : null, z ? C12315a.f79751F : null, 0, -9223372036854775807L, 0L, C10354of.f67450M, true);
            return c12849b;
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return 1;
        }

        @Override // p000.t1h
        public Object getUidOfPeriod(int i) {
            return C12315a.f79751F;
        }

        @Override // p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            c12851d.set(t1h.C12851d.f83407M1, this.f79754f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c12851d.f83428M = true;
            return c12851d;
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return 1;
        }
    }

    public rv9(vna vnaVar, boolean z) {
        super(vnaVar);
        this.f79744N = z && vnaVar.isSingleWindow();
        this.f79745Q = new t1h.C12851d();
        this.f79747X = new t1h.C12849b();
        t1h initialTimeline = vnaVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f79748Y = C12315a.createWithPlaceholderTimeline(vnaVar.getMediaItem());
        } else {
            this.f79748Y = C12315a.createWithRealTimeline(initialTimeline, null, null);
            this.f79750Z1 = true;
        }
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.f79748Y.f79752C == null || !this.f79748Y.f79752C.equals(obj)) ? obj : C12315a.f79751F;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.f79748Y.f79752C == null || !obj.equals(C12315a.f79751F)) ? obj : this.f79748Y.f79752C;
    }

    @g5e({"unpreparedMaskingMediaPeriod"})
    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        pv9 pv9Var = this.f79749Z;
        int indexOfPeriod = this.f79748Y.getIndexOfPeriod(pv9Var.f72216a.f71106a);
        if (indexOfPeriod == -1) {
            return;
        }
        long j2 = this.f79748Y.getPeriod(indexOfPeriod, this.f79747X).f83399d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        pv9Var.overridePreparePositionUs(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // p000.qri
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo10627D(p000.t1h r15) {
        /*
            r14 = this;
            boolean r0 = r14.f79746V1
            if (r0 == 0) goto L19
            rv9$a r0 = r14.f79748Y
            rv9$a r15 = r0.cloneWithUpdatedTimeline(r15)
            r14.f79748Y = r15
            pv9 r15 = r14.f79749Z
            if (r15 == 0) goto Lae
            long r0 = r15.getPreparePositionOverrideUs()
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r0)
            goto Lae
        L19:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L36
            boolean r0 = r14.f79750Z1
            if (r0 == 0) goto L2a
            rv9$a r0 = r14.f79748Y
            rv9$a r15 = r0.cloneWithUpdatedTimeline(r15)
            goto L32
        L2a:
            java.lang.Object r0 = p000.t1h.C12851d.f83407M1
            java.lang.Object r1 = p000.rv9.C12315a.f79751F
            rv9$a r15 = p000.rv9.C12315a.createWithRealTimeline(r15, r0, r1)
        L32:
            r14.f79748Y = r15
            goto Lae
        L36:
            t1h$d r0 = r14.f79745Q
            r1 = 0
            r15.getWindow(r1, r0)
            t1h$d r0 = r14.f79745Q
            long r2 = r0.getDefaultPositionUs()
            t1h$d r0 = r14.f79745Q
            java.lang.Object r0 = r0.f83434a
            pv9 r4 = r14.f79749Z
            if (r4 == 0) goto L74
            long r4 = r4.getPreparePositionUs()
            rv9$a r6 = r14.f79748Y
            pv9 r7 = r14.f79749Z
            vna$b r7 = r7.f72216a
            java.lang.Object r7 = r7.f71106a
            t1h$b r8 = r14.f79747X
            r6.getPeriodByUid(r7, r8)
            t1h$b r6 = r14.f79747X
            long r6 = r6.getPositionInWindowUs()
            long r6 = r6 + r4
            rv9$a r4 = r14.f79748Y
            t1h$d r5 = r14.f79745Q
            t1h$d r1 = r4.getWindow(r1, r5)
            long r4 = r1.getDefaultPositionUs()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            t1h$d r9 = r14.f79745Q
            t1h$b r10 = r14.f79747X
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.getPeriodPositionUs(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f79750Z1
            if (r1 == 0) goto L94
            rv9$a r0 = r14.f79748Y
            rv9$a r15 = r0.cloneWithUpdatedTimeline(r15)
            goto L98
        L94:
            rv9$a r15 = p000.rv9.C12315a.createWithRealTimeline(r15, r0, r2)
        L98:
            r14.f79748Y = r15
            pv9 r15 = r14.f79749Z
            if (r15 == 0) goto Lae
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r3)
            vna$b r15 = r15.f72216a
            java.lang.Object r0 = r15.f71106a
            java.lang.Object r0 = r14.getInternalPeriodUid(r0)
            vna$b r15 = r15.copyWithPeriodUid(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f79750Z1 = r0
            r14.f79746V1 = r0
            rv9$a r0 = r14.f79748Y
            r14.m10220l(r0)
            if (r15 == 0) goto Lc6
            pv9 r0 = r14.f79749Z
            java.lang.Object r0 = p000.u80.checkNotNull(r0)
            pv9 r0 = (p000.pv9) r0
            r0.createPeriod(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rv9.mo10627D(t1h):void");
    }

    public t1h getTimeline() {
        return this.f79748Y;
    }

    @Override // p000.vm2, p000.vna
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // p000.qri
    public void prepareSourceInternal() {
        if (this.f79744N) {
            return;
        }
        this.f79743M1 = true;
        m20625F();
    }

    @Override // p000.qri, p000.vna
    public void releasePeriod(nja njaVar) {
        ((pv9) njaVar).releasePeriod();
        if (njaVar == this.f79749Z) {
            this.f79749Z = null;
        }
    }

    @Override // p000.vm2, p000.es0
    public void releaseSourceInternal() {
        this.f79746V1 = false;
        this.f79743M1 = false;
        super.releaseSourceInternal();
    }

    @Override // p000.qri
    @hib
    /* JADX INFO: renamed from: x */
    public vna.C14175b mo20630x(vna.C14175b c14175b) {
        return c14175b.copyWithPeriodUid(getExternalPeriodUid(c14175b.f71106a));
    }

    @Override // p000.qri, p000.vna
    public pv9 createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        pv9 pv9Var = new pv9(c14175b, interfaceC6430gn, j);
        pv9Var.setMediaSource(this.f75482L);
        if (this.f79746V1) {
            pv9Var.createPeriod(c14175b.copyWithPeriodUid(getInternalPeriodUid(c14175b.f71106a)));
        } else {
            this.f79749Z = pv9Var;
            if (!this.f79743M1) {
                this.f79743M1 = true;
                m20625F();
            }
        }
        return pv9Var;
    }
}
