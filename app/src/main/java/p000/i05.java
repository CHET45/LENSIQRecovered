package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i05 implements Map, Serializable, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final i05 f45362a = new i05();
    private static final long serialVersionUID = 8246714829545688274L;

    private i05() {
    }

    private final Object readResolve() {
        return f45362a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@gib Object obj) {
        return false;
    }

    public boolean containsValue(@yfb Void r2) {
        md8.checkNotNullParameter(r2, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@gib Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @yfb
    public Set<Map.Entry> getEntries() {
        return u05.f86463a;
    }

    @yfb
    public Set<Object> getKeys() {
        return u05.f86463a;
    }

    public int getSize() {
        return 0;
    }

    @yfb
    public Collection getValues() {
        return h05.f41922a;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @yfb
    public String toString() {
        return isa.f48126c;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return containsValue((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    @gib
    public Void get(@gib Object obj) {
        return null;
    }

    public Void put(Object obj, Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
