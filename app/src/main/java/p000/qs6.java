package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.tt9;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class qs6<K, V> extends zs6 implements Map<K, V> {

    /* JADX INFO: renamed from: qs6$a */
    public abstract class AbstractC11664a extends tt9.AbstractC13224s<K, V> {
        public AbstractC11664a() {
        }

        @Override // p000.tt9.AbstractC13224s
        /* JADX INFO: renamed from: a */
        public Map<K, V> mo8722a() {
            return qs6.this;
        }
    }

    /* JADX INFO: renamed from: qs6$b */
    public class C11665b extends tt9.C13191b0<K, V> {
        public C11665b(final qs6 this$0) {
            super(this$0);
        }
    }

    /* JADX INFO: renamed from: qs6$c */
    public class C11666c extends tt9.C13221q0<K, V> {
        public C11666c(final qs6 this$0) {
            super(this$0);
        }
    }

    @Override // p000.zs6
    /* JADX INFO: renamed from: a */
    public abstract Map<K, V> mo8967m();

    /* JADX INFO: renamed from: b */
    public void m20636b() {
        wg8.m24509c(entrySet().iterator());
    }

    /* JADX INFO: renamed from: c */
    public boolean mo20637c(@wx1 Object key) {
        return tt9.m22792m(this, key);
    }

    public void clear() {
        mo8967m().clear();
    }

    public boolean containsKey(@wx1 Object key) {
        return mo8967m().containsKey(key);
    }

    public boolean containsValue(@wx1 Object value) {
        return mo8967m().containsValue(value);
    }

    /* JADX INFO: renamed from: d */
    public boolean m20638d(@wx1 Object value) {
        return tt9.m22793n(this, value);
    }

    /* JADX INFO: renamed from: e */
    public boolean m20639e(@wx1 Object object) {
        return tt9.m22794o(this, object);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo8967m().entrySet();
    }

    public boolean equals(@wx1 Object object) {
        return object == this || mo8967m().equals(object);
    }

    /* JADX INFO: renamed from: f */
    public int m20640f() {
        return t6f.m22397b(entrySet());
    }

    /* JADX INFO: renamed from: g */
    public boolean m20641g() {
        return !entrySet().iterator().hasNext();
    }

    @wx1
    public V get(@wx1 Object key) {
        return mo8967m().get(key);
    }

    /* JADX INFO: renamed from: h */
    public void m20642h(Map<? extends K, ? extends V> map) {
        tt9.m22801v(this, map);
    }

    public int hashCode() {
        return mo8967m().hashCode();
    }

    @wx1
    /* JADX INFO: renamed from: i */
    public V m20643i(@wx1 Object key) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (okb.equal(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return mo8967m().isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public String m20644j() {
        return tt9.m22771A(this);
    }

    public Set<K> keySet() {
        return mo8967m().keySet();
    }

    @op1
    @wx1
    public V put(@dgc K key, @dgc V value) {
        return mo8967m().put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo8967m().putAll(map);
    }

    @op1
    @wx1
    public V remove(@wx1 Object key) {
        return mo8967m().remove(key);
    }

    public int size() {
        return mo8967m().size();
    }

    public Collection<V> values() {
        return mo8967m().values();
    }
}
