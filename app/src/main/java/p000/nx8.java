package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class nx8 extends qx8 {

    /* JADX INFO: renamed from: e */
    public final psa f65956e;

    /* JADX INFO: renamed from: nx8$b */
    public static class C10105b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, nx8> f65957a;

        public nx8 getField() {
            return this.f65957a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f65957a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            nx8 value = this.f65957a.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object value) {
            if (value instanceof psa) {
                return this.f65957a.getValue().setValue((psa) value);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C10105b(Map.Entry<K, nx8> entry) {
            this.f65957a = entry;
        }
    }

    /* JADX INFO: renamed from: nx8$c */
    public static class C10106c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f65958a;

        public C10106c(Iterator<Map.Entry<K, Object>> iterator) {
            this.f65958a = iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65958a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f65958a.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f65958a.next();
            return next.getValue() instanceof nx8 ? new C10105b(next) : next;
        }
    }

    public nx8(psa defaultInstance, yi5 extensionRegistry, wj1 bytes) {
        super(extensionRegistry, bytes);
        this.f65956e = defaultInstance;
    }

    @Override // p000.qx8
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.f76274c == this.f65956e;
    }

    @Override // p000.qx8
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public psa getValue() {
        return getValue(this.f65956e);
    }

    @Override // p000.qx8
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
