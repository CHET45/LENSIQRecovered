package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.v98;

/* JADX INFO: loaded from: classes3.dex */
public final class ts9<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final ts9<?, ?> f85706b;

    /* JADX INFO: renamed from: a */
    public boolean f85707a;

    static {
        ts9<?, ?> ts9Var = new ts9<>();
        f85706b = ts9Var;
        ts9Var.makeImmutable();
    }

    private ts9() {
        this.f85707a = true;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m22761a(Map<K, V> a) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : a.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static <K, V> Map<K, V> m22762b(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> boolean m22763c(Map<K, V> a, Map<K, V> b) {
        if (a == b) {
            return true;
        }
        if (a.size() != b.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a.entrySet()) {
            if (!b.containsKey(entry.getKey()) || !equals(entry.getValue(), b.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static int calculateHashCodeForObject(Object a) {
        if (a instanceof byte[]) {
            return v98.hashCode((byte[]) a);
        }
        if (a instanceof v98.InterfaceC13947c) {
            throw new UnsupportedOperationException();
        }
        return a.hashCode();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> m) {
        for (Object obj : m.keySet()) {
            v98.m23881a(obj);
            v98.m23881a(m.get(obj));
        }
    }

    private static Object copy(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> ts9<K, V> emptyMapField() {
        return (ts9<K, V>) f85706b;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean equals(Object a, Object b) {
        return ((a instanceof byte[]) && (b instanceof byte[])) ? Arrays.equals((byte[]) a, (byte[]) b) : a.equals(b);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m22761a(this);
    }

    public boolean isMutable() {
        return this.f85707a;
    }

    public void makeImmutable() {
        this.f85707a = false;
    }

    public void mergeFrom(ts9<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    public ts9<K, V> mutableCopy() {
        return isEmpty() ? new ts9<>() : new ts9<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ensureMutable();
        v98.m23881a(k);
        v98.m23881a(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m) {
        ensureMutable();
        checkForNullKeysAndValues(m);
        super.putAll(m);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private ts9(Map<K, V> mapData) {
        super(mapData);
        this.f85707a = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && m22763c(this, (Map) object);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
