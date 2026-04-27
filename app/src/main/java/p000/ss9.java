package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public final class ss9<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final ss9<?, ?> f82748b;

    /* JADX INFO: renamed from: a */
    public boolean f82749a;

    static {
        ss9<?, ?> ss9Var = new ss9<>();
        f82748b = ss9Var;
        ss9Var.makeImmutable();
    }

    private ss9() {
        this.f82749a = true;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m22210a(Map<K, V> a) {
        int iCalculateHashCodeForObject = 0;
        for (Map.Entry<K, V> entry : a.entrySet()) {
            iCalculateHashCodeForObject += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return iCalculateHashCodeForObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static <K, V> Map<K, V> m22211b(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> boolean m22212c(Map<K, V> a, Map<K, V> b) {
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
            return w98.hashCode((byte[]) a);
        }
        if (a instanceof w98.InterfaceC14497d) {
            throw new UnsupportedOperationException();
        }
        return a.hashCode();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> m) {
        for (Object obj : m.keySet()) {
            w98.m24432a(obj);
            w98.m24432a(m.get(obj));
        }
    }

    private static Object copy(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> ss9<K, V> emptyMapField() {
        return (ss9<K, V>) f82748b;
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
        return m22210a(this);
    }

    public boolean isMutable() {
        return this.f82749a;
    }

    public void makeImmutable() {
        this.f82749a = false;
    }

    public void mergeFrom(ss9<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    public ss9<K, V> mutableCopy() {
        return isEmpty() ? new ss9<>() : new ss9<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        ensureMutable();
        w98.m24432a(k);
        w98.m24432a(v);
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

    private ss9(Map<K, V> mapData) {
        super(mapData);
        this.f82749a = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && m22212c(this, (Map) object);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
