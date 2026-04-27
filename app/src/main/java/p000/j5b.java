package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntSet.kt\nandroidx/collection/IntSet\n+ 6 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13600#4,2:845\n13600#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 IntSet.kt\nandroidx/collection/MutableIntSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
public final class j5b extends p78 {

    /* JADX INFO: renamed from: e */
    public int f49547e;

    public j5b() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        if (this.f69921c <= 8 || Long.compareUnsigned(oph.m31533constructorimpl(oph.m31533constructorimpl(this.f69922d) * 32), oph.m31533constructorimpl(oph.m31533constructorimpl(this.f69921c) * 25)) > 0) {
            resizeStorage(coe.nextCapacity(this.f69921c));
        } else {
            resizeStorage(coe.nextCapacity(this.f69921c));
        }
    }

    private final int findAbsoluteInsertIndex(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.f69921c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f69919a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i10 = i7;
            long j3 = j ^ (j2 * coe.f17281k);
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.f69920b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.f49547e == 0 && ((this.f69919a[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this.f69922d++;
                int i11 = this.f49547e;
                long[] jArr2 = this.f69919a;
                int i12 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i12];
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                this.f49547e = i11 - (((j5 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = ((~(255 << i13)) & j5) | (j2 << i13);
                int i14 = this.f69921c;
                int i15 = ((iFindFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return iFindFirstAvailableSlot;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this.f69921c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f69919a;
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

    private final void initializeGrowth() {
        this.f49547e = coe.loadedCapacity(getCapacity()) - this.f69922d;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = coe.f17275e;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f69919a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, coe.normalizeCapacity(i)) : 0;
        this.f69921c = iMax;
        initializeMetadata(iMax);
        this.f69920b = new int[iMax];
    }

    private final void removeElementAt(int i) {
        this.f69922d--;
        long[] jArr = this.f69919a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.f69921c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
    }

    private final void resizeStorage(int i) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f69919a;
        int[] iArr2 = this.f69920b;
        int i2 = this.f69921c;
        initializeStorage(i);
        int[] iArr3 = this.f69920b;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr2[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                long[] jArr3 = this.f69919a;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i6] = ((~(255 << i7)) & jArr3[i6]) | (j << i7);
                int i8 = this.f69921c;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr3[i10] = ((~(255 << i11)) & jArr3[i10]) | (j << i11);
                iArr3[iFindFirstAvailableSlot] = i4;
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
        long[] jArr = this.f69919a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this.f69921c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final boolean add(int i) {
        int i2 = this.f69922d;
        this.f69920b[findAbsoluteInsertIndex(i)] = i;
        return this.f69922d != i2;
    }

    public final boolean addAll(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        int i = this.f69922d;
        plusAssign(iArr);
        return i != this.f69922d;
    }

    public final void clear() {
        this.f69922d = 0;
        long[] jArr = this.f69919a;
        if (jArr != coe.f17275e) {
            u70.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f69919a;
            int i = this.f69921c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f69921c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f69919a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f69920b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6a
            r10 = -1
        L64:
            if (r10 < 0) goto L69
            r13.removeElementAt(r10)
        L69:
            return
        L6a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j5b.minusAssign(int):void");
    }

    public final void plusAssign(int i) {
        this.f69920b[findAbsoluteInsertIndex(i)] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f69921c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f69919a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f69920b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            r4 = r11
        L6d:
            if (r4 == 0) goto L72
            r0.removeElementAt(r10)
        L72:
            return r4
        L73:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.j5b.remove(int):boolean");
    }

    public final boolean removeAll(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        int i = this.f69922d;
        minusAssign(iArr);
        return i != this.f69922d;
    }

    @h78(from = 0)
    public final int trim() {
        int i = this.f69921c;
        int iNormalizeCapacity = coe.normalizeCapacity(coe.unloadedCapacity(this.f69922d));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this.f69921c;
    }

    public /* synthetic */ j5b(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public j5b(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(coe.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final void plusAssign(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        for (int i : iArr) {
            plusAssign(i);
        }
    }

    public final boolean addAll(@yfb p78 p78Var) {
        md8.checkNotNullParameter(p78Var, "elements");
        int i = this.f69922d;
        plusAssign(p78Var);
        return i != this.f69922d;
    }

    public final boolean removeAll(@yfb p78 p78Var) {
        md8.checkNotNullParameter(p78Var, "elements");
        int i = this.f69922d;
        minusAssign(p78Var);
        return i != this.f69922d;
    }

    public final void plusAssign(@yfb p78 p78Var) {
        md8.checkNotNullParameter(p78Var, "elements");
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
                        plusAssign(iArr[(i << 3) + i3]);
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

    public final void minusAssign(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        for (int i : iArr) {
            minusAssign(i);
        }
    }

    public final void minusAssign(@yfb p78 p78Var) {
        md8.checkNotNullParameter(p78Var, "elements");
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
                        minusAssign(iArr[(i << 3) + i3]);
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
