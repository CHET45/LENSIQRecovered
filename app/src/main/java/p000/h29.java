package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,118:1\n148#2:119\n148#2:120\n148#2:121\n488#3:122\n487#3,4:123\n491#3,2:130\n495#3:136\n1223#4,3:127\n1226#4,3:133\n487#5:132\n77#6:137\n77#6:138\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n48#1:119\n56#1:120\n58#1:121\n63#1:122\n63#1:123,4\n63#1:130,2\n63#1:136\n63#1:127,3\n63#1:133,3\n63#1:132\n64#1:137\n94#1:138\n*E\n"})
public final class h29 {

    /* JADX INFO: renamed from: h29$a */
    public static final class C6687a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ boolean f42105C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ float f42106F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ float f42107H;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ qy6<r29, bth> f42108L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ int f42109M;

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ int f42110N;

        /* JADX INFO: renamed from: Q */
        public final /* synthetic */ int f42111Q;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z29 f42112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ t7c f42113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zy8 f42114c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0701e f42115d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vac f42116e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f42117f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ s36 f42118m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6687a(z29 z29Var, t7c t7cVar, zy8 zy8Var, InterfaceC0701e interfaceC0701e, vac vacVar, boolean z, s36 s36Var, boolean z2, float f, float f2, qy6<? super r29, bth> qy6Var, int i, int i2, int i3) {
            super(2);
            this.f42112a = z29Var;
            this.f42113b = t7cVar;
            this.f42114c = zy8Var;
            this.f42115d = interfaceC0701e;
            this.f42116e = vacVar;
            this.f42117f = z;
            this.f42118m = s36Var;
            this.f42105C = z2;
            this.f42106F = f;
            this.f42107H = f2;
            this.f42108L = qy6Var;
            this.f42109M = i;
            this.f42110N = i2;
            this.f42111Q = i3;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            h29.m29896LazyStaggeredGridLJWHXA8(this.f42112a, this.f42113b, this.f42114c, this.f42115d, this.f42116e, this.f42117f, this.f42118m, this.f42105C, this.f42106F, this.f42107H, this.f42108L, zl2Var, tsd.updateChangedFlags(this.f42109M | 1), tsd.updateChangedFlags(this.f42110N), this.f42111Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m29896LazyStaggeredGridLJWHXA8(@p000.yfb p000.z29 r31, @p000.yfb p000.t7c r32, @p000.yfb p000.zy8 r33, @p000.gib androidx.compose.p002ui.InterfaceC0701e r34, @p000.gib p000.vac r35, boolean r36, @p000.gib p000.s36 r37, boolean r38, float r39, float r40, @p000.yfb p000.qy6<? super p000.r29, p000.bth> r41, @p000.gib p000.zl2 r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h29.m29896LazyStaggeredGridLJWHXA8(z29, t7c, zy8, androidx.compose.ui.e, vac, boolean, s36, boolean, float, float, qy6, zl2, int, int, int):void");
    }
}
