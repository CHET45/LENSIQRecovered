package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class jrf implements wp0 {

    /* JADX INFO: renamed from: f */
    public static final int f51625f = 10;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C8042a> f51626a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8043b f51627b;

    /* JADX INFO: renamed from: c */
    public final h52 f51628c;

    /* JADX INFO: renamed from: d */
    public double f51629d;

    /* JADX INFO: renamed from: e */
    public double f51630e;

    /* JADX INFO: renamed from: jrf$a */
    public static class C8042a {

        /* JADX INFO: renamed from: a */
        public final long f51631a;

        /* JADX INFO: renamed from: b */
        public final double f51632b;

        /* JADX INFO: renamed from: c */
        public final long f51633c;

        public C8042a(long j, double d, long j2) {
            this.f51631a = j;
            this.f51632b = d;
            this.f51633c = j2;
        }
    }

    /* JADX INFO: renamed from: jrf$b */
    public interface InterfaceC8043b {
        boolean shouldEvictSample(Deque<C8042a> deque);
    }

    public jrf() {
        this(getMaxCountEvictionFunction(10L));
    }

    @fdi
    /* JADX INFO: renamed from: c */
    public static InterfaceC8043b m14262c(final long j, final h52 h52Var) {
        return new InterfaceC8043b() { // from class: grf
            @Override // p000.jrf.InterfaceC8043b
            public final boolean shouldEvictSample(Deque deque) {
                return jrf.lambda$getAgeBasedEvictionFunction$1(j, h52Var, deque);
            }
        };
    }

    public static InterfaceC8043b getAgeBasedEvictionFunction(long j) {
        return m14262c(j, h52.f42390a);
    }

    public static InterfaceC8043b getMaxCountEvictionFunction(final long j) {
        return new InterfaceC8043b() { // from class: erf
            @Override // p000.jrf.InterfaceC8043b
            public final boolean shouldEvictSample(Deque deque) {
                return jrf.lambda$getMaxCountEvictionFunction$0(j, deque);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j, h52 h52Var, Deque deque) {
        return !deque.isEmpty() && ((C8042a) x0i.castNonNull((C8042a) deque.peek())).f51633c + j < h52Var.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        return ((long) deque.size()) >= j;
    }

    @Override // p000.wp0
    public void addSample(long j, long j2) {
        while (this.f51627b.shouldEvictSample(this.f51626a)) {
            C8042a c8042aRemove = this.f51626a.remove();
            double d = this.f51629d;
            double d2 = c8042aRemove.f51631a;
            double d3 = c8042aRemove.f51632b;
            this.f51629d = d - (d2 * d3);
            this.f51630e -= d3;
        }
        C8042a c8042a = new C8042a((j * 8000000) / j2, Math.sqrt(j), this.f51628c.elapsedRealtime());
        this.f51626a.add(c8042a);
        double d4 = this.f51629d;
        double d5 = c8042a.f51631a;
        double d6 = c8042a.f51632b;
        this.f51629d = d4 + (d5 * d6);
        this.f51630e += d6;
    }

    @Override // p000.wp0
    public long getBandwidthEstimate() {
        if (this.f51626a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.f51629d / this.f51630e);
    }

    @Override // p000.wp0
    public void reset() {
        this.f51626a.clear();
        this.f51629d = 0.0d;
        this.f51630e = 0.0d;
    }

    public jrf(InterfaceC8043b interfaceC8043b) {
        this(interfaceC8043b, h52.f42390a);
    }

    @fdi
    public jrf(InterfaceC8043b interfaceC8043b, h52 h52Var) {
        this.f51626a = new ArrayDeque<>();
        this.f51627b = interfaceC8043b;
        this.f51628c = h52Var;
    }
}
