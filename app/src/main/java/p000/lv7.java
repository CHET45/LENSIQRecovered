package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.mediarouter.media.C1340j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n1223#2,6:269\n1223#2,6:275\n124#3,6:281\n131#3,5:296\n136#3:307\n138#3:310\n289#4,9:287\n298#4,2:308\n4032#5,6:301\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:269,6\n246#1:275,6\n256#1:281,6\n256#1:296,5\n256#1:307\n256#1:310\n256#1:287,9\n256#1:308,2\n256#1:301,6\n*E\n"})
public final class lv7 {

    /* JADX INFO: renamed from: lv7$a */
    public static final class C8978a implements uba {

        /* JADX INFO: renamed from: a */
        public static final C8978a f58874a = new C8978a();

        /* JADX INFO: renamed from: lv7$a$a */
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public static final a f58875a = new a();

            public a() {
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

        @Override // p000.uba
        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30765getMinWidthimpl(j), ku2.m30764getMinHeightimpl(j), null, a.f58875a, 4, null);
        }
    }

    /* JADX INFO: renamed from: lv7$b */
    public static final class C8979b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ int f58876C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ int f58877F;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ occ f58878a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f58879b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0701e f58880c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC9407mm f58881d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ww2 f58882e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f58883f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ b92 f58884m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8979b(occ occVar, String str, InterfaceC0701e interfaceC0701e, InterfaceC9407mm interfaceC9407mm, ww2 ww2Var, float f, b92 b92Var, int i, int i2) {
            super(2);
            this.f58878a = occVar;
            this.f58879b = str;
            this.f58880c = interfaceC0701e;
            this.f58881d = interfaceC9407mm;
            this.f58882e = ww2Var;
            this.f58883f = f;
            this.f58884m = b92Var;
            this.f58876C = i;
            this.f58877F = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            lv7.Image(this.f58878a, this.f58879b, this.f58880c, this.f58881d, this.f58882e, this.f58883f, this.f58884m, zl2Var, tsd.updateChangedFlags(this.f58876C | 1), this.f58877F);
        }
    }

    /* JADX INFO: renamed from: lv7$c */
    public static final class C8980c extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f58885a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8980c(String str) {
            super(1);
            this.f58885a = str;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setContentDescription(eyeVar, this.f58885a);
            bye.m28185setRolekuIjeqM(eyeVar, jae.f50116b.m30504getImageo7Vup1c());
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    @q64(level = u64.f86867c, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @i2e(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final /* synthetic */ void Image(rs7 rs7Var, String str, InterfaceC0701e interfaceC0701e, InterfaceC9407mm interfaceC9407mm, ww2 ww2Var, float f, b92 b92Var, zl2 zl2Var, int i, int i2) {
        InterfaceC0701e interfaceC0701e2 = (i2 & 4) != 0 ? InterfaceC0701e.f5158d1 : interfaceC0701e;
        InterfaceC9407mm center = (i2 & 8) != 0 ? InterfaceC9407mm.f61437a.getCenter() : interfaceC9407mm;
        ww2 fit = (i2 & 16) != 0 ? ww2.f95584a.getFit() : ww2Var;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        b92 b92Var2 = (i2 & 64) != 0 ? null : b92Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-2123228673, i, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        m30900Image5hnEew(rs7Var, str, interfaceC0701e2, center, fit, f2, b92Var2, xu5.f99348b.m33296getLowfv9h1I(), zl2Var, i & 4194302, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    /* JADX INFO: renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m30900Image5hnEew(@yfb rs7 rs7Var, @gib String str, @gib InterfaceC0701e interfaceC0701e, @gib InterfaceC9407mm interfaceC9407mm, @gib ww2 ww2Var, float f, @gib b92 b92Var, int i, @gib zl2 zl2Var, int i2, int i3) {
        InterfaceC0701e interfaceC0701e2 = (i3 & 4) != 0 ? InterfaceC0701e.f5158d1 : interfaceC0701e;
        InterfaceC9407mm center = (i3 & 8) != 0 ? InterfaceC9407mm.f61437a.getCenter() : interfaceC9407mm;
        ww2 fit = (i3 & 16) != 0 ? ww2.f95584a.getFit() : ww2Var;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        b92 b92Var2 = (i3 & 64) != 0 ? null : b92Var;
        int iM30276getDefaultFilterQualityfv9h1I = (i3 & 128) != 0 ? ip4.f47823w.m30276getDefaultFilterQualityfv9h1I() : i;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1396260732, i2, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        boolean zChanged = zl2Var.changed(rs7Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = d41.m28569BitmapPainterQZhYCtY$default(rs7Var, 0L, 0L, iM30276getDefaultFilterQualityfv9h1I, 6, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        Image((c41) objRememberedValue, str, interfaceC0701e2, center, fit, f2, b92Var2, zl2Var, 4194288 & i2, 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    @bl2(applier = "androidx.compose.ui.UiComposable")
    @hk2
    public static final void Image(@yfb dw7 dw7Var, @gib String str, @gib InterfaceC0701e interfaceC0701e, @gib InterfaceC9407mm interfaceC9407mm, @gib ww2 ww2Var, float f, @gib b92 b92Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC0701e interfaceC0701e2 = (i2 & 4) != 0 ? InterfaceC0701e.f5158d1 : interfaceC0701e;
        InterfaceC9407mm center = (i2 & 8) != 0 ? InterfaceC9407mm.f61437a.getCenter() : interfaceC9407mm;
        ww2 fit = (i2 & 16) != 0 ? ww2.f95584a.getFit() : ww2Var;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        b92 b92Var2 = (i2 & 64) != 0 ? null : b92Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1595907091, i, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        Image(o3i.rememberVectorPainter(dw7Var, zl2Var, i & 14), str, interfaceC0701e2, center, fit, f2, b92Var2, zl2Var, n3i.f63216o | (i & 112) | (i & C1340j.f10444b) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    @p000.bl2(applier = "androidx.compose.ui.UiComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Image(@p000.yfb p000.occ r19, @p000.gib java.lang.String r20, @p000.gib androidx.compose.p002ui.InterfaceC0701e r21, @p000.gib p000.InterfaceC9407mm r22, @p000.gib p000.ww2 r23, float r24, @p000.gib p000.b92 r25, @p000.gib p000.zl2 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lv7.Image(occ, java.lang.String, androidx.compose.ui.e, mm, ww2, float, b92, zl2, int, int):void");
    }
}
