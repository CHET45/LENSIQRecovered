package p000;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class tx7<K, V> extends ax7<V> {

    /* JADX INFO: renamed from: b */
    public final ox7<K, V> f86253b;

    /* JADX INFO: renamed from: tx7$a */
    public class C13268a extends quh<V> {

        /* JADX INFO: renamed from: a */
        public final quh<Map.Entry<K, V>> f86254a;

        public C13268a() {
            this.f86254a = tx7.this.f86253b.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86254a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f86254a.next().getValue();
        }
    }

    /* JADX INFO: renamed from: tx7$b */
    public class C13269b extends kx7<V> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kx7 f86256c;

        public C13269b(final tx7 this$0, final kx7 val$entryList) {
            this.f86256c = val$entryList;
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) ((Map.Entry) this.f86256c.get(i)).getValue();
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f86256c.size();
        }
    }

    /* JADX INFO: renamed from: tx7$c */
    @jd7
    @yg8
    public static class C13270c<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ox7<?, V> f86257a;

        public C13270c(ox7<?, V> map) {
            this.f86257a = map;
        }

        public Object readResolve() {
            return this.f86257a.values();
        }
    }

    public tx7(ox7<K, V> map) {
        this.f86253b = map;
    }

    @Override // p000.ax7
    public kx7<V> asList() {
        return new C13269b(this, this.f86253b.entrySet().asList());
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return object != null && wg8.contains(iterator(), object);
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f86253b.size();
    }

    @Override // p000.ax7
    @jd7
    public Object writeReplace() {
        return new C13270c(this.f86253b);
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<V> iterator() {
        return new C13268a();
    }
}
