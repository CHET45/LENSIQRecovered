package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.foundation.layout.C0648y;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.ArrayList;
import java.util.List;
import p000.ssf;
import p000.yy8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,378:1\n148#2:379\n488#3:380\n487#3,4:381\n491#3,2:388\n495#3:394\n1223#4,3:385\n1226#4,3:391\n1223#4,6:397\n487#5:390\n77#6:395\n77#6:396\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n63#1:379\n83#1:380\n83#1:381,4\n83#1:388,2\n83#1:394\n83#1:385,3\n83#1:391,3\n162#1:397,6\n83#1:390\n84#1:395\n114#1:396\n*E\n"})
public final class ey8 {

    /* JADX INFO: renamed from: ey8$a */
    public static final class C5515a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f34428C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ C0625c.m f34429F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ C0625c.e f34430H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ qy6<qy8, bth> f34431L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ int f34432M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ int f34433N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ int f34434Q;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f34435a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ az8 f34436b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vy8 f34437c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vac f34438d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f34439e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f34440f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f34441m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5515a(InterfaceC0701e interfaceC0701e, az8 az8Var, vy8 vy8Var, vac vacVar, boolean z, boolean z2, s36 s36Var, boolean z3, C0625c.m mVar, C0625c.e eVar, qy6<? super qy8, bth> qy6Var, int i, int i2, int i3) {
            super(2);
            this.f34435a = interfaceC0701e;
            this.f34436b = az8Var;
            this.f34437c = vy8Var;
            this.f34438d = vacVar;
            this.f34439e = z;
            this.f34440f = z2;
            this.f34441m = s36Var;
            this.f34428C = z3;
            this.f34429F = mVar;
            this.f34430H = eVar;
            this.f34431L = qy6Var;
            this.f34432M = i;
            this.f34433N = i2;
            this.f34434Q = i3;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            ey8.LazyGrid(this.f34435a, this.f34436b, this.f34437c, this.f34438d, this.f34439e, this.f34440f, this.f34441m, this.f34428C, this.f34429F, this.f34430H, this.f34431L, zl2Var, tsd.updateChangedFlags(this.f34432M | 1), tsd.updateChangedFlags(this.f34433N), this.f34434Q);
        }
    }

    /* JADX INFO: renamed from: ey8$b */
    @dwf({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,378:1\n602#2,8:379\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n319#1:379,8\n*E\n"})
    public static final class C5516b extends tt8 implements gz6<zz8, ku2, hy8> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ C0625c.e f34442C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ x13 f34443F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ s97 f34444H;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ az8 f34445a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f34446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f34447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f34448d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ny6<yx8> f34449e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vy8 f34450f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C0625c.m f34451m;

        /* JADX INFO: renamed from: ey8$b$a */
        public static final class a extends tt8 implements kz6<Integer, Integer, qy6<? super AbstractC0767t.a, ? extends bth>, vba> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zz8 f34452a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f34453b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f34454c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f34455d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zz8 zz8Var, long j, int i, int i2) {
                super(3);
                this.f34452a = zz8Var;
                this.f34453b = j;
                this.f34454c = i;
                this.f34455d = i2;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ vba invoke(Integer num, Integer num2, qy6<? super AbstractC0767t.a, ? extends bth> qy6Var) {
                return invoke(num.intValue(), num2.intValue(), (qy6<? super AbstractC0767t.a, bth>) qy6Var);
            }

            @yfb
            public final vba invoke(int i, int i2, @yfb qy6<? super AbstractC0767t.a, bth> qy6Var) {
                return this.f34452a.layout(nu2.m31227constrainWidthK40F9xA(this.f34453b, i + this.f34454c), nu2.m31226constrainHeightK40F9xA(this.f34453b, i2 + this.f34455d), xt9.emptyMap(), qy6Var);
            }
        }

        /* JADX INFO: renamed from: ey8$b$b */
        public static final class b extends ky8 {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ zz8 f34456e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ az8 f34457f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ boolean f34458g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ boolean f34459h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ int f34460i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ int f34461j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ long f34462k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(yx8 yx8Var, zz8 zz8Var, int i, az8 az8Var, boolean z, boolean z2, int i2, int i3, long j) {
                super(yx8Var, zz8Var, i);
                this.f34456e = zz8Var;
                this.f34457f = az8Var;
                this.f34458g = z;
                this.f34459h = z2;
                this.f34460i = i2;
                this.f34461j = i3;
                this.f34462k = j;
            }

            @Override // p000.ky8
            @yfb
            /* JADX INFO: renamed from: createItem-O3s9Psw, reason: not valid java name */
            public iy8 mo28876createItemO3s9Psw(int i, @yfb Object obj, @gib Object obj2, int i2, int i3, @yfb List<? extends AbstractC0767t> list, long j, int i4, int i5) {
                return new iy8(i, obj, this.f34458g, i2, i3, this.f34459h, this.f34456e.getLayoutDirection(), this.f34460i, this.f34461j, list, this.f34462k, obj2, this.f34457f.getItemAnimator$foundation_release(), j, i4, i5, null);
            }
        }

        /* JADX INFO: renamed from: ey8$b$c */
        public static final class c extends my8 {

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ boolean f34463h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ uy8 f34464i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z, uy8 uy8Var, int i, int i2, b bVar, yy8 yy8Var) {
                super(z, uy8Var, i, i2, bVar, yy8Var);
                this.f34463h = z;
                this.f34464i = uy8Var;
            }

            @Override // p000.my8
            @yfb
            public ly8 createLine(int i, @yfb iy8[] iy8VarArr, @yfb List<ib7> list, int i2) {
                return new ly8(i, iy8VarArr, this.f34464i, list, this.f34463h, i2);
            }
        }

        /* JADX INFO: renamed from: ey8$b$d */
        @dwf({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,378:1\n33#2,6:379\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1\n*L\n307#1:379,6\n*E\n"})
        public static final class d extends tt8 implements qy6<Integer, ArrayList<scc<? extends Integer, ? extends ku2>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ yy8 f34465a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c f34466b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(yy8 yy8Var, c cVar) {
                super(1);
                this.f34465a = yy8Var;
                this.f34466b = cVar;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ ArrayList<scc<? extends Integer, ? extends ku2>> invoke(Integer num) {
                return invoke(num.intValue());
            }

            @yfb
            public final ArrayList<scc<Integer, ku2>> invoke(int i) {
                yy8.C15886c lineConfiguration = this.f34465a.getLineConfiguration(i);
                int firstItemIndex = lineConfiguration.getFirstItemIndex();
                ArrayList<scc<Integer, ku2>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                List<ib7> spans = lineConfiguration.getSpans();
                c cVar = this.f34466b;
                int size = spans.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int iM30186getCurrentLineSpanimpl = ib7.m30186getCurrentLineSpanimpl(spans.get(i3).m30189unboximpl());
                    arrayList.add(vkh.m24050to(Integer.valueOf(firstItemIndex), ku2.m30751boximpl(cVar.m31092childConstraintsJhjzzOo$foundation_release(i2, iM30186getCurrentLineSpanimpl))));
                    firstItemIndex++;
                    i2 += iM30186getCurrentLineSpanimpl;
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5516b(az8 az8Var, boolean z, vac vacVar, boolean z2, ny6<? extends yx8> ny6Var, vy8 vy8Var, C0625c.m mVar, C0625c.e eVar, x13 x13Var, s97 s97Var) {
            super(2);
            this.f34445a = az8Var;
            this.f34446b = z;
            this.f34447c = vacVar;
            this.f34448d = z2;
            this.f34449e = ny6Var;
            this.f34450f = vy8Var;
            this.f34451m = mVar;
            this.f34442C = eVar;
            this.f34443F = x13Var;
            this.f34444H = s97Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ hy8 invoke(zz8 zz8Var, ku2 ku2Var) {
            return m28875invoke0kLqBqw(zz8Var, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final hy8 m28875invoke0kLqBqw(@yfb zz8 zz8Var, long j) {
            float fMo27395getSpacingD9Ej5fM;
            long jIntOffset;
            int lineIndexOfItem;
            int firstVisibleItemScrollOffset;
            aub.m27883attachToScopeimpl(this.f34445a.m27908getMeasurementScopeInvalidatorzYiylxw$foundation_release());
            fy1.m29679checkScrollableContainerConstraintsK40F9xA(j, this.f34446b ? t7c.Vertical : t7c.Horizontal);
            int iMo27167roundToPx0680j_4 = this.f34446b ? zz8Var.mo27167roundToPx0680j_4(this.f34447c.mo32750calculateLeftPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateStartPadding(this.f34447c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_42 = this.f34446b ? zz8Var.mo27167roundToPx0680j_4(this.f34447c.mo32751calculateRightPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateEndPadding(this.f34447c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_43 = zz8Var.mo27167roundToPx0680j_4(this.f34447c.mo32752calculateTopPaddingD9Ej5fM());
            int iMo27167roundToPx0680j_44 = zz8Var.mo27167roundToPx0680j_4(this.f34447c.mo32749calculateBottomPaddingD9Ej5fM());
            int i = iMo27167roundToPx0680j_43 + iMo27167roundToPx0680j_44;
            int i2 = iMo27167roundToPx0680j_4 + iMo27167roundToPx0680j_42;
            boolean z = this.f34446b;
            int i3 = z ? i : i2;
            int i4 = (!z || this.f34448d) ? (z && this.f34448d) ? iMo27167roundToPx0680j_44 : (z || this.f34448d) ? iMo27167roundToPx0680j_42 : iMo27167roundToPx0680j_4 : iMo27167roundToPx0680j_43;
            int i5 = i3 - i4;
            long jM31229offsetNN6EwU = nu2.m31229offsetNN6EwU(j, -i2, -i);
            yx8 yx8VarInvoke = this.f34449e.invoke();
            yy8 spanLayoutProvider = yx8VarInvoke.getSpanLayoutProvider();
            uy8 uy8VarMo30508invoke0kLqBqw = this.f34450f.mo30508invoke0kLqBqw(zz8Var, j);
            int length = uy8VarMo30508invoke0kLqBqw.getSizes().length;
            spanLayoutProvider.setSlotsPerLine(length);
            if (this.f34446b) {
                C0625c.m mVar = this.f34451m;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                fMo27395getSpacingD9Ej5fM = mVar.mo27395getSpacingD9Ej5fM();
            } else {
                C0625c.e eVar = this.f34442C;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                fMo27395getSpacingD9Ej5fM = eVar.mo27395getSpacingD9Ej5fM();
            }
            int iMo27167roundToPx0680j_45 = zz8Var.mo27167roundToPx0680j_4(fMo27395getSpacingD9Ej5fM);
            int itemCount = yx8VarInvoke.getItemCount();
            int iM30762getMaxHeightimpl = this.f34446b ? ku2.m30762getMaxHeightimpl(j) - i : ku2.m30763getMaxWidthimpl(j) - i2;
            if (!this.f34448d || iM30762getMaxHeightimpl > 0) {
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            } else {
                boolean z2 = this.f34446b;
                if (!z2) {
                    iMo27167roundToPx0680j_4 += iM30762getMaxHeightimpl;
                }
                if (z2) {
                    iMo27167roundToPx0680j_43 += iM30762getMaxHeightimpl;
                }
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            }
            b bVar = new b(yx8VarInvoke, zz8Var, iMo27167roundToPx0680j_45, this.f34445a, this.f34446b, this.f34448d, i4, i5, jIntOffset);
            c cVar = new c(this.f34446b, uy8VarMo30508invoke0kLqBqw, itemCount, iMo27167roundToPx0680j_45, bVar, spanLayoutProvider);
            d dVar = new d(spanLayoutProvider, cVar);
            ssf.C12771a c12771a = ssf.f82790e;
            az8 az8Var = this.f34445a;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = az8Var.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(yx8VarInvoke, az8Var.getFirstVisibleItemIndex());
                if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                    firstVisibleItemScrollOffset = az8Var.getFirstVisibleItemScrollOffset();
                } else {
                    lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                    firstVisibleItemScrollOffset = 0;
                }
                bth bthVar = bth.f14751a;
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                hy8 hy8VarM29876measureLazyGridOZKpZRA = gy8.m29876measureLazyGridOZKpZRA(itemCount, cVar, bVar, iM30762getMaxHeightimpl, i4, i5, iMo27167roundToPx0680j_45, lineIndexOfItem, firstVisibleItemScrollOffset, this.f34445a.getScrollToBeConsumed$foundation_release(), jM31229offsetNN6EwU, this.f34446b, this.f34451m, this.f34442C, this.f34448d, zz8Var, this.f34445a.getItemAnimator$foundation_release(), length, pz8.calculateLazyLayoutPinnedIndices(yx8VarInvoke, this.f34445a.getPinnedItems$foundation_release(), this.f34445a.getBeyondBoundsInfo$foundation_release()), this.f34443F, this.f34445a.m27909getPlacementScopeInvalidatorzYiylxw$foundation_release(), this.f34444H, dVar, new a(zz8Var, j, i2, i));
                az8.applyMeasureResult$foundation_release$default(this.f34445a, hy8VarM29876measureLazyGridOZKpZRA, false, 2, null);
                return hy8VarM29876measureLazyGridOZKpZRA;
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyGrid(@p000.gib androidx.compose.p002ui.InterfaceC0701e r30, @p000.yfb p000.az8 r31, @p000.yfb p000.vy8 r32, @p000.gib p000.vac r33, boolean r34, boolean r35, @p000.gib p000.s36 r36, boolean r37, @p000.yfb androidx.compose.foundation.layout.C0625c.m r38, @p000.yfb androidx.compose.foundation.layout.C0625c.e r39, @p000.yfb p000.qy6<? super p000.qy8, p000.bth> r40, @p000.gib p000.zl2 r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ey8.LazyGrid(androidx.compose.ui.e, az8, vy8, vac, boolean, boolean, s36, boolean, androidx.compose.foundation.layout.c$m, androidx.compose.foundation.layout.c$e, qy6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final p000.gz6<p000.zz8, p000.ku2, p000.vba> rememberLazyGridMeasurePolicy(p000.ny6<? extends p000.yx8> r17, p000.az8 r18, p000.vy8 r19, p000.vac r20, boolean r21, boolean r22, androidx.compose.foundation.layout.C0625c.e r23, androidx.compose.foundation.layout.C0625c.m r24, p000.x13 r25, p000.s97 r26, p000.zl2 r27, int r28) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ey8.rememberLazyGridMeasurePolicy(ny6, az8, vy8, vac, boolean, boolean, androidx.compose.foundation.layout.c$e, androidx.compose.foundation.layout.c$m, x13, s97, zl2, int):gz6");
    }
}
