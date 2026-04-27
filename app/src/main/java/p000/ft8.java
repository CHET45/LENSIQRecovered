package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public interface ft8<K, V> {

    /* JADX INFO: renamed from: ft8$a */
    public enum EnumC5959a {
        RED,
        BLACK
    }

    /* JADX INFO: renamed from: ft8$b */
    public static abstract class AbstractC5960b<K, V> implements InterfaceC5961c<K, V> {
        @Override // p000.ft8.InterfaceC5961c
        public boolean shouldContinue(K k, V v) {
            visitEntry(k, v);
            return true;
        }

        public abstract void visitEntry(K k, V v);
    }

    /* JADX INFO: renamed from: ft8$c */
    public interface InterfaceC5961c<K, V> {
        boolean shouldContinue(K k, V v);
    }

    ft8<K, V> copy(K k, V v, EnumC5959a enumC5959a, ft8<K, V> ft8Var, ft8<K, V> ft8Var2);

    K getKey();

    ft8<K, V> getLeft();

    ft8<K, V> getMax();

    ft8<K, V> getMin();

    ft8<K, V> getRight();

    V getValue();

    void inOrderTraversal(AbstractC5960b<K, V> abstractC5960b);

    ft8<K, V> insert(K k, V v, Comparator<K> comparator);

    boolean isEmpty();

    boolean isRed();

    ft8<K, V> remove(K k, Comparator<K> comparator);

    boolean shortCircuitingInOrderTraversal(InterfaceC5961c<K, V> interfaceC5961c);

    boolean shortCircuitingReverseOrderTraversal(InterfaceC5961c<K, V> interfaceC5961c);

    int size();
}
