package p000;

import androidx.mediarouter.media.C1340j;
import com.watchfun.voicenotes.manager.voicenotes.RecordingService;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,520:1\n77#2:521\n77#2:540\n1223#3,6:522\n1223#3,6:528\n1223#3,6:534\n1223#3,6:544\n63#4,3:541\n184#5,6:550\n272#5,14:556\n696#6:570\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n132#1:521\n173#1:540\n135#1:522,6\n138#1:528,6\n147#1:534,6\n175#1:544,6\n174#1:541,3\n270#1:550,6\n270#1:556,14\n330#1:570\n*E\n"})
public final class o3i {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f66427a = "VectorRootGroup";

    /* JADX INFO: renamed from: o3i$a */
    public static final class C10184a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m3i f66428a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map<String, f3i> f66429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10184a(m3i m3iVar, Map<String, ? extends f3i> map) {
            super(2);
            this.f66428a = m3iVar;
            this.f66429b = map;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        @bl2(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
        @hk2
        public final void invoke(@gib zl2 zl2Var, int i) {
            if ((i & 3) == 2 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:514)");
            }
            o3i.RenderVectorGroup((k3i) this.f66428a, this.f66429b, zl2Var, 0, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: o3i$b */
    public static final class C10185b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ k3i f66430a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map<String, f3i> f66431b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f66432c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f66433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10185b(k3i k3iVar, Map<String, ? extends f3i> map, int i, int i2) {
            super(2);
            this.f66430a = k3iVar;
            this.f66431b = map;
            this.f66432c = i;
            this.f66433d = i2;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            o3i.RenderVectorGroup(this.f66430a, this.f66431b, zl2Var, tsd.updateChangedFlags(this.f66432c | 1), this.f66433d);
        }
    }

    /* JADX INFO: renamed from: o3i$c */
    public static final class C10186c implements f3i {
    }

    /* JADX INFO: renamed from: o3i$d */
    public static final class C10187d implements f3i {
    }

    /* JADX INFO: renamed from: o3i$e */
    public static final class C10188e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ oz6<Float, Float, zl2, Integer, bth> f66434a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f66435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10188e(oz6<? super Float, ? super Float, ? super zl2, ? super Integer, bth> oz6Var, long j) {
            super(2);
            this.f66434a = oz6Var;
            this.f66435b = j;
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
                gm2.traceEventStart(-824421385, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:157)");
            }
            this.f66434a.invoke(Float.valueOf(wpf.m33069getWidthimpl(this.f66435b)), Float.valueOf(wpf.m33066getHeightimpl(this.f66435b)), zl2Var, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @p000.bl2(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @p000.hk2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RenderVectorGroup(@p000.yfb p000.k3i r22, @p000.gib java.util.Map<java.lang.String, ? extends p000.f3i> r23, @p000.gib p000.zl2 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o3i.RenderVectorGroup(k3i, java.util.Map, zl2, int, int):void");
    }

    @yfb
    /* JADX INFO: renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final n3i m31282configureVectorPainterT4PVSW8(@yfb n3i n3iVar, long j, long j2, @yfb String str, @gib b92 b92Var, boolean z) {
        n3iVar.m31128setSizeuvyYCjk$ui_release(j);
        n3iVar.setAutoMirror$ui_release(z);
        n3iVar.setIntrinsicColorFilter$ui_release(b92Var);
        n3iVar.m31129setViewportSizeuvyYCjk$ui_release(j2);
        n3iVar.setName$ui_release(str);
        return n3iVar;
    }

    /* JADX INFO: renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final b92 m31284createColorFilterxETnrds(long j, int i) {
        if (j != 16) {
            return b92.f13012b.m27967tintxETnrds(j, i);
        }
        return null;
    }

    @yfb
    public static final mb7 createGroupComponent(@yfb mb7 mb7Var, @yfb k3i k3iVar) {
        int size = k3iVar.getSize();
        for (int i = 0; i < size; i++) {
            m3i m3iVar = k3iVar.get(i);
            if (m3iVar instanceof p3i) {
                xic xicVar = new xic();
                p3i p3iVar = (p3i) m3iVar;
                xicVar.setPathData(p3iVar.getPathData());
                xicVar.m33230setPathFillTypeoQ8Xj4U(p3iVar.m31719getPathFillTypeRgk1Os());
                xicVar.setName(p3iVar.getName());
                xicVar.setFill(p3iVar.getFill());
                xicVar.setFillAlpha(p3iVar.getFillAlpha());
                xicVar.setStroke(p3iVar.getStroke());
                xicVar.setStrokeAlpha(p3iVar.getStrokeAlpha());
                xicVar.setStrokeLineWidth(p3iVar.getStrokeLineWidth());
                xicVar.m33231setStrokeLineCapBeK7IIE(p3iVar.m31720getStrokeLineCapKaPHkGw());
                xicVar.m33232setStrokeLineJoinWw9F2mQ(p3iVar.m31721getStrokeLineJoinLxFBmk8());
                xicVar.setStrokeLineMiter(p3iVar.getStrokeLineMiter());
                xicVar.setTrimPathStart(p3iVar.getTrimPathStart());
                xicVar.setTrimPathEnd(p3iVar.getTrimPathEnd());
                xicVar.setTrimPathOffset(p3iVar.getTrimPathOffset());
                mb7Var.insertAt(i, xicVar);
            } else if (m3iVar instanceof k3i) {
                mb7 mb7Var2 = new mb7();
                k3i k3iVar2 = (k3i) m3iVar;
                mb7Var2.setName(k3iVar2.getName());
                mb7Var2.setRotation(k3iVar2.getRotation());
                mb7Var2.setScaleX(k3iVar2.getScaleX());
                mb7Var2.setScaleY(k3iVar2.getScaleY());
                mb7Var2.setTranslationX(k3iVar2.getTranslationX());
                mb7Var2.setTranslationY(k3iVar2.getTranslationY());
                mb7Var2.setPivotX(k3iVar2.getPivotX());
                mb7Var2.setPivotY(k3iVar2.getPivotY());
                mb7Var2.setClipPathData(k3iVar2.getClipPathData());
                createGroupComponent(mb7Var2, k3iVar2);
                mb7Var.insertAt(i, mb7Var2);
            }
        }
        return mb7Var;
    }

    @yfb
    public static final n3i createVectorPainterFromImageVector(@yfb c64 c64Var, @yfb dw7 dw7Var, @yfb mb7 mb7Var) {
        long jM31285obtainSizePxVpY3zN4 = m31285obtainSizePxVpY3zN4(c64Var, dw7Var.m28707getDefaultWidthD9Ej5fM(), dw7Var.m28706getDefaultHeightD9Ej5fM());
        return m31282configureVectorPainterT4PVSW8(new n3i(mb7Var), jM31285obtainSizePxVpY3zN4, m31286obtainViewportSizePq9zytI(jM31285obtainSizePxVpY3zN4, dw7Var.getViewportWidth(), dw7Var.getViewportHeight()), dw7Var.getName(), m31284createColorFilterxETnrds(dw7Var.m28709getTintColor0d7_KjU(), dw7Var.m28708getTintBlendMode0nO6VwU()), dw7Var.getAutoMirror());
    }

    private static final void mirror(ip4 ip4Var, qy6<? super ip4, bth> qy6Var) {
        long jMo30272getCenterF1C5BW0 = ip4Var.mo30272getCenterF1C5BW0();
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31602scale0AR0LA0(-1.0f, 1.0f, jMo30272getCenterF1C5BW0);
            qy6Var.invoke(ip4Var);
        } finally {
            o28.finallyStart(1);
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            o28.finallyEnd(1);
        }
    }

    /* JADX INFO: renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m31285obtainSizePxVpY3zN4(c64 c64Var, float f, float f2) {
        return eqf.Size(c64Var.mo27173toPx0680j_4(f), c64Var.mo27173toPx0680j_4(f2));
    }

    /* JADX INFO: renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m31286obtainViewportSizePq9zytI(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = wpf.m33069getWidthimpl(j);
        }
        if (Float.isNaN(f2)) {
            f2 = wpf.m33066getHeightimpl(j);
        }
        return eqf.Size(f, f2);
    }

    @yfb
    @hk2
    public static final n3i rememberVectorPainter(@yfb dw7 dw7Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        c64 c64Var = (c64) zl2Var.consume(sn2.getLocalDensity());
        float genId$ui_release = dw7Var.getGenId$ui_release();
        boolean zChanged = zl2Var.changed((((long) Float.floatToRawIntBits(c64Var.getDensity())) & 4294967295L) | (Float.floatToRawIntBits(genId$ui_release) << 32));
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            mb7 mb7Var = new mb7();
            createGroupComponent(mb7Var, dw7Var.getRoot());
            bth bthVar = bth.f14751a;
            objRememberedValue = createVectorPainterFromImageVector(c64Var, dw7Var, mb7Var);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        n3i n3iVar = (n3i) objRememberedValue;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return n3iVar;
    }

    @sk2(index = -1)
    @q64(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @i2e(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @yfb
    @hk2
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final n3i m31287rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, @gib String str, long j, int i, @yfb oz6<? super Float, ? super Float, ? super zl2, ? super Integer, bth> oz6Var, @gib zl2 zl2Var, int i2, int i3) {
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) != 0 ? Float.NaN : f4;
        String str2 = (i3 & 16) != 0 ? f66427a : str;
        long jM32987getUnspecified0d7_KjU = (i3 & 32) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j;
        int iM31926getSrcIn0nO6VwU = (i3 & 64) != 0 ? q51.f73234b.m31926getSrcIn0nO6VwU() : i;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-964365210, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:86)");
        }
        n3i n3iVarM31288rememberVectorPaintervIP8VLU = m31288rememberVectorPaintervIP8VLU(f, f2, f5, f6, str2, jM32987getUnspecified0d7_KjU, iM31926getSrcIn0nO6VwU, false, oz6Var, zl2Var, (i2 & 14) | RecordingService.f26452f | (i2 & 112) | (i2 & C1340j.f10444b) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 << 3) & 234881024), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return n3iVarM31288rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0129 A[PHI: r5
  0x0129: PHI (r5v11 oz6<? super java.lang.Float, ? super java.lang.Float, ? super zl2, ? super java.lang.Integer, bth>) = 
  (r5v9 oz6<? super java.lang.Float, ? super java.lang.Float, ? super zl2, ? super java.lang.Integer, bth>)
  (r5v12 oz6<? super java.lang.Float, ? super java.lang.Float, ? super zl2, ? super java.lang.Integer, bth>)
 binds: [B:77:0x0127, B:73:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    @p000.sk2(index = -1)
    @p000.yfb
    @p000.hk2
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.n3i m31288rememberVectorPaintervIP8VLU(float r17, float r18, float r19, float r20, @p000.gib java.lang.String r21, long r22, int r24, boolean r25, @p000.yfb p000.oz6<? super java.lang.Float, ? super java.lang.Float, ? super p000.zl2, ? super java.lang.Integer, p000.bth> r26, @p000.gib p000.zl2 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o3i.m31288rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, oz6, zl2, int, int):n3i");
    }
}
