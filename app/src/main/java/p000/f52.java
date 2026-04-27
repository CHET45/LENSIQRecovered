package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p000.t1h;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f52 extends qri {

    /* JADX INFO: renamed from: M1 */
    public final ArrayList<d52> f35337M1;

    /* JADX INFO: renamed from: N */
    public final long f35338N;

    /* JADX INFO: renamed from: Q */
    public final long f35339Q;

    /* JADX INFO: renamed from: V1 */
    public final t1h.C12851d f35340V1;

    /* JADX INFO: renamed from: X */
    public final boolean f35341X;

    /* JADX INFO: renamed from: Y */
    public final boolean f35342Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f35343Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public C5597a f35344Z1;

    /* JADX INFO: renamed from: a2 */
    @hib
    public C5598b f35345a2;

    /* JADX INFO: renamed from: b2 */
    public long f35346b2;

    /* JADX INFO: renamed from: c2 */
    public long f35347c2;

    /* JADX INFO: renamed from: f52$a */
    public static final class C5597a extends xt6 {

        /* JADX INFO: renamed from: C */
        public final long f35348C;

        /* JADX INFO: renamed from: F */
        public final long f35349F;

        /* JADX INFO: renamed from: H */
        public final boolean f35350H;

        /* JADX INFO: renamed from: m */
        public final long f35351m;

        public C5597a(t1h t1hVar, long j, long j2) throws C5598b {
            super(t1hVar);
            boolean z = false;
            if (t1hVar.getPeriodCount() != 1) {
                throw new C5598b(0);
            }
            t1h.C12851d window = t1hVar.getWindow(0, new t1h.C12851d());
            long jMax = Math.max(0L, j);
            if (!window.f83428M && jMax != 0 && !window.f83424C) {
                throw new C5598b(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? window.f83430Q : Math.max(0L, j2);
            long j3 = window.f83430Q;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new C5598b(2);
                }
            }
            this.f35351m = jMax;
            this.f35348C = jMax2;
            this.f35349F = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (window.f83425F && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f35350H = z;
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12849b getPeriod(int i, t1h.C12849b c12849b, boolean z) {
            this.f99225f.getPeriod(0, c12849b, z);
            long positionInWindowUs = c12849b.getPositionInWindowUs() - this.f35351m;
            long j = this.f35349F;
            return c12849b.set(c12849b.f83396a, c12849b.f83397b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }

        @Override // p000.xt6, p000.t1h
        public t1h.C12851d getWindow(int i, t1h.C12851d c12851d, long j) {
            this.f99225f.getWindow(0, c12851d, 0L);
            long j2 = c12851d.f83433Z;
            long j3 = this.f35351m;
            c12851d.f83433Z = j2 + j3;
            c12851d.f83430Q = this.f35349F;
            c12851d.f83425F = this.f35350H;
            long j4 = c12851d.f83429N;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                c12851d.f83429N = jMax;
                long j5 = this.f35348C;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                c12851d.f83429N = jMax - this.f35351m;
            }
            long jUsToMs = x0i.usToMs(this.f35351m);
            long j6 = c12851d.f83438e;
            if (j6 != -9223372036854775807L) {
                c12851d.f83438e = j6 + jUsToMs;
            }
            long j7 = c12851d.f83439f;
            if (j7 != -9223372036854775807L) {
                c12851d.f83439f = j7 + jUsToMs;
            }
            return c12851d;
        }
    }

    /* JADX INFO: renamed from: f52$b */
    public static final class C5598b extends IOException {

        /* JADX INFO: renamed from: b */
        public static final int f35352b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f35353c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f35354d = 2;

        /* JADX INFO: renamed from: a */
        public final int f35355a;

        /* JADX INFO: renamed from: f52$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C5598b(int i) {
            super("Illegal clipping: " + getReasonDescription(i));
            this.f35355a = i;
        }

        private static String getReasonDescription(int i) {
            return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public f52(vna vnaVar, long j, long j2) {
        this(vnaVar, j, j2, true, false, false);
    }

    private void refreshClippedTimeline(t1h t1hVar) {
        long j;
        long j2;
        t1hVar.getWindow(0, this.f35340V1);
        long positionInFirstPeriodUs = this.f35340V1.getPositionInFirstPeriodUs();
        if (this.f35344Z1 == null || this.f35337M1.isEmpty() || this.f35342Y) {
            long j3 = this.f35338N;
            long j4 = this.f35339Q;
            if (this.f35343Z) {
                long defaultPositionUs = this.f35340V1.getDefaultPositionUs();
                j3 += defaultPositionUs;
                j4 += defaultPositionUs;
            }
            this.f35346b2 = positionInFirstPeriodUs + j3;
            this.f35347c2 = this.f35339Q != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.f35337M1.size();
            for (int i = 0; i < size; i++) {
                this.f35337M1.get(i).updateClipping(this.f35346b2, this.f35347c2);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.f35346b2 - positionInFirstPeriodUs;
            j2 = this.f35339Q != Long.MIN_VALUE ? this.f35347c2 - positionInFirstPeriodUs : Long.MIN_VALUE;
            j = j5;
        }
        try {
            C5597a c5597a = new C5597a(t1hVar, j, j2);
            this.f35344Z1 = c5597a;
            m10220l(c5597a);
        } catch (C5598b e) {
            this.f35345a2 = e;
            for (int i2 = 0; i2 < this.f35337M1.size(); i2++) {
                this.f35337M1.get(i2).setClippingError(this.f35345a2);
            }
        }
    }

    @Override // p000.qri
    /* JADX INFO: renamed from: D */
    public void mo10627D(t1h t1hVar) {
        if (this.f35345a2 != null) {
            return;
        }
        refreshClippedTimeline(t1hVar);
    }

    @Override // p000.qri, p000.vna
    public nja createPeriod(vna.C14175b c14175b, InterfaceC6430gn interfaceC6430gn, long j) {
        d52 d52Var = new d52(this.f75482L.createPeriod(c14175b, interfaceC6430gn, j), this.f35341X, this.f35346b2, this.f35347c2);
        this.f35337M1.add(d52Var);
        return d52Var;
    }

    @Override // p000.vm2, p000.vna
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        C5598b c5598b = this.f35345a2;
        if (c5598b != null) {
            throw c5598b;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // p000.qri, p000.vna
    public void releasePeriod(nja njaVar) {
        u80.checkState(this.f35337M1.remove(njaVar));
        this.f75482L.releasePeriod(((d52) njaVar).f28448a);
        if (!this.f35337M1.isEmpty() || this.f35342Y) {
            return;
        }
        refreshClippedTimeline(((C5597a) u80.checkNotNull(this.f35344Z1)).f99225f);
    }

    @Override // p000.vm2, p000.es0
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f35345a2 = null;
        this.f35344Z1 = null;
    }

    public f52(vna vnaVar, long j) {
        this(vnaVar, 0L, j, true, false, true);
    }

    public f52(vna vnaVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((vna) u80.checkNotNull(vnaVar));
        u80.checkArgument(j >= 0);
        this.f35338N = j;
        this.f35339Q = j2;
        this.f35341X = z;
        this.f35342Y = z2;
        this.f35343Z = z3;
        this.f35337M1 = new ArrayList<>();
        this.f35340V1 = new t1h.C12851d();
    }
}
