package p000;

import java.util.Collection;
import java.util.Iterator;
import p000.lsc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
@e0g(parameters = 0)
public final class lrc<E> extends AbstractC7141i4<E> implements lsc<E> {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C8947a f58544d = new C8947a(null);

    /* JADX INFO: renamed from: e */
    public static final int f58545e = 8;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final lrc f58546f = new lrc(oih.f67755d.getEMPTY$runtime_release(), 0);

    /* JADX INFO: renamed from: b */
    @yfb
    public final oih<E> f58547b;

    /* JADX INFO: renamed from: c */
    public final int f58548c;

    /* JADX INFO: renamed from: lrc$a */
    public static final class C8947a {
        public /* synthetic */ C8947a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final <E> lsc<E> emptyOf$runtime_release() {
            return lrc.f58546f;
        }

        private C8947a() {
        }
    }

    public lrc(@yfb oih<E> oihVar, int i) {
        this.f58547b = oihVar;
        this.f58548c = i;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f58547b.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.Set
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return collection instanceof lrc ? this.f58547b.containsAll(((lrc) collection).f58547b, 0) : collection instanceof mrc ? this.f58547b.containsAll(((mrc) collection).getNode$runtime_release(), 0) : super.containsAll(collection);
    }

    @yfb
    public final oih<E> getNode$runtime_release() {
        return this.f58547b;
    }

    @Override // p000.AbstractC10126o0
    public int getSize() {
        return this.f58548c;
    }

    @Override // p000.AbstractC7141i4, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return new nrc(this.f58547b);
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> add(E e) {
        oih<E> oihVarAdd = this.f58547b.add(e != null ? e.hashCode() : 0, e, 0);
        return this.f58547b == oihVarAdd ? this : new lrc(oihVarAdd, size() + 1);
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
        return new mrc(this);
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> clear() {
        return f58544d.emptyOf$runtime_release();
    }

    @Override // java.util.Collection, java.util.Set, p000.oqc, p000.lsc
    @yfb
    public lsc<E> remove(E e) {
        oih<E> oihVarRemove = this.f58547b.remove(e != null ? e.hashCode() : 0, e, 0);
        return this.f58547b == oihVarRemove ? this : new lrc(oihVarRemove, size() - 1);
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
