package p000;

import java.util.HashMap;
import java.util.Map;
import p000.p7e;
import p000.rke;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class op5<K, V> extends rke<K, V> {

    /* JADX INFO: renamed from: e */
    public final HashMap<K, rke.C12135c<K, V>> f68246e = new HashMap<>();

    @Override // p000.rke
    @hib
    /* JADX INFO: renamed from: a */
    public rke.C12135c<K, V> mo18803a(K k) {
        return this.f68246e.get(k);
    }

    @hib
    public Map.Entry<K, V> ceil(K k) {
        if (contains(k)) {
            return this.f68246e.get(k).f78581d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f68246e.containsKey(k);
    }

    @Override // p000.rke
    public V putIfAbsent(@efb K k, @efb V v) {
        rke.C12135c<K, V> c12135cMo18803a = mo18803a(k);
        if (c12135cMo18803a != null) {
            return c12135cMo18803a.f78579b;
        }
        this.f68246e.put(k, m21410b(k, v));
        return null;
    }

    @Override // p000.rke
    public V remove(@efb K k) {
        V v = (V) super.remove(k);
        this.f68246e.remove(k);
        return v;
    }
}
