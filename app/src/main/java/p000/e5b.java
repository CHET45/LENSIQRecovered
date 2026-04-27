package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/MutableIntFloatMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntFloatMap.kt\nandroidx/collection/IntFloatMap\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntList.kt\nandroidx/collection/IntList\n+ 7 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/MutableIntFloatMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
public final class e5b extends h68 {

    /* JADX INFO: renamed from: f */
    public int f31852f;

    public e5b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f42477d <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f42478e) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f42477d) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f42477d));
        } else {
            resizeStorage(coe.nextCapacity(this.f42477d));
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f42477d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f42474a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final int findInsertIndex(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f42477d;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f42474a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i10 = i7;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.f42475b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.f31852f == 0 && ((this.f42474a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this.f42478e++;
                int i11 = this.f31852f;
                long[] jArr2 = this.f42474a;
                int i12 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i12];
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                this.f31852f = i11 - (((j5 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = ((~(255 << i13)) & j5) | (j2 << i13);
                int i14 = this.f42477d;
                int i15 = ((iFindFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return ~iFindFirstAvailableSlot;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    private final void initializeGrowth() {
        this.f31852f = coe.loadedCapacity(getCapacity()) - this.f42478e;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f42474a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f42477d = iMax;
        initializeMetadata(iMax);
        this.f42475b = new int[iMax];
        this.f42476c = new float[iMax];
    }

    private final void resizeStorage(int i) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f42474a;
        int[] iArr2 = this.f42475b;
        float[] fArr = this.f42476c;
        int i2 = this.f42477d;
        initializeStorage(i);
        int[] iArr3 = this.f42475b;
        float[] fArr2 = this.f42476c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr2[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr3 = this.f42474a;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i6] = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.f42477d;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr3[i10] = ((~(255 << i11)) & jArr3[i10]) | (j << i11);
                iArr3[iFindFirstAvailableSlot] = i4;
                fArr2[iFindFirstAvailableSlot] = fArr[i3];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i3++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.f42474a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f42477d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final void clear() {
        this.f42478e = 0;
        long[] jArr = this.f42474a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f42474a;
            int i = this.f42477d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        initializeGrowth();
    }

    public final float getOrPut(int i, @yfb ny6<Float> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex >= 0) {
            return this.f42476c[iFindKeyIndex];
        }
        float fFloatValue = ny6Var.invoke().floatValue();
        put(i, fFloatValue);
        return fFloatValue;
    }

    public final void minusAssign(int i) {
        remove(i);
    }

    public final void plusAssign(@yfb h68 h68Var) {
        md8.checkNotNullParameter(h68Var, ymh.InterfaceC15729h.f102263c);
        putAll(h68Var);
    }

    public final void put(int i, float f) {
        set(i, f);
    }

    public final void putAll(@yfb h68 h68Var) {
        md8.checkNotNullParameter(h68Var, ymh.InterfaceC15729h.f102263c);
        int[] iArr = h68Var.f42475b;
        float[] fArr = h68Var.f42476c;
        long[] jArr = h68Var.f42474a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(iArr[i4], fArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void remove(int i) {
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@yfb gz6<? super Integer, ? super Float, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f42474a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (gz6Var.invoke(Integer.valueOf(this.f42475b[i4]), Float.valueOf(this.f42476c[i4])).booleanValue()) {
                            removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @yjd
    public final void removeValueAt(int i) {
        this.f42478e--;
        long[] jArr = this.f42474a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f42477d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    public final void set(int i, float f) {
        int iFindInsertIndex = findInsertIndex(i);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.f42475b[iFindInsertIndex] = i;
        this.f42476c[iFindInsertIndex] = f;
    }

    public final int trim() {
        int i = this.f42477d;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f42478e));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f42477d;
    }

    public /* synthetic */ e5b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "keys");
        for (int i : iArr) {
            remove(i);
        }
    }

    public final float put(int i, float f, float f2) {
        int iFindInsertIndex = findInsertIndex(i);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f2 = this.f42476c[iFindInsertIndex];
        }
        this.f42475b[iFindInsertIndex] = i;
        this.f42476c[iFindInsertIndex] = f;
        return f2;
    }

    public e5b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(int i, float f) {
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex < 0 || this.f42476c[iFindKeyIndex] != f) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@yfb p78 p78Var) {
        md8.checkNotNullParameter(p78Var, "keys");
        int[] iArr = p78Var.f69920b;
        long[] jArr = p78Var.f69919a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(iArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void minusAssign(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "keys");
        int[] iArr = q68Var.f73324a;
        int i = q68Var.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }
}
