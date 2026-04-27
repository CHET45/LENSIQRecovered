package p000;

import java.util.Map;
import p000.ap8;

/* JADX INFO: loaded from: classes.dex */
public final class y5b<K, V> extends ls9<K, V> implements Map.Entry<K, V>, ap8.InterfaceC1546a {

    /* JADX INFO: renamed from: d */
    @yfb
    public final Map<K, x79<V>> f100424d;

    /* JADX INFO: renamed from: e */
    @yfb
    public x79<V> f100425e;

    public y5b(@yfb Map<K, x79<V>> map, K k, @yfb x79<V> x79Var) {
        super(k, x79Var.getValue());
        this.f100424d = map;
        this.f100425e = x79Var;
    }

    @Override // p000.ls9, java.util.Map.Entry
    public V getValue() {
        return this.f100425e.getValue();
    }

    @Override // p000.ls9, java.util.Map.Entry
    public V setValue(V v) {
        V value = this.f100425e.getValue();
        this.f100425e = this.f100425e.withValue(v);
        this.f100424d.put(getKey(), this.f100425e);
        return value;
    }
}
