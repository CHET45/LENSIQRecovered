package p000;

import p000.ft8;

/* JADX INFO: loaded from: classes5.dex */
public class dt8<K, V> extends ht8<K, V> {

    /* JADX INFO: renamed from: e */
    public int f30841e;

    public dt8(K k, V v, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        super(k, v, ft8Var, ft8Var2);
        this.f30841e = -1;
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
        return new dt8(k, v, ft8Var, ft8Var2);
    }

    @Override // p000.ht8
    /* JADX INFO: renamed from: b */
    public ft8.EnumC5959a mo9356b() {
        return ft8.EnumC5959a.BLACK;
    }

    @Override // p000.ht8
    /* JADX INFO: renamed from: c */
    public void mo9357c(ft8<K, V> ft8Var) {
        if (this.f30841e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.mo9357c(ft8Var);
    }

    @Override // p000.ft8
    public boolean isRed() {
        return false;
    }

    @Override // p000.ft8
    public int size() {
        if (this.f30841e == -1) {
            this.f30841e = getLeft().size() + 1 + getRight().size();
        }
        return this.f30841e;
    }
}
