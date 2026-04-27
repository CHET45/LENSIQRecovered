package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p000.prc;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
@e0g(parameters = 2)
public abstract class AbstractC11854r3<E> extends AbstractC7110i2<E> implements prc<E> {

    /* JADX INFO: renamed from: a */
    public static final int f76914a = 0;

    /* JADX INFO: renamed from: r3$a */
    public static final class a extends tt8 implements qy6<E, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection<E> f76915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f76915a = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(E e) {
            return Boolean.valueOf(this.f76915a.contains(e));
        }
    }

    /* JADX INFO: renamed from: r3$b */
    public static final class b extends tt8 implements qy6<E, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection<E> f76916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends E> collection) {
            super(1);
            this.f76916a = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(E e) {
            return Boolean.valueOf(!this.f76916a.contains(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC10126o0, java.util.Collection, java.util.Set
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> addAll(@yfb Collection<? extends E> collection) {
        prc.InterfaceC11080a<E> interfaceC11080aBuilder = builder();
        interfaceC11080aBuilder.addAll(collection);
        return interfaceC11080aBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> clear() {
        return j1i.persistentVectorOf();
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> remove(E e) {
        int iIndexOf = indexOf(e);
        return iIndexOf != -1 ? removeAt(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> removeAll(@yfb Collection<? extends E> collection) {
        return removeAll((qy6) new a(collection));
    }

    @Override // java.util.Collection, java.util.List, p000.oqc, p000.lsc
    @yfb
    public prc<E> retainAll(@yfb Collection<? extends E> collection) {
        return removeAll((qy6) new b(collection));
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public jx7<E> subList(int i, int i2) {
        return super.subList(i, i2);
    }

    @Override // java.util.List, p000.prc
    @yfb
    public prc<E> addAll(int i, @yfb Collection<? extends E> collection) {
        prc.InterfaceC11080a<E> interfaceC11080aBuilder = builder();
        interfaceC11080aBuilder.addAll(i, collection);
        return interfaceC11080aBuilder.build();
    }
}
