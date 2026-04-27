package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1031:1\n357#1,6:1034\n367#1,3:1041\n370#1,9:1045\n357#1,6:1054\n367#1,3:1061\n370#1,9:1065\n357#1,6:1074\n367#1,3:1081\n370#1,9:1085\n385#1,4:1094\n357#1,6:1098\n367#1,3:1105\n370#1,2:1109\n389#1,2:1111\n373#1,6:1113\n391#1:1119\n385#1,4:1120\n357#1,6:1124\n367#1,3:1131\n370#1,2:1135\n389#1,2:1137\n373#1,6:1139\n391#1:1145\n385#1,4:1146\n357#1,6:1150\n367#1,3:1157\n370#1,2:1161\n389#1,2:1163\n373#1,6:1165\n391#1:1171\n410#1,3:1172\n357#1,6:1175\n367#1,3:1182\n370#1,2:1186\n413#1,2:1188\n373#1,6:1190\n415#1:1196\n385#1,4:1197\n357#1,6:1201\n367#1,3:1208\n370#1,2:1212\n389#1,2:1214\n373#1,6:1216\n391#1:1222\n385#1,4:1223\n357#1,6:1227\n367#1,3:1234\n370#1,2:1238\n389#1,2:1240\n373#1,6:1242\n391#1:1248\n385#1,4:1249\n357#1,6:1253\n367#1,3:1260\n370#1,2:1264\n389#1,2:1266\n373#1,6:1268\n391#1:1274\n385#1,4:1275\n357#1,6:1279\n367#1,3:1286\n370#1,2:1290\n389#1,2:1292\n373#1,6:1294\n391#1:1300\n385#1,4:1301\n357#1,6:1305\n367#1,3:1312\n370#1,2:1316\n389#1,2:1318\n373#1,6:1320\n391#1:1326\n385#1,4:1327\n357#1,6:1331\n367#1,3:1338\n370#1,2:1342\n389#1,2:1344\n373#1,6:1346\n391#1:1352\n519#1,11:1369\n385#1,4:1380\n357#1,6:1384\n367#1,3:1391\n370#1,2:1395\n389#1:1397\n530#1,10:1398\n390#1:1408\n373#1,6:1409\n391#1:1415\n540#1,2:1416\n519#1,11:1418\n385#1,4:1429\n357#1,6:1433\n367#1,3:1440\n370#1,2:1444\n389#1:1446\n530#1,10:1447\n390#1:1457\n373#1,6:1458\n391#1:1464\n540#1,2:1465\n519#1,11:1467\n385#1,4:1478\n357#1,6:1482\n367#1,3:1489\n370#1,2:1493\n389#1:1495\n530#1,10:1496\n390#1:1506\n373#1,6:1507\n391#1:1513\n540#1,2:1514\n519#1,11:1516\n385#1,4:1527\n357#1,6:1531\n367#1,3:1538\n370#1,2:1542\n389#1:1544\n530#1,10:1545\n390#1:1555\n373#1,6:1556\n391#1:1562\n540#1,2:1563\n519#1,11:1565\n385#1,4:1576\n357#1,6:1580\n367#1,3:1587\n370#1,2:1591\n389#1:1593\n530#1,10:1594\n390#1:1604\n373#1,6:1605\n391#1:1611\n540#1,2:1612\n1810#2:1032\n1672#2:1033\n1810#2:1040\n1672#2:1044\n1810#2:1060\n1672#2:1064\n1810#2:1080\n1672#2:1084\n1810#2:1104\n1672#2:1108\n1810#2:1130\n1672#2:1134\n1810#2:1156\n1672#2:1160\n1810#2:1181\n1672#2:1185\n1810#2:1207\n1672#2:1211\n1810#2:1233\n1672#2:1237\n1810#2:1259\n1672#2:1263\n1810#2:1285\n1672#2:1289\n1810#2:1311\n1672#2:1315\n1810#2:1337\n1672#2:1341\n1603#2:1356\n1599#2:1357\n1779#2,3:1358\n1793#2,3:1361\n1717#2:1364\n1705#2:1365\n1699#2:1366\n1712#2:1367\n1802#2:1368\n1810#2:1390\n1672#2:1394\n1810#2:1439\n1672#2:1443\n1810#2:1488\n1672#2:1492\n1810#2:1537\n1672#2:1541\n1810#2:1586\n1672#2:1590\n833#3,3:1353\n*S KotlinDebug\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMap\n*L\n388#1:1034,6\n388#1:1041,3\n388#1:1045,9\n400#1:1054,6\n400#1:1061,3\n400#1:1065,9\n412#1:1074,6\n412#1:1081,3\n412#1:1085,9\n421#1:1094,4\n421#1:1098,6\n421#1:1105,3\n421#1:1109,2\n421#1:1111,2\n421#1:1113,6\n421#1:1119\n431#1:1120,4\n431#1:1124,6\n431#1:1131,3\n431#1:1135,2\n431#1:1137,2\n431#1:1139,6\n431#1:1145\n447#1:1146,4\n447#1:1150,6\n447#1:1157,3\n447#1:1161,2\n447#1:1163,2\n447#1:1165,6\n447#1:1171\n470#1:1172,3\n470#1:1175,6\n470#1:1182,3\n470#1:1186,2\n470#1:1188,2\n470#1:1190,6\n470#1:1196\n494#1:1197,4\n494#1:1201,6\n494#1:1208,3\n494#1:1212,2\n494#1:1214,2\n494#1:1216,6\n494#1:1222\n529#1:1223,4\n529#1:1227,6\n529#1:1234,3\n529#1:1238,2\n529#1:1240,2\n529#1:1242,6\n529#1:1248\n529#1:1249,4\n529#1:1253,6\n529#1:1260,3\n529#1:1264,2\n529#1:1266,2\n529#1:1268,6\n529#1:1274\n550#1:1275,4\n550#1:1279,6\n550#1:1286,3\n550#1:1290,2\n550#1:1292,2\n550#1:1294,6\n550#1:1300\n576#1:1301,4\n576#1:1305,6\n576#1:1312,3\n576#1:1316,2\n576#1:1318,2\n576#1:1320,6\n576#1:1326\n598#1:1327,4\n598#1:1331,6\n598#1:1338,3\n598#1:1342,2\n598#1:1344,2\n598#1:1346,6\n598#1:1352\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,6\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397\n-1#1:1398,10\n-1#1:1408\n-1#1:1409,6\n-1#1:1415\n-1#1:1416,2\n-1#1:1418,11\n-1#1:1429,4\n-1#1:1433,6\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446\n-1#1:1447,10\n-1#1:1457\n-1#1:1458,6\n-1#1:1464\n-1#1:1465,2\n-1#1:1467,11\n-1#1:1478,4\n-1#1:1482,6\n-1#1:1489,3\n-1#1:1493,2\n-1#1:1495\n-1#1:1496,10\n-1#1:1506\n-1#1:1507,6\n-1#1:1513\n-1#1:1514,2\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n362#1:1032\n369#1:1033\n388#1:1040\n388#1:1044\n400#1:1060\n400#1:1064\n412#1:1080\n412#1:1084\n421#1:1104\n421#1:1108\n431#1:1130\n431#1:1134\n447#1:1156\n447#1:1160\n470#1:1181\n470#1:1185\n494#1:1207\n494#1:1211\n529#1:1233\n529#1:1237\n529#1:1259\n529#1:1263\n550#1:1285\n550#1:1289\n576#1:1311\n576#1:1315\n598#1:1337\n598#1:1341\n618#1:1356\n621#1:1357\n625#1:1358,3\n626#1:1361,3\n627#1:1364\n628#1:1365\n628#1:1366\n632#1:1367\n635#1:1368\n-1#1:1390\n-1#1:1394\n-1#1:1439\n-1#1:1443\n-1#1:1488\n-1#1:1492\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n617#1:1353,3\n*E\n"})
public abstract class el9 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public long[] f33341a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public long[] f33342b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public int[] f33343c;

    /* JADX INFO: renamed from: d */
    @un8
    public int f33344d;

    /* JADX INFO: renamed from: e */
    @un8
    public int f33345e;

    public /* synthetic */ el9(jt3 jt3Var) {
        this();
    }

    @yjd
    public static /* synthetic */ void getKeys$annotations() {
    }

    @yjd
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @yjd
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(el9 el9Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return el9Var.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean all(@yfb gz6<? super Long, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!gz6Var.invoke(Long.valueOf(jArr[i4]), Integer.valueOf(iArr[i4])).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this.f33345e != 0;
    }

    public final boolean contains(long j) {
        return findKeyIndex(j) >= 0;
    }

    public final boolean containsKey(long j) {
        return findKeyIndex(j) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(int r15) {
        /*
            r14 = this;
            int[] r0 = r14.f33343c
            long[] r1 = r14.f33341a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L44
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L39
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            if (r15 != r10) goto L39
            r15 = 1
            return r15
        L39:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3d:
            if (r7 != r8) goto L44
        L3f:
            if (r4 == r2) goto L44
            int r4 = r4 + 1
            goto Lb
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.containsValue(int):boolean");
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@p000.gib java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p000.el9
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            el9 r1 = (p000.el9) r1
            int r3 = r1.getSize()
            int r5 = r18.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            long[] r3 = r0.f33342b
            int[] r5 = r0.f33343c
            long[] r6 = r0.f33341a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6a
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L65
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L63
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r13
            r12 = r3[r14]
            r14 = r5[r14]
            int r12 = r1.get(r12)
            if (r14 == r12) goto L5b
            return r4
        L5b:
            r12 = 8
            goto L5f
        L5e:
            r15 = r13
        L5f:
            long r9 = r9 >> r12
            int r13 = r15 + 1
            goto L41
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r8 == r7) goto L6a
            int r8 = r8 + 1
            goto L27
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.equals(java.lang.Object):boolean");
    }

    @yjd
    public final int findKeyIndex(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f33344d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f33341a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * coe.f17281k) ^ j2;
            for (long j4 = (~j3) & (j3 - coe.f17281k) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f33342b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void forEach(@yfb gz6<? super Long, ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
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
                        gz6Var.invoke(Long.valueOf(jArr[i4]), Integer.valueOf(iArr[i4]));
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
    public final void forEachIndexed(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        long[] jArr = this.f33341a;
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
                        qy6Var.invoke(Integer.valueOf((i << 3) + i3));
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

    public final void forEachKey(@yfb qy6<? super Long, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        long[] jArr = this.f33342b;
        long[] jArr2 = this.f33341a;
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
                        qy6Var.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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

    public final void forEachValue(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        int[] iArr = this.f33343c;
        long[] jArr = this.f33341a;
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
                        qy6Var.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
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

    public final int get(long j) {
        int iFindKeyIndex = findKeyIndex(j);
        if (iFindKeyIndex >= 0) {
            return this.f33343c[iFindKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + j);
    }

    public final int getCapacity() {
        return this.f33344d;
    }

    public final int getOrDefault(long j, int i) {
        int iFindKeyIndex = findKeyIndex(j);
        return iFindKeyIndex >= 0 ? this.f33343c[iFindKeyIndex] : i;
    }

    public final int getOrElse(long j, @yfb ny6<Integer> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        int iFindKeyIndex = findKeyIndex(j);
        return iFindKeyIndex < 0 ? ny6Var.invoke().intValue() : this.f33343c[iFindKeyIndex];
    }

    public final int getSize() {
        return this.f33345e;
    }

    public int hashCode() {
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            long j2 = jArr[i5];
                            iHashCode += Integer.hashCode(iArr[i5]) ^ Long.hashCode(j2);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 == length) {
                    i = iHashCode;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f33345e == 0;
    }

    public final boolean isNotEmpty() {
        return this.f33345e != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this.f33345e == 0;
    }

    @yfb
    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.f33345e) {
                                sb.append(C4584d2.f28238g);
                                sb.append(' ');
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "s.append('}').toString()");
        return string;
    }

    private el9() {
        this.f33341a = coe.f17275e;
        this.f33342b = yl9.getEmptyLongArray();
        this.f33343c = q78.getEmptyIntArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            p000.md8.checkNotNullParameter(r1, r2)
            long[] r2 = r0.f33342b
            int[] r3 = r0.f33343c
            long[] r4 = r0.f33341a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L63
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L58
            r1 = 1
            return r1
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r5) goto L63
            int r7 = r7 + 1
            goto L16
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.any(gz6):boolean");
    }

    public final int count(@yfb gz6<? super Long, ? super Integer, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (gz6Var.invoke(Long.valueOf(jArr[i6]), Integer.valueOf(iArr[i6])).booleanValue()) {
                                i3++;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(el9 el9Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, gz6 gz6Var, int i2, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i3;
        if (obj == null) {
            CharSequence charSequence5 = (i2 & 1) != 0 ? ", " : charSequence;
            CharSequence charSequence6 = (i2 & 2) != 0 ? "" : charSequence2;
            CharSequence charSequence7 = (i2 & 4) == 0 ? charSequence3 : "";
            int i4 = (i2 & 8) != 0 ? -1 : i;
            CharSequence charSequence8 = (i2 & 16) != 0 ? "..." : charSequence4;
            md8.checkNotNullParameter(charSequence5, "separator");
            md8.checkNotNullParameter(charSequence6, "prefix");
            md8.checkNotNullParameter(charSequence7, "postfix");
            md8.checkNotNullParameter(charSequence8, "truncated");
            md8.checkNotNullParameter(gz6Var, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence6);
            long[] jArr3 = el9Var.f33342b;
            int[] iArr = el9Var.f33343c;
            long[] jArr4 = el9Var.f33341a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                int i6 = 0;
                loop0: while (true) {
                    long j = jArr4[i5];
                    int i7 = i5;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j & 255) < 128) {
                                int i11 = (i7 << 3) + i10;
                                long j2 = jArr3[i11];
                                int i12 = iArr[i11];
                                if (i6 == i4) {
                                    sb.append(charSequence8);
                                    break loop0;
                                }
                                if (i6 != 0) {
                                    sb.append(charSequence5);
                                }
                                Long lValueOf = Long.valueOf(j2);
                                jArr2 = jArr4;
                                sb.append((CharSequence) gz6Var.invoke(lValueOf, Integer.valueOf(i12)));
                                i6++;
                                i3 = 8;
                            } else {
                                jArr2 = jArr4;
                                i3 = i8;
                            }
                            j >>= i3;
                            i10++;
                            i8 = i3;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        if (i9 != i8) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i5 = i7 + 1;
                    jArr4 = jArr;
                }
                sb.append(charSequence7);
            } else {
                sb.append(charSequence7);
            }
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4) {
        long[] jArr;
        long[] jArr2;
        int i2;
        int i3;
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr3 = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr4 = this.f33341a;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr4[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j & 255) < 128) {
                            int i9 = (i4 << 3) + i8;
                            jArr2 = jArr4;
                            i2 = length;
                            long j2 = jArr3[i9];
                            int i10 = iArr[i9];
                            if (i5 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(j2);
                            sb.append('=');
                            sb.append(i10);
                            i5++;
                            i3 = 8;
                        } else {
                            jArr2 = jArr4;
                            i2 = length;
                            i3 = i6;
                        }
                        j >>= i3;
                        i8++;
                        i6 = i3;
                        jArr4 = jArr2;
                        length = i2;
                    }
                    jArr = jArr4;
                    int i11 = length;
                    if (i7 != i6) {
                        break;
                    }
                    length = i11;
                } else {
                    jArr = jArr4;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr4 = jArr;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[PHI: r12
  0x009a: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x004c, B:19:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r22, @p000.yfb java.lang.CharSequence r23, @p000.yfb java.lang.CharSequence r24, int r25, @p000.yfb java.lang.CharSequence r26, @p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r26
            r5 = r27
            java.lang.String r6 = "separator"
            p000.md8.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "prefix"
            p000.md8.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "postfix"
            p000.md8.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "truncated"
            p000.md8.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "transform"
            p000.md8.checkNotNullParameter(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            long[] r2 = r0.f33342b
            int[] r7 = r0.f33343c
            long[] r8 = r0.f33341a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto La4
            r11 = 0
            r12 = 0
        L3a:
            r13 = r8[r11]
            r15 = r11
            long r10 = ~r13
            r16 = 7
            long r10 = r10 << r16
            long r10 = r10 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L9a
            int r11 = r15 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r11 = 0
        L58:
            if (r11 >= r10) goto L96
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L8c
            int r17 = r15 << 3
            int r17 = r17 + r11
            r18 = r2[r17]
            r17 = r7[r17]
            r0 = r25
            if (r12 != r0) goto L74
            r6.append(r4)
            goto La7
        L74:
            if (r12 == 0) goto L79
            r6.append(r1)
        L79:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
            int r12 = r12 + 1
        L8c:
            r0 = 8
            long r13 = r13 >> r0
            int r11 = r11 + 1
            r0 = r21
            r1 = r22
            goto L58
        L96:
            r0 = 8
            if (r10 != r0) goto La4
        L9a:
            r10 = r15
            if (r10 == r9) goto La4
            int r11 = r10 + 1
            r0 = r21
            r1 = r22
            goto L3a
        La4:
            r6.append(r3)
        La7:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, gz6):java.lang.String");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb gz6<? super Long, ? super Integer, ? extends CharSequence> gz6Var) {
        CharSequence charSequence4 = charSequence;
        md8.checkNotNullParameter(charSequence4, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(gz6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.f33342b;
        int[] iArr = this.f33343c;
        long[] jArr2 = this.f33341a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            long j2 = jArr[i7];
                            int i8 = iArr[i7];
                            if (i3 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence4);
                            }
                            sb.append(gz6Var.invoke(Long.valueOf(j2), Integer.valueOf(i8)));
                            i3++;
                        }
                        j >>= 8;
                        i6++;
                        charSequence4 = charSequence;
                        i4 = 8;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                charSequence4 = charSequence;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[PHI: r11
  0x0093: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r21, @p000.yfb java.lang.CharSequence r22, @p000.yfb java.lang.CharSequence r23, @p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            p000.md8.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "prefix"
            p000.md8.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "postfix"
            p000.md8.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "transform"
            p000.md8.checkNotNullParameter(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            long[] r2 = r0.f33342b
            int[] r6 = r0.f33343c
            long[] r7 = r0.f33341a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9a
            r10 = 0
            r11 = 0
        L33:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L93
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L50:
            if (r9 >= r14) goto L90
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L88
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r2[r16]
            r16 = r6[r16]
            r15 = -1
            if (r11 != r15) goto L6d
            java.lang.String r1 = "..."
            r5.append(r1)
            goto L9d
        L6d:
            if (r11 == 0) goto L72
            r5.append(r1)
        L72:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            int r11 = r11 + 1
            r0 = 8
            goto L89
        L88:
            r0 = r15
        L89:
            long r12 = r12 >> r0
            int r9 = r9 + 1
            r15 = r0
            r0 = r20
            goto L50
        L90:
            r0 = r15
            if (r14 != r0) goto L9a
        L93:
            if (r10 == r8) goto L9a
            int r10 = r10 + 1
            r0 = r20
            goto L33
        L9a:
            r5.append(r3)
        L9d:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[PHI: r10
  0x0087: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003a, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r21, @p000.yfb java.lang.CharSequence r22, @p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "separator"
            p000.md8.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "prefix"
            p000.md8.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            p000.md8.checkNotNullParameter(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            long[] r2 = r0.f33342b
            int[] r5 = r0.f33343c
            long[] r6 = r0.f33341a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8c
            r9 = 0
            r10 = 0
        L2c:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L87
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L46:
            if (r15 >= r13) goto L84
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7e
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r2[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L63
            java.lang.String r1 = "..."
            r4.append(r1)
            goto L91
        L63:
            if (r10 == 0) goto L68
            r4.append(r1)
        L68:
            java.lang.Long r8 = java.lang.Long.valueOf(r17)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r3.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r4.append(r8)
            int r10 = r10 + 1
            r8 = 8
            goto L7f
        L7e:
            r8 = r14
        L7f:
            long r11 = r11 >> r8
            int r15 = r15 + 1
            r14 = r8
            goto L46
        L84:
            r8 = r14
            if (r13 != r8) goto L8c
        L87:
            if (r9 == r7) goto L8c
            int r9 = r9 + 1
            goto L2c
        L8c:
            java.lang.String r1 = ""
            r4.append(r1)
        L91:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.joinToString(java.lang.CharSequence, java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[PHI: r11
  0x0087: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0038, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r22, @p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            p000.md8.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            p000.md8.checkNotNullParameter(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            long[] r5 = r0.f33342b
            int[] r6 = r0.f33343c
            long[] r7 = r0.f33341a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8e
            r10 = 0
            r11 = 0
        L27:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L44:
            if (r9 >= r14) goto L84
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L7c
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r5[r17]
            r17 = r6[r17]
            r15 = -1
            if (r11 != r15) goto L61
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L91
        L61:
            if (r11 == 0) goto L66
            r3.append(r1)
        L66:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            r0 = 8
            goto L7d
        L7c:
            r0 = r15
        L7d:
            long r12 = r12 >> r0
            int r9 = r9 + 1
            r15 = r0
            r0 = r21
            goto L44
        L84:
            r0 = r15
            if (r14 != r0) goto L8e
        L87:
            if (r10 == r8) goto L8e
            int r10 = r10 + 1
            r0 = r21
            goto L27
        L8e:
            r3.append(r4)
        L91:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.joinToString(java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r10
  0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002e, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb p000.gz6<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            p000.md8.checkNotNullParameter(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            long[] r4 = r0.f33342b
            int[] r5 = r0.f33343c
            long[] r6 = r0.f33341a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L82
            r9 = 0
            r10 = 0
        L20:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7d
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3a:
            if (r15 >= r13) goto L7a
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L74
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L57
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L85
        L57:
            if (r10 == 0) goto L5e
            java.lang.String r8 = ", "
            r2.append(r8)
        L5e:
            java.lang.Long r8 = java.lang.Long.valueOf(r17)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            r8 = 8
            goto L75
        L74:
            r8 = r14
        L75:
            long r11 = r11 >> r8
            int r15 = r15 + 1
            r14 = r8
            goto L3a
        L7a:
            r8 = r14
            if (r13 != r8) goto L82
        L7d:
            if (r9 == r7) goto L82
            int r9 = r9 + 1
            goto L20
        L82:
            r2.append(r3)
        L85:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.el9.joinToString(gz6):java.lang.String");
    }
}
