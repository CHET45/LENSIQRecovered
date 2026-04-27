package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
public final class w4b extends k46 {

    /* JADX INFO: renamed from: f */
    public int f93241f;

    public w4b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f52569d <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f52570e) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f52569d) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f52569d));
        } else {
            resizeStorage(coe.nextCapacity(this.f52569d));
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f52569d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f52566a;
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

    private final int findInsertIndex(float f) {
        int iHashCode = Float.hashCode(f) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.f52569d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f52566a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i6;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.f52567b[iNumberOfTrailingZeros] == f) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.f93241f == 0 && ((this.f52566a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this.f52570e++;
                int i10 = this.f93241f;
                long[] jArr2 = this.f52566a;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.f93241f = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this.f52569d;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return ~iFindFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final void initializeGrowth() {
        this.f93241f = coe.loadedCapacity(getCapacity()) - this.f52570e;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f52566a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f52569d = iMax;
        initializeMetadata(iMax);
        this.f52567b = new float[iMax];
        this.f52568c = new int[iMax];
    }

    private final void resizeStorage(int i) {
        long[] jArr;
        float[] fArr;
        long[] jArr2 = this.f52566a;
        float[] fArr2 = this.f52567b;
        int[] iArr = this.f52568c;
        int i2 = this.f52569d;
        initializeStorage(i);
        float[] fArr3 = this.f52567b;
        int[] iArr2 = this.f52568c;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr2[i3];
                int iHashCode = Float.hashCode(f) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & 127;
                long[] jArr3 = this.f52566a;
                int i5 = iFindFirstAvailableSlot >> 3;
                int i6 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                fArr = fArr2;
                jArr3[i5] = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                int i7 = this.f52569d;
                int i8 = ((iFindFirstAvailableSlot - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr3[i9] = ((~(255 << i10)) & jArr3[i9]) | (j << i10);
                fArr3[iFindFirstAvailableSlot] = f;
                iArr2[iFindFirstAvailableSlot] = iArr[i3];
            } else {
                jArr = jArr2;
                fArr = fArr2;
            }
            i3++;
            jArr2 = jArr;
            fArr2 = fArr;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.f52566a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f52569d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final void clear() {
        this.f52570e = 0;
        long[] jArr = this.f52566a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f52566a;
            int i = this.f52569d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        initializeGrowth();
    }

    public final int getOrPut(float f, @yfb ny6<Integer> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex >= 0) {
            return this.f52568c[iFindKeyIndex];
        }
        int iIntValue = ny6Var.invoke().intValue();
        put(f, iIntValue);
        return iIntValue;
    }

    public final void minusAssign(float f) {
        remove(f);
    }

    public final void plusAssign(@yfb k46 k46Var) {
        md8.checkNotNullParameter(k46Var, ymh.InterfaceC15729h.f102263c);
        putAll(k46Var);
    }

    public final void put(float f, int i) {
        set(f, i);
    }

    public final void putAll(@yfb k46 k46Var) {
        md8.checkNotNullParameter(k46Var, ymh.InterfaceC15729h.f102263c);
        float[] fArr = k46Var.f52567b;
        int[] iArr = k46Var.f52568c;
        long[] jArr = k46Var.f52566a;
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
                        set(fArr[i4], iArr[i4]);
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

    public final void remove(float f) {
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@yfb gz6<? super Float, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f52566a;
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
                        if (gz6Var.invoke(Float.valueOf(this.f52567b[i4]), Integer.valueOf(this.f52568c[i4])).booleanValue()) {
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
        this.f52570e--;
        long[] jArr = this.f52566a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f52569d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    public final void set(float f, int i) {
        int iFindInsertIndex = findInsertIndex(f);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.f52567b[iFindInsertIndex] = f;
        this.f52568c[iFindInsertIndex] = i;
    }

    public final int trim() {
        int i = this.f52569d;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f52570e));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f52569d;
    }

    public /* synthetic */ w4b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@yfb float[] fArr) {
        md8.checkNotNullParameter(fArr, "keys");
        for (float f : fArr) {
            remove(f);
        }
    }

    public final int put(float f, int i, int i2) {
        int iFindInsertIndex = findInsertIndex(f);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            i2 = this.f52568c[iFindInsertIndex];
        }
        this.f52567b[iFindInsertIndex] = f;
        this.f52568c[iFindInsertIndex] = i;
        return i2;
    }

    public w4b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(float f, int i) {
        int iFindKeyIndex = findKeyIndex(f);
        if (iFindKeyIndex < 0 || this.f52568c[iFindKeyIndex] != i) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@yfb b56 b56Var) {
        md8.checkNotNullParameter(b56Var, "keys");
        float[] fArr = b56Var.f12703b;
        long[] jArr = b56Var.f12702a;
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
                        remove(fArr[(i << 3) + i3]);
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

    public final void minusAssign(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "keys");
        float[] fArr = p46Var.f69630a;
        int i = p46Var.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }
}
