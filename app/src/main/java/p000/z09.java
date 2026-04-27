package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,650:1\n1#2:651\n26#3:652\n26#3:653\n26#3:654\n33#4,6:655\n33#4,6:661\n33#4,6:667\n235#4,3:673\n33#4,4:676\n238#4,2:680\n38#4:682\n240#4:683\n116#4,2:684\n33#4,6:686\n118#4:692\n116#4,2:693\n33#4,6:695\n118#4:701\n116#4,2:702\n33#4,6:704\n118#4:710\n33#4,6:711\n51#4,6:717\n33#4,6:723\n33#4,6:729\n33#4,6:735\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n134#1:652\n259#1:653\n260#1:654\n307#1:655,6\n324#1:661,6\n380#1:667,6\n417#1:673,3\n417#1:676,4\n417#1:680,2\n417#1:682\n417#1:683\n478#1:684,2\n478#1:686,6\n478#1:692\n495#1:693,2\n495#1:695,6\n495#1:701\n497#1:702,2\n497#1:704,6\n497#1:710\n518#1:711,6\n545#1:717,6\n629#1:723,6\n636#1:729,6\n642#1:735,6\n*E\n"})
public final class z09 {

    /* JADX INFO: renamed from: z09$a */
    public static final class C15910a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C15910a f103632a = new C15910a();

        public C15910a() {
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

    /* JADX INFO: renamed from: z09$b */
    @dwf({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,650:1\n33#2,6:651\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8\n*L\n406#1:651,6\n*E\n"})
    public static final class C15911b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<b19> f103633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b19 f103634b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f103635c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ z6b<bth> f103636d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15911b(List<b19> list, b19 b19Var, boolean z, z6b<bth> z6bVar) {
            super(1);
            this.f103633a = list;
            this.f103634b = b19Var;
            this.f103635c = z;
            this.f103636d = z6bVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<b19> list = this.f103633a;
            b19 b19Var = this.f103634b;
            boolean z = this.f103635c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                b19 b19Var2 = list.get(i);
                if (b19Var2 != b19Var) {
                    b19Var2.place(aVar, z);
                }
            }
            b19 b19Var3 = this.f103634b;
            if (b19Var3 != null) {
                b19Var3.place(aVar, this.f103635c);
            }
            aub.m27883attachToScopeimpl(this.f103636d);
        }
    }

    private static final List<b19> calculateItemsOffsets(List<b19> list, List<b19> list2, List<b19> list3, int i, int i2, int i3, int i4, int i5, boolean z, C0625c.m mVar, C0625c.e eVar, boolean z2, c64 c64Var) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int mainAxisSizeWithSpacings = i5;
            for (int i7 = 0; i7 < size; i7++) {
                b19 b19Var = list2.get(i7);
                mainAxisSizeWithSpacings -= b19Var.getMainAxisSizeWithSpacings();
                b19Var.position(mainAxisSizeWithSpacings, i, i2);
                arrayList.add(b19Var);
            }
            int size2 = list.size();
            int mainAxisSizeWithSpacings2 = i5;
            for (int i8 = 0; i8 < size2; i8++) {
                b19 b19Var2 = list.get(i8);
                b19Var2.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(b19Var2);
                mainAxisSizeWithSpacings2 += b19Var2.getMainAxisSizeWithSpacings();
            }
            int size3 = list3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                b19 b19Var3 = list3.get(i9);
                b19Var3.position(mainAxisSizeWithSpacings2, i, i2);
                arrayList.add(b19Var3);
                mainAxisSizeWithSpacings2 += b19Var3.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i10 = 0; i10 < size4; i10++) {
                iArr[i10] = list.get(calculateItemsOffsets$reverseAware(i10, z2, size4)).getSize();
            }
            int[] iArr2 = new int[size4];
            for (int i11 = 0; i11 < size4; i11++) {
                iArr2[i11] = 0;
            }
            if (z) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.arrange(c64Var, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
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
                    int size5 = iArr2[first];
                    b19 b19Var4 = list.get(calculateItemsOffsets$reverseAware(first, z2, size4));
                    if (z2) {
                        size5 = (i6 - size5) - b19Var4.getSize();
                    }
                    b19Var4.position(size5, i, i2);
                    arrayList.add(b19Var4);
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

    private static final List<b19> createItemsAfterList(List<b19> list, d19 d19Var, int i, int i2, List<Integer> list2, float f, boolean z, y09 y09Var) {
        ArrayList arrayList;
        t09 t09Var;
        b19 b19Var;
        b19 b19Var2;
        int mainAxisSizeWithSpacings;
        b19 b19Var3;
        int index;
        int iMin;
        b19 b19Var4;
        b19 b19Var5;
        int i3 = i - 1;
        int iMin2 = Math.min(((b19) v82.last((List) list)).getIndex() + i2, i3);
        int index2 = ((b19) v82.last((List) list)).getIndex() + 1;
        if (index2 <= iMin2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z && y09Var != null && !y09Var.getVisibleItemsInfo().isEmpty()) {
            List<t09> visibleItemsInfo = y09Var.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    t09Var = null;
                    break;
                }
                if (visibleItemsInfo.get(size).getIndex() > iMin2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= iMin2)) {
                    break;
                }
            }
            t09Var = visibleItemsInfo.get(size);
            t09 t09Var2 = (t09) v82.last((List) y09Var.getVisibleItemsInfo());
            if (t09Var != null && (index = t09Var.getIndex()) <= (iMin = Math.min(t09Var2.getIndex(), i3))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                b19Var5 = null;
                                break;
                            }
                            b19Var5 = arrayList.get(i4);
                            if (b19Var5.getIndex() == index) {
                                break;
                            }
                            i4++;
                        }
                        b19Var4 = b19Var5;
                    } else {
                        b19Var4 = null;
                    }
                    if (b19Var4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float viewportEndOffset = ((y09Var.getViewportEndOffset() - t09Var2.getOffset()) - t09Var2.getSize()) - f;
            if (viewportEndOffset > 0.0f) {
                int index3 = t09Var2.getIndex() + 1;
                int i5 = 0;
                while (index3 < i && i5 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                b19Var3 = null;
                                break;
                            }
                            b19Var3 = list.get(i6);
                            if (b19Var3.getIndex() == index3) {
                                break;
                            }
                            i6++;
                        }
                        b19Var = b19Var3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                b19Var2 = null;
                                break;
                            }
                            b19Var2 = arrayList.get(i7);
                            if (b19Var2.getIndex() == index3) {
                                break;
                            }
                            i7++;
                        }
                        b19Var = b19Var2;
                    } else {
                        b19Var = null;
                    }
                    if (b19Var != null) {
                        index3++;
                        mainAxisSizeWithSpacings = b19Var.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((b19) v82.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i5 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((b19) v82.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((b19) v82.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i8 = 0; i8 < size5; i8++) {
            int iIntValue = list2.get(i8).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    private static final List<b19> createItemsBeforeList(int i, d19 d19Var, int i2, List<Integer> list) {
        int iMax = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (iMax <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, i3, 0L, 2, null));
                if (i3 == iMax) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(d19.m28564getAndMeasure0kLqBqw$default(d19Var, iIntValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? l82.emptyList() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0415  */
    @p000.yfb
    /* JADX INFO: renamed from: measureLazyList-x0Ok8Vo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.a19 m33463measureLazyListx0Ok8Vo(int r40, @p000.yfb p000.d19 r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, @p000.yfb java.util.List<java.lang.Integer> r52, @p000.gib androidx.compose.foundation.layout.C0625c.m r53, @p000.gib androidx.compose.foundation.layout.C0625c.e r54, boolean r55, @p000.yfb p000.c64 r56, @p000.yfb androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<p000.b19> r57, int r58, @p000.yfb java.util.List<java.lang.Integer> r59, boolean r60, boolean r61, @p000.gib p000.y09 r62, @p000.yfb p000.x13 r63, @p000.yfb p000.z6b<p000.bth> r64, @p000.yfb p000.s97 r65, @p000.yfb p000.kz6<? super java.lang.Integer, ? super java.lang.Integer, ? super p000.qy6<? super androidx.compose.p002ui.layout.AbstractC0767t.a, p000.bth>, ? extends p000.vba> r66) {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z09.m33463measureLazyListx0Ok8Vo(int, d19, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.c$m, androidx.compose.foundation.layout.c$e, boolean, c64, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, y09, x13, z6b, s97, kz6):a19");
    }
}
