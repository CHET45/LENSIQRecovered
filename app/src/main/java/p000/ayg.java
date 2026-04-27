package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
@e0g(parameters = 0)
public final class ayg {

    /* JADX INFO: renamed from: d */
    public static final int f12213d = 8;

    /* JADX INFO: renamed from: a */
    public final int f12214a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final long[] f12215b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object[] f12216c;

    public ayg(int i, @yfb long[] jArr, @yfb Object[] objArr) {
        this.f12214a = i;
        this.f12215b = jArr;
        this.f12216c = objArr;
    }

    private final int find(long j) {
        int i = this.f12214a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = this.f12215b[0];
            if (j2 == j) {
                return 0;
            }
            return j2 > j ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = this.f12215b[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @gib
    public final Object get(long j) {
        int iFind = find(j);
        if (iFind >= 0) {
            return this.f12216c[iFind];
        }
        return null;
    }

    @yfb
    public final ayg newWith(long j, @gib Object obj) {
        int i = this.f12214a;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.f12216c) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = this.f12215b[i5];
                Object obj3 = this.f12216c[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = j;
                objArr[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.f12215b[i5];
                    Object obj4 = this.f12216c[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new ayg(i4, jArr, objArr);
    }

    public final boolean trySet(long j, @gib Object obj) {
        int iFind = find(j);
        if (iFind < 0) {
            return false;
        }
        this.f12216c[iFind] = obj;
        return true;
    }
}
