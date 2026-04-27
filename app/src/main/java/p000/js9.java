package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use Maps.difference")
@gd7
@tx4
public interface js9<K, V> {

    /* JADX INFO: renamed from: js9$a */
    @jh4("Use Maps.difference")
    public interface InterfaceC8052a<V> {
        boolean equals(@wx1 Object other);

        int hashCode();

        @dgc
        V leftValue();

        @dgc
        V rightValue();
    }

    boolean areEqual();

    Map<K, InterfaceC8052a<V>> entriesDiffering();

    Map<K, V> entriesInCommon();

    Map<K, V> entriesOnlyOnLeft();

    Map<K, V> entriesOnlyOnRight();

    boolean equals(@wx1 Object object);

    int hashCode();
}
