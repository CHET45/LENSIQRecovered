package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class rx7<K, V> extends dy7<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: rx7$a */
    @jd7
    @yg8
    public static class C12361a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ox7<K, V> f80064a;

        public C12361a(ox7<K, V> map) {
            this.f80064a = map;
        }

        public Object readResolve() {
            return this.f80064a.entrySet();
        }
    }

    /* JADX INFO: renamed from: rx7$b */
    public static final class C12362b<K, V> extends rx7<K, V> {

        /* JADX INFO: renamed from: f */
        public final transient ox7<K, V> f80065f;

        /* JADX INFO: renamed from: m */
        public final transient kx7<Map.Entry<K, V>> f80066m;

        public C12362b(ox7<K, V> map, Map.Entry<K, V>[] entries) {
            this(map, kx7.m15108e(entries));
        }

        @Override // p000.ax7
        @jd7("not used in GWT")
        /* JADX INFO: renamed from: a */
        public int mo2718a(Object[] dst, int offset) {
            return this.f80066m.mo2718a(dst, offset);
        }

        @Override // p000.dy7
        /* JADX INFO: renamed from: h */
        public kx7<Map.Entry<K, V>> mo9582h() {
            return this.f80066m;
        }

        @Override // p000.rx7
        /* JADX INFO: renamed from: j */
        public ox7<K, V> mo13561j() {
            return this.f80065f;
        }

        public C12362b(ox7<K, V> map, kx7<Map.Entry<K, V>> entries) {
            this.f80065f = map;
            this.f80066m = entries;
        }

        @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<Map.Entry<K, V>> iterator() {
            return this.f80066m.iterator();
        }
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) object;
        V v = mo13561j().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public int hashCode() {
        return mo13561j().hashCode();
    }

    @Override // p000.dy7
    @jd7
    /* JADX INFO: renamed from: i */
    public boolean mo9583i() {
        return mo13561j().mo19087g();
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return mo13561j().mo2953h();
    }

    /* JADX INFO: renamed from: j */
    public abstract ox7<K, V> mo13561j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return mo13561j().size();
    }

    @Override // p000.dy7, p000.ax7
    @jd7
    @yg8
    public Object writeReplace() {
        return new C12361a(mo13561j());
    }
}
