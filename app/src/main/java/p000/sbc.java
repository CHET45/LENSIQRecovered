package p000;

import androidx.compose.foundation.layout.C0648y;
import androidx.compose.p002ui.layout.AbstractC0767t;
import p000.InterfaceC9407mm;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,208:1\n1223#2,6:209\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n57#1:209,6\n*E\n"})
public final class sbc {

    /* JADX INFO: renamed from: sbc$a */
    @dwf({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,208:1\n602#2,8:209\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n153#1:209,8\n*E\n"})
    public static final class C12509a extends tt8 implements gz6<zz8, ku2, tbc> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ ny6<Integer> f81135C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ InterfaceC9407mm.c f81136F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ InterfaceC9407mm.b f81137H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ int f81138L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ msf f81139M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ x13 f81140N;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dcc f81141a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t7c f81142b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vac f81143c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f81144d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f81145e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ dbc f81146f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ ny6<qbc> f81147m;

        /* JADX INFO: renamed from: sbc$a$a */
        public static final class a extends tt8 implements kz6<Integer, Integer, qy6<? super AbstractC0767t.a, ? extends bth>, vba> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zz8 f81148a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f81149b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f81150c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f81151d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zz8 zz8Var, long j, int i, int i2) {
                super(3);
                this.f81148a = zz8Var;
                this.f81149b = j;
                this.f81150c = i;
                this.f81151d = i2;
            }

            @Override // p000.kz6
            public /* bridge */ /* synthetic */ vba invoke(Integer num, Integer num2, qy6<? super AbstractC0767t.a, ? extends bth> qy6Var) {
                return invoke(num.intValue(), num2.intValue(), (qy6<? super AbstractC0767t.a, bth>) qy6Var);
            }

            @yfb
            public final vba invoke(int i, int i2, @yfb qy6<? super AbstractC0767t.a, bth> qy6Var) {
                return this.f81148a.layout(nu2.m31227constrainWidthK40F9xA(this.f81149b, i + this.f81150c), nu2.m31226constrainHeightK40F9xA(this.f81149b, i2 + this.f81151d), xt9.emptyMap(), qy6Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12509a(dcc dccVar, t7c t7cVar, vac vacVar, boolean z, float f, dbc dbcVar, ny6<qbc> ny6Var, ny6<Integer> ny6Var2, InterfaceC9407mm.c cVar, InterfaceC9407mm.b bVar, int i, msf msfVar, x13 x13Var) {
            super(2);
            this.f81141a = dccVar;
            this.f81142b = t7cVar;
            this.f81143c = vacVar;
            this.f81144d = z;
            this.f81145e = f;
            this.f81146f = dbcVar;
            this.f81147m = ny6Var;
            this.f81135C = ny6Var2;
            this.f81136F = cVar;
            this.f81137H = bVar;
            this.f81138L = i;
            this.f81139M = msfVar;
            this.f81140N = x13Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ tbc invoke(zz8 zz8Var, ku2 ku2Var) {
            return m32298invoke0kLqBqw(zz8Var, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final tbc m32298invoke0kLqBqw(@yfb zz8 zz8Var, long j) {
            long jIntOffset;
            aub.m27883attachToScopeimpl(this.f81141a.m28635getMeasurementScopeInvalidatorzYiylxw$foundation_release());
            t7c t7cVar = this.f81142b;
            t7c t7cVar2 = t7c.Vertical;
            boolean z = t7cVar == t7cVar2;
            fy1.m29679checkScrollableContainerConstraintsK40F9xA(j, z ? t7cVar2 : t7c.Horizontal);
            int iMo27167roundToPx0680j_4 = z ? zz8Var.mo27167roundToPx0680j_4(this.f81143c.mo32750calculateLeftPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateStartPadding(this.f81143c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_42 = z ? zz8Var.mo27167roundToPx0680j_4(this.f81143c.mo32751calculateRightPaddingu2uoSUM(zz8Var.getLayoutDirection())) : zz8Var.mo27167roundToPx0680j_4(C0648y.calculateEndPadding(this.f81143c, zz8Var.getLayoutDirection()));
            int iMo27167roundToPx0680j_43 = zz8Var.mo27167roundToPx0680j_4(this.f81143c.mo32752calculateTopPaddingD9Ej5fM());
            int iMo27167roundToPx0680j_44 = zz8Var.mo27167roundToPx0680j_4(this.f81143c.mo32749calculateBottomPaddingD9Ej5fM());
            int i = iMo27167roundToPx0680j_43 + iMo27167roundToPx0680j_44;
            int i2 = iMo27167roundToPx0680j_4 + iMo27167roundToPx0680j_42;
            int i3 = z ? i : i2;
            int i4 = (!z || this.f81144d) ? (z && this.f81144d) ? iMo27167roundToPx0680j_44 : (z || this.f81144d) ? iMo27167roundToPx0680j_42 : iMo27167roundToPx0680j_4 : iMo27167roundToPx0680j_43;
            int i5 = i3 - i4;
            long jM31229offsetNN6EwU = nu2.m31229offsetNN6EwU(j, -i2, -i);
            this.f81141a.setDensity$foundation_release(zz8Var);
            int iMo27167roundToPx0680j_45 = zz8Var.mo27167roundToPx0680j_4(this.f81145e);
            int iM30762getMaxHeightimpl = z ? ku2.m30762getMaxHeightimpl(j) - i : ku2.m30763getMaxWidthimpl(j) - i2;
            if (!this.f81144d || iM30762getMaxHeightimpl > 0) {
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            } else {
                if (!z) {
                    iMo27167roundToPx0680j_4 += iM30762getMaxHeightimpl;
                }
                if (z) {
                    iMo27167roundToPx0680j_43 += iM30762getMaxHeightimpl;
                }
                jIntOffset = b78.IntOffset(iMo27167roundToPx0680j_4, iMo27167roundToPx0680j_43);
            }
            long j2 = jIntOffset;
            int iCoerceAtLeast = kpd.coerceAtLeast(this.f81146f.calculateMainAxisPageSize(zz8Var, iM30762getMaxHeightimpl, iMo27167roundToPx0680j_45), 0);
            this.f81141a.m28639setPremeasureConstraintsBRTryo0$foundation_release(nu2.Constraints$default(0, this.f81142b == t7cVar2 ? ku2.m30763getMaxWidthimpl(jM31229offsetNN6EwU) : iCoerceAtLeast, 0, this.f81142b != t7cVar2 ? ku2.m30762getMaxHeightimpl(jM31229offsetNN6EwU) : iCoerceAtLeast, 5, null));
            qbc qbcVarInvoke = this.f81147m.invoke();
            ssf.C12771a c12771a = ssf.f82790e;
            dcc dccVar = this.f81141a;
            msf msfVar = this.f81139M;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iMatchScrollPositionWithKey$foundation_release = dccVar.matchScrollPositionWithKey$foundation_release(qbcVarInvoke, dccVar.getCurrentPage());
                int iCurrentPageOffset = lbc.currentPageOffset(msfVar, iM30762getMaxHeightimpl, iCoerceAtLeast, iMo27167roundToPx0680j_45, i4, i5, dccVar.getCurrentPage(), dccVar.getCurrentPageOffsetFraction(), dccVar.getPageCount());
                bth bthVar = bth.f14751a;
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                tbc tbcVarM32105measurePagerbmk8ZPk = rbc.m32105measurePagerbmk8ZPk(zz8Var, this.f81135C.invoke().intValue(), qbcVarInvoke, iM30762getMaxHeightimpl, i4, i5, iMo27167roundToPx0680j_45, iMatchScrollPositionWithKey$foundation_release, iCurrentPageOffset, jM31229offsetNN6EwU, this.f81142b, this.f81136F, this.f81137H, this.f81144d, j2, iCoerceAtLeast, this.f81138L, pz8.calculateLazyLayoutPinnedIndices(qbcVarInvoke, this.f81141a.getPinnedPages$foundation_release(), this.f81141a.getBeyondBoundsInfo$foundation_release()), this.f81139M, this.f81141a.m28636getPlacementScopeInvalidatorzYiylxw$foundation_release(), this.f81140N, new a(zz8Var, j, i2, i));
                dcc.applyMeasureResult$foundation_release$default(this.f81141a, tbcVarM32105measurePagerbmk8ZPk, false, 2, null);
                return tbcVarM32105measurePagerbmk8ZPk;
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    @p000.yfb
    @p000.hk2
    /* JADX INFO: renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.gz6<p000.zz8, p000.ku2, p000.vba> m32297rememberPagerMeasurePolicy8u0NR3k(@p000.yfb p000.ny6<p000.qbc> r21, @p000.yfb p000.dcc r22, @p000.yfb p000.vac r23, boolean r24, @p000.yfb p000.t7c r25, int r26, float r27, @p000.yfb p000.dbc r28, @p000.gib p000.InterfaceC9407mm.b r29, @p000.gib p000.InterfaceC9407mm.c r30, @p000.yfb p000.msf r31, @p000.yfb p000.x13 r32, @p000.yfb p000.ny6<java.lang.Integer> r33, @p000.gib p000.zl2 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sbc.m32297rememberPagerMeasurePolicy8u0NR3k(ny6, dcc, vac, boolean, t7c, int, float, dbc, mm$b, mm$c, msf, x13, ny6, zl2, int, int):gz6");
    }
}
