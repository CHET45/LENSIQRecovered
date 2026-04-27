package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n393#1,3:514\n396#1,15:521\n412#1:537\n393#1,3:538\n396#1,15:545\n412#1:561\n1#2:510\n26#3:511\n26#3:512\n26#3:513\n33#4,4:517\n38#4:536\n33#4,4:541\n38#4:560\n33#4,6:562\n235#4,3:568\n33#4,4:571\n238#4,2:575\n38#4:577\n240#4:578\n33#4,6:579\n132#4,3:585\n33#4,4:588\n135#4,2:592\n38#4:594\n137#4:595\n51#4,6:596\n33#4,6:602\n33#4,6:608\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n263#1:514,3\n263#1:521,15\n263#1:537\n270#1:538,3\n270#1:545,15\n270#1:561\n126#1:511\n248#1:512\n249#1:513\n263#1:517,4\n263#1:536\n270#1:541,4\n270#1:560\n346#1:562,6\n368#1:568,3\n368#1:571,4\n368#1:575,2\n368#1:577\n368#1:578\n395#1:579,6\n439#1:585,3\n439#1:588,4\n439#1:592,2\n439#1:594\n439#1:595\n482#1:596,6\n489#1:602,6\n494#1:608,6\n*E\n"})
public final class gy8 {

    /* JADX INFO: renamed from: gy8$a */
    public static final class C6653a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6653a f41821a = new C6653a();

        public C6653a() {
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

    /* JADX INFO: renamed from: gy8$b */
    @dwf({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n33#2,6:510\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6\n*L\n359#1:510,6\n*E\n"})
    public static final class C6654b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<iy8> f41822a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z6b<bth> f41823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6654b(List<iy8> list, z6b<bth> z6bVar) {
            super(1);
            this.f41822a = list;
            this.f41823b = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<iy8> list = this.f41822a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).place(aVar);
            }
            aub.m27883attachToScopeimpl(this.f41823b);
        }
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    @ah5
    private static final List<iy8> calculateExtraItems(List<Integer> list, ky8 ky8Var, my8 my8Var, qy6<? super Integer, Boolean> qy6Var) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = list.get(i).intValue();
            if (qy6Var.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                int iSpanOf = my8Var.spanOf(iIntValue);
                iy8 iy8VarMo28187getAndMeasurehBUhpc = ky8Var.mo28187getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, my8Var.m31092childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iy8VarMo28187getAndMeasurehBUhpc);
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    private static final List<iy8> calculateItemsOffsets(List<ly8> list, List<iy8> list2, List<iy8> list3, int i, int i2, int i3, int i4, int i5, boolean z, C0625c.m mVar, C0625c.e eVar, boolean z2, c64 c64Var) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset");
        }
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += list.get(i7).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (!z3) {
            int size2 = list2.size() - 1;
            if (size2 >= 0) {
                int mainAxisSizeWithSpacings = i5;
                while (true) {
                    int i8 = size2 - 1;
                    iy8 iy8Var = list2.get(size2);
                    mainAxisSizeWithSpacings -= iy8Var.getMainAxisSizeWithSpacings();
                    iy8Var.position(mainAxisSizeWithSpacings, 0, i, i2);
                    arrayList.add(iy8Var);
                    if (i8 < 0) {
                        break;
                    }
                    size2 = i8;
                }
            }
            int size3 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i9 = 0; i9 < size3; i9++) {
                ly8 ly8Var = list.get(i9);
                addAllFromArray(arrayList, ly8Var.position(mainAxisSizeWithSpacings2, i, i2));
                mainAxisSizeWithSpacings2 += ly8Var.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i10 = 0; i10 < size4; i10++) {
                iy8 iy8Var2 = list3.get(i10);
                iy8Var2.position(mainAxisSizeWithSpacings2, 0, i, i2);
                arrayList.add(iy8Var2);
                mainAxisSizeWithSpacings2 += iy8Var2.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items");
            }
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i11 = 0; i11 < size5; i11++) {
                iArr[i11] = list.get(calculateItemsOffsets$reverseAware(i11, z2, size5)).getMainAxisSize();
            }
            int[] iArr2 = new int[size5];
            for (int i12 = 0; i12 < size5; i12++) {
                iArr2[i12] = 0;
            }
            if (z) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement");
                }
                mVar.arrange(c64Var, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement");
                }
                eVar.arrange(c64Var, i6, iArr, ov8.Ltr, iArr2);
            }
            d78 indices = e80.getIndices(iArr2);
            if (z2) {
                indices = kpd.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    ly8 ly8Var2 = list.get(calculateItemsOffsets$reverseAware(first, z2, size5));
                    if (z2) {
                        mainAxisSize = (i6 - mainAxisSize) - ly8Var2.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, ly8Var2.position(mainAxisSize, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    @yfb
    /* JADX INFO: renamed from: measureLazyGrid-OZKpZRA, reason: not valid java name */
    public static final hy8 m29876measureLazyGridOZKpZRA(int i, @yfb my8 my8Var, @yfb ky8 ky8Var, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, @gib C0625c.m mVar, @gib C0625c.e eVar, boolean z2, @yfb c64 c64Var, @yfb LazyLayoutItemAnimator<iy8> lazyLayoutItemAnimator, int i8, @yfb List<Integer> list, @yfb x13 x13Var, @yfb z6b<bth> z6bVar, @yfb s97 s97Var, @yfb qy6<? super Integer, ? extends List<scc<Integer, ku2>>> qy6Var, @yfb kz6<? super Integer, ? super Integer, ? super qy6<? super AbstractC0767t.a, bth>, ? extends vba> kz6Var) {
        boolean z3;
        int i9;
        int mainAxisSizeWithSpacings;
        ly8 ly8Var;
        int index;
        ly8 ly8Var2;
        int i10;
        int iM31227constrainWidthK40F9xA;
        int iM31226constrainHeightK40F9xA;
        List<iy8> list2;
        int i11;
        int i12;
        float f2;
        iy8[] items;
        iy8 iy8Var;
        int i13;
        int i14;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        if (i <= 0) {
            int iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
            int iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, iM30765getMinWidthimpl, iM30764getMinHeightimpl, new ArrayList(), ky8Var.getKeyIndexMap(), ky8Var, z, false, i8, false, 0, 0, x13Var, s97Var);
            long jM27471getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m27471getMinSizeToFitDisappearingItemsYbymL2g();
            if (!r78.m32085equalsimpl0(jM27471getMinSizeToFitDisappearingItemsYbymL2g, r78.f77324b.m32092getZeroYbymL2g())) {
                iM30765getMinWidthimpl = nu2.m31227constrainWidthK40F9xA(j, r78.m32087getWidthimpl(jM27471getMinSizeToFitDisappearingItemsYbymL2g));
                iM30764getMinHeightimpl = nu2.m31226constrainHeightK40F9xA(j, r78.m32086getHeightimpl(jM27471getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new hy8(null, 0, false, 0.0f, kz6Var.invoke(Integer.valueOf(iM30765getMinWidthimpl), Integer.valueOf(iM30764getMinHeightimpl), C6653a.f41821a), false, x13Var, c64Var, i8, qy6Var, l82.emptyList(), -i3, i2 + i4, 0, z2, z ? t7c.Vertical : t7c.Horizontal, i4, i5);
        }
        int iRound = Math.round(f);
        int i15 = i7 - iRound;
        if (i6 == 0 && i15 < 0) {
            iRound += i15;
            i15 = 0;
        }
        e60 e60Var = new e60();
        int i16 = -i3;
        int i17 = (i5 < 0 ? i5 : 0) + i16;
        int mainAxisSizeWithSpacings2 = i15 + i17;
        int i18 = i6;
        while (mainAxisSizeWithSpacings2 < 0 && i18 > 0) {
            i18--;
            ly8 andMeasure = my8Var.getAndMeasure(i18);
            e60Var.add(0, andMeasure);
            mainAxisSizeWithSpacings2 += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings2 < i17) {
            iRound += mainAxisSizeWithSpacings2;
            mainAxisSizeWithSpacings2 = i17;
        }
        int i19 = mainAxisSizeWithSpacings2 - i17;
        int i20 = i2 + i4;
        int i21 = i18;
        int iCoerceAtLeast = kpd.coerceAtLeast(i20, 0);
        int i22 = i21;
        int mainAxisSizeWithSpacings3 = i19;
        int mainAxisSizeWithSpacings4 = -i19;
        int i23 = 0;
        boolean z4 = false;
        while (true) {
            z3 = true;
            if (i23 >= e60Var.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings4 >= iCoerceAtLeast) {
                e60Var.remove(i23);
                z4 = true;
            } else {
                i22++;
                mainAxisSizeWithSpacings4 += ((ly8) e60Var.get(i23)).getMainAxisSizeWithSpacings();
                i23++;
            }
        }
        int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings4;
        boolean z5 = z4;
        int i24 = i22;
        int i25 = i21;
        while (i24 < i && (mainAxisSizeWithSpacings5 < iCoerceAtLeast || mainAxisSizeWithSpacings5 <= 0 || e60Var.isEmpty())) {
            int i26 = iCoerceAtLeast;
            ly8 andMeasure2 = my8Var.getAndMeasure(i24);
            if (andMeasure2.isEmpty()) {
                break;
            }
            mainAxisSizeWithSpacings5 += andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings5 <= i17) {
                i13 = i17;
                i14 = i25;
                if (((iy8) e80.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    mainAxisSizeWithSpacings3 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i25 = i24 + 1;
                    z5 = true;
                }
                i24++;
                iCoerceAtLeast = i26;
                i17 = i13;
            } else {
                i13 = i17;
                i14 = i25;
            }
            e60Var.add(andMeasure2);
            i25 = i14;
            i24++;
            iCoerceAtLeast = i26;
            i17 = i13;
        }
        int i27 = i25;
        if (mainAxisSizeWithSpacings5 < i2) {
            int i28 = i2 - mainAxisSizeWithSpacings5;
            int i29 = mainAxisSizeWithSpacings5 + i28;
            int i30 = i27;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings3 - i28;
            while (mainAxisSizeWithSpacings < i3 && i30 > 0) {
                int i31 = i30 - 1;
                ly8 andMeasure3 = my8Var.getAndMeasure(i31);
                e60Var.add(0, andMeasure3);
                mainAxisSizeWithSpacings += andMeasure3.getMainAxisSizeWithSpacings();
                i30 = i31;
            }
            iRound += i28;
            if (mainAxisSizeWithSpacings < 0) {
                iRound += mainAxisSizeWithSpacings;
                i9 = i29 + mainAxisSizeWithSpacings;
                mainAxisSizeWithSpacings = 0;
            } else {
                i9 = i29;
            }
        } else {
            i9 = mainAxisSizeWithSpacings5;
            mainAxisSizeWithSpacings = mainAxisSizeWithSpacings3;
        }
        float f3 = (p3a.getSign(Math.round(f)) != p3a.getSign(iRound) || Math.abs(Math.round(f)) < Math.abs(iRound)) ? f : iRound;
        if (mainAxisSizeWithSpacings < 0) {
            throw new IllegalArgumentException("negative initial offset");
        }
        int i32 = -mainAxisSizeWithSpacings;
        ly8 ly8Var3 = (ly8) e60Var.first();
        iy8 iy8Var2 = (iy8) e80.firstOrNull(ly8Var3.getItems());
        int index2 = iy8Var2 != null ? iy8Var2.getIndex() : 0;
        ly8 ly8Var4 = (ly8) e60Var.lastOrNull();
        if (ly8Var4 == null || (items = ly8Var4.getItems()) == null || (iy8Var = (iy8) e80.lastOrNull(items)) == null) {
            ly8Var = ly8Var3;
            index = 0;
        } else {
            ly8Var = ly8Var3;
            index = iy8Var.getIndex();
        }
        int size = list.size();
        List listEmptyList = null;
        int i33 = mainAxisSizeWithSpacings;
        List listEmptyList2 = null;
        int i34 = 0;
        while (i34 < size) {
            int i35 = size;
            int iIntValue = list.get(i34).intValue();
            if (iIntValue < 0 || iIntValue >= index2) {
                i12 = index2;
                f2 = f3;
            } else {
                i12 = index2;
                int iSpanOf = my8Var.spanOf(iIntValue);
                f2 = f3;
                iy8 iy8VarMo28187getAndMeasurehBUhpc = ky8Var.mo28187getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, my8Var.m31092childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list3 = listEmptyList2;
                list3.add(iy8VarMo28187getAndMeasurehBUhpc);
                listEmptyList2 = list3;
            }
            i34++;
            size = i35;
            index2 = i12;
            f3 = f2;
        }
        int i36 = index2;
        float f4 = f3;
        if (listEmptyList2 == null) {
            listEmptyList2 = l82.emptyList();
        }
        List list4 = listEmptyList2;
        int size2 = list.size();
        int i37 = 0;
        while (i37 < size2) {
            int iIntValue2 = list.get(i37).intValue();
            if (index + 1 > iIntValue2 || iIntValue2 >= i) {
                i11 = index;
            } else {
                int iSpanOf2 = my8Var.spanOf(iIntValue2);
                i11 = index;
                iy8 iy8VarMo28187getAndMeasurehBUhpc2 = ky8Var.mo28187getAndMeasurehBUhpc(iIntValue2, 0, iSpanOf2, my8Var.m31092childConstraintsJhjzzOo$foundation_release(0, iSpanOf2));
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list5 = listEmptyList;
                list5.add(iy8VarMo28187getAndMeasurehBUhpc2);
                listEmptyList = list5;
            }
            i37++;
            index = i11;
        }
        int i38 = index;
        if (listEmptyList == null) {
            listEmptyList = l82.emptyList();
        }
        List list6 = listEmptyList;
        if (i3 > 0 || i5 < 0) {
            int size3 = e60Var.size();
            ly8 ly8Var5 = ly8Var;
            int i39 = 0;
            int i40 = i33;
            while (i39 < size3) {
                int mainAxisSizeWithSpacings6 = ((ly8) e60Var.get(i39)).getMainAxisSizeWithSpacings();
                if (i40 == 0 || mainAxisSizeWithSpacings6 > i40 || i39 == l82.getLastIndex(e60Var)) {
                    break;
                }
                i40 -= mainAxisSizeWithSpacings6;
                i39++;
                ly8Var5 = (ly8) e60Var.get(i39);
            }
            ly8Var2 = ly8Var5;
            i10 = i40;
        } else {
            ly8Var2 = ly8Var;
            i10 = i33;
        }
        int iM30763getMaxWidthimpl = z ? ku2.m30763getMaxWidthimpl(j) : nu2.m31227constrainWidthK40F9xA(j, i9);
        int iM31226constrainHeightK40F9xA2 = z ? nu2.m31226constrainHeightK40F9xA(j, i9) : ku2.m30762getMaxHeightimpl(j);
        int i41 = i36;
        List<iy8> listCalculateItemsOffsets = calculateItemsOffsets(e60Var, list4, list6, iM30763getMaxWidthimpl, iM31226constrainHeightK40F9xA2, i9, i2, i32, z, mVar, eVar, z2, c64Var);
        int i42 = i9;
        lazyLayoutItemAnimator.onMeasured((int) f4, iM30763getMaxWidthimpl, iM31226constrainHeightK40F9xA2, listCalculateItemsOffsets, ky8Var.getKeyIndexMap(), ky8Var, z, false, i8, false, i10, i42, x13Var, s97Var);
        long jM27471getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m27471getMinSizeToFitDisappearingItemsYbymL2g();
        if (r78.m32085equalsimpl0(jM27471getMinSizeToFitDisappearingItemsYbymL2g2, r78.f77324b.m32092getZeroYbymL2g())) {
            iM31227constrainWidthK40F9xA = iM30763getMaxWidthimpl;
            iM31226constrainHeightK40F9xA = iM31226constrainHeightK40F9xA2;
        } else {
            int i43 = z ? iM31226constrainHeightK40F9xA2 : iM30763getMaxWidthimpl;
            iM31227constrainWidthK40F9xA = nu2.m31227constrainWidthK40F9xA(j, Math.max(iM30763getMaxWidthimpl, r78.m32087getWidthimpl(jM27471getMinSizeToFitDisappearingItemsYbymL2g2)));
            iM31226constrainHeightK40F9xA = nu2.m31226constrainHeightK40F9xA(j, Math.max(iM31226constrainHeightK40F9xA2, r78.m32086getHeightimpl(jM27471getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i44 = z ? iM31226constrainHeightK40F9xA : iM31227constrainWidthK40F9xA;
            if (i44 != i43) {
                int size4 = listCalculateItemsOffsets.size();
                for (int i45 = 0; i45 < size4; i45++) {
                    listCalculateItemsOffsets.get(i45).updateMainAxisLayoutSize(i44);
                }
            }
        }
        if (i38 == i - 1 && i42 <= i2) {
            z3 = false;
        }
        vba vbaVarInvoke = kz6Var.invoke(Integer.valueOf(iM31227constrainWidthK40F9xA), Integer.valueOf(iM31226constrainHeightK40F9xA), new C6654b(listCalculateItemsOffsets, z6bVar));
        if (list4.isEmpty() && list6.isEmpty()) {
            list2 = listCalculateItemsOffsets;
        } else {
            ArrayList arrayList = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            int i46 = 0;
            while (i46 < size5) {
                iy8 iy8Var3 = listCalculateItemsOffsets.get(i46);
                int index3 = iy8Var3.getIndex();
                int i47 = i41;
                if (i47 <= index3 && index3 <= i38) {
                    arrayList.add(iy8Var3);
                }
                i46++;
                i41 = i47;
            }
            list2 = arrayList;
        }
        return new hy8(ly8Var2, i10, z3, f4, vbaVarInvoke, z5, x13Var, c64Var, i8, qy6Var, list2, i16, i20, i, z2, z ? t7c.Vertical : t7c.Horizontal, i4, i5);
    }
}
