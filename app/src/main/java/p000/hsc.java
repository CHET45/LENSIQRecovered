package p000;

import java.util.Collection;
import java.util.Iterator;
import p000.lsc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
@e0g(parameters = 0)
public final class hsc<E> extends AbstractC7141i4<E> implements lsc<E> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C6995a f44728e = new C6995a(null);

    /* JADX INFO: renamed from: f */
    public static final int f44729f = 8;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final hsc f44730m;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f44731b;

    /* JADX INFO: renamed from: c */
    @gib
    public final Object f44732c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final uqc<E, a89> f44733d;

    /* JADX INFO: renamed from: hsc$a */
    public static final class C6995a {
        public /* synthetic */ C6995a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final <E> lsc<E> emptyOf$runtime_release() {
            return hsc.f44730m;
        }

        private C6995a() {
        }
    }

    static {
        b25 b25Var = b25.f12448a;
        f44730m = new hsc(b25Var, b25Var, uqc.f88809f.emptyOf$runtime_release());
    }

    public hsc(@gib Object obj, @gib Object obj2, @yfb uqc<E, a89> uqcVar) {
        this.f44731b = obj;
        this.f44732c = obj2;
        this.f44733d = uqcVar;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44733d.containsKey(obj);
    }

    @gib
    public final Object getFirstElement$runtime_release() {
        return this.f44731b;
    }

    @yfb
    public final uqc<E, a89> getHashMap$runtime_release() {
        return this.f44733d;
    }

    @gib
    public final Object getLastElement$runtime_release() {
        return this.f44732c;
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f44733d.size();
    }

    @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new jsc(this.f44731b, this.f44733d);
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> add(E e) {
        if (this.f44733d.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new hsc(e, e, this.f44733d.put(e, new a89()));
        }
        Object obj = this.f44732c;
        a89 a89Var = this.f44733d.get((E) obj);
        md8.checkNotNull(a89Var);
        return new hsc(this.f44731b, e, this.f44733d.put((E) obj, a89Var.withNext(e)).put(e, new a89(obj)));
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> addAll(@yfb Collection<? extends E> collection) {
        lsc.InterfaceC8954a<E> interfaceC8954aBuilder = builder();
        interfaceC8954aBuilder.addAll(collection);
        return interfaceC8954aBuilder.build();
    }

    @Override // p000.oqc
    @yfb
    public lsc.InterfaceC8954a<E> builder() {
        return new isc(this);
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> clear() {
        return f44728e.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> remove(E e) {
        a89 a89Var = this.f44733d.get(e);
        if (a89Var == null) {
            return this;
        }
        uqc uqcVarRemove = this.f44733d.remove(e);
        if (a89Var.getHasPrevious()) {
            V v = uqcVarRemove.get(a89Var.getPrevious());
            md8.checkNotNull(v);
            uqcVarRemove = uqcVarRemove.put(a89Var.getPrevious(), ((a89) v).withNext(a89Var.getNext()));
        }
        if (a89Var.getHasNext()) {
            V v2 = uqcVarRemove.get(a89Var.getNext());
            md8.checkNotNull(v2);
            uqcVarRemove = uqcVarRemove.put(a89Var.getNext(), ((a89) v2).withPrevious(a89Var.getPrevious()));
        }
        return new hsc(!a89Var.getHasPrevious() ? a89Var.getNext() : this.f44731b, !a89Var.getHasNext() ? a89Var.getPrevious() : this.f44732c, uqcVarRemove);
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> retainAll(@yfb Collection<? extends E> collection) {
        lsc.InterfaceC8954a<E> interfaceC8954aBuilder = builder();
        interfaceC8954aBuilder.retainAll(collection);
        return interfaceC8954aBuilder.build();
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> removeAll(@yfb Collection<? extends E> collection) {
        lsc.InterfaceC8954a<E> interfaceC8954aBuilder = builder();
        interfaceC8954aBuilder.removeAll(collection);
        return interfaceC8954aBuilder.build();
    }

    @Override // p000.oqc
    @yfb
    public lsc<E> removeAll(@yfb qy6<? super E, Boolean> qy6Var) {
        lsc.InterfaceC8954a<E> interfaceC8954aBuilder = builder();
        q82.removeAll(interfaceC8954aBuilder, qy6Var);
        return interfaceC8954aBuilder.build();
    }
}
