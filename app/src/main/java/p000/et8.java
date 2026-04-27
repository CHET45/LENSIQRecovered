package p000;

import java.util.Comparator;
import p000.ft8;

/* JADX INFO: loaded from: classes5.dex */
public class et8<K, V> implements ft8<K, V> {

    /* JADX INFO: renamed from: a */
    public static final et8 f34006a = new et8();

    private et8() {
    }

    public static <K, V> et8<K, V> getInstance() {
        return f34006a;
    }

    @Override // p000.ft8
    public ft8<K, V> copy(K k, V v, ft8.EnumC5959a enumC5959a, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        return this;
    }

    @Override // p000.ft8
    public K getKey() {
        return null;
    }

    @Override // p000.ft8
    public ft8<K, V> getLeft() {
        return this;
    }

    @Override // p000.ft8
    public ft8<K, V> getMax() {
        return this;
    }

    @Override // p000.ft8
    public ft8<K, V> getMin() {
        return this;
    }

    @Override // p000.ft8
    public ft8<K, V> getRight() {
        return this;
    }

    @Override // p000.ft8
    public V getValue() {
        return null;
    }

    @Override // p000.ft8
    public void inOrderTraversal(ft8.AbstractC5960b<K, V> abstractC5960b) {
    }

    @Override // p000.ft8
    public ft8<K, V> insert(K k, V v, Comparator<K> comparator) {
        return new gt8(k, v);
    }

    @Override // p000.ft8
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.ft8
    public boolean isRed() {
        return false;
    }

    @Override // p000.ft8
    public ft8<K, V> remove(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // p000.ft8
    public boolean shortCircuitingInOrderTraversal(ft8.InterfaceC5961c<K, V> interfaceC5961c) {
        return true;
    }

    @Override // p000.ft8
    public boolean shortCircuitingReverseOrderTraversal(ft8.InterfaceC5961c<K, V> interfaceC5961c) {
        return true;
    }

    @Override // p000.ft8
    public int size() {
        return 0;
    }
}
