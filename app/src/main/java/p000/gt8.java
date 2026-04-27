package p000;

import p000.ft8;

/* JADX INFO: loaded from: classes5.dex */
public class gt8<K, V> extends ht8<K, V> {
    public gt8(K k, V v) {
        super(k, v, et8.getInstance(), et8.getInstance());
    }

    @Override // p000.ht8
    /* JADX INFO: renamed from: a */
    public ht8<K, V> mo9355a(K k, V v, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        if (k == null) {
            k = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (ft8Var == null) {
            ft8Var = getLeft();
        }
        if (ft8Var2 == null) {
            ft8Var2 = getRight();
        }
        return new gt8(k, v, ft8Var, ft8Var2);
    }

    @Override // p000.ht8
    /* JADX INFO: renamed from: b */
    public ft8.EnumC5959a mo9356b() {
        return ft8.EnumC5959a.RED;
    }

    @Override // p000.ft8
    public boolean isRed() {
        return true;
    }

    @Override // p000.ft8
    public int size() {
        return getLeft().size() + 1 + getRight().size();
    }

    public gt8(K k, V v, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        super(k, v, ft8Var, ft8Var2);
    }
}
