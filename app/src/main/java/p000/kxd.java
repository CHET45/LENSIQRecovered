package p000;

import java.util.Map;
import p000.mxd;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class kxd<K, V> extends xw7<K, V> {

    /* JADX INFO: renamed from: L */
    public static final kxd<Object, Object> f55591L = new kxd<>();

    /* JADX INFO: renamed from: C */
    public final transient int f55592C;

    /* JADX INFO: renamed from: F */
    public final transient int f55593F;

    /* JADX INFO: renamed from: H */
    public final transient kxd<V, K> f55594H;

    /* JADX INFO: renamed from: f */
    @wx1
    public final transient Object f55595f;

    /* JADX INFO: renamed from: m */
    @gdi
    public final transient Object[] f55596m;

    /* JADX WARN: Multi-variable type inference failed */
    private kxd() {
        this.f55595f = null;
        this.f55596m = new Object[0];
        this.f55592C = 0;
        this.f55593F = 0;
        this.f55594H = this;
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: c */
    public dy7<Map.Entry<K, V>> mo13559c() {
        return new mxd.C9606a(this, this.f55596m, this.f55592C, this.f55593F);
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: d */
    public dy7<K> mo2957d() {
        return new mxd.C9607b(this, new mxd.C9608c(this.f55596m, this.f55592C, this.f55593F));
    }

    @Override // p000.ox7, java.util.Map
    @wx1
    public V get(@wx1 Object obj) {
        V v = (V) mxd.m17666m(this.f55595f, this.f55596m, this.f55593F, this.f55592C, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: h */
    public boolean mo2953h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f55593F;
    }

    @Override // p000.xw7, p000.k11
    public xw7<V, K> inverse() {
        return this.f55594H;
    }

    public kxd(Object[] alternatingKeysAndValues, int size) {
        this.f55596m = alternatingKeysAndValues;
        this.f55593F = size;
        this.f55592C = 0;
        int iM9574g = size >= 2 ? dy7.m9574g(size) : 0;
        this.f55595f = mxd.m17665l(alternatingKeysAndValues, size, iM9574g, 0);
        this.f55594H = new kxd<>(mxd.m17665l(alternatingKeysAndValues, size, iM9574g, 1), alternatingKeysAndValues, size, this);
    }

    private kxd(@wx1 Object valueHashTable, Object[] alternatingKeysAndValues, int size, kxd<V, K> inverse) {
        this.f55595f = valueHashTable;
        this.f55596m = alternatingKeysAndValues;
        this.f55592C = 1;
        this.f55593F = size;
        this.f55594H = inverse;
    }
}
