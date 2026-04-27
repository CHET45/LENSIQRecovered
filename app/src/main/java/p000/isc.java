package p000;

import java.util.Iterator;
import p000.lsc;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class isc<E> extends AbstractC6688h3<E> implements lsc.InterfaceC8954a<E> {

    /* JADX INFO: renamed from: e */
    public static final int f48137e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public hsc<E> f48138a;

    /* JADX INFO: renamed from: b */
    @gib
    public Object f48139b;

    /* JADX INFO: renamed from: c */
    @gib
    public Object f48140c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final wqc<E, a89> f48141d;

    public isc(@yfb hsc<E> hscVar) {
        this.f48138a = hscVar;
        this.f48139b = hscVar.getFirstElement$runtime_release();
        this.f48140c = this.f48138a.getLastElement$runtime_release();
        this.f48141d = this.f48138a.getHashMap$runtime_release().builder();
    }

    @Override // p000.AbstractC6688h3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.f48141d.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.f48139b = e;
            this.f48140c = e;
            this.f48141d.put(e, new a89());
            return true;
        }
        a89 a89Var = this.f48141d.get(this.f48140c);
        md8.checkNotNull(a89Var);
        this.f48141d.put((E) this.f48140c, a89Var.withNext(e));
        this.f48141d.put(e, new a89(this.f48140c));
        this.f48140c = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f48141d.clear();
        b25 b25Var = b25.f12448a;
        this.f48139b = b25Var;
        this.f48140c = b25Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f48141d.containsKey(obj);
    }

    @gib
    public final Object getFirstElement$runtime_release() {
        return this.f48139b;
    }

    @yfb
    public final wqc<E, a89> getHashMapBuilder$runtime_release() {
        return this.f48141d;
    }

    @Override // p000.AbstractC6688h3
    public int getSize() {
        return this.f48141d.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new ksc(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        a89 a89VarRemove = this.f48141d.remove(obj);
        if (a89VarRemove == null) {
            return false;
        }
        if (a89VarRemove.getHasPrevious()) {
            a89 a89Var = this.f48141d.get(a89VarRemove.getPrevious());
            md8.checkNotNull(a89Var);
            this.f48141d.put((E) a89VarRemove.getPrevious(), a89Var.withNext(a89VarRemove.getNext()));
        } else {
            this.f48139b = a89VarRemove.getNext();
        }
        if (!a89VarRemove.getHasNext()) {
            this.f48140c = a89VarRemove.getPrevious();
            return true;
        }
        a89 a89Var2 = this.f48141d.get(a89VarRemove.getNext());
        md8.checkNotNull(a89Var2);
        this.f48141d.put((E) a89VarRemove.getNext(), a89Var2.withPrevious(a89VarRemove.getPrevious()));
        return true;
    }

    public final void setFirstElement$runtime_release(@gib Object obj) {
        this.f48139b = obj;
    }

    @Override // p000.oqc.InterfaceC10501a
    @yfb
    public lsc<E> build() {
        hsc<E> hscVar;
        uqc<E, a89> uqcVarBuild = this.f48141d.build();
        if (uqcVarBuild == this.f48138a.getHashMap$runtime_release()) {
            ec2.m28824assert(this.f48139b == this.f48138a.getFirstElement$runtime_release());
            ec2.m28824assert(this.f48140c == this.f48138a.getLastElement$runtime_release());
            hscVar = this.f48138a;
        } else {
            hscVar = new hsc<>(this.f48139b, this.f48140c, uqcVarBuild);
        }
        this.f48138a = hscVar;
        return hscVar;
    }
}
