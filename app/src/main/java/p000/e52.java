package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e52 extends rri {

    /* JADX INFO: renamed from: M1 */
    public final boolean f31804M1;

    /* JADX INFO: renamed from: N */
    public final long f31805N;

    /* JADX INFO: renamed from: Q */
    public final long f31806Q;

    /* JADX INFO: renamed from: V1 */
    public final ArrayList<c52> f31807V1;

    /* JADX INFO: renamed from: X */
    public final boolean f31808X;

    /* JADX INFO: renamed from: Y */
    public final boolean f31809Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f31810Z;

    /* JADX INFO: renamed from: Z1 */
    public final q1h.C11272d f31811Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public C5120c f31812a2;

    /* JADX INFO: renamed from: b2 */
    @hib
    public C5121d f31813b2;

    /* JADX INFO: renamed from: c2 */
    public long f31814c2;

    /* JADX INFO: renamed from: d2 */
    public long f31815d2;

    /* JADX INFO: renamed from: e52$b */
    public static final class C5119b {

        /* JADX INFO: renamed from: a */
        public final una f31816a;

        /* JADX INFO: renamed from: b */
        public long f31817b;

        /* JADX INFO: renamed from: e */
        public boolean f31820e;

        /* JADX INFO: renamed from: f */
        public boolean f31821f;

        /* JADX INFO: renamed from: g */
        public boolean f31822g;

        /* JADX INFO: renamed from: h */
        public boolean f31823h;

        /* JADX INFO: renamed from: d */
        public boolean f31819d = true;

        /* JADX INFO: renamed from: c */
        public long f31818c = Long.MIN_VALUE;

        public C5119b(una unaVar) {
            this.f31816a = (una) v80.checkNotNull(unaVar);
        }

        public e52 build() {
            this.f31823h = true;
            return new e52(this);
        }

        @op1
        public C5119b setAllowDynamicClippingUpdates(boolean z) {
            v80.checkState(!this.f31823h);
            this.f31820e = z;
            return this;
        }

        @op1
        public C5119b setAllowUnseekableMedia(boolean z) {
            v80.checkState(!this.f31823h);
            this.f31822g = z;
            return this;
        }

        @op1
        public C5119b setEnableInitialDiscontinuity(boolean z) {
            v80.checkState(!this.f31823h);
            this.f31819d = z;
            return this;
        }

        @op1
        public C5119b setEndPositionMs(long j) {
            return setEndPositionUs(t0i.msToUs(j));
        }

        @op1
        public C5119b setEndPositionUs(long j) {
            v80.checkState(!this.f31823h);
            this.f31818c = j;
            return this;
        }

        @op1
        public C5119b setRelativeToDefaultPosition(boolean z) {
            v80.checkState(!this.f31823h);
            this.f31821f = z;
            return this;
        }

        @op1
        public C5119b setStartPositionMs(long j) {
            return setStartPositionUs(t0i.msToUs(j));
        }

        @op1
        public C5119b setStartPositionUs(long j) {
            v80.checkArgument(j >= 0);
            v80.checkState(!this.f31823h);
            this.f31817b = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: e52$c */
    public static final class C5120c extends yt6 {

        /* JADX INFO: renamed from: f */
        public final long f31824f;

        /* JADX INFO: renamed from: g */
        public final long f31825g;

        /* JADX INFO: renamed from: h */
        public final long f31826h;

        /* JADX INFO: renamed from: i */
        public final boolean f31827i;

        public C5120c(q1h q1hVar, long j, long j2, boolean z) throws C5121d {
            super(q1hVar);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new C5121d(2, j, j2);
            }
            boolean z2 = false;
            if (q1hVar.getPeriodCount() != 1) {
                throw new C5121d(0);
            }
            q1h.C11272d window = q1hVar.getWindow(0, new q1h.C11272d());
            long jMax = Math.max(0L, j);
            if (!z && !window.f72981k && jMax != 0 && !window.f72978h) {
                throw new C5121d(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? window.f72983m : Math.max(0L, j2);
            long j3 = window.f72983m;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f31824f = jMax;
            this.f31825g = jMax2;
            this.f31826h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (window.f72979i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z2 = true;
            }
            this.f31827i = z2;
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11270b getPeriod(int i, q1h.C11270b c11270b, boolean z) {
            this.f102944e.getPeriod(0, c11270b, z);
            long positionInWindowUs = c11270b.getPositionInWindowUs() - this.f31824f;
            long j = this.f31826h;
            return c11270b.set(c11270b.f72944a, c11270b.f72945b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }

        @Override // p000.yt6, p000.q1h
        public q1h.C11272d getWindow(int i, q1h.C11272d c11272d, long j) {
            this.f102944e.getWindow(0, c11272d, 0L);
            long j2 = c11272d.f72986p;
            long j3 = this.f31824f;
            c11272d.f72986p = j2 + j3;
            c11272d.f72983m = this.f31826h;
            c11272d.f72979i = this.f31827i;
            long j4 = c11272d.f72982l;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                c11272d.f72982l = jMax;
                long j5 = this.f31825g;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                c11272d.f72982l = jMax - this.f31824f;
            }
            long jUsToMs = t0i.usToMs(this.f31824f);
            long j6 = c11272d.f72975e;
            if (j6 != -9223372036854775807L) {
                c11272d.f72975e = j6 + jUsToMs;
            }
            long j7 = c11272d.f72976f;
            if (j7 != -9223372036854775807L) {
                c11272d.f72976f = j7 + jUsToMs;
            }
            return c11272d;
        }
    }

    /* JADX INFO: renamed from: e52$d */
    public static final class C5121d extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f31828b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f31829c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f31830d = 2;

        /* JADX INFO: renamed from: a */
        public final int f31831a;

        /* JADX INFO: renamed from: e52$d$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C5121d(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }

        private static String getReasonDescription(int i, long j, long j2) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i != 2) {
                return "unknown";
            }
            v80.checkState((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j + ", End time: " + j2;
        }

        public C5121d(int i, long j, long j2) {
            super("Illegal clipping: " + getReasonDescription(i, j, j2));
            this.f31831a = i;
        }
    }

    private void refreshClippedTimeline(q1h q1hVar) {
        long j;
        long j2;
        q1hVar.getWindow(0, this.f31811Z1);
        long positionInFirstPeriodUs = this.f31811Z1.getPositionInFirstPeriodUs();
        if (this.f31812a2 == null || this.f31807V1.isEmpty() || this.f31809Y) {
            long j3 = this.f31805N;
            long j4 = this.f31806Q;
            if (this.f31810Z) {
                long defaultPositionUs = this.f31811Z1.getDefaultPositionUs();
                j3 += defaultPositionUs;
                j4 += defaultPositionUs;
            }
            this.f31814c2 = positionInFirstPeriodUs + j3;
            this.f31815d2 = this.f31806Q != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.f31807V1.size();
            for (int i = 0; i < size; i++) {
                this.f31807V1.get(i).updateClipping(this.f31814c2, this.f31815d2);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.f31814c2 - positionInFirstPeriodUs;
            j2 = this.f31806Q != Long.MIN_VALUE ? this.f31815d2 - positionInFirstPeriodUs : Long.MIN_VALUE;
            j = j5;
        }
        try {
            C5120c c5120c = new C5120c(q1hVar, j, j2, this.f31804M1);
            this.f31812a2 = c5120c;
            m11123m(c5120c);
        } catch (C5121d e) {
            this.f31813b2 = e;
            for (int i2 = 0; i2 < this.f31807V1.size(); i2++) {
                this.f31807V1.get(i2).setClippingError(this.f31813b2);
            }
        }
    }

    @Override // p000.rri
    /* JADX INFO: renamed from: F */
    public void mo9030F(q1h q1hVar) {
        if (this.f31813b2 != null) {
            return;
        }
        refreshClippedTimeline(q1hVar);
    }

    @Override // p000.rri, p000.una
    public boolean canUpdateMediaItem(nfa nfaVar) {
        return getMediaItem().f64309f.equals(nfaVar.f64309f) && this.f79175L.canUpdateMediaItem(nfaVar);
    }

    @Override // p000.rri, p000.una
    public mja createPeriod(una.C13612b c13612b, InterfaceC5892fn interfaceC5892fn, long j) {
        c52 c52Var = new c52(this.f79175L.createPeriod(c13612b, interfaceC5892fn, j), this.f31808X, this.f31814c2, this.f31815d2);
        this.f31807V1.add(c52Var);
        return c52Var;
    }

    @Override // p000.um2, p000.una
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        C5121d c5121d = this.f31813b2;
        if (c5121d != null) {
            throw c5121d;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.rri, p000.una
    public void releasePeriod(mja mjaVar) {
        v80.checkState(this.f31807V1.remove(mjaVar));
        this.f79175L.releasePeriod(((c52) mjaVar).f15785a);
        if (!this.f31807V1.isEmpty() || this.f31809Y) {
            return;
        }
        refreshClippedTimeline(((C5120c) v80.checkNotNull(this.f31812a2)).f102944e);
    }

    @Override // p000.um2, p000.fs0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f31813b2 = null;
        this.f31812a2 = null;
    }

    @Deprecated
    public e52(una unaVar, long j, long j2) {
        this(new C5119b(unaVar).setStartPositionUs(j).setEndPositionUs(j2));
    }

    @Deprecated
    public e52(una unaVar, long j) {
        this(new C5119b(unaVar).setEndPositionUs(j).setRelativeToDefaultPosition(true));
    }

    @Deprecated
    public e52(una unaVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        this(new C5119b(unaVar).setStartPositionUs(j).setEndPositionUs(j2).setEnableInitialDiscontinuity(z).setAllowDynamicClippingUpdates(z2).setRelativeToDefaultPosition(z3));
    }

    private e52(C5119b c5119b) {
        super(c5119b.f31816a);
        this.f31805N = c5119b.f31817b;
        this.f31806Q = c5119b.f31818c;
        this.f31808X = c5119b.f31819d;
        this.f31809Y = c5119b.f31820e;
        this.f31810Z = c5119b.f31821f;
        this.f31804M1 = c5119b.f31822g;
        this.f31807V1 = new ArrayList<>();
        this.f31811Z1 = new q1h.C11272d();
    }
}
