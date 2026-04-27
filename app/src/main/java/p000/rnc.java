package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rnc implements z0h {

    /* JADX INFO: renamed from: f */
    public static final int f78797f = 10;

    /* JADX INFO: renamed from: g */
    public static final float f78798g = 0.5f;

    /* JADX INFO: renamed from: h */
    public static final int f78799h = 10;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<xh3, Long> f78800a;

    /* JADX INFO: renamed from: b */
    public final arf f78801b;

    /* JADX INFO: renamed from: c */
    public final float f78802c;

    /* JADX INFO: renamed from: d */
    public final j52 f78803d;

    /* JADX INFO: renamed from: e */
    public boolean f78804e;

    /* JADX INFO: renamed from: rnc$a */
    public static class C12168a<K, V> extends LinkedHashMap<K, V> {

        /* JADX INFO: renamed from: a */
        public final int f78805a;

        public C12168a(int i) {
            this.f78805a = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f78805a;
        }
    }

    public rnc() {
        this(10, 0.5f);
    }

    @Override // p000.z0h
    public long getTimeToFirstByteEstimateUs() {
        if (this.f78804e) {
            return -9223372036854775807L;
        }
        return (long) this.f78801b.getPercentile(this.f78802c);
    }

    @Override // p000.z0h
    public void onTransferInitializing(xh3 xh3Var) {
        this.f78800a.remove(xh3Var);
        this.f78800a.put(xh3Var, Long.valueOf(t0i.msToUs(this.f78803d.elapsedRealtime())));
    }

    @Override // p000.z0h
    public void onTransferStart(xh3 xh3Var) {
        if (this.f78800a.remove(xh3Var) == null) {
            return;
        }
        this.f78801b.addSample(1, t0i.msToUs(this.f78803d.elapsedRealtime()) - r6.longValue());
        this.f78804e = false;
    }

    @Override // p000.z0h
    public void reset() {
        this.f78801b.reset();
        this.f78804e = true;
    }

    public rnc(int i, float f) {
        this(i, f, j52.f49539a);
    }

    @fdi
    public rnc(int i, float f, j52 j52Var) {
        v80.checkArgument(i > 0 && f > 0.0f && f <= 1.0f);
        this.f78802c = f;
        this.f78803d = j52Var;
        this.f78800a = new C12168a(10);
        this.f78801b = new arf(i);
        this.f78804e = true;
    }
}
