package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class urc<K, V> implements Iterator<Map.Entry<K, V>>, xo8 {

    /* JADX INFO: renamed from: b */
    public static final int f88864b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xrc<K, V> f88865a;

    public urc(@yfb src<K, V> srcVar) {
        this.f88865a = new xrc<>(srcVar.getFirstKey$runtime_release(), srcVar);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f88865a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f88865a.remove();
    }

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        return new y5b(this.f88865a.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), this.f88865a.getLastIteratedKey$runtime_release(), this.f88865a.next());
    }
}
