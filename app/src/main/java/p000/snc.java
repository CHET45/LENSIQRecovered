package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class snc implements y0h {

    /* JADX INFO: renamed from: f */
    public static final int f82379f = 10;

    /* JADX INFO: renamed from: g */
    public static final float f82380g = 0.5f;

    /* JADX INFO: renamed from: h */
    public static final int f82381h = 10;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<yh3, Long> f82382a;

    /* JADX INFO: renamed from: b */
    public final brf f82383b;

    /* JADX INFO: renamed from: c */
    public final float f82384c;

    /* JADX INFO: renamed from: d */
    public final h52 f82385d;

    /* JADX INFO: renamed from: e */
    public boolean f82386e;

    /* JADX INFO: renamed from: snc$a */
    public static class C12705a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f82387a;

        public C12705a(int i) {
            this.f82387a = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f82387a;
        }
    }

    public snc() {
        this(10, 0.5f);
    }

    @Override // p000.y0h
    public long getTimeToFirstByteEstimateUs() {
        if (this.f82386e) {
            return -9223372036854775807L;
        }
        return (long) this.f82383b.getPercentile(this.f82384c);
    }

    @Override // p000.y0h
    public void onTransferInitializing(yh3 yh3Var) {
        this.f82382a.remove(yh3Var);
        this.f82382a.put(yh3Var, Long.valueOf(x0i.msToUs(this.f82385d.elapsedRealtime())));
    }

    @Override // p000.y0h
    public void onTransferStart(yh3 yh3Var) {
        if (this.f82382a.remove(yh3Var) == null) {
            return;
        }
        this.f82383b.addSample(1, x0i.msToUs(this.f82385d.elapsedRealtime()) - r6.longValue());
        this.f82386e = false;
    }

    @Override // p000.y0h
    public void reset() {
        this.f82383b.reset();
        this.f82386e = true;
    }

    public snc(int i, float f) {
        this(i, f, h52.f42390a);
    }

    @fdi
    public snc(int i, float f, h52 h52Var) {
        u80.checkArgument(i > 0 && f > 0.0f && f <= 1.0f);
        this.f82384c = f;
        this.f82385d = h52Var;
        this.f82382a = new C12705a(10);
        this.f82383b = new brf(i);
        this.f82386e = true;
    }
}
