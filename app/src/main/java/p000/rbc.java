package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,681:1\n677#1,4:683\n677#1,4:687\n677#1,4:691\n677#1,4:695\n677#1,4:699\n677#1,4:703\n677#1,4:752\n1#2:682\n33#3,6:707\n33#3,6:713\n235#3,3:719\n33#3,4:722\n238#3,2:726\n38#3:728\n240#3:729\n235#3,3:730\n33#3,4:733\n238#3,2:737\n38#3:739\n240#3:740\n235#3,3:741\n33#3,4:744\n238#3,2:748\n38#3:750\n240#3:751\n33#3,6:756\n33#3,6:762\n171#3,13:768\n33#3,6:781\n33#3,6:787\n33#3,6:793\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n69#1:683,4\n134#1:687,4\n155#1:691,4\n175#1:695,4\n214#1:699,4\n236#1:703,4\n445#1:752,4\n335#1:707,6\n361#1:713,6\n401#1:719,3\n401#1:722,4\n401#1:726,2\n401#1:728\n401#1:729\n406#1:730,3\n406#1:733,4\n406#1:737,2\n406#1:739\n406#1:740\n411#1:741,3\n411#1:744,4\n411#1:748,2\n411#1:750\n411#1:751\n499#1:756,6\n524#1:762,6\n543#1:768,13\n651#1:781,6\n658#1:787,6\n664#1:793,6\n*E\n"})
public final class rbc {

    /* JADX INFO: renamed from: a */
    public static final float f77663a = -0.5f;

    /* JADX INFO: renamed from: b */
    public static final float f77664b = 0.5f;

    /* JADX INFO: renamed from: rbc$a */
    @dwf({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,681:1\n33#2,6:682\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14\n*L\n456#1:682,6\n*E\n"})
    public static final class C11991a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<bca> f77665a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z6b<bth> f77666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11991a(List<bca> list, z6b<bth> z6bVar) {
            super(1);
            this.f77665a = list;
            this.f77666b = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<bca> list = this.f77665a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).place(aVar);
            }
            aub.m27883attachToScopeimpl(this.f77666b);
        }
    }

    /* JADX INFO: renamed from: rbc$b */
    public static final class C11992b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11992b f77667a = new C11992b();

        public C11992b() {
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

    /* JADX INFO: renamed from: rbc$c */
    public static final class C11993c extends tt8 implements qy6<Integer, bca> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f77668C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f77669F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zz8 f77670a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f77671b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qbc f77672c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f77673d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t7c f77674e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.b f77675f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC9407mm.c f77676m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11993c(zz8 zz8Var, long j, qbc qbcVar, long j2, t7c t7cVar, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, boolean z, int i) {
            super(1);
            this.f77670a = zz8Var;
            this.f77671b = j;
            this.f77672c = qbcVar;
            this.f77673d = j2;
            this.f77674e = t7cVar;
            this.f77675f = bVar;
            this.f77676m = cVar;
            this.f77668C = z;
            this.f77669F = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bca invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final bca invoke(int i) {
            zz8 zz8Var = this.f77670a;
            return rbc.m32104getAndMeasureSGf7dI0(zz8Var, i, this.f77671b, this.f77672c, this.f77673d, this.f77674e, this.f77675f, this.f77676m, zz8Var.getLayoutDirection(), this.f77668C, this.f77669F);
        }
    }

    /* JADX INFO: renamed from: rbc$d */
    public static final class C11994d extends tt8 implements qy6<Integer, bca> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f77677C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f77678F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zz8 f77679a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f77680b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ qbc f77681c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f77682d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t7c f77683e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC9407mm.b f77684f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ InterfaceC9407mm.c f77685m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11994d(zz8 zz8Var, long j, qbc qbcVar, long j2, t7c t7cVar, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, boolean z, int i) {
            super(1);
            this.f77679a = zz8Var;
            this.f77680b = j;
            this.f77681c = qbcVar;
            this.f77682d = j2;
            this.f77683e = t7cVar;
            this.f77684f = bVar;
            this.f77685m = cVar;
            this.f77677C = z;
            this.f77678F = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bca invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final bca invoke(int i) {
            zz8 zz8Var = this.f77679a;
            return rbc.m32104getAndMeasureSGf7dI0(zz8Var, i, this.f77680b, this.f77681c, this.f77682d, this.f77683e, this.f77684f, this.f77685m, zz8Var.getLayoutDirection(), this.f77677C, this.f77678F);
        }
    }

    private static final bca calculateNewCurrentPage(int i, List<bca> list, int i2, int i3, int i4, msf msfVar, int i5) {
        bca bcaVar;
        if (list.isEmpty()) {
            bcaVar = null;
        } else {
            bca bcaVar2 = list.get(0);
            bca bcaVar3 = bcaVar2;
            float f = -Math.abs(nsf.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, bcaVar3.getOffset(), bcaVar3.getIndex(), msfVar, i5));
            int lastIndex = l82.getLastIndex(list);
            int i6 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    bca bcaVar4 = list.get(i6);
                    bca bcaVar5 = bcaVar4;
                    float f2 = -Math.abs(nsf.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, bcaVar5.getOffset(), bcaVar5.getIndex(), msfVar, i5));
                    if (Float.compare(f, f2) < 0) {
                        bcaVar2 = bcaVar4;
                        f = f2;
                    }
                    if (i6 == lastIndex) {
                        break;
                    }
                    i6++;
                }
            }
            bcaVar = bcaVar2;
        }
        return bcaVar;
    }

    private static final List<bca> calculatePagesOffsets(zz8 zz8Var, List<bca> list, List<bca> list2, List<bca> list3, int i, int i2, int i3, int i4, int i5, t7c t7cVar, boolean z, c64 c64Var, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i5;
        int i11 = i7 + i6;
        if (t7cVar == t7c.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = i3 < Math.min(i9, i8);
        if (z2 && i10 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i10).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z2) {
            int size = list2.size();
            int i12 = i10;
            for (int i13 = 0; i13 < size; i13++) {
                bca bcaVar = list2.get(i13);
                i12 -= i11;
                bcaVar.position(i12, i, i2);
                arrayList.add(bcaVar);
            }
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                bca bcaVar2 = list.get(i14);
                bcaVar2.position(i10, i, i2);
                arrayList.add(bcaVar2);
                i10 += i11;
            }
            int size3 = list3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                bca bcaVar3 = list3.get(i15);
                bcaVar3.position(i10, i, i2);
                arrayList.add(bcaVar3);
                i10 += i11;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i16 = 0; i16 < size4; i16++) {
                iArr[i16] = i7;
            }
            int[] iArr2 = new int[size4];
            for (int i17 = 0; i17 < size4; i17++) {
                iArr2[i17] = 0;
            }
            C0625c.f fVarM27392spacedBy0680j_4 = C0625c.a.f4493a.m27392spacedBy0680j_4(zz8Var.mo27170toDpu2uoSUM(i6));
            if (t7cVar == t7c.Vertical) {
                fVarM27392spacedBy0680j_4.arrange(c64Var, i9, iArr, iArr2);
            } else {
                fVarM27392spacedBy0680j_4.arrange(c64Var, i9, iArr, ov8.Ltr, iArr2);
            }
            d78 indices = e80.getIndices(iArr2);
            if (z) {
                indices = kpd.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size5 = iArr2[first];
                    bca bcaVar4 = list.get(calculatePagesOffsets$reverseAware(first, z, size4));
                    if (z) {
                        size5 = (i9 - size5) - bcaVar4.getSize();
                    }
                    bcaVar4.position(size5, i, i2);
                    arrayList.add(bcaVar4);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List<bca> createPagesAfterList(int i, int i2, int i3, List<Integer> list, qy6<? super Integer, bca> qy6Var) {
        int iMin = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qy6Var.invoke(Integer.valueOf(i4)));
                if (i4 == iMin) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qy6Var.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    private static final List<bca> createPagesBeforeList(int i, int i2, List<Integer> list, qy6<? super Integer, bca> qy6Var) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qy6Var.invoke(Integer.valueOf(i3)));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = list.get(i4).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qy6Var.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    private static final void debugLog(ny6<String> ny6Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final bca m32104getAndMeasureSGf7dI0(zz8 zz8Var, int i, long j, qbc qbcVar, long j2, t7c t7cVar, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, ov8 ov8Var, boolean z, int i2) {
        return new bca(i, i2, zz8Var.mo27165measure0kLqBqw(i, j), j2, qbcVar.getKey(i), t7cVar, bVar, cVar, ov8Var, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    /* JADX INFO: renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final tbc m32105measurePagerbmk8ZPk(@yfb zz8 zz8Var, int i, @yfb qbc qbcVar, int i2, int i3, int i4, int i5, int i6, int i7, long j, @yfb t7c t7cVar, @gib InterfaceC9407mm.c cVar, @gib InterfaceC9407mm.b bVar, boolean z, long j2, int i8, int i9, @yfb List<Integer> list, @yfb msf msfVar, @yfb z6b<bth> z6bVar, @yfb x13 x13Var, @yfb kz6<? super Integer, ? super Integer, ? super qy6<? super AbstractC0767t.a, bth>, ? extends vba> kz6Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        bca bcaVar;
        int i15;
        long j3;
        int i16;
        List<bca> list2;
        List arrayList;
        List arrayList2;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int i17 = 0;
        int iCoerceAtLeast = kpd.coerceAtLeast(i8 + i5, 0);
        if (i <= 0) {
            return new tbc(l82.emptyList(), i8, i5, i4, t7cVar, -i3, i2 + i4, false, i9, null, null, 0.0f, 0, false, msfVar, kz6Var.invoke(Integer.valueOf(ku2.m30765getMinWidthimpl(j)), Integer.valueOf(ku2.m30764getMinHeightimpl(j)), C11992b.f77667a), false, null, null, x13Var, 393216, null);
        }
        t7c t7cVar2 = t7c.Vertical;
        long jConstraints$default = nu2.Constraints$default(0, t7cVar == t7cVar2 ? ku2.m30763getMaxWidthimpl(j) : i8, 0, t7cVar != t7cVar2 ? ku2.m30762getMaxHeightimpl(j) : i8, 5, null);
        int i18 = i6;
        int i19 = i7;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= iCoerceAtLeast;
        }
        int i20 = i19 * (-1);
        if (i18 >= i) {
            i18 = i - 1;
            i20 = 0;
        }
        e60 e60Var = new e60();
        int i21 = -i3;
        int i22 = (i5 < 0 ? i5 : 0) + i21;
        int i23 = i20 + i22;
        int iMax = 0;
        while (i23 < 0 && i18 > 0) {
            int i24 = i18 - 1;
            e60 e60Var2 = e60Var;
            int i25 = i17;
            int i26 = iCoerceAtLeast;
            bca bcaVarM32104getAndMeasureSGf7dI0 = m32104getAndMeasureSGf7dI0(zz8Var, i24, jConstraints$default, qbcVar, j2, t7cVar, bVar, cVar, zz8Var.getLayoutDirection(), z, i8);
            e60Var2.add(i25, bcaVarM32104getAndMeasureSGf7dI0);
            iMax = Math.max(iMax, bcaVarM32104getAndMeasureSGf7dI0.getCrossAxisSize());
            i23 += i26;
            i18 = i24;
            i22 = i22;
            e60Var = e60Var2;
            i17 = i25;
            iCoerceAtLeast = i26;
            i21 = i21;
        }
        int i27 = i23;
        int i28 = i21;
        int i29 = i22;
        e60 e60Var3 = e60Var;
        int i30 = i17;
        int i31 = iCoerceAtLeast;
        int i32 = (i27 < i29 ? i29 : i27) - i29;
        int i33 = i2 + i4;
        int iCoerceAtLeast2 = kpd.coerceAtLeast(i33, i30);
        int i34 = -i32;
        int i35 = i30;
        int i36 = i35;
        int i37 = i18;
        while (i35 < e60Var3.size()) {
            if (i34 >= iCoerceAtLeast2) {
                e60Var3.remove(i35);
                i36 = 1;
            } else {
                i37++;
                i34 += i31;
                i35++;
            }
        }
        int i38 = i18;
        int i39 = i32;
        int i40 = i36;
        int i41 = i37;
        int i42 = i34;
        while (i41 < i && (i42 < iCoerceAtLeast2 || i42 <= 0 || e60Var3.isEmpty())) {
            int i43 = i33;
            int i44 = i41;
            int i45 = i38;
            int i46 = iCoerceAtLeast2;
            int i47 = i42;
            int i48 = i31;
            bca bcaVarM32104getAndMeasureSGf7dI02 = m32104getAndMeasureSGf7dI0(zz8Var, i41, jConstraints$default, qbcVar, j2, t7cVar, bVar, cVar, zz8Var.getLayoutDirection(), z, i8);
            int i49 = i - 1;
            i42 = (i44 == i49 ? i8 : i48) + i47;
            if (i42 > i29 || i44 == i49) {
                iMax = Math.max(iMax, bcaVarM32104getAndMeasureSGf7dI02.getCrossAxisSize());
                e60Var3.add(bcaVarM32104getAndMeasureSGf7dI02);
                i38 = i45;
            } else {
                i39 -= i48;
                i38 = i44 + 1;
                i40 = 1;
            }
            i41 = i44 + 1;
            i33 = i43;
            i31 = i48;
            iCoerceAtLeast2 = i46;
        }
        int i50 = i38;
        int i51 = i33;
        int i52 = i41;
        int i53 = i42;
        int i54 = i31;
        if (i53 < i2) {
            int i55 = i2 - i53;
            int i56 = i39 - i55;
            int i57 = i55 + i53;
            int i58 = i3;
            i14 = i50;
            int i59 = i54;
            int i60 = i56;
            while (i60 < i58 && i14 > 0) {
                i14--;
                int i61 = i59;
                bca bcaVarM32104getAndMeasureSGf7dI03 = m32104getAndMeasureSGf7dI0(zz8Var, i14, jConstraints$default, qbcVar, j2, t7cVar, bVar, cVar, zz8Var.getLayoutDirection(), z, i8);
                e60Var3.add(0, bcaVarM32104getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, bcaVarM32104getAndMeasureSGf7dI03.getCrossAxisSize());
                i60 += i61;
                i58 = i3;
                i59 = i61;
            }
            i10 = i59;
            i11 = 0;
            if (i60 < 0) {
                i12 = i57 + i60;
                i13 = 0;
            } else {
                i13 = i60;
                i12 = i57;
            }
        } else {
            i10 = i54;
            i11 = 0;
            i12 = i53;
            i13 = i39;
            i14 = i50;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i62 = -i13;
        bca bcaVar2 = (bca) e60Var3.first();
        if (i3 > 0 || i5 < 0) {
            int size = e60Var3.size();
            int i63 = i13;
            int i64 = i11;
            while (i64 < size && i63 != 0 && i10 <= i63 && i64 != l82.getLastIndex(e60Var3)) {
                i63 -= i10;
                i64++;
                bcaVar2 = (bca) e60Var3.get(i64);
            }
            bcaVar = bcaVar2;
            i15 = i63;
        } else {
            i15 = i13;
            bcaVar = bcaVar2;
        }
        int i65 = iMax;
        bca bcaVar3 = bcaVar;
        int i66 = i11;
        List<bca> listCreatePagesBeforeList = createPagesBeforeList(i14, i9, list, new C11994d(zz8Var, jConstraints$default, qbcVar, j2, t7cVar, bVar, cVar, z, i8));
        int size2 = listCreatePagesBeforeList.size();
        int iMax2 = i65;
        for (int i67 = i66; i67 < size2; i67++) {
            iMax2 = Math.max(iMax2, listCreatePagesBeforeList.get(i67).getCrossAxisSize());
        }
        int i68 = i10;
        List<bca> listCreatePagesAfterList = createPagesAfterList(((bca) e60Var3.last()).getIndex(), i, i9, list, new C11993c(zz8Var, jConstraints$default, qbcVar, j2, t7cVar, bVar, cVar, z, i8));
        int size3 = listCreatePagesAfterList.size();
        int iMax3 = iMax2;
        for (int i69 = i66; i69 < size3; i69++) {
            iMax3 = Math.max(iMax3, listCreatePagesAfterList.get(i69).getCrossAxisSize());
        }
        int i70 = (md8.areEqual(bcaVar3, e60Var3.first()) && listCreatePagesBeforeList.isEmpty() && listCreatePagesAfterList.isEmpty()) ? 1 : i66;
        t7c t7cVar3 = t7c.Vertical;
        if (t7cVar == t7cVar3) {
            j3 = j;
            i16 = iMax3;
        } else {
            j3 = j;
            i16 = i12;
        }
        int iM31227constrainWidthK40F9xA = nu2.m31227constrainWidthK40F9xA(j3, i16);
        if (t7cVar == t7cVar3) {
            iMax3 = i12;
        }
        int iM31226constrainHeightK40F9xA = nu2.m31226constrainHeightK40F9xA(j3, iMax3);
        List<bca> listCalculatePagesOffsets = calculatePagesOffsets(zz8Var, e60Var3, listCreatePagesBeforeList, listCreatePagesAfterList, iM31227constrainWidthK40F9xA, iM31226constrainHeightK40F9xA, i12, i2, i62, t7cVar, z, zz8Var, i5, i8);
        if (i70 != 0) {
            list2 = listCalculatePagesOffsets;
        } else {
            ArrayList arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            for (int i71 = i66; i71 < size4; i71++) {
                bca bcaVar4 = listCalculatePagesOffsets.get(i71);
                bca bcaVar5 = bcaVar4;
                if (bcaVar5.getIndex() >= ((bca) e60Var3.first()).getIndex() && bcaVar5.getIndex() <= ((bca) e60Var3.last()).getIndex()) {
                    arrayList3.add(bcaVar4);
                }
            }
            list2 = arrayList3;
        }
        if (listCreatePagesBeforeList.isEmpty()) {
            arrayList = l82.emptyList();
        } else {
            arrayList = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i72 = i66; i72 < size5; i72++) {
                bca bcaVar6 = listCalculatePagesOffsets.get(i72);
                if (bcaVar6.getIndex() < ((bca) e60Var3.first()).getIndex()) {
                    arrayList.add(bcaVar6);
                }
            }
        }
        List list3 = arrayList;
        if (listCreatePagesAfterList.isEmpty()) {
            arrayList2 = l82.emptyList();
        } else {
            arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i73 = i66; i73 < size6; i73++) {
                bca bcaVar7 = listCalculatePagesOffsets.get(i73);
                if (bcaVar7.getIndex() > ((bca) e60Var3.last()).getIndex()) {
                    arrayList2.add(bcaVar7);
                }
            }
        }
        List list4 = arrayList2;
        int i74 = i12;
        bca bcaVarCalculateNewCurrentPage = calculateNewCurrentPage(t7cVar == t7c.Vertical ? iM31226constrainHeightK40F9xA : iM31227constrainWidthK40F9xA, list2, i3, i4, i68, msfVar, i);
        return new tbc(list2, i8, i5, i4, t7cVar, i28, i51, z, i9, bcaVar3, bcaVarCalculateNewCurrentPage, i68 == 0 ? 0.0f : kpd.coerceIn((msfVar.position(i2, i8, i3, i4, bcaVarCalculateNewCurrentPage != null ? bcaVarCalculateNewCurrentPage.getIndex() : i66, i) - (bcaVarCalculateNewCurrentPage != null ? bcaVarCalculateNewCurrentPage.getOffset() : i66)) / i68, -0.5f, 0.5f), i15, (i52 < i || i74 > i2) ? 1 : i66, msfVar, kz6Var.invoke(Integer.valueOf(iM31227constrainWidthK40F9xA), Integer.valueOf(iM31226constrainHeightK40F9xA), new C11991a(listCalculatePagesOffsets, z6bVar)), i40, list3, list4, x13Var);
    }
}
