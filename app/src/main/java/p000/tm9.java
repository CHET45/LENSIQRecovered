package p000;

import java.util.HashMap;
import java.util.Map;
import p000.sbf;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tm9 extends qri {

    /* JADX INFO: renamed from: N */
    public final int f85319N;

    /* JADX INFO: renamed from: Q */
    public final Map<vna.C14175b, vna.C14175b> f85320Q;

    /* JADX INFO: renamed from: X */
    public final Map<nja, vna.C14175b> f85321X;

    /* JADX INFO: renamed from: tm9$a */
    public static final class C13106a extends xt6 {
        public C13106a(t1h t1hVar) {
            super(t1hVar);
        }

        @Override // p000.xt6, p000.t1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            int nextWindowIndex = this.f99225f.getNextWindowIndex(i, i2, z);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
        }

        @Override // p000.xt6, p000.t1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            int previousWindowIndex = this.f99225f.getPreviousWindowIndex(i, i2, z);
            return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
        }
    }

    /* JADX INFO: renamed from: tm9$b */
    public static final class C13107b extends AbstractC11774r0 {

        /* JADX INFO: renamed from: F */
        public final t1h f85322F;

        /* JADX INFO: renamed from: H */
        public final int f85323H;

        /* JADX INFO: renamed from: L */
        public final int f85324L;

        /* JADX INFO: renamed from: M */
        public final int f85325M;

        public C13107b(t1h t1hVar, int i) {
            super(false, new sbf.C12511b(i));
            this.f85322F = t1hVar;
            int periodCount = t1hVar.getPeriodCount();
            this.f85323H = periodCount;
            this.f85324L = t1hVar.getWindowCount();
            this.f85325M = i;
            if (periodCount > 0) {
                u80.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: b */
        public int mo18b(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: c */
        public int mo19c(int i) {
            return i / this.f85324L;
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: d */
        public Object mo20d(int i) {
            return Integer.valueOf(i);
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: e */
        public int mo21e(int i) {
            return i * this.f85323H;
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: f */
        public int mo22f(int i) {
            return i * this.f85324L;
        }

        @Override // p000.AbstractC11774r0
        /* JADX INFO: renamed from: g */
        public t1h mo23g(int i) {
            return this.f85322F;
        }

        @Override // p000.AbstractC11774r0
        public int getChildIndexByPeriodIndex(int i) {
            return i / this.f85323H;
        }

        @Override // p000.t1h
        public int getPeriodCount() {
            return this.f85323H * this.f85325M;
        }

        @Override // p000.t1h
        public int getWindowCount() {
            return this.f85324L * this.f85325M;
        }
    }

    public tm9(vna vnaVar) {
        this(vnaVar, Integer.MAX_VALUE);
    }

    @Override // p000.qri
    /* JADX INFO: renamed from: D */
    public void mo10627D(t1h t1hVar) {
        m10220l(this.f85319N != Integer.MAX_VALUE ? new C13107b(t1hVar, this.f85319N) : new C13106a(t1hVar));
    }

    @Override // p000.qri, p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        if (this.f85319N == Integer.MAX_VALUE) {
            return this.f75482L.createPeriod(c14175b, interfaceC6430gn, j);
        }
        vna.C14175b c14175bCopyWithPeriodUid = c14175b.copyWithPeriodUid(AbstractC11774r0.getChildPeriodUidFromConcatenatedUid(c14175b.f71106a));
        this.f85320Q.put(c14175bCopyWithPeriodUid, c14175b);
        nja njaVarCreatePeriod = this.f75482L.createPeriod(c14175bCopyWithPeriodUid, interfaceC6430gn, j);
        this.f85321X.put(njaVarCreatePeriod, c14175bCopyWithPeriodUid);
        return njaVarCreatePeriod;
    }

    @Override // p000.qri, p000.vna
    @hib
    public t1h getInitialTimeline() {
        rv9 rv9Var = (rv9) this.f75482L;
        return this.f85319N != Integer.MAX_VALUE ? new C13107b(rv9Var.getTimeline(), this.f85319N) : new C13106a(rv9Var.getTimeline());
    }

    @Override // p000.qri, p000.vna
    public boolean isSingleWindow() {
        return false;
    }

    @Override // p000.qri, p000.vna
    public void releasePeriod(nja njaVar) {
        this.f75482L.releasePeriod(njaVar);
        vna.C14175b c14175bRemove = this.f85321X.remove(njaVar);
        if (c14175bRemove != null) {
            this.f85320Q.remove(c14175bRemove);
        }
    }

    @Override // p000.qri
    @hib
    /* JADX INFO: renamed from: x */
    public vna.C14175b mo20630x(vna.C14175b c14175b) {
        return this.f85319N != Integer.MAX_VALUE ? this.f85320Q.get(c14175b) : c14175b;
    }

    public tm9(vna vnaVar, int i) {
        super(new rv9(vnaVar, false));
        u80.checkArgument(i > 0);
        this.f85319N = i;
        this.f85320Q = new HashMap();
        this.f85321X = new HashMap();
    }
}
