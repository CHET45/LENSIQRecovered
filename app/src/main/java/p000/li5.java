package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class li5 implements z0h {

    /* JADX INFO: renamed from: e */
    public static final double f57670e = 0.85d;

    /* JADX INFO: renamed from: f */
    public static final int f57671f = 10;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<xh3, Long> f57672a;

    /* JADX INFO: renamed from: b */
    public final double f57673b;

    /* JADX INFO: renamed from: c */
    public final j52 f57674c;

    /* JADX INFO: renamed from: d */
    public long f57675d;

    /* JADX INFO: renamed from: li5$a */
    public static class C8823a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f57676a;

        public C8823a(int i) {
            this.f57676a = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f57676a;
        }
    }

    public li5() {
        this(0.85d, j52.f49539a);
    }

    @Override // p000.z0h
    public long getTimeToFirstByteEstimateUs() {
        return this.f57675d;
    }

    @Override // p000.z0h
    public void onTransferInitializing(xh3 xh3Var) {
        this.f57672a.remove(xh3Var);
        this.f57672a.put(xh3Var, Long.valueOf(t0i.msToUs(this.f57674c.elapsedRealtime())));
    }

    @Override // p000.z0h
    public void onTransferStart(xh3 xh3Var) {
        Long lRemove = this.f57672a.remove(xh3Var);
        if (lRemove == null) {
            return;
        }
        long jMsToUs = t0i.msToUs(this.f57674c.elapsedRealtime()) - lRemove.longValue();
        long j = this.f57675d;
        if (j == -9223372036854775807L) {
            this.f57675d = jMsToUs;
        } else {
            double d = this.f57673b;
            this.f57675d = (long) ((j * d) + ((1.0d - d) * jMsToUs));
        }
    }

    @Override // p000.z0h
    public void reset() {
        this.f57675d = -9223372036854775807L;
    }

    public li5(double d) {
        this(d, j52.f49539a);
    }

    @fdi
    public li5(double d, j52 j52Var) {
        this.f57673b = d;
        this.f57674c = j52Var;
        this.f57672a = new C8823a(10);
        this.f57675d = -9223372036854775807L;
    }
}
