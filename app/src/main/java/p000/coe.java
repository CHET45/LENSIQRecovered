package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n1645#1:1835\n1645#1:1836\n1645#1:1837\n1699#1:1838\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1664#1:1835\n1666#1:1836\n1669#1:1837\n1705#1:1838\n*E\n"})
public final class coe {

    /* JADX INFO: renamed from: a */
    public static final long f17271a = -9187201950435737472L;

    /* JADX INFO: renamed from: b */
    public static final long f17272b = 128;

    /* JADX INFO: renamed from: c */
    public static final long f17273c = 254;

    /* JADX INFO: renamed from: d */
    public static final long f17274d = 255;

    /* JADX INFO: renamed from: f */
    public static final int f17276f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f17277g = 7;

    /* JADX INFO: renamed from: h */
    public static final int f17278h = 6;

    /* JADX INFO: renamed from: j */
    public static final int f17280j = -862048943;

    /* JADX INFO: renamed from: k */
    public static final long f17281k = 72340172838076673L;

    /* JADX INFO: renamed from: l */
    public static final long f17282l = -9187201950435737472L;

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public static final long[] f17275e = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: i */
    @yfb
    public static final s6b f17279i = new s6b(0);

    @yfb
    public static final <K, V> boe<K, V> emptyScatterMap() {
        s6b s6bVar = f17279i;
        md8.checkNotNull(s6bVar, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return s6bVar;
    }

    public static final int get(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    @yjd
    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    @yjd
    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    @yjd
    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final long group(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "metadata");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return (((-i3) >> 63) & (jArr[i2 + 1] << (64 - i3))) | (jArr[i2] >>> i3);
    }

    /* JADX INFO: renamed from: h1 */
    public static final int m4110h1(int i) {
        return i >>> 7;
    }

    /* JADX INFO: renamed from: h2 */
    public static final int m4111h2(int i) {
        return i & 127;
    }

    public static final boolean hasNext(long j) {
        return j != 0;
    }

    public static final int hash(@gib Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128;
    }

    @yjd
    public static final boolean isFull(long j) {
        return j < 128;
    }

    public static final int loadedCapacity(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    @yjd
    public static final int lowestBitSet(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    public static final long maskEmpty(long j) {
        return j & ((~j) << 6) & (-9187201950435737472L);
    }

    @yjd
    public static final long maskEmptyOrDeleted(long j) {
        return j & ((~j) << 7) & (-9187201950435737472L);
    }

    @yjd
    public static final long match(long j, int i) {
        long j2 = j ^ (((long) i) * f17281k);
        return (~j2) & (j2 - f17281k) & (-9187201950435737472L);
    }

    @yfb
    public static final <K, V> s6b<K, V> mutableScatterMapOf() {
        return new s6b<>(0, 1, null);
    }

    public static final long next(long j) {
        return j & (j - 1);
    }

    public static final int nextCapacity(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int normalizeCapacity(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    @yjd
    public static final long readRawMetadata(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "data");
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }

    public static final void writeRawMetadata(@yfb long[] jArr, int i, long j) {
        md8.checkNotNullParameter(jArr, "data");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (j << i3) | (jArr[i2] & (~(255 << i3)));
    }

    public static final boolean isFull(@yfb long[] jArr, int i) {
        md8.checkNotNullParameter(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) < 128;
    }

    @yfb
    public static final <K, V> s6b<K, V> mutableScatterMapOf(@yfb scc<? extends K, ? extends V>... sccVarArr) {
        md8.checkNotNullParameter(sccVarArr, "pairs");
        s6b<K, V> s6bVar = new s6b<>(sccVarArr.length);
        s6bVar.putAll(sccVarArr);
        return s6bVar;
    }
}
