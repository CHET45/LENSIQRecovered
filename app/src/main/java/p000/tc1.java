package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.C0771x;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n1223#2,6:125\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125,6\n*E\n"})
public final class tc1 {

    /* JADX INFO: renamed from: tc1$a */
    @dwf({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class C12974a extends tt8 implements gz6<lcg, ku2, vba> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ uba f84224a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kz6<uc1, zl2, Integer, bth> f84225b;

        /* JADX INFO: renamed from: tc1$a$a */
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ kz6<uc1, zl2, Integer, bth> f84226a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vc1 f84227b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kz6<? super uc1, ? super zl2, ? super Integer, bth> kz6Var, vc1 vc1Var) {
                super(2);
                this.f84226a = kz6Var;
                this.f84227b = vc1Var;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(-1945019079, i, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                this.f84226a.invoke(this.f84227b, zl2Var, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12974a(uba ubaVar, kz6<? super uc1, ? super zl2, ? super Integer, bth> kz6Var) {
            super(2);
            this.f84224a = ubaVar;
            this.f84225b = kz6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ vba invoke(lcg lcgVar, ku2 ku2Var) {
            return m32398invoke0kLqBqw(lcgVar, ku2Var.m30769unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final vba m32398invoke0kLqBqw(@yfb lcg lcgVar, long j) {
            return this.f84224a.mo27228measure3p2s80s(lcgVar, lcgVar.subcompose(bth.f14751a, mk2.composableLambdaInstance(-1945019079, true, new a(this.f84225b, new vc1(lcgVar, j, null)))), j);
        }
    }

    /* JADX INFO: renamed from: tc1$b */
    public static final class C12975b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e f84228a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC9407mm f84229b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f84230c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kz6<uc1, zl2, Integer, bth> f84231d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f84232e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f84233f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12975b(InterfaceC0701e interfaceC0701e, InterfaceC9407mm interfaceC9407mm, boolean z, kz6<? super uc1, ? super zl2, ? super Integer, bth> kz6Var, int i, int i2) {
            super(2);
            this.f84228a = interfaceC0701e;
            this.f84229b = interfaceC9407mm;
            this.f84230c = z;
            this.f84231d = kz6Var;
            this.f84232e = i;
            this.f84233f = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            tc1.BoxWithConstraints(this.f84228a, this.f84229b, this.f84230c, this.f84231d, zl2Var, tsd.updateChangedFlags(this.f84232e | 1), this.f84233f);
        }
    }

    @yqh
    @hk2
    public static final void BoxWithConstraints(@gib InterfaceC0701e interfaceC0701e, @gib InterfaceC9407mm interfaceC9407mm, boolean z, @yfb kz6<? super uc1, ? super zl2, ? super Integer, bth> kz6Var, @gib zl2 zl2Var, int i, int i2) {
        int i3;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (zl2VarStartRestartGroup.changed(interfaceC0701e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(interfaceC9407mm) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= zl2VarStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= kw1.f55470l;
        } else if ((i & kw1.f55470l) == 0) {
            i3 |= zl2VarStartRestartGroup.changedInstance(kz6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                interfaceC0701e = InterfaceC0701e.f5158d1;
            }
            if (i5 != 0) {
                interfaceC9407mm = InterfaceC9407mm.f61437a.getTopStart();
            }
            if (i6 != 0) {
                z = false;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            uba ubaVarMaybeCachedBoxMeasurePolicy = pc1.maybeCachedBoxMeasurePolicy(interfaceC9407mm, z);
            boolean zChanged = ((i3 & 7168) == 2048) | zl2VarStartRestartGroup.changed(ubaVarMaybeCachedBoxMeasurePolicy);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C12974a(ubaVarMaybeCachedBoxMeasurePolicy, kz6Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C0771x.SubcomposeLayout(interfaceC0701e, (gz6) objRememberedValue, zl2VarStartRestartGroup, i3 & 14, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        InterfaceC0701e interfaceC0701e2 = interfaceC0701e;
        InterfaceC9407mm interfaceC9407mm2 = interfaceC9407mm;
        boolean z2 = z;
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C12975b(interfaceC0701e2, interfaceC9407mm2, z2, kz6Var, i, i2));
        }
    }
}
