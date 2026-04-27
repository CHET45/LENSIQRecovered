package p000;

import androidx.compose.foundation.lazy.layout.C0661c;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.C0771x;
import androidx.compose.p002ui.layout.C0772y;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n1223#2,6:159\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n55#1:159,6\n*E\n"})
public final class yz8 {

    /* JADX INFO: renamed from: a */
    public static final int f103503a = 7;

    /* JADX INFO: renamed from: yz8$a */
    public static final class C15899a extends tt8 implements ny6<vz8> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vz8 f103504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15899a(vz8 vz8Var) {
            super(0);
            this.f103504a = vz8Var;
        }

        @Override // p000.ny6
        @yfb
        public final vz8 invoke() {
            return this.f103504a;
        }
    }

    /* JADX INFO: renamed from: yz8$b */
    public static final class C15900b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vz8 f103505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f103506b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i09 f103507c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zz8, ku2, vba> f103508d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f103509e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f103510f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15900b(vz8 vz8Var, InterfaceC0701e interfaceC0701e, i09 i09Var, gz6<? super zz8, ? super ku2, ? extends vba> gz6Var, int i, int i2) {
            super(2);
            this.f103505a = vz8Var;
            this.f103506b = interfaceC0701e;
            this.f103507c = i09Var;
            this.f103508d = gz6Var;
            this.f103509e = i;
            this.f103510f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            yz8.LazyLayout(this.f103505a, this.f103506b, this.f103507c, this.f103508d, zl2Var, tsd.updateChangedFlags(this.f103509e | 1), this.f103510f);
        }
    }

    /* JADX INFO: renamed from: yz8$c */
    @dwf({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n1223#2,6:159\n1223#2,6:165\n1223#2,6:171\n1223#2,6:177\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n*L\n83#1:159,6\n86#1:165,6\n96#1:171,6\n111#1:177,6\n*E\n"})
    public static final class C15901c extends tt8 implements kz6<ple, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i09 f103511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f103512b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zz8, ku2, vba> f103513c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ i2g<ny6<vz8>> f103514d;

        /* JADX INFO: renamed from: yz8$c$a */
        @dwf({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,158:1\n64#2,5:159\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3$1$1\n*L\n102#1:159,5\n*E\n"})
        public static final class a extends tt8 implements qy6<wf4, vf4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i09 f103515a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ tz8 f103516b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0772y f103517c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ s9d f103518d;

            /* JADX INFO: renamed from: yz8$c$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3$1$1\n*L\n1#1,497:1\n103#2,2:498\n*E\n"})
            public static final class C16564a implements vf4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ i09 f103519a;

                public C16564a(i09 i09Var) {
                    this.f103519a = i09Var;
                }

                @Override // p000.vf4
                public void dispose() {
                    this.f103519a.setPrefetchHandleProvider$foundation_release(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i09 i09Var, tz8 tz8Var, C0772y c0772y, s9d s9dVar) {
                super(1);
                this.f103515a = i09Var;
                this.f103516b = tz8Var;
                this.f103517c = c0772y;
                this.f103518d = s9dVar;
            }

            @Override // p000.qy6
            @yfb
            public final vf4 invoke(@yfb wf4 wf4Var) {
                this.f103515a.setPrefetchHandleProvider$foundation_release(new o9d(this.f103516b, this.f103517c, this.f103518d));
                return new C16564a(this.f103515a);
            }
        }

        /* JADX INFO: renamed from: yz8$c$b */
        public static final class b extends tt8 implements gz6<lcg, ku2, vba> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ tz8 f103520a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ gz6<zz8, ku2, vba> f103521b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(tz8 tz8Var, gz6<? super zz8, ? super ku2, ? extends vba> gz6Var) {
                super(2);
                this.f103520a = tz8Var;
                this.f103521b = gz6Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ vba invoke(lcg lcgVar, ku2 ku2Var) {
                return m33461invoke0kLqBqw(lcgVar, ku2Var.m30769unboximpl());
            }

            @yfb
            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
            public final vba m33461invoke0kLqBqw(@yfb lcg lcgVar, long j) {
                return this.f103521b.invoke(new a09(this.f103520a, lcgVar), ku2.m30751boximpl(j));
            }
        }

        /* JADX INFO: renamed from: yz8$c$c */
        public static final class c extends tt8 implements ny6<vz8> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<ny6<vz8>> f103522a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i2g<? extends ny6<? extends vz8>> i2gVar) {
                super(0);
                this.f103522a = i2gVar;
            }

            @Override // p000.ny6
            @yfb
            public final vz8 invoke() {
                return this.f103522a.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15901c(i09 i09Var, InterfaceC0701e interfaceC0701e, gz6<? super zz8, ? super ku2, ? extends vba> gz6Var, i2g<? extends ny6<? extends vz8>> i2gVar) {
            super(3);
            this.f103511a = i09Var;
            this.f103512b = interfaceC0701e;
            this.f103513c = gz6Var;
            this.f103514d = i2gVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(ple pleVar, zl2 zl2Var, Integer num) {
            invoke(pleVar, zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.UiComposable")
        @hk2
        public final void invoke(@yfb ple pleVar, @gib zl2 zl2Var, int i) {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1488997347, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            i2g<ny6<vz8>> i2gVar = this.f103514d;
            Object objRememberedValue = zl2Var.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                objRememberedValue = new tz8(pleVar, new c(i2gVar));
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            tz8 tz8Var = (tz8) objRememberedValue;
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new C0772y(new xz8(tz8Var));
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            C0772y c0772y = (C0772y) objRememberedValue2;
            if (this.f103511a != null) {
                zl2Var.startReplaceGroup(205264983);
                s9d prefetchScheduler$foundation_release = this.f103511a.getPrefetchScheduler$foundation_release();
                if (prefetchScheduler$foundation_release == null) {
                    zl2Var.startReplaceGroup(6622915);
                    prefetchScheduler$foundation_release = t9d.rememberDefaultPrefetchScheduler(zl2Var, 0);
                } else {
                    zl2Var.startReplaceGroup(6621830);
                }
                zl2Var.endReplaceGroup();
                Object[] objArr = {this.f103511a, tz8Var, c0772y, prefetchScheduler$foundation_release};
                boolean zChanged = zl2Var.changed(this.f103511a) | zl2Var.changedInstance(tz8Var) | zl2Var.changedInstance(c0772y) | zl2Var.changedInstance(prefetchScheduler$foundation_release);
                i09 i09Var = this.f103511a;
                Object objRememberedValue3 = zl2Var.rememberedValue();
                if (zChanged || objRememberedValue3 == c16170a.getEmpty()) {
                    objRememberedValue3 = new a(i09Var, tz8Var, c0772y, prefetchScheduler$foundation_release);
                    zl2Var.updateRememberedValue(objRememberedValue3);
                }
                jx4.DisposableEffect(objArr, (qy6<? super wf4, ? extends vf4>) objRememberedValue3, zl2Var, 0);
                zl2Var.endReplaceGroup();
            } else {
                zl2Var.startReplaceGroup(205858881);
                zl2Var.endReplaceGroup();
            }
            InterfaceC0701e interfaceC0701eTraversablePrefetchState = C0661c.traversablePrefetchState(this.f103512b, this.f103511a);
            boolean zChanged2 = zl2Var.changed(tz8Var) | zl2Var.changed(this.f103513c);
            gz6<zz8, ku2, vba> gz6Var = this.f103513c;
            Object objRememberedValue4 = zl2Var.rememberedValue();
            if (zChanged2 || objRememberedValue4 == c16170a.getEmpty()) {
                objRememberedValue4 = new b(tz8Var, gz6Var);
                zl2Var.updateRememberedValue(objRememberedValue4);
            }
            C0771x.SubcomposeLayout(c0772y, interfaceC0701eTraversablePrefetchState, (gz6) objRememberedValue4, zl2Var, C0772y.f5533f, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: yz8$d */
    public static final class C15902d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<vz8> f103523a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e f103524b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i09 f103525c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gz6<zz8, ku2, vba> f103526d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f103527e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f103528f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15902d(ny6<? extends vz8> ny6Var, InterfaceC0701e interfaceC0701e, i09 i09Var, gz6<? super zz8, ? super ku2, ? extends vba> gz6Var, int i, int i2) {
            super(2);
            this.f103523a = ny6Var;
            this.f103524b = interfaceC0701e;
            this.f103525c = i09Var;
            this.f103526d = gz6Var;
            this.f103527e = i;
            this.f103528f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            yz8.LazyLayout(this.f103523a, this.f103524b, this.f103525c, this.f103526d, zl2Var, tsd.updateChangedFlags(this.f103527e | 1), this.f103528f);
        }
    }

    @q64(message = "Use an overload accepting a lambda prodicing an item provider instead", replaceWith = @i2e(expression = "LazyLayout({ itemProvider }, modifier, prefetchState, measurePolicy)", imports = {}))
    @ah5
    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void LazyLayout(@yfb vz8 vz8Var, @gib InterfaceC0701e interfaceC0701e, @gib i09 i09Var, @yfb gz6<? super zz8, ? super ku2, ? extends vba> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(852831187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(vz8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(i09Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (i5 != 0) {
                i09Var = null;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(852831187, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:53)");
            }
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C15899a(vz8Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyLayout((ny6<? extends vz8>) objRememberedValue, interfaceC0701e, i09Var, gz6Var, zl2VarStartRestartGroup, i3 & 8176, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        i09 i09Var2 = i09Var;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C15900b(vz8Var, interfaceC0701e2, i09Var2, gz6Var, i, i2));
        }
    }

    @ah5
    @hk2
    @ik2(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@yfb ny6<? extends vz8> ny6Var, @gib InterfaceC0701e interfaceC0701e, @gib i09 i09Var, @yfb gz6<? super zz8, ? super ku2, ? extends vba> gz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changedInstance(ny6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC0701e) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(i09Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (i5 != 0) {
                i09Var = null;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            q19.LazySaveableStateHolderProvider(mk2.rememberComposableLambda(-1488997347, true, new C15901c(i09Var, interfaceC0701e, gz6Var, stf.rememberUpdatedState(ny6Var, zl2VarStartRestartGroup, i3 & 14)), zl2VarStartRestartGroup, 54), zl2VarStartRestartGroup, 6);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        i09 i09Var2 = i09Var;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C15902d(ny6Var, interfaceC0701e2, i09Var2, gz6Var, i, i2));
        }
    }
}
