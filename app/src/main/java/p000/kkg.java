package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableTable, HashBasedTable, or another implementation")
@gd7
@tx4
public interface kkg<R, C, V> {

    /* JADX INFO: renamed from: kkg$a */
    public interface InterfaceC8439a<R, C, V> {
        boolean equals(@wx1 Object obj);

        @dgc
        C getColumnKey();

        @dgc
        R getRowKey();

        @dgc
        V getValue();

        int hashCode();
    }

    Set<InterfaceC8439a<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@dgc C columnKey);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(@wx1 @rd2("R") Object rowKey, @wx1 @rd2("C") Object columnKey);

    boolean containsColumn(@wx1 @rd2("C") Object columnKey);

    boolean containsRow(@wx1 @rd2("R") Object rowKey);

    boolean containsValue(@wx1 @rd2(k95.f53074X4) Object value);

    boolean equals(@wx1 Object obj);

    @wx1
    V get(@wx1 @rd2("R") Object rowKey, @wx1 @rd2("C") Object columnKey);

    int hashCode();

    boolean isEmpty();

    @op1
    @wx1
    V put(@dgc R rowKey, @dgc C columnKey, @dgc V value);

    void putAll(kkg<? extends R, ? extends C, ? extends V> table);

    @op1
    @wx1
    V remove(@wx1 @rd2("R") Object rowKey, @wx1 @rd2("C") Object columnKey);

    Map<C, V> row(@dgc R rowKey);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
