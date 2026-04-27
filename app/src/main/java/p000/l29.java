package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1334:1\n55#1,9:1336\n77#1,4:1345\n1013#1:1362\n1014#1,3:1367\n77#1,4:1370\n77#1,4:1374\n77#1,4:1378\n1013#1:1389\n1014#1,3:1394\n77#1,4:1405\n77#1,4:1409\n1013#1:1430\n1014#1,3:1435\n77#1,4:1440\n77#1,4:1446\n77#1,4:1450\n1013#1:1471\n1014#1,3:1476\n77#1,4:1479\n77#1,4:1483\n1073#1,4:1489\n77#1,4:1493\n77#1,4:1497\n982#1,3:1501\n1000#1:1504\n985#1:1509\n986#1,9:1512\n1001#1:1528\n996#1:1529\n982#1,3:1530\n1000#1:1533\n985#1:1538\n986#1,9:1541\n1001#1:1557\n996#1:1558\n77#1,4:1559\n65#1:1573\n1046#1,11:1577\n1013#1:1588\n1014#1,3:1593\n1000#1:1596\n1001#1:1609\n1013#1:1638\n1014#1,3:1643\n26#2:1335\n26#2:1487\n26#2:1488\n246#3:1349\n243#3:1350\n243#3:1356\n246#3:1382\n243#3:1383\n243#3:1399\n246#3:1417\n243#3:1418\n243#3:1424\n246#3:1458\n243#3:1459\n243#3:1465\n1009#4:1351\n1008#4:1352\n1007#4:1354\n1009#4:1357\n1008#4:1358\n1007#4:1360\n1007#4:1363\n1008#4:1365\n1009#4:1384\n1008#4:1385\n1007#4:1387\n1007#4:1390\n1008#4:1392\n1007#4:1397\n1009#4:1400\n1008#4:1401\n1007#4:1403\n1009#4:1419\n1008#4:1420\n1007#4:1422\n1009#4:1425\n1008#4:1426\n1007#4:1428\n1007#4:1431\n1008#4:1433\n1007#4:1438\n1009#4:1460\n1008#4:1461\n1007#4:1463\n1009#4:1466\n1008#4:1467\n1007#4:1469\n1007#4:1472\n1008#4:1474\n1007#4:1589\n1008#4:1591\n1007#4:1634\n1008#4:1636\n1007#4:1639\n1008#4:1641\n114#5:1353\n107#5:1355\n114#5:1359\n107#5:1361\n107#5:1364\n114#5:1366\n114#5:1386\n107#5:1388\n107#5:1391\n114#5:1393\n107#5:1398\n114#5:1402\n107#5:1404\n114#5:1421\n107#5:1423\n114#5:1427\n107#5:1429\n107#5:1432\n114#5:1434\n107#5:1439\n114#5:1462\n107#5:1464\n114#5:1468\n107#5:1470\n107#5:1473\n114#5:1475\n107#5:1590\n114#5:1592\n107#5:1635\n114#5:1637\n107#5:1640\n114#5:1642\n12774#6,2:1413\n12541#6,2:1415\n12774#6,2:1444\n12583#6,2:1454\n12774#6,2:1456\n12583#6,2:1510\n12583#6,2:1539\n12774#6,2:1569\n12583#6,2:1571\n12744#6,2:1575\n51#7,4:1505\n56#7:1521\n33#7,6:1522\n51#7,4:1534\n56#7:1550\n33#7,6:1551\n33#7,6:1563\n51#7,6:1597\n33#7,6:1603\n51#7,6:1610\n33#7,6:1616\n51#7,6:1622\n33#7,6:1628\n1#8:1574\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n256#1:1336,9\n346#1:1345,4\n391#1:1362\n391#1:1367,3\n403#1:1370,4\n445#1:1374,4\n484#1:1378,4\n512#1:1389\n512#1:1394,3\n536#1:1405,4\n539#1:1409,4\n572#1:1430\n572#1:1435,3\n593#1:1440,4\n616#1:1446,4\n619#1:1450,4\n691#1:1471\n691#1:1476,3\n729#1:1479,4\n732#1:1483,4\n749#1:1489,4\n753#1:1493,4\n776#1:1497,4\n806#1:1501,3\n806#1:1504\n806#1:1509\n806#1:1512,9\n806#1:1528\n806#1:1529\n836#1:1530,3\n836#1:1533\n836#1:1538\n836#1:1541,9\n836#1:1557\n836#1:1558\n867#1:1559,4\n256#1:1573\n950#1:1577,11\n969#1:1588\n969#1:1593,3\n984#1:1596\n984#1:1609\n1026#1:1638\n1026#1:1643,3\n173#1:1335\n741#1:1487\n742#1:1488\n383#1:1349\n383#1:1350\n390#1:1356\n510#1:1382\n510#1:1383\n529#1:1399\n563#1:1417\n563#1:1418\n567#1:1424\n683#1:1458\n683#1:1459\n690#1:1465\n383#1:1351\n383#1:1352\n383#1:1354\n390#1:1357\n390#1:1358\n390#1:1360\n391#1:1363\n391#1:1365\n510#1:1384\n510#1:1385\n510#1:1387\n512#1:1390\n512#1:1392\n520#1:1397\n529#1:1400\n529#1:1401\n529#1:1403\n563#1:1419\n563#1:1420\n563#1:1422\n567#1:1425\n567#1:1426\n567#1:1428\n572#1:1431\n572#1:1433\n584#1:1438\n683#1:1460\n683#1:1461\n683#1:1463\n690#1:1466\n690#1:1467\n690#1:1469\n691#1:1472\n691#1:1474\n969#1:1589\n969#1:1591\n1013#1:1634\n1013#1:1636\n1026#1:1639\n1026#1:1641\n383#1:1353\n383#1:1355\n390#1:1359\n390#1:1361\n391#1:1364\n391#1:1366\n510#1:1386\n510#1:1388\n512#1:1391\n512#1:1393\n520#1:1398\n529#1:1402\n529#1:1404\n563#1:1421\n563#1:1423\n567#1:1427\n567#1:1429\n572#1:1432\n572#1:1434\n584#1:1439\n683#1:1462\n683#1:1464\n690#1:1468\n690#1:1470\n691#1:1473\n691#1:1475\n969#1:1590\n969#1:1592\n1013#1:1635\n1013#1:1637\n1026#1:1640\n1026#1:1642\n548#1:1413,2\n551#1:1415,2\n612#1:1444,2\n626#1:1454,2\n634#1:1456,2\n819#1:1510,2\n852#1:1539,2\n906#1:1569,2\n907#1:1571,2\n948#1:1575,2\n806#1:1505,4\n806#1:1521\n806#1:1522,6\n836#1:1534,4\n836#1:1550\n836#1:1551,6\n897#1:1563,6\n984#1:1597,6\n984#1:1603,6\n1000#1:1610,6\n1000#1:1616,6\n1000#1:1622,6\n1000#1:1628,6\n*E\n"})
public final class l29 {

    /* JADX INFO: renamed from: a */
    public static final boolean f55994a = false;

    /* JADX INFO: renamed from: b */
    public static final int f55995b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l29$a */
    public static final class C8583a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C8583a f55996a = new C8583a();

        public C8583a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
        }
    }

    /* JADX INFO: renamed from: l29$b */
    @dwf({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$30\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1334:1\n33#2,6:1335\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$30\n*L\n914#1:1335,6\n*E\n"})
    public static final class C8584b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<q29> f55997a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ k29 f55998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8584b(List<q29> list, k29 k29Var) {
            super(1);
            this.f55997a = list;
            this.f55998b = k29Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<q29> list = this.f55997a;
            k29 k29Var = this.f55998b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).place(aVar, k29Var);
            }
            aub.m27883attachToScopeimpl(this.f55998b.getState().m33465getPlacementScopeInvalidatorzYiylxw$foundation_release());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15277a(List list, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (!z) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                qy6Var.invoke(list.get(i2));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            qy6Var.invoke(list.get(size2));
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    @ah5
    private static final List<q29> calculateExtraItems(k29 k29Var, qy6<? super q29, bth> qy6Var, qy6<? super Integer, Boolean> qy6Var2, boolean z) {
        List<Integer> pinnedItems = k29Var.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (qy6Var2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM30634getSpanRangelOCCd4c = k29Var.m30634getSpanRangelOCCd4c(k29Var.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        q29 q29VarM31117getAndMeasurejy6DScQ = k29Var.getMeasuredItemProvider().m31117getAndMeasurejy6DScQ(iIntValue, jM30634getSpanRangelOCCd4c);
                        qy6Var.invoke(q29VarM31117getAndMeasurejy6DScQ);
                        arrayList.add(q29VarM31117getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iIntValue2 = pinnedItems.get(i2).intValue();
                if (qy6Var2.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM30634getSpanRangelOCCd4c2 = k29Var.m30634getSpanRangelOCCd4c(k29Var.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    q29 q29VarM31117getAndMeasurejy6DScQ2 = k29Var.getMeasuredItemProvider().m31117getAndMeasurejy6DScQ(iIntValue2, jM30634getSpanRangelOCCd4c2);
                    qy6Var.invoke(q29VarM31117getAndMeasurejy6DScQ2);
                    arrayList.add(q29VarM31117getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    private static final List<q29> calculateVisibleItems(k29 k29Var, e60<q29>[] e60VarArr, int[] iArr, int i) {
        int size = 0;
        for (e60<q29> e60Var : e60VarArr) {
            size += e60Var.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (e60<q29> e60Var2 : e60VarArr) {
                if (!e60Var2.isEmpty()) {
                    int length = e60VarArr.length;
                    int i2 = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < length; i4++) {
                        q29 q29VarFirstOrNull = e60VarArr[i4].firstOrNull();
                        int index = q29VarFirstOrNull != null ? q29VarFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i3 > index) {
                            i2 = i4;
                            i3 = index;
                        }
                    }
                    q29 q29VarRemoveFirst = e60VarArr[i2].removeFirst();
                    if (q29VarRemoveFirst.getLane() == i2) {
                        long jM32226constructorimpl = rwf.m32226constructorimpl(q29VarRemoveFirst.getLane(), q29VarRemoveFirst.getSpan());
                        int iM30805maxInRangejy6DScQ = m30805maxInRangejy6DScQ(iArr, jM32226constructorimpl);
                        q29VarRemoveFirst.position(iM30805maxInRangejy6DScQ, k29Var.getResolvedSlots().getPositions()[i2], i);
                        arrayList.add(q29VarRemoveFirst);
                        int i5 = (int) (jM32226constructorimpl & 4294967295L);
                        for (int i6 = (int) (jM32226constructorimpl >> 32); i6 < i5; i6++) {
                            iArr[i6] = q29VarRemoveFirst.getMainAxisSizeWithSpacings() + iM30805maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    private static final String debugRender(e60<q29>[] e60VarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(k29 k29Var, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && k29Var.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(k29Var, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !k29Var.isFullSpan(k29Var.getItemProvider(), iArr[length])) {
                k29Var.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, qy6<? super T, bth> qy6Var) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                qy6Var.invoke(list.get(i));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            qy6Var.invoke(list.get(size2));
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(k29 k29Var, int i, int i2) {
        return k29Var.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m30804forEachnIS5qE8(long j, qy6<? super Integer, bth> qy6Var) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            qy6Var.invoke(Integer.valueOf(i2));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final <T> int indexOfMinBy(T[] tArr, qy6<? super T, Integer> qy6Var) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int iIntValue = qy6Var.invoke(tArr[i3]).intValue();
            if (i2 > iIntValue) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    public static final int indexOfMinValue(@yfb int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m30805maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ed, code lost:
    
        r3 = indexOfMinValue$default(r13, 0, 1, null);
        r4 = indexOfMaxValue(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f8, code lost:
    
        if (r3 == r4) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02fe, code lost:
    
        if (r13[r3] != r13[r4]) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0300, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0302, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0303, code lost:
    
        r4 = r30[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0306, code lost:
    
        if (r4 != (-1)) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0308, code lost:
    
        r8 = r47;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x030c, code lost:
    
        r8 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030e, code lost:
    
        r4 = findPreviousItemIndex(r8, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0312, code lost:
    
        if (r4 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        r11 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0316, code lost:
    
        if (r0 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031c, code lost:
    
        if (measure$lambda$38$misalignedStart(r11, r8, r13, r3) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
    
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0322, code lost:
    
        if (r51 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0324, code lost:
    
        r47.getLaneInfo().reset();
        r0 = r11.length;
        r1 = new int[r0];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032f, code lost:
    
        if (r2 >= r0) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0331, code lost:
    
        r1[r2] = -1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0337, code lost:
    
        r0 = r13.length;
        r2 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033b, code lost:
    
        if (r4 >= r0) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033d, code lost:
    
        r2[r4] = r13[r3];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034b, code lost:
    
        return measure(r8, r29, r1, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034c, code lost:
    
        r31 = r1;
        r25 = r7;
        r48 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0354, code lost:
    
        r9 = r29;
        r11 = r30;
        r48 = r15;
        r14 = r8.m30634getSpanRangelOCCd4c(r47.getItemProvider(), r4, r3);
        r3 = r47.getLaneInfo();
        r50 = r0;
        r31 = r1;
        r0 = (int) (r14 & 4294967295L);
        r25 = r7;
        r1 = (int) (r14 >> 32);
        r7 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037c, code lost:
    
        if (r7 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037e, code lost:
    
        r8 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0380, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0381, code lost:
    
        r3.setLane(r4, r8);
        r3 = r47.getMeasuredItemProvider().m31117getAndMeasurejy6DScQ(r4, r14);
        r8 = m30805maxInRangejy6DScQ(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0391, code lost:
    
        if (r7 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0393, code lost:
    
        r7 = r47.getLaneInfo().getGaps(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x039c, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x039d, code lost:
    
        r14 = r1;
        r1 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a0, code lost:
    
        if (r14 >= r0) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03a4, code lost:
    
        if (r13[r14] == r8) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03a7, code lost:
    
        r6[r14].addFirst(r3);
        r11[r14] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ae, code lost:
    
        if (r7 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b0, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b2, code lost:
    
        r15 = r7[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03b4, code lost:
    
        r13[r14] = (r8 + r3.getMainAxisSizeWithSpacings()) + r15;
        r14 = r14 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:342:0x073f  */
    @p000.ah5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final p000.o29 measure(p000.k29 r47, int r48, int[] r49, int[] r50, boolean r51) {
        /*
            Method dump skipped, instruction units count: 2323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l29.measure(k29, int, int[], int[], boolean):o29");
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, k29 k29Var) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-k29Var.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, k29 k29Var, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(k29Var, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(k29Var, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = k29Var.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    @ah5
    @yfb
    /* JADX INFO: renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final o29 m30806measureStaggeredGridXtK8cYQ(@yfb zz8 zz8Var, @yfb z29 z29Var, @yfb List<Integer> list, @yfb c29 c29Var, @yfb x29 x29Var, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, @yfb x13 x13Var, @yfb s97 s97Var) {
        int iM30805maxInRangejy6DScQ;
        k29 k29Var = new k29(z29Var, list, c29Var, x29Var, j, z, zz8Var, i, j2, i3, i4, z2, i2, x13Var, s97Var, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = z29Var.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(c29Var, z29Var.getScrollPosition$foundation_release().getIndices());
        int[] scrollOffsets = z29Var.getScrollPosition$foundation_release().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != k29Var.getLaneCount()) {
            k29Var.getLaneInfo().reset();
            int laneCount = k29Var.getLaneCount();
            int[] iArr = new int[laneCount];
            int i5 = 0;
            while (i5 < laneCount) {
                if (i5 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM30805maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i5]) == -1) {
                    iM30805maxInRangejy6DScQ = i5 == 0 ? 0 : m30805maxInRangejy6DScQ(iArr, rwf.m32226constructorimpl(0, i5)) + 1;
                }
                iArr[i5] = iM30805maxInRangejy6DScQ;
                k29Var.getLaneInfo().setLane(iArr[i5], i5);
                i5++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != k29Var.getLaneCount()) {
            int laneCount2 = k29Var.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i6 = 0;
            while (i6 < laneCount2) {
                iArr2[i6] = i6 < scrollOffsets.length ? scrollOffsets[i6] : i6 == 0 ? 0 : iArr2[i6 - 1];
                i6++;
            }
            scrollOffsets = iArr2;
        }
        return measure(k29Var, Math.round(z29Var.getScrollToBeConsumed$foundation_release()), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    private static final int[] transform(int[] iArr, qy6<? super Integer, Integer> qy6Var) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = qy6Var.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    @ah5
    private static final <T> T withDebugLogging(zz8 zz8Var, qy6<? super zz8, ? extends T> qy6Var) {
        return qy6Var.invoke(zz8Var);
    }
}
