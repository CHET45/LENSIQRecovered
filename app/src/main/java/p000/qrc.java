package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface qrc<K, V> extends px7<K, V> {

    /* JADX INFO: renamed from: qrc$a */
    public interface InterfaceC11636a<K, V> extends Map<K, V>, ap8 {
        @yfb
        qrc<K, V> build();
    }

    @yfb
    InterfaceC11636a<K, V> builder();

    @Override // java.util.Map
    @yfb
    qrc<K, V> clear();

    @Override // java.util.Map
    @yfb
    qrc<K, V> put(K k, V v);

    @Override // java.util.Map
    @yfb
    qrc<K, V> putAll(@yfb Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    @yfb
    qrc<K, V> remove(K k);

    @Override // java.util.Map
    @yfb
    qrc<K, V> remove(K k, V v);
}
