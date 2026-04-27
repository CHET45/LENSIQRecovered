package p000;

import p000.wc8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n1208#2:223\n1187#2,2:224\n523#3:226\n523#3:227\n523#3:228\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n104#1:223\n104#1:224,2\n156#1:226\n158#1:227\n175#1:228\n*E\n"})
@ah5
@e0g(parameters = 0)
public final class n5b<T> implements wc8<T> {

    /* JADX INFO: renamed from: d */
    public static final int f63343d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<wc8.C14548a<T>> f63344a = new f7b<>(new wc8.C14548a[16], 0);

    /* JADX INFO: renamed from: b */
    public int f63345b;

    /* JADX INFO: renamed from: c */
    @gib
    public wc8.C14548a<? extends T> f63346c;

    private final void checkIndexBounds(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
        }
    }

    private final boolean contains(wc8.C14548a<? extends T> c14548a, int i) {
        return i < c14548a.getStartIndex() + c14548a.getSize() && c14548a.getStartIndex() <= i;
    }

    private final wc8.C14548a<T> getIntervalForIndex(int i) {
        wc8.C14548a<? extends T> c14548a = this.f63346c;
        if (c14548a != null && contains(c14548a, i)) {
            return c14548a;
        }
        f7b<wc8.C14548a<T>> f7bVar = this.f63344a;
        wc8.C14548a c14548a2 = (wc8.C14548a<? extends T>) f7bVar.getContent()[xc8.binarySearch(f7bVar, i)];
        this.f63346c = c14548a2;
        return c14548a2;
    }

    public final void addInterval(int i, T t) {
        if (i < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
        }
        if (i == 0) {
            return;
        }
        wc8.C14548a<T> c14548a = new wc8.C14548a<>(getSize(), i, t);
        this.f63345b = getSize() + i;
        this.f63344a.add(c14548a);
    }

    @Override // p000.wc8
    public void forEach(int i, int i2, @yfb qy6<? super wc8.C14548a<? extends T>, bth> qy6Var) {
        checkIndexBounds(i);
        checkIndexBounds(i2);
        if (i2 < i) {
            throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        int iBinarySearch = xc8.binarySearch(this.f63344a, i);
        int startIndex = this.f63344a.getContent()[iBinarySearch].getStartIndex();
        while (startIndex <= i2) {
            wc8.C14548a<T> c14548a = this.f63344a.getContent()[iBinarySearch];
            qy6Var.invoke(c14548a);
            startIndex += c14548a.getSize();
            iBinarySearch++;
        }
    }

    @Override // p000.wc8
    @yfb
    public wc8.C14548a<T> get(int i) {
        checkIndexBounds(i);
        return getIntervalForIndex(i);
    }

    @Override // p000.wc8
    public int getSize() {
        return this.f63345b;
    }
}
