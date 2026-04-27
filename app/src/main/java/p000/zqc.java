package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class zqc<K, V> implements Iterator<Map.Entry<K, V>>, xo8 {

    /* JADX INFO: renamed from: b */
    public static final int f105752b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final xqc<K, V, Map.Entry<K, V>> f105753a;

    public zqc(@yfb wqc<K, V> wqcVar) {
        pih[] pihVarArr = new pih[8];
        for (int i = 0; i < 8; i++) {
            pihVarArr[i] = new vih(this);
        }
        this.f105753a = new xqc<>(wqcVar, pihVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f105753a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f105753a.remove();
    }

    public final void setValue(K k, V v) {
        this.f105753a.setValue(k, v);
    }

    @Override // java.util.Iterator
    @yfb
    public Map.Entry<K, V> next() {
        return this.f105753a.next();
    }
}
