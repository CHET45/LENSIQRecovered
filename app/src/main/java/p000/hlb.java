package p000;

import java.util.Collection;
import java.util.Iterator;
import p000.frb;

/* JADX INFO: loaded from: classes3.dex */
public class hlb<K, V> extends x60<K, V> implements frb<K, V> {

    /* JADX INFO: renamed from: m */
    public transient hs9 f44077m;

    private void notifyChange(Object obj) {
        hs9 hs9Var = this.f44077m;
        if (hs9Var != null) {
            hs9Var.notifyCallbacks(this, 0, obj);
        }
    }

    @Override // p000.frb
    public void addOnMapChangedCallback(frb.AbstractC5941a<? extends frb<K, V>, K, V> abstractC5941a) {
        if (this.f44077m == null) {
            this.f44077m = new hs9();
        }
        this.f44077m.add(abstractC5941a);
    }

    @Override // p000.scf, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        notifyChange(null);
    }

    @Override // p000.scf, java.util.Map
    public V put(K k, V v) {
        super.put(k, v);
        notifyChange(k);
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.x60
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int iIndexOfKey = indexOfKey(it.next());
            if (iIndexOfKey >= 0) {
                removeAt(iIndexOfKey);
                z = true;
            }
        }
        return z;
    }

    @Override // p000.scf
    public V removeAt(int i) {
        K kKeyAt = keyAt(i);
        V v = (V) super.removeAt(i);
        if (v != null) {
            notifyChange(kKeyAt);
        }
        return v;
    }

    @Override // p000.frb
    public void removeOnMapChangedCallback(frb.AbstractC5941a<? extends frb<K, V>, K, V> abstractC5941a) {
        hs9 hs9Var = this.f44077m;
        if (hs9Var != null) {
            hs9Var.remove(abstractC5941a);
        }
    }

    @Override // p000.x60
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z = true;
            }
        }
        return z;
    }

    @Override // p000.scf
    public V setValueAt(int i, V v) {
        K kKeyAt = keyAt(i);
        V v2 = (V) super.setValueAt(i, v);
        notifyChange(kKeyAt);
        return v2;
    }
}
