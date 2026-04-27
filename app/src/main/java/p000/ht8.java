package p000;

import java.util.Comparator;
import p000.ft8;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ht8<K, V> implements ft8<K, V> {

    /* JADX INFO: renamed from: a */
    public final K f44820a;

    /* JADX INFO: renamed from: b */
    public final V f44821b;

    /* JADX INFO: renamed from: c */
    public ft8<K, V> f44822c;

    /* JADX INFO: renamed from: d */
    public final ft8<K, V> f44823d;

    public ht8(K k, V v, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        this.f44820a = k;
        this.f44821b = v;
        this.f44822c = ft8Var == null ? et8.getInstance() : ft8Var;
        this.f44823d = ft8Var2 == null ? et8.getInstance() : ft8Var2;
    }

    private ht8<K, V> colorFlip() {
        ft8<K, V> ft8Var = this.f44822c;
        ft8<K, V> ft8VarCopy = ft8Var.copy(null, null, oppositeColor(ft8Var), null, null);
        ft8<K, V> ft8Var2 = this.f44823d;
        return copy((Object) null, (Object) null, oppositeColor(this), (ft8) ft8VarCopy, (ft8) ft8Var2.copy(null, null, oppositeColor(ft8Var2), null, null));
    }

    private ht8<K, V> fixUp() {
        ht8<K, V> ht8VarRotateLeft = (!this.f44823d.isRed() || this.f44822c.isRed()) ? this : rotateLeft();
        if (ht8VarRotateLeft.f44822c.isRed() && ((ht8) ht8VarRotateLeft.f44822c).f44822c.isRed()) {
            ht8VarRotateLeft = ht8VarRotateLeft.rotateRight();
        }
        return (ht8VarRotateLeft.f44822c.isRed() && ht8VarRotateLeft.f44823d.isRed()) ? ht8VarRotateLeft.colorFlip() : ht8VarRotateLeft;
    }

    private ht8<K, V> moveRedLeft() {
        ht8<K, V> ht8VarColorFlip = colorFlip();
        return ht8VarColorFlip.getRight().getLeft().isRed() ? ht8VarColorFlip.mo9355a(null, null, null, ((ht8) ht8VarColorFlip.getRight()).rotateRight()).rotateLeft().colorFlip() : ht8VarColorFlip;
    }

    private ht8<K, V> moveRedRight() {
        ht8<K, V> ht8VarColorFlip = colorFlip();
        return ht8VarColorFlip.getLeft().getLeft().isRed() ? ht8VarColorFlip.rotateRight().colorFlip() : ht8VarColorFlip;
    }

    private static ft8.EnumC5959a oppositeColor(ft8 ft8Var) {
        return ft8Var.isRed() ? ft8.EnumC5959a.BLACK : ft8.EnumC5959a.RED;
    }

    private ft8<K, V> removeMin() {
        if (this.f44822c.isEmpty()) {
            return et8.getInstance();
        }
        ht8<K, V> ht8VarMoveRedLeft = (getLeft().isRed() || getLeft().getLeft().isRed()) ? this : moveRedLeft();
        return ht8VarMoveRedLeft.mo9355a(null, null, ((ht8) ht8VarMoveRedLeft.f44822c).removeMin(), null).fixUp();
    }

    private ht8<K, V> rotateLeft() {
        return (ht8) this.f44823d.copy(null, null, mo9356b(), copy((Object) null, (Object) null, ft8.EnumC5959a.RED, (ft8) null, (ft8) ((ht8) this.f44823d).f44822c), null);
    }

    private ht8<K, V> rotateRight() {
        return (ht8) this.f44822c.copy(null, null, mo9356b(), null, copy((Object) null, (Object) null, ft8.EnumC5959a.RED, (ft8) ((ht8) this.f44822c).f44823d, (ft8) null));
    }

    /* JADX INFO: renamed from: a */
    public abstract ht8<K, V> mo9355a(K k, V v, ft8<K, V> ft8Var, ft8<K, V> ft8Var2);

    /* JADX INFO: renamed from: b */
    public abstract ft8.EnumC5959a mo9356b();

    /* JADX INFO: renamed from: c */
    public void mo9357c(ft8<K, V> ft8Var) {
        this.f44822c = ft8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ft8
    public /* bridge */ /* synthetic */ ft8 copy(Object obj, Object obj2, ft8.EnumC5959a enumC5959a, ft8 ft8Var, ft8 ft8Var2) {
        return copy(obj, obj2, enumC5959a, (ft8<Object, Object>) ft8Var, (ft8<Object, Object>) ft8Var2);
    }

    @Override // p000.ft8
    public K getKey() {
        return this.f44820a;
    }

    @Override // p000.ft8
    public ft8<K, V> getLeft() {
        return this.f44822c;
    }

    @Override // p000.ft8
    public ft8<K, V> getMax() {
        return this.f44823d.isEmpty() ? this : this.f44823d.getMax();
    }

    @Override // p000.ft8
    public ft8<K, V> getMin() {
        return this.f44822c.isEmpty() ? this : this.f44822c.getMin();
    }

    @Override // p000.ft8
    public ft8<K, V> getRight() {
        return this.f44823d;
    }

    @Override // p000.ft8
    public V getValue() {
        return this.f44821b;
    }

    @Override // p000.ft8
    public void inOrderTraversal(ft8.AbstractC5960b<K, V> abstractC5960b) {
        this.f44822c.inOrderTraversal(abstractC5960b);
        abstractC5960b.visitEntry(this.f44820a, this.f44821b);
        this.f44823d.inOrderTraversal(abstractC5960b);
    }

    @Override // p000.ft8
    public ft8<K, V> insert(K k, V v, Comparator<K> comparator) {
        int iCompare = comparator.compare(k, this.f44820a);
        return (iCompare < 0 ? mo9355a(null, null, this.f44822c.insert(k, v, comparator), null) : iCompare == 0 ? mo9355a(k, v, null, null) : mo9355a(null, null, null, this.f44823d.insert(k, v, comparator))).fixUp();
    }

    @Override // p000.ft8
    public boolean isEmpty() {
        return false;
    }

    @Override // p000.ft8
    public ft8<K, V> remove(K k, Comparator<K> comparator) {
        ht8<K, V> ht8VarMo9355a;
        if (comparator.compare(k, this.f44820a) < 0) {
            ht8<K, V> ht8VarMoveRedLeft = (this.f44822c.isEmpty() || this.f44822c.isRed() || ((ht8) this.f44822c).f44822c.isRed()) ? this : moveRedLeft();
            ht8VarMo9355a = ht8VarMoveRedLeft.mo9355a(null, null, ht8VarMoveRedLeft.f44822c.remove(k, comparator), null);
        } else {
            ht8<K, V> ht8VarRotateRight = this.f44822c.isRed() ? rotateRight() : this;
            if (!ht8VarRotateRight.f44823d.isEmpty() && !ht8VarRotateRight.f44823d.isRed() && !((ht8) ht8VarRotateRight.f44823d).f44822c.isRed()) {
                ht8VarRotateRight = ht8VarRotateRight.moveRedRight();
            }
            if (comparator.compare(k, ht8VarRotateRight.f44820a) == 0) {
                if (ht8VarRotateRight.f44823d.isEmpty()) {
                    return et8.getInstance();
                }
                ft8<K, V> min = ht8VarRotateRight.f44823d.getMin();
                ht8VarRotateRight = ht8VarRotateRight.mo9355a(min.getKey(), min.getValue(), null, ((ht8) ht8VarRotateRight.f44823d).removeMin());
            }
            ht8VarMo9355a = ht8VarRotateRight.mo9355a(null, null, null, ht8VarRotateRight.f44823d.remove(k, comparator));
        }
        return ht8VarMo9355a.fixUp();
    }

    @Override // p000.ft8
    public boolean shortCircuitingInOrderTraversal(ft8.InterfaceC5961c<K, V> interfaceC5961c) {
        if (this.f44822c.shortCircuitingInOrderTraversal(interfaceC5961c) && interfaceC5961c.shouldContinue(this.f44820a, this.f44821b)) {
            return this.f44823d.shortCircuitingInOrderTraversal(interfaceC5961c);
        }
        return false;
    }

    @Override // p000.ft8
    public boolean shortCircuitingReverseOrderTraversal(ft8.InterfaceC5961c<K, V> interfaceC5961c) {
        if (this.f44823d.shortCircuitingReverseOrderTraversal(interfaceC5961c) && interfaceC5961c.shouldContinue(this.f44820a, this.f44821b)) {
            return this.f44822c.shortCircuitingReverseOrderTraversal(interfaceC5961c);
        }
        return false;
    }

    @Override // p000.ft8
    public ht8<K, V> copy(K k, V v, ft8.EnumC5959a enumC5959a, ft8<K, V> ft8Var, ft8<K, V> ft8Var2) {
        if (k == null) {
            k = this.f44820a;
        }
        if (v == null) {
            v = this.f44821b;
        }
        if (ft8Var == null) {
            ft8Var = this.f44822c;
        }
        if (ft8Var2 == null) {
            ft8Var2 = this.f44823d;
        }
        return enumC5959a == ft8.EnumC5959a.RED ? new gt8(k, v, ft8Var, ft8Var2) : new dt8(k, v, ft8Var, ft8Var2);
    }
}
