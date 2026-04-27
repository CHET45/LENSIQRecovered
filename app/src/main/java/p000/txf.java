package p000;

import android.util.SparseLongArray;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
public final class txf {

    /* JADX INFO: renamed from: txf$a */
    public static final class C13277a extends o68 {

        /* JADX INFO: renamed from: a */
        public int f86274a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseLongArray f86275b;

        public C13277a(SparseLongArray sparseLongArray) {
            this.f86275b = sparseLongArray;
        }

        public final int getIndex() {
            return this.f86274a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86274a < this.f86275b.size();
        }

        @Override // p000.o68
        public int nextInt() {
            SparseLongArray sparseLongArray = this.f86275b;
            int i = this.f86274a;
            this.f86274a = i + 1;
            return sparseLongArray.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f86274a = i;
        }
    }

    /* JADX INFO: renamed from: txf$b */
    public static final class C13278b extends gl9 {

        /* JADX INFO: renamed from: a */
        public int f86276a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseLongArray f86277b;

        public C13278b(SparseLongArray sparseLongArray) {
            this.f86277b = sparseLongArray;
        }

        public final int getIndex() {
            return this.f86276a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86276a < this.f86277b.size();
        }

        @Override // p000.gl9
        public long nextLong() {
            SparseLongArray sparseLongArray = this.f86277b;
            int i = this.f86276a;
            this.f86276a = i + 1;
            return sparseLongArray.valueAt(i);
        }

        public final void setIndex(int i) {
            this.f86276a = i;
        }
    }

    public static final boolean contains(@yfb SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(@yfb SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(@yfb SparseLongArray sparseLongArray, long j) {
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    public static final void forEach(@yfb SparseLongArray sparseLongArray, @yfb gz6<? super Integer, ? super Long, bth> gz6Var) {
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    public static final long getOrDefault(@yfb SparseLongArray sparseLongArray, int i, long j) {
        return sparseLongArray.get(i, j);
    }

    public static final long getOrElse(@yfb SparseLongArray sparseLongArray, int i, @yfb ny6<Long> ny6Var) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : ny6Var.invoke().longValue();
    }

    public static final int getSize(@yfb SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(@yfb SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(@yfb SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @yfb
    public static final o68 keyIterator(@yfb SparseLongArray sparseLongArray) {
        return new C13277a(sparseLongArray);
    }

    @yfb
    public static final SparseLongArray plus(@yfb SparseLongArray sparseLongArray, @yfb SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(@yfb SparseLongArray sparseLongArray, @yfb SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    public static final boolean remove(@yfb SparseLongArray sparseLongArray, int i, long j) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey < 0 || j != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(@yfb SparseLongArray sparseLongArray, int i, long j) {
        sparseLongArray.put(i, j);
    }

    @yfb
    public static final gl9 valueIterator(@yfb SparseLongArray sparseLongArray) {
        return new C13278b(sparseLongArray);
    }
}
