package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public final class blh<T, V extends AbstractC16313zy> implements alh<T, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<T, V> f14075a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<V, T> f14076b;

    /* JADX WARN: Multi-variable type inference failed */
    public blh(@yfb qy6<? super T, ? extends V> qy6Var, @yfb qy6<? super V, ? extends T> qy6Var2) {
        this.f14075a = qy6Var;
        this.f14076b = qy6Var2;
    }

    @Override // p000.alh
    @yfb
    public qy6<V, T> getConvertFromVector() {
        return this.f14076b;
    }

    @Override // p000.alh
    @yfb
    public qy6<T, V> getConvertToVector() {
        return this.f14075a;
    }
}
