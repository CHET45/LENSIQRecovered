package p000;

import java.util.HashMap;
import java.util.Map;
import p000.rbf;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class sm9 extends rri {

    /* JADX INFO: renamed from: N */
    public final int f82238N;

    /* JADX INFO: renamed from: Q */
    public final Map<una.C13612b, una.C13612b> f82239Q;

    /* JADX INFO: renamed from: X */
    public final Map<mja, una.C13612b> f82240X;

    /* JADX INFO: renamed from: sm9$a */
    public static final class C12659a extends yt6 {
        public C12659a(q1h q1hVar) {
            super(q1hVar);
        }

        @Override // p000.yt6, p000.q1h
        public int getNextWindowIndex(int i, int i2, boolean z) {
            int nextWindowIndex = this.f102944e.getNextWindowIndex(i, i2, z);
            return nextWindowIndex == -1 ? getFirstWindowIndex(z) : nextWindowIndex;
        }

        @Override // p000.yt6, p000.q1h
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            int previousWindowIndex = this.f102944e.getPreviousWindowIndex(i, i2, z);
            return previousWindowIndex == -1 ? getLastWindowIndex(z) : previousWindowIndex;
        }
    }

    /* JADX INFO: renamed from: sm9$b */
    public static final class C12660b extends AbstractC12381s0 {

        /* JADX INFO: renamed from: h */
        public final q1h f82241h;

        /* JADX INFO: renamed from: i */
        public final int f82242i;

        /* JADX INFO: renamed from: j */
        public final int f82243j;

        /* JADX INFO: renamed from: k */
        public final int f82244k;

        public C12660b(q1h q1hVar, int i) {
            super(false, new rbf.C11996b(i));
            this.f82241h = q1hVar;
            int periodCount = q1hVar.getPeriodCount();
            this.f82242i = periodCount;
            this.f82243j = q1hVar.getWindowCount();
            this.f82244k = i;
            if (periodCount > 0) {
                v80.checkState(i <= Integer.MAX_VALUE / periodCount, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: a */
        public int mo2513a(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: b */
        public int mo2514b(int i) {
            return i / this.f82243j;
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: c */
        public Object mo2515c(int i) {
            return Integer.valueOf(i);
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: d */
        public int mo2516d(int i) {
            return i * this.f82242i;
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: e */
        public int mo2517e(int i) {
            return i * this.f82243j;
        }

        @Override // p000.AbstractC12381s0
        /* JADX INFO: renamed from: f */
        public q1h mo2518f(int i) {
            return this.f82241h;
        }

        @Override // p000.AbstractC12381s0
        public int getChildIndexByPeriodIndex(int i) {
            return i / this.f82242i;
        }

        @Override // p000.q1h
        public int getPeriodCount() {
            return this.f82242i * this.f82244k;
        }

        @Override // p000.q1h
        public int getWindowCount() {
            return this.f82243j * this.f82244k;
        }
    }

    public sm9(una unaVar) {
        this(unaVar, Integer.MAX_VALUE);
    }

    @Override // p000.rri
    /* JADX INFO: renamed from: F */
    public void mo9030F(q1h q1hVar) {
        m11123m(this.f82238N != Integer.MAX_VALUE ? new C12660b(q1hVar, this.f82238N) : new C12659a(q1hVar));
    }

    @Override // p000.rri, p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        if (this.f82238N == Integer.MAX_VALUE) {
            return this.f79175L.createPeriod(c13612b, interfaceC5892fn, j);
        }
        una.C13612b c13612bCopyWithPeriodUid = c13612b.copyWithPeriodUid(AbstractC12381s0.getChildPeriodUidFromConcatenatedUid(c13612b.f88603a));
        this.f82239Q.put(c13612bCopyWithPeriodUid, c13612b);
        mja mjaVarCreatePeriod = this.f79175L.createPeriod(c13612bCopyWithPeriodUid, interfaceC5892fn, j);
        this.f82240X.put(mjaVarCreatePeriod, c13612bCopyWithPeriodUid);
        return mjaVarCreatePeriod;
    }

    @Override // p000.rri, p000.una
    @hib
    public q1h getInitialTimeline() {
        qv9 qv9Var = (qv9) this.f79175L;
        return this.f82238N != Integer.MAX_VALUE ? new C12660b(qv9Var.getTimeline(), this.f82238N) : new C12659a(qv9Var.getTimeline());
    }

    @Override // p000.rri, p000.una
    public boolean isSingleWindow() {
        return false;
    }

    @Override // p000.rri, p000.una
    public void releasePeriod(mja mjaVar) {
        this.f79175L.releasePeriod(mjaVar);
        una.C13612b c13612bRemove = this.f82240X.remove(mjaVar);
        if (c13612bRemove != null) {
            this.f82239Q.remove(c13612bRemove);
        }
    }

    @Override // p000.rri
    @hib
    /* JADX INFO: renamed from: z */
    public una.C13612b mo9031z(una.C13612b c13612b) {
        return this.f82238N != Integer.MAX_VALUE ? this.f82239Q.get(c13612b) : c13612b;
    }

    public sm9(una unaVar, int i) {
        super(new qv9(unaVar, false));
        v80.checkArgument(i > 0);
        this.f82238N = i;
        this.f82239Q = new HashMap();
        this.f82240X = new HashMap();
    }
}
