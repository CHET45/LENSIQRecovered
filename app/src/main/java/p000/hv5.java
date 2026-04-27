package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class hv5<K, V> extends gv5<K, V> implements kv5<K, V> {

    /* JADX INFO: renamed from: hv5$a */
    public class C7027a extends gv5<K, V>.C6592c implements Set<Map.Entry<K, V>> {
        public C7027a(final hv5 this$0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object o) {
            return t6f.m22396a(this, o);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return t6f.m22397b(this);
        }
    }

    public hv5(p6f<K, V> unfiltered, l8d<? super K> keyPredicate) {
        super(unfiltered, keyPredicate);
    }

    @Override // p000.gv5, p000.AbstractC2173c3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> mo3678b() {
        return new C7027a(this);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // p000.gv5, p000.u3b
    public Set<V> get(@dgc K key) {
        return (Set) super.get((Object) key);
    }

    @Override // p000.gv5, p000.u3b
    public Set<V> removeAll(@wx1 Object key) {
        return (Set) super.removeAll(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public Set<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        return (Set) super.replaceValues((Object) key, (Iterable) values);
    }

    @Override // p000.gv5, p000.iv5
    public p6f<K, V> unfiltered() {
        return (p6f) this.f41457f;
    }
}
