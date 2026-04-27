package p000;

import android.util.SparseArray;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
public final class oxf {

    /* JADX INFO: renamed from: oxf$a */
    public static final class C10712a extends o68 {

        /* JADX INFO: renamed from: a */
        public int f69170a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseArray<T> f69171b;

        public C10712a(SparseArray<T> sparseArray) {
            this.f69171b = sparseArray;
        }

        public final int getIndex() {
            return this.f69170a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69170a < this.f69171b.size();
        }

        @Override // p000.o68
        public int nextInt() {
            SparseArray<T> sparseArray = this.f69171b;
            int i = this.f69170a;
            this.f69170a = i + 1;
            return sparseArray.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f69170a = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: oxf$b */
    public static final class C10713b<T> implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f69172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseArray<T> f69173b;

        public C10713b(SparseArray<T> sparseArray) {
            this.f69173b = sparseArray;
        }

        public final int getIndex() {
            return this.f69172a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69172a < this.f69173b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            SparseArray<T> sparseArray = this.f69173b;
            int i = this.f69172a;
            this.f69172a = i + 1;
            return sparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f69172a = i;
        }
    }

    public static final <T> boolean contains(@yfb SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsKey(@yfb SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static final <T> boolean containsValue(@yfb SparseArray<T> sparseArray, T t) {
        return sparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(@yfb SparseArray<T> sparseArray, @yfb gz6<? super Integer, ? super T, bth> gz6Var) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@yfb SparseArray<T> sparseArray, int i, T t) {
        T t2 = sparseArray.get(i);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(@yfb SparseArray<T> sparseArray, int i, @yfb ny6<? extends T> ny6Var) {
        T t = sparseArray.get(i);
        return t == null ? ny6Var.invoke() : t;
    }

    public static final <T> int getSize(@yfb SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(@yfb SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@yfb SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @yfb
    public static final <T> o68 keyIterator(@yfb SparseArray<T> sparseArray) {
        return new C10712a(sparseArray);
    }

    @yfb
    public static final <T> SparseArray<T> plus(@yfb SparseArray<T> sparseArray, @yfb SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(@yfb SparseArray<T> sparseArray, @yfb SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(@yfb SparseArray<T> sparseArray, int i, T t) {
        int iIndexOfKey = sparseArray.indexOfKey(i);
        if (iIndexOfKey < 0 || !md8.areEqual(t, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(@yfb SparseArray<T> sparseArray, int i, T t) {
        sparseArray.put(i, t);
    }

    @yfb
    public static final <T> Iterator<T> valueIterator(@yfb SparseArray<T> sparseArray) {
        return new C10713b(sparseArray);
    }
}
