package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class zrc<K, V> implements Iterator<V>, xo8 {

    /* JADX INFO: renamed from: b */
    public static final int f105857b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xrc<K, V> f105858a;

    public zrc(@yfb src<K, V> srcVar) {
        this.f105858a = new xrc<>(srcVar.getFirstKey$runtime_release(), srcVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105858a.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f105858a.next().getValue();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f105858a.remove();
    }
}
