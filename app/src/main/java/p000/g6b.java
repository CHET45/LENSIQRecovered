package p000;

import java.util.Iterator;
import p000.ymh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1058:1\n1048#1,2:1139\n1052#1,5:1147\n1048#1,2:1178\n1052#1,5:1186\n1048#1,2:1203\n1052#1,5:1211\n1#2:1059\n1656#3,6:1060\n1810#3:1076\n1672#3:1080\n1810#3:1098\n1672#3:1102\n1810#3:1123\n1672#3:1127\n1656#3,6:1141\n1656#3,6:1152\n1589#3,3:1158\n1599#3:1161\n1603#3:1162\n1779#3,3:1163\n1793#3,3:1166\n1717#3:1169\n1705#3:1170\n1699#3:1171\n1712#3:1172\n1802#3:1173\n1666#3:1174\n1645#3:1175\n1664#3:1176\n1645#3:1177\n1656#3,6:1180\n1779#3,3:1191\n1810#3:1194\n1699#3:1195\n1669#3:1196\n1645#3:1197\n1589#3,3:1198\n1599#3:1201\n1603#3:1202\n1656#3,6:1205\n1656#3,6:1216\n1656#3,6:1222\n401#4,4:1066\n373#4,6:1070\n383#4,3:1077\n386#4,2:1081\n406#4,2:1083\n389#4,6:1085\n408#4:1091\n373#4,6:1092\n383#4,3:1099\n386#4,9:1103\n267#5,4:1112\n237#5,7:1116\n248#5,3:1124\n251#5,2:1128\n272#5,2:1130\n254#5,6:1132\n274#5:1138\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n*L\n900#1:1139,2\n900#1:1147,5\n960#1:1178,2\n960#1:1186,5\n1035#1:1203,2\n1035#1:1211,5\n728#1:1060,6\n804#1:1076\n804#1:1080\n843#1:1098\n843#1:1102\n889#1:1123\n889#1:1127\n900#1:1141,6\n911#1:1152,6\n925#1:1158,3\n926#1:1161\n927#1:1162\n934#1:1163,3\n935#1:1166,3\n936#1:1169\n937#1:1170\n937#1:1171\n941#1:1172\n944#1:1173\n953#1:1174\n953#1:1175\n959#1:1176\n959#1:1177\n960#1:1180,6\n975#1:1191,3\n976#1:1194\n978#1:1195\n1030#1:1196\n1030#1:1197\n1032#1:1198,3\n1033#1:1201\n1035#1:1202\n1035#1:1205,6\n1049#1:1216,6\n1055#1:1222,6\n804#1:1066,4\n804#1:1070,6\n804#1:1077,3\n804#1:1081,2\n804#1:1083,2\n804#1:1085,6\n804#1:1091\n843#1:1092,6\n843#1:1099,3\n843#1:1103,9\n889#1:1112,4\n889#1:1116,7\n889#1:1124,3\n889#1:1128,2\n889#1:1130,2\n889#1:1132,6\n889#1:1138\n*E\n"})
public final class g6b<K> extends ekb<K> {

    /* JADX INFO: renamed from: f */
    public int f38896f;

    public g6b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f33267d <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f33268e) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f33267d) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f33267d));
        } else {
            resizeStorage(coe.nextCapacity(this.f33267d));
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f33267d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f33264a;
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

    private final int findIndex(K k) {
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.f33267d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f33264a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (md8.areEqual(this.f33265b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.f38896f == 0 && ((this.f33264a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this.f33268e++;
                int i10 = this.f38896f;
                long[] jArr2 = this.f33264a;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.f38896f = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                jArr2[i11] = (j5 & (~(255 << i12))) | (j2 << i12);
                int i13 = this.f33267d;
                int i14 = ((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7);
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                jArr2[i15] = ((~(255 << i16)) & jArr2[i15]) | (j2 << i16);
                return ~iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final void initializeGrowth() {
        this.f38896f = coe.loadedCapacity(getCapacity()) - this.f33268e;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f33264a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f33267d = iMax;
        initializeMetadata(iMax);
        this.f33265b = new Object[iMax];
        this.f33266c = new long[iMax];
    }

    private final void resizeStorage(int i) {
        int i2;
        long[] jArr = this.f33264a;
        Object[] objArr = this.f33265b;
        long[] jArr2 = this.f33266c;
        int i3 = this.f33267d;
        initializeStorage(i);
        Object[] objArr2 = this.f33265b;
        long[] jArr3 = this.f33266c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr4 = this.f33264a;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                i2 = i4;
                jArr4[i6] = (jArr4[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.f33267d;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr4[i10] = (jArr4[i10] & (~(255 << i11))) | (j << i11);
                objArr2[iFindFirstAvailableSlot] = obj;
                jArr3[iFindFirstAvailableSlot] = jArr2[i2];
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.f33264a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f33267d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final void clear() {
        this.f33268e = 0;
        long[] jArr = this.f33264a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f33264a;
            int i = this.f33267d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        u70.fill(this.f33265b, (Object) null, 0, this.f33267d);
        initializeGrowth();
    }

    public final long getOrPut(K k, @yfb ny6<Long> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k);
        if (iFindKeyIndex >= 0) {
            return this.f33266c[iFindKeyIndex];
        }
        long jLongValue = ny6Var.invoke().longValue();
        set(k, jLongValue);
        return jLongValue;
    }

    public final void minusAssign(K k) {
        remove(k);
    }

    public final void plusAssign(@yfb ekb<K> ekbVar) {
        md8.checkNotNullParameter(ekbVar, ymh.InterfaceC15729h.f102263c);
        putAll(ekbVar);
    }

    public final void put(K k, long j) {
        set(k, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@yfb ekb<K> ekbVar) {
        md8.checkNotNullParameter(ekbVar, ymh.InterfaceC15729h.f102263c);
        Object[] objArr = ekbVar.f33265b;
        long[] jArr = ekbVar.f33266c;
        long[] jArr2 = ekbVar.f33264a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(objArr[i4], jArr[i4]);
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

    public final void remove(K k) {
        int iFindKeyIndex = findKeyIndex(k);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final void removeIf(@yfb gz6<? super K, ? super Long, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f33264a;
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
                        if (gz6Var.invoke(this.f33265b[i4], Long.valueOf(this.f33266c[i4])).booleanValue()) {
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
        this.f33268e--;
        long[] jArr = this.f33264a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f33267d;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.f33265b[i] = null;
    }

    public final void set(K k, long j) {
        int iFindIndex = findIndex(k);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.f33265b[iFindIndex] = k;
        this.f33266c[iFindIndex] = j;
    }

    public final int trim() {
        int i = this.f33267d;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f33268e));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f33267d;
    }

    public /* synthetic */ g6b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(@yfb K[] kArr) {
        md8.checkNotNullParameter(kArr, "keys");
        for (K k : kArr) {
            remove(k);
        }
    }

    public final long put(K k, long j, long j2) {
        int iFindIndex = findIndex(k);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            j2 = this.f33266c[iFindIndex];
        }
        this.f33265b[iFindIndex] = k;
        this.f33266c[iFindIndex] = j;
        return j2;
    }

    public g6b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final boolean remove(K k, long j) {
        int iFindKeyIndex = findKeyIndex(k);
        if (iFindKeyIndex < 0 || this.f33266c[iFindKeyIndex] != j) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void minusAssign(@yfb Iterable<? extends K> iterable) {
        md8.checkNotNullParameter(iterable, "keys");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(@yfb vye<? extends K> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "keys");
        Iterator<? extends K> it = vyeVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@yfb doe<K> doeVar) {
        md8.checkNotNullParameter(doeVar, "keys");
        Object[] objArr = doeVar.f30278b;
        long[] jArr = doeVar.f30277a;
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
                        remove(objArr[(i << 3) + i3]);
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
}
