package p000;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface ice<R, C, V> extends kkg<R, C, V> {
    @Override // p000.kkg
    SortedSet<R> rowKeySet();

    @Override // p000.kkg
    SortedMap<R, Map<C, V>> rowMap();
}
