package p000;

import android.util.LongSparseArray;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,99:1\n77#1,4:100\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:100,4\n*E\n"})
public final class am9 {

    /* JADX INFO: renamed from: am9$a */
    public static final class C0325a extends gl9 {

        /* JADX INFO: renamed from: a */
        public int f2073a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LongSparseArray<T> f2074b;

        public C0325a(LongSparseArray<T> longSparseArray) {
            this.f2074b = longSparseArray;
        }

        public final int getIndex() {
            return this.f2073a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2073a < this.f2074b.size();
        }

        @Override // p000.gl9
        public long nextLong() {
            LongSparseArray<T> longSparseArray = this.f2074b;
            int i = this.f2073a;
            this.f2073a = i + 1;
            return longSparseArray.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f2073a = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: am9$b */
    public static final class C0326b<T> implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f2075a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LongSparseArray<T> f2076b;

        public C0326b(LongSparseArray<T> longSparseArray) {
            this.f2076b = longSparseArray;
        }

        public final int getIndex() {
            return this.f2075a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2075a < this.f2076b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.f2076b;
            int i = this.f2075a;
            this.f2075a = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f2075a = i;
        }
    }

    public static final <T> boolean contains(@yfb LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsKey(@yfb LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsValue(@yfb LongSparseArray<T> longSparseArray, T t) {
        return longSparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(@yfb LongSparseArray<T> longSparseArray, @yfb gz6<? super Long, ? super T, bth> gz6Var) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@yfb LongSparseArray<T> longSparseArray, long j, T t) {
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(@yfb LongSparseArray<T> longSparseArray, long j, @yfb ny6<? extends T> ny6Var) {
        T t = longSparseArray.get(j);
        return t == null ? ny6Var.invoke() : t;
    }

    public static final <T> int getSize(@yfb LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(@yfb LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@yfb LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @yfb
    public static final <T> gl9 keyIterator(@yfb LongSparseArray<T> longSparseArray) {
        return new C0325a(longSparseArray);
    }

    @yfb
    public static final <T> LongSparseArray<T> plus(@yfb LongSparseArray<T> longSparseArray, @yfb LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(@yfb LongSparseArray<T> longSparseArray, @yfb LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(@yfb LongSparseArray<T> longSparseArray, long j, T t) {
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0 || !md8.areEqual(t, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(@yfb LongSparseArray<T> longSparseArray, long j, T t) {
        longSparseArray.put(j, t);
    }

    @yfb
    public static final <T> Iterator<T> valueIterator(@yfb LongSparseArray<T> longSparseArray) {
        return new C0326b(longSparseArray);
    }
}
