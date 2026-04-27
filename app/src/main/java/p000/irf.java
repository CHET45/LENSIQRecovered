package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class irf implements xp0 {

    /* JADX INFO: renamed from: f */
    public static final int f48101f = 10;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C7578a> f48102a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7579b f48103b;

    /* JADX INFO: renamed from: c */
    public final j52 f48104c;

    /* JADX INFO: renamed from: d */
    public double f48105d;

    /* JADX INFO: renamed from: e */
    public double f48106e;

    /* JADX INFO: renamed from: irf$a */
    public static class C7578a {

        /* JADX INFO: renamed from: a */
        public final long f48107a;

        /* JADX INFO: renamed from: b */
        public final double f48108b;

        /* JADX INFO: renamed from: c */
        public final long f48109c;

        public C7578a(long j, double d, long j2) {
            this.f48107a = j;
            this.f48108b = d;
            this.f48109c = j2;
        }
    }

    /* JADX INFO: renamed from: irf$b */
    public interface InterfaceC7579b {
        boolean shouldEvictSample(Deque<C7578a> deque);
    }

    public irf() {
        this(getMaxCountEvictionFunction(10L));
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static InterfaceC7579b m13356c(final long j, final j52 j52Var) {
        return new InterfaceC7579b() { // from class: frf
            @Override // p000.irf.InterfaceC7579b
            public final boolean shouldEvictSample(Deque deque) {
                return irf.lambda$getAgeBasedEvictionFunction$1(j, j52Var, deque);
            }
        };
    }

    public static InterfaceC7579b getAgeBasedEvictionFunction(long j) {
        return m13356c(j, j52.f49539a);
    }

    public static InterfaceC7579b getMaxCountEvictionFunction(final long j) {
        return new InterfaceC7579b() { // from class: hrf
            @Override // p000.irf.InterfaceC7579b
            public final boolean shouldEvictSample(Deque deque) {
                return irf.lambda$getMaxCountEvictionFunction$0(j, deque);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, j52 j52Var, Deque deque) {
        return !deque.isEmpty() && ((C7578a) t0i.castNonNull((C7578a) deque.peek())).f48109c + j < j52Var.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        return ((long) deque.size()) >= j;
    }

    @Override // p000.xp0
    public void addSample(long j, long j2) {
        while (this.f48103b.shouldEvictSample(this.f48102a)) {
            C7578a c7578aRemove = this.f48102a.remove();
            double d = this.f48105d;
            double d2 = c7578aRemove.f48107a;
            double d3 = c7578aRemove.f48108b;
            this.f48105d = d - (d2 * d3);
            this.f48106e -= d3;
        }
        C7578a c7578a = new C7578a((j * 8000000) / j2, Math.sqrt(j), this.f48104c.elapsedRealtime());
        this.f48102a.add(c7578a);
        double d4 = this.f48105d;
        double d5 = c7578a.f48107a;
        double d6 = c7578a.f48108b;
        this.f48105d = d4 + (d5 * d6);
        this.f48106e += d6;
    }

    @Override // p000.xp0
    public long getBandwidthEstimate() {
        if (this.f48102a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.f48105d / this.f48106e);
    }

    @Override // p000.xp0
    public void reset() {
        this.f48102a.clear();
        this.f48105d = 0.0d;
        this.f48106e = 0.0d;
    }

    public irf(InterfaceC7579b interfaceC7579b) {
        this(interfaceC7579b, j52.f49539a);
    }

    @fdi
    public irf(InterfaceC7579b interfaceC7579b, j52 j52Var) {
        this.f48102a = new ArrayDeque<>();
        this.f48103b = interfaceC7579b;
        this.f48104c = j52Var;
    }
}
