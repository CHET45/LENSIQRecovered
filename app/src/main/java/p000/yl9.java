package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class yl9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final v5b f102016a = new v5b(0);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final long[] f102017b = new long[0];

    @yfb
    public static final xl9 emptyLongSet() {
        return f102016a;
    }

    @yfb
    public static final long[] getEmptyLongArray() {
        return f102017b;
    }

    public static final int hash(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    @yfb
    public static final xl9 longSetOf() {
        return f102016a;
    }

    @yfb
    public static final v5b mutableLongSetOf() {
        return new v5b(0, 1, null);
    }

    @yfb
    public static final xl9 longSetOf(long j) {
        return mutableLongSetOf(j);
    }

    @yfb
    public static final v5b mutableLongSetOf(long j) {
        v5b v5bVar = new v5b(1);
        v5bVar.plusAssign(j);
        return v5bVar;
    }

    @yfb
    public static final xl9 longSetOf(long j, long j2) {
        return mutableLongSetOf(j, j2);
    }

    @yfb
    public static final xl9 longSetOf(long j, long j2, long j3) {
        return mutableLongSetOf(j, j2, j3);
    }

    @yfb
    public static final v5b mutableLongSetOf(long j, long j2) {
        v5b v5bVar = new v5b(2);
        v5bVar.plusAssign(j);
        v5bVar.plusAssign(j2);
        return v5bVar;
    }

    @yfb
    public static final xl9 longSetOf(@yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        v5b v5bVar = new v5b(jArr.length);
        v5bVar.plusAssign(jArr);
        return v5bVar;
    }

    @yfb
    public static final v5b mutableLongSetOf(long j, long j2, long j3) {
        v5b v5bVar = new v5b(3);
        v5bVar.plusAssign(j);
        v5bVar.plusAssign(j2);
        v5bVar.plusAssign(j3);
        return v5bVar;
    }

    @yfb
    public static final v5b mutableLongSetOf(@yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        v5b v5bVar = new v5b(jArr.length);
        v5bVar.plusAssign(jArr);
        return v5bVar;
    }
}
