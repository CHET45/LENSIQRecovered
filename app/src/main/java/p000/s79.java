package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class s79<E> extends AbstractC12401s2<E> {
    public s79(int distinctElements) {
        super(distinctElements);
    }

    public static <E> s79<E> create() {
        return create(3);
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
    public /* bridge */ /* synthetic */ boolean contains(@wx1 Object element) {
        return super.contains(element);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // p000.AbstractC12401s2
    /* JADX INFO: renamed from: f */
    public qjb<E> mo21653f(int distinctElements) {
        return new rjb(distinctElements);
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> s79<E> create(int distinctElements) {
        return new s79<>(distinctElements);
    }

    public static <E> s79<E> create(Iterable<? extends E> elements) {
        s79<E> s79VarCreate = create(e4b.m9661e(elements));
        vg8.addAll(s79VarCreate, elements);
        return s79VarCreate;
    }
}
