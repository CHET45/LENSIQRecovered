package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.d7b;

/* JADX INFO: loaded from: classes5.dex */
@px4
public final class d7b<B> extends qs6<nmh<? extends B>, B> implements mmh<B> {

    /* JADX INFO: renamed from: a */
    public final Map<nmh<? extends B>, B> f28705a = tt9.newHashMap();

    /* JADX INFO: renamed from: d7b$a */
    public static final class C4658a<K, V> extends rs6<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, V> f28706a;

        /* JADX INFO: renamed from: d7b$a$a */
        public class a extends jt6<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Set f28707a;

            public a(final Set val$entries) {
                this.f28707a = val$entries;
            }

            @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return C4658a.transformEntries(super.iterator());
            }

            @Override // p000.jt6, p000.lr6, p000.zs6
            /* JADX INFO: renamed from: m */
            public Set<Map.Entry<K, V>> mo8967m() {
                return this.f28707a;
            }

            @Override // p000.lr6, java.util.Collection
            public Object[] toArray() {
                return m16327j();
            }

            @Override // p000.lr6, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) m16328k(tArr);
            }
        }

        private C4658a(Map.Entry<K, V> delegate) {
            this.f28706a = (Map.Entry) v7d.checkNotNull(delegate);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ C4658a m8963e(Map.Entry entry) {
            return new C4658a(entry);
        }

        /* JADX INFO: renamed from: g */
        public static <K, V> Set<Map.Entry<K, V>> m8965g(Set<Map.Entry<K, V>> entries) {
            return new a(entries);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> transformEntries(Iterator<Map.Entry<K, V>> entries) {
            return wg8.transform(entries, new lz6() { // from class: c7b
                @Override // p000.lz6
                public final Object apply(Object obj) {
                    return d7b.C4658a.m8963e((Map.Entry) obj);
                }
            });
        }

        @Override // p000.rs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> mo8967m() {
            return this.f28706a;
        }

        @Override // p000.rs6, java.util.Map.Entry
        @zfc
        public V setValue(@zfc V value) {
            throw new UnsupportedOperationException();
        }
    }

    @wx1
    private <T extends B> T trustedGet(nmh<T> nmhVar) {
        return this.f28705a.get(nmhVar);
    }

    @wx1
    private <T extends B> T trustedPut(nmh<T> nmhVar, @zfc T t) {
        return this.f28705a.put(nmhVar, t);
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: a */
    public Map<nmh<? extends B>, B> mo8967m() {
        return this.f28705a;
    }

    @Override // p000.qs6, java.util.Map
    public Set<Map.Entry<nmh<? extends B>, B>> entrySet() {
        return C4658a.m8965g(super.entrySet());
    }

    @Override // p000.mmh
    @wx1
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) trustedGet(nmh.m18018of((Class) cls));
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends nmh<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // p000.mmh
    @op1
    @wx1
    public <T extends B> T putInstance(Class<T> cls, @zfc T t) {
        return (T) trustedPut(nmh.m18018of((Class) cls), t);
    }

    @Override // p000.mmh
    @wx1
    public <T extends B> T getInstance(nmh<T> nmhVar) {
        return (T) trustedGet(nmhVar.m18022h());
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public B put(nmh<? extends B> key, @zfc B value) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // p000.mmh
    @op1
    @wx1
    public <T extends B> T putInstance(nmh<T> nmhVar, @zfc T t) {
        return (T) trustedPut(nmhVar.m18022h(), t);
    }
}
