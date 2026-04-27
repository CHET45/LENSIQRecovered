package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class fx7<K extends Enum<K>, V> extends ox7.AbstractC10703b<K, V> {

    /* JADX INFO: renamed from: f */
    public final transient EnumMap<K, V> f37941f;

    /* JADX INFO: renamed from: fx7$b */
    @yg8
    public static class C6026b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final EnumMap<K, V> f37942a;

        public C6026b(EnumMap<K, V> delegate) {
            this.f37942a = delegate;
        }

        public Object readResolve() {
            return new fx7(this.f37942a);
        }
    }

    /* JADX INFO: renamed from: k */
    public static <K extends Enum<K>, V> ox7<K, V> m11217k(EnumMap<K, V> map) {
        int size = map.size();
        if (size == 0) {
            return ox7.m19076of();
        }
        if (size != 1) {
            return new fx7(map);
        }
        Map.Entry entry = (Map.Entry) vg8.getOnlyElement(map.entrySet());
        return ox7.m19077of((Enum) entry.getKey(), entry.getValue());
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // p000.ox7, java.util.Map
    public boolean containsKey(@wx1 Object key) {
        return this.f37941f.containsKey(key);
    }

    @Override // p000.ox7, java.util.Map
    public boolean equals(@wx1 Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fx7) {
            object = ((fx7) object).f37941f;
        }
        return this.f37941f.equals(object);
    }

    @Override // p000.ox7, java.util.Map
    @wx1
    public V get(@wx1 Object key) {
        return this.f37941f.get(key);
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: h */
    public boolean mo2953h() {
        return false;
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: i */
    public quh<K> mo11218i() {
        return wg8.unmodifiableIterator(this.f37941f.keySet().iterator());
    }

    @Override // p000.ox7.AbstractC10703b
    /* JADX INFO: renamed from: j */
    public quh<Map.Entry<K, V>> mo2958j() {
        return tt9.m22774D(this.f37941f.entrySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f37941f.size();
    }

    @Override // p000.ox7
    @yg8
    public Object writeReplace() {
        return new C6026b(this.f37941f);
    }

    private fx7(EnumMap<K, V> delegate) {
        this.f37941f = delegate;
        v7d.checkArgument(!delegate.isEmpty());
    }
}
