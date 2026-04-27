package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ox8 extends px8 {

    /* JADX INFO: renamed from: f */
    public final qsa f69159f;

    /* JADX INFO: renamed from: ox8$b */
    public static class C10708b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, ox8> f69160a;

        public ox8 getField() {
            return this.f69160a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f69160a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            ox8 value = this.f69160a.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object value) {
            if (value instanceof qsa) {
                return this.f69160a.getValue().setValue((qsa) value);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C10708b(Map.Entry<K, ox8> entry) {
            this.f69160a = entry;
        }
    }

    /* JADX INFO: renamed from: ox8$c */
    public static class C10709c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f69161a;

        public C10709c(Iterator<Map.Entry<K, Object>> iterator) {
            this.f69161a = iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69161a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f69161a.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f69161a.next();
            return next.getValue() instanceof ox8 ? new C10708b(next) : next;
        }
    }

    public ox8(qsa defaultInstance, zi5 extensionRegistry, vj1 bytes) {
        super(extensionRegistry, bytes);
        this.f69159f = defaultInstance;
    }

    @Override // p000.px8
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.f72456c == this.f69159f;
    }

    @Override // p000.px8
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public qsa getValue() {
        return getValue(this.f69159f);
    }

    @Override // p000.px8
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
