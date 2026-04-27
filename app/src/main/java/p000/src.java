package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.qrc;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class src<K, V> extends AbstractC6093g3<K, V> implements qrc.InterfaceC11636a<K, V> {

    /* JADX INFO: renamed from: e */
    public static final int f82712e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public rrc<K, V> f82713a;

    /* JADX INFO: renamed from: b */
    @gib
    public Object f82714b;

    /* JADX INFO: renamed from: c */
    @gib
    public Object f82715c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final wqc<K, x79<V>> f82716d;

    public src(@yfb rrc<K, V> rrcVar) {
        this.f82713a = rrcVar;
        this.f82714b = rrcVar.getFirstKey$runtime_release();
        this.f82715c = this.f82713a.getLastKey$runtime_release();
        this.f82716d = this.f82713a.getHashMap$runtime_release().builder();
    }

    @Override // p000.qrc.InterfaceC11636a, p000.qqc.InterfaceC11587a
    @yfb
    public qrc<K, V> build() {
        rrc<K, V> rrcVar;
        uqc<K, x79<V>> uqcVarBuild = this.f82716d.build();
        if (uqcVarBuild == this.f82713a.getHashMap$runtime_release()) {
            ec2.m28824assert(this.f82714b == this.f82713a.getFirstKey$runtime_release());
            ec2.m28824assert(this.f82715c == this.f82713a.getLastKey$runtime_release());
            rrcVar = this.f82713a;
        } else {
            rrcVar = new rrc<>(this.f82714b, this.f82715c, uqcVarBuild);
        }
        this.f82713a = rrcVar;
        return rrcVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f82716d.clear();
        b25 b25Var = b25.f12448a;
        this.f82714b = b25Var;
        this.f82715c = b25Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f82716d.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V get(Object obj) {
        x79<V> x79Var = this.f82716d.get(obj);
        if (x79Var != null) {
            return x79Var.getValue();
        }
        return null;
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<Map.Entry<K, V>> getEntries() {
        return new trc(this);
    }

    @gib
    public final Object getFirstKey$runtime_release() {
        return this.f82714b;
    }

    @yfb
    public final wqc<K, x79<V>> getHashMapBuilder$runtime_release() {
        return this.f82716d;
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Set<K> getKeys() {
        return new vrc(this);
    }

    @Override // p000.AbstractC6093g3
    public int getSize() {
        return this.f82716d.size();
    }

    @Override // p000.AbstractC6093g3
    @yfb
    public Collection<V> getValues() {
        return new yrc(this);
    }

    @Override // p000.AbstractC6093g3, java.util.AbstractMap, java.util.Map
    @gib
    public V put(K k, V v) {
        x79<V> x79Var = this.f82716d.get(k);
        if (x79Var != null) {
            if (x79Var.getValue() == v) {
                return v;
            }
            this.f82716d.put(k, x79Var.withValue(v));
            return x79Var.getValue();
        }
        if (isEmpty()) {
            this.f82714b = k;
            this.f82715c = k;
            this.f82716d.put(k, new x79<>(v));
            return null;
        }
        Object obj = this.f82715c;
        x79<V> x79Var2 = this.f82716d.get((K) obj);
        md8.checkNotNull(x79Var2);
        ec2.m28824assert(!r2.getHasNext());
        this.f82716d.put((K) obj, x79Var2.withNext(k));
        this.f82716d.put(k, new x79<>(v, obj));
        this.f82715c = k;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @gib
    public V remove(Object obj) {
        x79<V> x79VarRemove = this.f82716d.remove(obj);
        if (x79VarRemove == null) {
            return null;
        }
        if (x79VarRemove.getHasPrevious()) {
            x79<V> x79Var = this.f82716d.get(x79VarRemove.getPrevious());
            md8.checkNotNull(x79Var);
            this.f82716d.put((K) x79VarRemove.getPrevious(), x79Var.withNext(x79VarRemove.getNext()));
        } else {
            this.f82714b = x79VarRemove.getNext();
        }
        if (x79VarRemove.getHasNext()) {
            x79<V> x79Var2 = this.f82716d.get(x79VarRemove.getNext());
            md8.checkNotNull(x79Var2);
            this.f82716d.put((K) x79VarRemove.getNext(), x79Var2.withPrevious(x79VarRemove.getPrevious()));
        } else {
            this.f82715c = x79VarRemove.getPrevious();
        }
        return x79VarRemove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        x79<V> x79Var = this.f82716d.get(obj);
        if (x79Var == null || !md8.areEqual(x79Var.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
