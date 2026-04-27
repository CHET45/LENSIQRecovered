package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class wrc<K, V> implements Iterator<K>, xo8 {

    /* JADX INFO: renamed from: b */
    public static final int f95221b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xrc<K, V> f95222a;

    public wrc(@yfb src<K, V> srcVar) {
        this.f95222a = new xrc<>(srcVar.getFirstKey$runtime_release(), srcVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f95222a.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.f95222a.next();
        return (K) this.f95222a.getLastIteratedKey$runtime_release();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f95222a.remove();
    }
}
