package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
public final class qxf {

    /* JADX INFO: renamed from: qxf$a */
    public static final class C11758a extends o68 {

        /* JADX INFO: renamed from: a */
        public int f76282a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseBooleanArray f76283b;

        public C11758a(SparseBooleanArray sparseBooleanArray) {
            this.f76283b = sparseBooleanArray;
        }

        public final int getIndex() {
            return this.f76282a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76282a < this.f76283b.size();
        }

        @Override // p000.o68
        public int nextInt() {
            SparseBooleanArray sparseBooleanArray = this.f76283b;
            int i = this.f76282a;
            this.f76282a = i + 1;
            return sparseBooleanArray.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f76282a = i;
        }
    }

    /* JADX INFO: renamed from: qxf$b */
    public static final class C11759b extends wa1 {

        /* JADX INFO: renamed from: a */
        public int f76284a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SparseBooleanArray f76285b;

        public C11759b(SparseBooleanArray sparseBooleanArray) {
            this.f76285b = sparseBooleanArray;
        }

        public final int getIndex() {
            return this.f76284a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f76284a < this.f76285b.size();
        }

        @Override // p000.wa1
        public boolean nextBoolean() {
            SparseBooleanArray sparseBooleanArray = this.f76285b;
            int i = this.f76284a;
            this.f76284a = i + 1;
            return sparseBooleanArray.valueAt(i);
        }

        public final void setIndex(int i) {
            this.f76284a = i;
        }
    }

    public static final boolean contains(@yfb SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(@yfb SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(@yfb SparseBooleanArray sparseBooleanArray, boolean z) {
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final void forEach(@yfb SparseBooleanArray sparseBooleanArray, @yfb gz6<? super Integer, ? super Boolean, bth> gz6Var) {
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean getOrDefault(@yfb SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(@yfb SparseBooleanArray sparseBooleanArray, int i, @yfb ny6<Boolean> ny6Var) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : ny6Var.invoke().booleanValue();
    }

    public static final int getSize(@yfb SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(@yfb SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(@yfb SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @yfb
    public static final o68 keyIterator(@yfb SparseBooleanArray sparseBooleanArray) {
        return new C11758a(sparseBooleanArray);
    }

    @yfb
    public static final SparseBooleanArray plus(@yfb SparseBooleanArray sparseBooleanArray, @yfb SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(@yfb SparseBooleanArray sparseBooleanArray, @yfb SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean remove(@yfb SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        if (iIndexOfKey < 0 || z != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void set(@yfb SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        sparseBooleanArray.put(i, z);
    }

    @yfb
    public static final wa1 valueIterator(@yfb SparseBooleanArray sparseBooleanArray) {
        return new C11759b(sparseBooleanArray);
    }
}
