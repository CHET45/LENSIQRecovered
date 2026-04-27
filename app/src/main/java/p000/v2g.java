package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v2g<K, V> extends u2g<K, V> implements Iterator<K>, xo8 {
    public v2g(@yfb auf<K, V> aufVar, @yfb Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(aufVar, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> entryM23079d = m23079d();
        if (entryM23079d == null) {
            throw new IllegalStateException();
        }
        m23076a();
        return entryM23079d.getKey();
    }
}
