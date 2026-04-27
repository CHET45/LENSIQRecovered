package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class mi5 implements y0h {

    /* JADX INFO: renamed from: e */
    public static final double f61055e = 0.85d;

    /* JADX INFO: renamed from: f */
    public static final int f61056f = 10;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<yh3, Long> f61057a;

    /* JADX INFO: renamed from: b */
    public final double f61058b;

    /* JADX INFO: renamed from: c */
    public final h52 f61059c;

    /* JADX INFO: renamed from: d */
    public long f61060d;

    /* JADX INFO: renamed from: mi5$a */
    public static class C9357a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f61061a;

        public C9357a(int i) {
            this.f61061a = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f61061a;
        }
    }

    public mi5() {
        this(0.85d, h52.f42390a);
    }

    @Override // p000.y0h
    public long getTimeToFirstByteEstimateUs() {
        return this.f61060d;
    }

    @Override // p000.y0h
    public void onTransferInitializing(yh3 yh3Var) {
        this.f61057a.remove(yh3Var);
        this.f61057a.put(yh3Var, Long.valueOf(x0i.msToUs(this.f61059c.elapsedRealtime())));
    }

    @Override // p000.y0h
    public void onTransferStart(yh3 yh3Var) {
        Long lRemove = this.f61057a.remove(yh3Var);
        if (lRemove == null) {
            return;
        }
        long jMsToUs = x0i.msToUs(this.f61059c.elapsedRealtime()) - lRemove.longValue();
        long j = this.f61060d;
        if (j == -9223372036854775807L) {
            this.f61060d = jMsToUs;
        } else {
            double d = this.f61058b;
            this.f61060d = (long) ((j * d) + ((1.0d - d) * jMsToUs));
        }
    }

    @Override // p000.y0h
    public void reset() {
        this.f61060d = -9223372036854775807L;
    }

    public mi5(double d) {
        this(d, h52.f42390a);
    }

    @fdi
    public mi5(double d, h52 h52Var) {
        this.f61058b = d;
        this.f61059c = h52Var;
        this.f61057a = new C9357a(10);
        this.f61060d = -9223372036854775807L;
    }
}
