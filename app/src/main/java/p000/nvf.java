package p000;

import java.util.SortedMap;
import p000.js9;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface nvf<K, V> extends js9<K, V> {
    @Override // p000.js9
    SortedMap<K, js9.InterfaceC8052a<V>> entriesDiffering();

    @Override // p000.js9
    SortedMap<K, V> entriesInCommon();

    @Override // p000.js9
    SortedMap<K, V> entriesOnlyOnLeft();

    @Override // p000.js9
    SortedMap<K, V> entriesOnlyOnRight();
}
