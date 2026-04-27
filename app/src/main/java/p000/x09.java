package p000;

import androidx.compose.foundation.layout.C0625c;
import androidx.compose.foundation.layout.C0648y;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.List;
import p000.InterfaceC9407mm;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,365:1\n488#2:366\n487#2,4:367\n491#2,2:374\n495#2:380\n1223#3,3:371\n1226#3,3:377\n1223#3,6:384\n487#4:376\n77#5:381\n77#5:382\n77#5:383\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n85#1:366\n85#1:367,4\n85#1:374,2\n85#1:380\n85#1:371,3\n85#1:377,3\n171#1:384,6\n85#1:376\n86#1:381\n87#1:382\n124#1:383\n*E\n"})
public final class x09 {

    /* JADX INFO: renamed from: x09$a */
    public static final class C14864a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f95927C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ InterfaceC9407mm.b f95928F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ C0625c.m f95929H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ InterfaceC9407mm.c f95930L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ C0625c.e f95931M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ qy6<h19, bth> f95932N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ int f95933Q;

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ int f95934X;

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ int f95935Y;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f95936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ m19 f95937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f95938c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f95939d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f95940e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ s36 f95941f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f95942m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14864a(InterfaceC0701e interfaceC0701e, m19 m19Var, vac vacVar, boolean z, boolean z2, s36 s36Var, boolean z3, int i, InterfaceC9407mm.b bVar, C0625c.m mVar, InterfaceC9407mm.c cVar, C0625c.e eVar, qy6<? super h19, bth> qy6Var, int i2, int i3, int i4) {
            super(2);
            this.f95936a = interfaceC0701e;
            this.f95937b = m19Var;
            this.f95938c = vacVar;
            this.f95939d = z;
            this.f95940e = z2;
            this.f95941f = s36Var;
            this.f95942m = z3;
            this.f95927C = i;
            this.f95928F = bVar;
            this.f95929H = mVar;
            this.f95930L = cVar;
            this.f95931M = eVar;
            this.f95932N = qy6Var;
            this.f95933Q = i2;
            this.f95934X = i3;
            this.f95935Y = i4;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            x09.LazyList(this.f95936a, this.f95937b, this.f95938c, this.f95939d, this.f95940e, this.f95941f, this.f95942m, this.f95927C, this.f95928F, this.f95929H, this.f95930L, this.f95931M, this.f95932N, zl2Var, tsd.updateChangedFlags(this.f95933Q | 1), tsd.updateChangedFlags(this.f95934X), this.f95935Y);
        }
    }

    /* JADX INFO: renamed from: x09$b */
    @dwf({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,365:1\n602#2,8:366\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n299#1:366,8\n*E\n"})
    public static final class C14865b extends tt8 implements gz6<zz8, ku2, a19> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f95943C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f95944F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ x13 f95945H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ s97 f95946L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ InterfaceC9407mm.b f95947M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ InterfaceC9407mm.c f95948N;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m19 f95949a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f95950b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f95951c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f95952d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ny6<u09> f95953e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C0625c.m f95954f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C0625c.e f95955m;

        /* JADX INFO: renamed from: x09$b$a */
        public static final class a extends tt8 implements kz6<Integer, Integer, qy6<? super AbstractC0767t.a, ? extends bth>, vba> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zz8 f95956a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f95957b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f95958c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f95959d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zz8 zz8Var, long j, int i, int i2) {
                super(3);
                this.f95956a = zz8Var;
                this.f95957b = j;
                this.f95958c = i;
                this.f95959d = i2;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ vba invoke(Integer num, Integer num2, qy6<? super AbstractC0767t.a, ? extends bth> qy6Var) {
                return invoke(num.intValue(), num2.intValue(), (qy6<? super AbstractC0767t.a, bth>) qy6Var);
            }

            @yfb
            public final vba invoke(int i, int i2, @yfb qy6<? super AbstractC0767t.a, bth> qy6Var) {
                return this.f95956a.layout(nu2.m31227constrainWidthK40F9xA(this.f95957b, i + this.f95958c), nu2.m31226constrainHeightK40F9xA(this.f95957b, i2 + this.f95959d), xt9.emptyMap(), qy6Var);
            }
        }

        /* JADX INFO: renamed from: x09$b$b */
        public static final class b extends d19 {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ boolean f95960e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ zz8 f95961f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f95962g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ int f95963h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ InterfaceC9407mm.b f95964i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ InterfaceC9407mm.c f95965j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ boolean f95966k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ int f95967l;

            /* JADX INFO: renamed from: m */
            public final /* synthetic */ int f95968m;

            /* JADX INFO: renamed from: n */
            public final /* synthetic */ long f95969n;

            /* JADX INFO: renamed from: o */
            public final /* synthetic */ m19 f95970o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, boolean z, u09 u09Var, zz8 zz8Var, int i, int i2, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar, boolean z2, int i3, int i4, long j2, m19 m19Var) {
                super(j, z, u09Var, zz8Var, null);
                this.f95960e = z;
                this.f95961f = zz8Var;
                this.f95962g = i;
                this.f95963h = i2;
                this.f95964i = bVar;
                this.f95965j = cVar;
                this.f95966k = z2;
                this.f95967l = i3;
                this.f95968m = i4;
                this.f95969n = j2;
                this.f95970o = m19Var;
            }

            @Override // p000.d19
            @yfb
            /* JADX INFO: renamed from: createItem-X9ElhV4 */
            public b19 mo28565createItemX9ElhV4(int i, @yfb Object obj, @gib Object obj2, @yfb List<? extends AbstractC0767t> list, long j) {
                return new b19(i, list, this.f95960e, this.f95964i, this.f95965j, this.f95961f.getLayoutDirection(), this.f95966k, this.f95967l, this.f95968m, i == this.f95962g + (-1) ? 0 : this.f95963h, this.f95969n, obj, obj2, this.f95970o.getItemAnimator$foundation_release(), j, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14865b(m19 m19Var, boolean z, vac vacVar, boolean z2, ny6<? extends u09> ny6Var, C0625c.m mVar, C0625c.e eVar, boolean z3, int i, x13 x13Var, s97 s97Var, InterfaceC9407mm.b bVar, InterfaceC9407mm.c cVar) {
            super(2);
            this.f95949a = m19Var;
            this.f95950b = z;
            this.f95951c = vacVar;
            this.f95952d = z2;
            this.f95953e = ny6Var;
            this.f95954f = mVar;
            this.f95955m = eVar;
            this.f95943C = z3;
            this.f95944F = i;
            this.f95945H = x13Var;
            this.f95946L = s97Var;
            this.f95947M = bVar;
            this.f95948N = cVar;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ a19 invoke(zz8 zz8Var, ku2 ku2Var) {
            return m33149invoke0kLqBqw(zz8Var, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final a19 m33149invoke0kLqBqw(@yfb zz8 zz8Var, long j) {
            float fMo27395getSpacingD9Ej5fM;
            long jIntOffset;
            aub.m27883attachToScopeimpl(this.f95949a.m30927getMeasurementScopeInvalidatorzYiylxw$foundation_release());
            boolean z = this.f95949a.getHasLookaheadPassOccurred$foundation_release() || zz8Var.isLookingAhead();
            fy1.m29679checkScrollableContainerConstraintsK40F9xA(j, this.f95950b ? t7c.Vertical : t7c.Horizontal);
            int iMo27167roundToPx0680j_4 = this.f95950b ? zz8Var.mo27167roundToPx0680j_4(this.f95951c.mo32750calculateLeftPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateStartPadding(this.f95951c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_42 = this.f95950b ? zz8Var.mo27167roundToPx0680j_4(this.f95951c.mo32751calculateRightPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateEndPadding(this.f95951c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_43 = zz8Var.mo27167roundToPx0680j_4(this.f95951c.mo32752calculateTopPaddingD9Ej5fM());
            int iMo27167roundToPx0680j_44 = zz8Var.mo27167roundToPx0680j_4(this.f95951c.mo32749calculateBottomPaddingD9Ej5fM());
            int i = iMo27167roundToPx0680j_43 + iMo27167roundToPx0680j_44;
            int i2 = iMo27167roundToPx0680j_4 + iMo27167roundToPx0680j_42;
            boolean z2 = this.f95950b;
            int i3 = z2 ? i : i2;
            int i4 = (!z2 || this.f95952d) ? (z2 && this.f95952d) ? iMo27167roundToPx0680j_44 : (z2 || this.f95952d) ? iMo27167roundToPx0680j_42 : iMo27167roundToPx0680j_4 : iMo27167roundToPx0680j_43;
            int i5 = i3 - i4;
            long jM31229offsetNN6EwU = nu2.m31229offsetNN6EwU(j, -i2, -i);
            u09 u09VarInvoke = this.f95953e.invoke();
            u09VarInvoke.getItemScope().setMaxSize(ku2.m30763getMaxWidthimpl(jM31229offsetNN6EwU), ku2.m30762getMaxHeightimpl(jM31229offsetNN6EwU));
            if (this.f95950b) {
                C0625c.m mVar = this.f95954f;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                fMo27395getSpacingD9Ej5fM = mVar.mo27395getSpacingD9Ej5fM();
            } else {
                C0625c.e eVar = this.f95955m;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
                }
                fMo27395getSpacingD9Ej5fM = eVar.mo27395getSpacingD9Ej5fM();
            }
            int iMo27167roundToPx0680j_45 = zz8Var.mo27167roundToPx0680j_4(fMo27395getSpacingD9Ej5fM);
            int itemCount = u09VarInvoke.getItemCount();
            int iM30762getMaxHeightimpl = this.f95950b ? ku2.m30762getMaxHeightimpl(j) - i : ku2.m30763getMaxWidthimpl(j) - i2;
            if (!this.f95952d || iM30762getMaxHeightimpl > 0) {
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            } else {
                boolean z3 = this.f95950b;
                if (!z3) {
                    iMo27167roundToPx0680j_4 += iM30762getMaxHeightimpl;
                }
                if (z3) {
                    iMo27167roundToPx0680j_43 += iM30762getMaxHeightimpl;
                }
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            }
            b bVar = new b(jM31229offsetNN6EwU, this.f95950b, u09VarInvoke, zz8Var, itemCount, iMo27167roundToPx0680j_45, this.f95947M, this.f95948N, this.f95952d, i4, i5, jIntOffset, this.f95949a);
            ssf.C12771a c12771a = ssf.f82790e;
            m19 m19Var = this.f95949a;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = m19Var.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(u09VarInvoke, m19Var.getFirstVisibleItemIndex());
                int firstVisibleItemScrollOffset = m19Var.getFirstVisibleItemScrollOffset();
                bth bthVar = bth.f14751a;
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                a19 a19VarM33463measureLazyListx0Ok8Vo = z09.m33463measureLazyListx0Ok8Vo(itemCount, bVar, iM30762getMaxHeightimpl, i4, i5, iMo27167roundToPx0680j_45, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, (zz8Var.isLookingAhead() || !z) ? this.f95949a.getScrollToBeConsumed$foundation_release() : this.f95949a.getScrollDeltaBetweenPasses$foundation_release(), jM31229offsetNN6EwU, this.f95950b, this.f95943C ? u09VarInvoke.getHeaderIndexes() : l82.emptyList(), this.f95954f, this.f95955m, this.f95952d, zz8Var, this.f95949a.getItemAnimator$foundation_release(), this.f95944F, pz8.calculateLazyLayoutPinnedIndices(u09VarInvoke, this.f95949a.getPinnedItems$foundation_release(), this.f95949a.getBeyondBoundsInfo$foundation_release()), z, zz8Var.isLookingAhead(), this.f95949a.getPostLookaheadLayoutInfo$foundation_release(), this.f95945H, this.f95949a.m30928getPlacementScopeInvalidatorzYiylxw$foundation_release(), this.f95946L, new a(zz8Var, j, i2, i));
                m19.applyMeasureResult$foundation_release$default(this.f95949a, a19VarM33463measureLazyListx0Ok8Vo, zz8Var.isLookingAhead(), false, 4, null);
                return a19VarM33463measureLazyListx0Ok8Vo;
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(@p000.yfb androidx.compose.p002ui.InterfaceC0701e r37, @p000.yfb p000.m19 r38, @p000.yfb p000.vac r39, boolean r40, boolean r41, @p000.yfb p000.s36 r42, boolean r43, int r44, @p000.gib p000.InterfaceC9407mm.b r45, @p000.gib androidx.compose.foundation.layout.C0625c.m r46, @p000.gib p000.InterfaceC9407mm.c r47, @p000.gib androidx.compose.foundation.layout.C0625c.e r48, @p000.yfb p000.qy6<? super p000.h19, p000.bth> r49, @p000.gib p000.zl2 r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x09.LazyList(androidx.compose.ui.e, m19, vac, boolean, boolean, s36, boolean, int, mm$b, androidx.compose.foundation.layout.c$m, mm$c, androidx.compose.foundation.layout.c$e, qy6, zl2, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    @p000.ah5
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final p000.gz6<p000.zz8, p000.ku2, p000.vba> rememberLazyListMeasurePolicy(p000.ny6<? extends p000.u09> r21, p000.m19 r22, p000.vac r23, boolean r24, boolean r25, int r26, p000.InterfaceC9407mm.b r27, p000.InterfaceC9407mm.c r28, androidx.compose.foundation.layout.C0625c.e r29, androidx.compose.foundation.layout.C0625c.m r30, p000.x13 r31, p000.s97 r32, boolean r33, p000.zl2 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x09.rememberLazyListMeasurePolicy(ny6, m19, vac, boolean, boolean, int, mm$b, mm$c, androidx.compose.foundation.layout.c$e, androidx.compose.foundation.layout.c$m, x13, s97, boolean, zl2, int, int):gz6");
    }
}
