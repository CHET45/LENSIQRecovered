package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1058:1\n373#1,6:1061\n383#1,3:1068\n386#1,9:1072\n373#1,6:1081\n383#1,3:1088\n386#1,9:1092\n373#1,6:1101\n383#1,3:1108\n386#1,9:1112\n401#1,4:1121\n373#1,6:1125\n383#1,3:1132\n386#1,2:1136\n406#1,2:1138\n389#1,6:1140\n408#1:1146\n401#1,4:1147\n373#1,6:1151\n383#1,3:1158\n386#1,2:1162\n406#1,2:1164\n389#1,6:1166\n408#1:1172\n401#1,4:1173\n373#1,6:1177\n383#1,3:1184\n386#1,2:1188\n406#1,2:1190\n389#1,6:1192\n408#1:1198\n428#1,3:1199\n373#1,6:1202\n383#1,3:1209\n386#1,2:1213\n431#1,2:1215\n389#1,6:1217\n433#1:1223\n401#1,4:1224\n373#1,6:1228\n383#1,3:1235\n386#1,2:1239\n406#1,2:1241\n389#1,6:1243\n408#1:1249\n401#1,4:1250\n373#1,6:1254\n383#1,3:1261\n386#1,2:1265\n406#1,2:1267\n389#1,6:1269\n408#1:1275\n401#1,4:1276\n373#1,6:1280\n383#1,3:1287\n386#1,2:1291\n406#1,2:1293\n389#1,6:1295\n408#1:1301\n401#1,4:1302\n373#1,6:1306\n383#1,3:1313\n386#1,2:1317\n406#1,2:1319\n389#1,6:1321\n408#1:1327\n401#1,4:1328\n373#1,6:1332\n383#1,3:1339\n386#1,2:1343\n406#1,2:1345\n389#1,6:1347\n408#1:1353\n401#1,4:1354\n373#1,6:1358\n383#1,3:1365\n386#1,2:1369\n406#1,2:1371\n389#1,6:1373\n408#1:1379\n537#1,11:1396\n401#1,4:1407\n373#1,6:1411\n383#1,3:1418\n386#1,2:1422\n406#1:1424\n548#1,10:1425\n407#1:1435\n389#1,6:1436\n408#1:1442\n558#1,2:1443\n537#1,11:1445\n401#1,4:1456\n373#1,6:1460\n383#1,3:1467\n386#1,2:1471\n406#1:1473\n548#1,10:1474\n407#1:1484\n389#1,6:1485\n408#1:1491\n558#1,2:1492\n537#1,11:1494\n401#1,4:1505\n373#1,6:1509\n383#1,3:1516\n386#1,2:1520\n406#1:1522\n548#1,10:1523\n407#1:1533\n389#1,6:1534\n408#1:1540\n558#1,2:1541\n537#1,11:1543\n401#1,4:1554\n373#1,6:1558\n383#1,3:1565\n386#1,2:1569\n406#1:1571\n548#1,10:1572\n407#1:1582\n389#1,6:1583\n408#1:1589\n558#1,2:1590\n537#1,11:1592\n401#1,4:1603\n373#1,6:1607\n383#1,3:1614\n386#1,2:1618\n406#1:1620\n548#1,10:1621\n407#1:1631\n389#1,6:1632\n408#1:1638\n558#1,2:1639\n1810#2:1059\n1672#2:1060\n1810#2:1067\n1672#2:1071\n1810#2:1087\n1672#2:1091\n1810#2:1107\n1672#2:1111\n1810#2:1131\n1672#2:1135\n1810#2:1157\n1672#2:1161\n1810#2:1183\n1672#2:1187\n1810#2:1208\n1672#2:1212\n1810#2:1234\n1672#2:1238\n1810#2:1260\n1672#2:1264\n1810#2:1286\n1672#2:1290\n1810#2:1312\n1672#2:1316\n1810#2:1338\n1672#2:1342\n1810#2:1364\n1672#2:1368\n1589#2,3:1380\n1603#2:1383\n1599#2:1384\n1779#2,3:1385\n1793#2,3:1388\n1717#2:1391\n1705#2:1392\n1699#2:1393\n1712#2:1394\n1802#2:1395\n1810#2:1417\n1672#2:1421\n1810#2:1466\n1672#2:1470\n1810#2:1515\n1672#2:1519\n1810#2:1564\n1672#2:1568\n1810#2:1613\n1672#2:1617\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n*L\n404#1:1061,6\n404#1:1068,3\n404#1:1072,9\n417#1:1081,6\n417#1:1088,3\n417#1:1092,9\n430#1:1101,6\n430#1:1108,3\n430#1:1112,9\n439#1:1121,4\n439#1:1125,6\n439#1:1132,3\n439#1:1136,2\n439#1:1138,2\n439#1:1140,6\n439#1:1146\n449#1:1147,4\n449#1:1151,6\n449#1:1158,3\n449#1:1162,2\n449#1:1164,2\n449#1:1166,6\n449#1:1172\n465#1:1173,4\n465#1:1177,6\n465#1:1184,3\n465#1:1188,2\n465#1:1190,2\n465#1:1192,6\n465#1:1198\n488#1:1199,3\n488#1:1202,6\n488#1:1209,3\n488#1:1213,2\n488#1:1215,2\n488#1:1217,6\n488#1:1223\n512#1:1224,4\n512#1:1228,6\n512#1:1235,3\n512#1:1239,2\n512#1:1241,2\n512#1:1243,6\n512#1:1249\n547#1:1250,4\n547#1:1254,6\n547#1:1261,3\n547#1:1265,2\n547#1:1267,2\n547#1:1269,6\n547#1:1275\n547#1:1276,4\n547#1:1280,6\n547#1:1287,3\n547#1:1291,2\n547#1:1293,2\n547#1:1295,6\n547#1:1301\n568#1:1302,4\n568#1:1306,6\n568#1:1313,3\n568#1:1317,2\n568#1:1319,2\n568#1:1321,6\n568#1:1327\n597#1:1328,4\n597#1:1332,6\n597#1:1339,3\n597#1:1343,2\n597#1:1345,2\n597#1:1347,6\n597#1:1353\n619#1:1354,4\n619#1:1358,6\n619#1:1365,3\n619#1:1369,2\n619#1:1371,2\n619#1:1373,6\n619#1:1379\n-1#1:1396,11\n-1#1:1407,4\n-1#1:1411,6\n-1#1:1418,3\n-1#1:1422,2\n-1#1:1424\n-1#1:1425,10\n-1#1:1435\n-1#1:1436,6\n-1#1:1442\n-1#1:1443,2\n-1#1:1445,11\n-1#1:1456,4\n-1#1:1460,6\n-1#1:1467,3\n-1#1:1471,2\n-1#1:1473\n-1#1:1474,10\n-1#1:1484\n-1#1:1485,6\n-1#1:1491\n-1#1:1492,2\n-1#1:1494,11\n-1#1:1505,4\n-1#1:1509,6\n-1#1:1516,3\n-1#1:1520,2\n-1#1:1522\n-1#1:1523,10\n-1#1:1533\n-1#1:1534,6\n-1#1:1540\n-1#1:1541,2\n-1#1:1543,11\n-1#1:1554,4\n-1#1:1558,6\n-1#1:1565,3\n-1#1:1569,2\n-1#1:1571\n-1#1:1572,10\n-1#1:1582\n-1#1:1583,6\n-1#1:1589\n-1#1:1590,2\n-1#1:1592,11\n-1#1:1603,4\n-1#1:1607,6\n-1#1:1614,3\n-1#1:1618,2\n-1#1:1620\n-1#1:1621,10\n-1#1:1631\n-1#1:1632,6\n-1#1:1638\n-1#1:1639,2\n378#1:1059\n385#1:1060\n404#1:1067\n404#1:1071\n417#1:1087\n417#1:1091\n430#1:1107\n430#1:1111\n439#1:1131\n439#1:1135\n449#1:1157\n449#1:1161\n465#1:1183\n465#1:1187\n488#1:1208\n488#1:1212\n512#1:1234\n512#1:1238\n547#1:1260\n547#1:1264\n547#1:1286\n547#1:1290\n568#1:1312\n568#1:1316\n597#1:1338\n597#1:1342\n619#1:1364\n619#1:1368\n638#1:1380,3\n639#1:1383\n642#1:1384\n646#1:1385,3\n647#1:1388,3\n648#1:1391\n649#1:1392\n649#1:1393\n653#1:1394\n656#1:1395\n-1#1:1417\n-1#1:1421\n-1#1:1466\n-1#1:1470\n-1#1:1515\n-1#1:1519\n-1#1:1564\n-1#1:1568\n-1#1:1613\n-1#1:1617\n*E\n"})
public abstract class ekb<K> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public long[] f33264a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public Object[] f33265b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public long[] f33266c;

    /* JADX INFO: renamed from: d */
    @un8
    public int f33267d;

    /* JADX INFO: renamed from: e */
    @un8
    public int f33268e;

    public /* synthetic */ ekb(jt3 jt3Var) {
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

    public static /* synthetic */ String joinToString$default(ekb ekbVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return ekbVar.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean all(@yfb gz6<? super K, ? super Long, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        Object[] objArr = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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
                        if (!gz6Var.invoke(objArr[i4], Long.valueOf(jArr[i4])).booleanValue()) {
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
        return this.f33268e != 0;
    }

    public final boolean contains(K k) {
        return findKeyIndex(k) >= 0;
    }

    public final boolean containsKey(K k) {
        return findKeyIndex(k) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(long r16) {
        /*
            r15 = this;
            r0 = r15
            long[] r1 = r0.f33266c
            long[] r2 = r0.f33264a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L47
            r5 = r4
        Lc:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L42
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L26:
            if (r10 >= r8) goto L40
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L3c
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            int r11 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r11 != 0) goto L3c
            r1 = 1
            return r1
        L3c:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L26
        L40:
            if (r8 != r9) goto L47
        L42:
            if (r5 == r3) goto L47
            int r5 = r5 + 1
            goto Lc
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.containsValue(long):boolean");
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
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
            boolean r3 = r1 instanceof p000.ekb
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            ekb r1 = (p000.ekb) r1
            int r3 = r1.getSize()
            int r5 = r18.getSize()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f33265b
            long[] r5 = r0.f33266c
            long[] r6 = r0.f33264a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L67
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
            if (r11 == 0) goto L62
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L60
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            long r14 = r1.get(r15)
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L5c
            return r4
        L5c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L60:
            if (r11 != r12) goto L67
        L62:
            if (r8 == r7) goto L67
            int r8 = r8 + 1
            goto L27
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.equals(java.lang.Object):boolean");
    }

    @yjd
    public final int findKeyIndex(K k) {
        int i = 0;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f33267d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f33264a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * coe.f17281k) ^ j;
            for (long j3 = (~j2) & (j2 - coe.f17281k) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (md8.areEqual(this.f33265b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void forEach(@yfb gz6<? super K, ? super Long, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        Object[] objArr = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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
                        gz6Var.invoke(objArr[i4], Long.valueOf(jArr[i4]));
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

    public final void forEachKey(@yfb qy6<? super K, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f33265b;
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
                        qy6Var.invoke(objArr[(i << 3) + i3]);
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

    public final void forEachValue(@yfb qy6<? super Long, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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

    public final long get(K k) {
        int iFindKeyIndex = findKeyIndex(k);
        if (iFindKeyIndex >= 0) {
            return this.f33266c[iFindKeyIndex];
        }
        throw new NoSuchElementException("There is no key " + k + " in the map");
    }

    public final int getCapacity() {
        return this.f33267d;
    }

    public final long getOrDefault(K k, long j) {
        int iFindKeyIndex = findKeyIndex(k);
        return iFindKeyIndex >= 0 ? this.f33266c[iFindKeyIndex] : j;
    }

    public final long getOrElse(K k, @yfb ny6<Long> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k);
        return iFindKeyIndex >= 0 ? this.f33266c[iFindKeyIndex] : ny6Var.invoke().longValue();
    }

    public final int getSize() {
        return this.f33268e;
    }

    public int hashCode() {
        Object[] objArr = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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
                            Object obj = objArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i5]);
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
        return this.f33268e == 0;
    }

    public final boolean isNotEmpty() {
        return this.f33268e != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this.f33268e == 0;
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
        Object[] objArr = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this.f33268e) {
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
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
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

    private ekb() {
        this.f33264a = coe.f17275e;
        this.f33265b = cv2.f27725c;
        this.f33266c = yl9.getEmptyLongArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@p000.yfb p000.gz6<? super K, ? super java.lang.Long, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            p000.md8.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.f33265b
            long[] r3 = r0.f33266c
            long[] r4 = r0.f33264a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5f
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
            if (r10 == 0) goto L5a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L54
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r15 = r3[r13]
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L54
            r1 = 1
            return r1
        L54:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L58:
            if (r10 != r11) goto L5f
        L5a:
            if (r7 == r5) goto L5f
            int r7 = r7 + 1
            goto L16
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.any(gz6):boolean");
    }

    public final int count(@yfb gz6<? super K, ? super Long, Boolean> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "predicate");
        Object[] objArr = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
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
                            if (gz6Var.invoke(objArr[i6], Long.valueOf(jArr[i6])).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(ekb ekbVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, gz6 gz6Var, int i2, Object obj) {
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
            Object[] objArr = ekbVar.f33265b;
            long[] jArr3 = ekbVar.f33266c;
            long[] jArr4 = ekbVar.f33264a;
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
                                Object obj2 = objArr[i11];
                                long j2 = jArr3[i11];
                                if (i6 == i4) {
                                    sb.append(charSequence8);
                                    break loop0;
                                }
                                if (i6 != 0) {
                                    sb.append(charSequence5);
                                }
                                jArr2 = jArr4;
                                sb.append((CharSequence) gz6Var.invoke(obj2, Long.valueOf(j2)));
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
        Object[] objArr;
        Object[] objArr2;
        int i2;
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr3 = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            Object obj = objArr3[i8];
                            objArr2 = objArr3;
                            long j2 = jArr[i8];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(obj);
                            sb.append('=');
                            sb.append(j2);
                            i4++;
                            i2 = 8;
                        } else {
                            objArr2 = objArr3;
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr3 = objArr;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @yfb gz6<? super K, ? super Long, ? extends CharSequence> gz6Var) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence charSequence5 = charSequence;
        md8.checkNotNullParameter(charSequence5, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        md8.checkNotNullParameter(gz6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr3 = this.f33265b;
        long[] jArr = this.f33266c;
        long[] jArr2 = this.f33264a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr3[i7];
                            long j2 = jArr[i7];
                            objArr2 = objArr3;
                            if (i3 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence5);
                            }
                            sb.append(gz6Var.invoke(obj, Long.valueOf(j2)));
                            i3++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i6++;
                        charSequence5 = charSequence;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                charSequence5 = charSequence;
                objArr3 = objArr;
            }
            sb.append(charSequence3);
        } else {
            sb.append(charSequence3);
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[PHI: r11
  0x0090: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:20:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r21, @p000.yfb java.lang.CharSequence r22, @p000.yfb java.lang.CharSequence r23, int r24, @p000.yfb p000.gz6<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
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
            java.lang.Object[] r2 = r0.f33265b
            long[] r6 = r0.f33266c
            long[] r7 = r0.f33264a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
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
            if (r14 == 0) goto L90
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L50:
            if (r9 >= r14) goto L8d
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r9
            r15 = r2[r16]
            r18 = r6[r16]
            r0 = r24
            if (r11 != r0) goto L6e
            java.lang.String r0 = "..."
            r5.append(r0)
            goto L9a
        L6e:
            if (r11 == 0) goto L73
            r5.append(r1)
        L73:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            int r11 = r11 + 1
            r0 = 8
            goto L86
        L85:
            r0 = r15
        L86:
            long r12 = r12 >> r0
            int r9 = r9 + 1
            r15 = r0
            r0 = r20
            goto L50
        L8d:
            r0 = r15
            if (r14 != r0) goto L97
        L90:
            if (r10 == r8) goto L97
            int r10 = r10 + 1
            r0 = r20
            goto L33
        L97:
            r5.append(r3)
        L9a:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[PHI: r11
  0x008f: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0044, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r21, @p000.yfb java.lang.CharSequence r22, @p000.yfb java.lang.CharSequence r23, @p000.yfb p000.gz6<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
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
            java.lang.Object[] r2 = r0.f33265b
            long[] r6 = r0.f33266c
            long[] r7 = r0.f33264a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L96
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
            if (r14 == 0) goto L8f
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L50:
            if (r9 >= r14) goto L8c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L84
            int r16 = r10 << 3
            int r16 = r16 + r9
            r15 = r2[r16]
            r18 = r6[r16]
            r0 = -1
            if (r11 != r0) goto L6d
            java.lang.String r0 = "..."
            r5.append(r0)
            goto L99
        L6d:
            if (r11 == 0) goto L72
            r5.append(r1)
        L72:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            int r11 = r11 + 1
            r0 = 8
            goto L85
        L84:
            r0 = r15
        L85:
            long r12 = r12 >> r0
            int r9 = r9 + 1
            r15 = r0
            r0 = r20
            goto L50
        L8c:
            r0 = r15
            if (r14 != r0) goto L96
        L8f:
            if (r10 == r8) goto L96
            int r10 = r10 + 1
            r0 = r20
            goto L33
        L96:
            r5.append(r3)
        L99:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[PHI: r10
  0x0083: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003a, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r21, @p000.yfb java.lang.CharSequence r22, @p000.yfb p000.gz6<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r23) {
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
            java.lang.Object[] r2 = r0.f33265b
            long[] r5 = r0.f33266c
            long[] r6 = r0.f33264a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L88
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
            if (r13 == 0) goto L83
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L46:
            if (r15 >= r13) goto L80
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7a
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r2[r16]
            r16 = r5[r16]
            r14 = -1
            if (r10 != r14) goto L63
            java.lang.String r1 = "..."
            r4.append(r1)
            goto L8d
        L63:
            if (r10 == 0) goto L68
            r4.append(r1)
        L68:
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r3.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r4.append(r8)
            int r10 = r10 + 1
            r8 = 8
            goto L7b
        L7a:
            r8 = r14
        L7b:
            long r11 = r11 >> r8
            int r15 = r15 + 1
            r14 = r8
            goto L46
        L80:
            r8 = r14
            if (r13 != r8) goto L88
        L83:
            if (r9 == r7) goto L88
            int r9 = r9 + 1
            goto L2c
        L88:
            java.lang.String r1 = ""
            r4.append(r1)
        L8d:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.joinToString(java.lang.CharSequence, java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[PHI: r11
  0x0083: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0038, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb java.lang.CharSequence r22, @p000.yfb p000.gz6<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r23) {
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
            java.lang.Object[] r5 = r0.f33265b
            long[] r6 = r0.f33266c
            long[] r7 = r0.f33264a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8a
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
            if (r14 == 0) goto L83
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L44:
            if (r9 >= r14) goto L80
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L78
            int r17 = r10 << 3
            int r17 = r17 + r9
            r15 = r5[r17]
            r19 = r6[r17]
            r0 = -1
            if (r11 != r0) goto L61
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L8d
        L61:
            if (r11 == 0) goto L66
            r3.append(r1)
        L66:
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            r0 = 8
            goto L79
        L78:
            r0 = r15
        L79:
            long r12 = r12 >> r0
            int r9 = r9 + 1
            r15 = r0
            r0 = r21
            goto L44
        L80:
            r0 = r15
            if (r14 != r0) goto L8a
        L83:
            if (r10 == r8) goto L8a
            int r10 = r10 + 1
            r0 = r21
            goto L27
        L8a:
            r3.append(r4)
        L8d:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.joinToString(java.lang.CharSequence, gz6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[PHI: r10
  0x0079: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002e, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    @p000.yfb
    @p000.yn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@p000.yfb p000.gz6<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r21) {
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
            java.lang.Object[] r4 = r0.f33265b
            long[] r5 = r0.f33266c
            long[] r6 = r0.f33264a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
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
            if (r13 == 0) goto L79
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3a:
            if (r15 >= r13) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r18 = r5[r16]
            r14 = -1
            if (r10 != r14) goto L57
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L81
        L57:
            if (r10 == 0) goto L5e
            java.lang.String r14 = ", "
            r2.append(r14)
        L5e:
            java.lang.Long r14 = java.lang.Long.valueOf(r18)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            r8 = 8
            goto L71
        L70:
            r8 = r14
        L71:
            long r11 = r11 >> r8
            int r15 = r15 + 1
            r14 = r8
            goto L3a
        L76:
            r8 = r14
            if (r13 != r8) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L20
        L7e:
            r2.append(r3)
        L81:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p000.md8.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ekb.joinToString(gz6):java.lang.String");
    }
}
