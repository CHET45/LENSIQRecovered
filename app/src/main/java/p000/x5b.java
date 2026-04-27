package p000;

import java.util.Map;
import p000.ap8;

/* JADX INFO: loaded from: classes.dex */
public final class x5b<K, V> extends ls9<K, V> implements Map.Entry<K, V>, ap8.InterfaceC1546a {

    /* JADX INFO: renamed from: d */
    @yfb
    public final zqc<K, V> f96831d;

    /* JADX INFO: renamed from: e */
    public V f96832e;

    public x5b(@yfb zqc<K, V> zqcVar, K k, V v) {
        super(k, v);
        this.f96831d = zqcVar;
        this.f96832e = v;
    }

    @Override // p000.ls9, java.util.Map.Entry
    public V getValue() {
        return this.f96832e;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v) {
        this.f96832e = v;
    }

    @Override // p000.ls9, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        setValue((Object) v);
        this.f96831d.setValue(getKey(), v);
        return value;
    }
}
