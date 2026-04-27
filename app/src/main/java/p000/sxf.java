package p000;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class sxf {

    /* JADX INFO: renamed from: sxf$a */
    public static final class C12825a extends o68 {

        /* JADX INFO: renamed from: a */
        public int f83204a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseIntArray f83205b;

        public C12825a(SparseIntArray sparseIntArray) {
            this.f83205b = sparseIntArray;
        }

        public final int getIndex() {
            return this.f83204a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83204a < this.f83205b.size();
        }

        @Override // p000.o68
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f83205b;
            int i = this.f83204a;
            this.f83204a = i + 1;
            return sparseIntArray.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f83204a = i;
        }
    }

    /* JADX INFO: renamed from: sxf$b */
    public static final class C12826b extends o68 {

        /* JADX INFO: renamed from: a */
        public int f83206a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseIntArray f83207b;

        public C12826b(SparseIntArray sparseIntArray) {
            this.f83207b = sparseIntArray;
        }

        public final int getIndex() {
            return this.f83206a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f83206a < this.f83207b.size();
        }

        @Override // p000.o68
        public int nextInt() {
            SparseIntArray sparseIntArray = this.f83207b;
            int i = this.f83206a;
            this.f83206a = i + 1;
            return sparseIntArray.valueAt(i);
        }

        public final void setIndex(int i) {
            this.f83206a = i;
        }
    }

    public static final boolean contains(@yfb SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(@yfb SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(@yfb SparseIntArray sparseIntArray, int i) {
        return sparseIntArray.indexOfValue(i) >= 0;
    }

    public static final void forEach(@yfb SparseIntArray sparseIntArray, @yfb gz6<? super Integer, ? super Integer, bth> gz6Var) {
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(sparseIntArray.keyAt(i)), Integer.valueOf(sparseIntArray.valueAt(i)));
        }
    }

    public static final int getOrDefault(@yfb SparseIntArray sparseIntArray, int i, int i2) {
        return sparseIntArray.get(i, i2);
    }

    public static final int getOrElse(@yfb SparseIntArray sparseIntArray, int i, @yfb ny6<Integer> ny6Var) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : ny6Var.invoke().intValue();
    }

    public static final int getSize(@yfb SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(@yfb SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(@yfb SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @yfb
    public static final o68 keyIterator(@yfb SparseIntArray sparseIntArray) {
        return new C12825a(sparseIntArray);
    }

    @yfb
    public static final SparseIntArray plus(@yfb SparseIntArray sparseIntArray, @yfb SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(@yfb SparseIntArray sparseIntArray, @yfb SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i), sparseIntArray2.valueAt(i));
        }
    }

    public static final boolean remove(@yfb SparseIntArray sparseIntArray, int i, int i2) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey < 0 || i2 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(@yfb SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.put(i, i2);
    }

    @yfb
    public static final o68 valueIterator(@yfb SparseIntArray sparseIntArray) {
        return new C12826b(sparseIntArray);
    }
}
