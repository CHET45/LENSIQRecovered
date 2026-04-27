package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,133:1\n256#2:134\n329#2,26:225\n78#3:135\n78#3:179\n78#3:180\n78#3:181\n432#4,6:136\n442#4,2:143\n444#4,8:148\n452#4,9:159\n461#4,8:171\n432#4,6:182\n442#4,2:189\n444#4,8:194\n452#4,9:205\n461#4,8:217\n264#5:142\n264#5:188\n245#6,3:145\n248#6,3:168\n245#6,3:191\n248#6,3:214\n1208#7:156\n1187#7,2:157\n1208#7:202\n1187#7,2:203\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n48#1:134\n102#1:225,26\n56#1:135\n63#1:179\n75#1:180\n88#1:181\n56#1:136,6\n56#1:143,2\n56#1:148,8\n56#1:159,9\n56#1:171,8\n88#1:182,6\n88#1:189,2\n88#1:194,8\n88#1:205,9\n88#1:217,8\n56#1:142\n88#1:188\n56#1:145,3\n56#1:168,3\n88#1:191,3\n88#1:214,3\n56#1:156\n56#1:157,2\n88#1:202\n88#1:203,2\n*E\n"})
@e0g(parameters = 1)
public final class nw8 implements ip4, ov2 {

    /* JADX INFO: renamed from: c */
    public static final int f65894c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final nr1 f65895a;

    /* JADX INFO: renamed from: b */
    @gib
    public fp4 f65896b;

    public nw8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m31266draweZhPAX0$ui_release(@yfb vq1 vq1Var, long j, @yfb heb hebVar, @yfb InterfaceC0701e.d dVar, @gib u97 u97Var) {
        int iM30687constructorimpl = keb.m30687constructorimpl(4);
        InterfaceC0701e.d dVarPop = dVar;
        f7b f7bVar = null;
        while (dVarPop != null) {
            if (dVarPop instanceof fp4) {
                m31267drawDirecteZhPAX0$ui_release(vq1Var, j, hebVar, (fp4) dVarPop, u97Var);
            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                int i = 0;
                for (InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            dVarPop = delegate$ui_release;
                        } else {
                            if (f7bVar == null) {
                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                            }
                            if (dVarPop != null) {
                                f7bVar.add(dVarPop);
                                dVarPop = null;
                            }
                            f7bVar.add(delegate$ui_release);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            dVarPop = w34.pop(f7bVar);
        }
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawArc-illE91I */
    public void mo30253drawArcillE91I(@yfb he1 he1Var, float f, float f2, boolean z, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30253drawArcillE91I(he1Var, f, f2, z, j, j2, f3, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public void mo30254drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f3, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30254drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public void mo30255drawCircleV9BoPsw(@yfb he1 he1Var, float f, long j, @y46(from = 0.0d, m25645to = 1.0d) float f2, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30255drawCircleV9BoPsw(he1Var, f, j, f2, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public void mo30256drawCircleVaOC9Bg(long j, float f, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f2, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30256drawCircleVaOC9Bg(j, f, j2, f2, rp4Var, b92Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // p000.ov2
    public void drawContent() {
        vq1 canvas = getDrawContext().getCanvas();
        fp4 fp4Var = this.f65896b;
        md8.checkNotNull(fp4Var);
        InterfaceC0701e.d dVarNextDrawNode = ow8.nextDrawNode(fp4Var);
        if (dVarNextDrawNode == 0) {
            heb hebVarM32852requireCoordinator64DMado = w34.m32852requireCoordinator64DMado(fp4Var, keb.m30687constructorimpl(4));
            if (hebVarM32852requireCoordinator64DMado.getTail() == fp4Var.getNode()) {
                hebVarM32852requireCoordinator64DMado = hebVarM32852requireCoordinator64DMado.getWrapped$ui_release();
                md8.checkNotNull(hebVarM32852requireCoordinator64DMado);
            }
            hebVarM32852requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM30687constructorimpl = keb.m30687constructorimpl(4);
        f7b f7bVar = null;
        while (dVarNextDrawNode != 0) {
            if (dVarNextDrawNode instanceof fp4) {
                performDraw((fp4) dVarNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((dVarNextDrawNode.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarNextDrawNode instanceof d44)) {
                InterfaceC0701e.d delegate$ui_release = ((d44) dVarNextDrawNode).getDelegate$ui_release();
                int i = 0;
                dVarNextDrawNode = dVarNextDrawNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            dVarNextDrawNode = delegate$ui_release;
                        } else {
                            if (f7bVar == null) {
                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                            }
                            if (dVarNextDrawNode != 0) {
                                f7bVar.add(dVarNextDrawNode);
                                dVarNextDrawNode = 0;
                            }
                            f7bVar.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    dVarNextDrawNode = dVarNextDrawNode;
                }
                if (i == 1) {
                }
            }
            dVarNextDrawNode = w34.pop(f7bVar);
        }
    }

    /* JADX INFO: renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m31267drawDirecteZhPAX0$ui_release(@yfb vq1 vq1Var, long j, @yfb heb hebVar, @yfb fp4 fp4Var, @gib u97 u97Var) {
        fp4 fp4Var2 = this.f65896b;
        this.f65896b = fp4Var;
        nr1 nr1Var = this.f65895a;
        ov8 layoutDirection = hebVar.getLayoutDirection();
        c64 density = nr1Var.getDrawContext().getDensity();
        ov8 layoutDirection2 = nr1Var.getDrawContext().getLayoutDirection();
        vq1 canvas = nr1Var.getDrawContext().getCanvas();
        long jMo28019getSizeNHjbRc = nr1Var.getDrawContext().mo28019getSizeNHjbRc();
        u97 graphicsLayer = nr1Var.getDrawContext().getGraphicsLayer();
        bp4 drawContext = nr1Var.getDrawContext();
        drawContext.setDensity(hebVar);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(vq1Var);
        drawContext.mo28020setSizeuvyYCjk(j);
        drawContext.setGraphicsLayer(u97Var);
        vq1Var.save();
        try {
            fp4Var.draw(this);
            vq1Var.restore();
            bp4 drawContext2 = nr1Var.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas);
            drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            this.f65896b = fp4Var2;
        } catch (Throwable th) {
            vq1Var.restore();
            bp4 drawContext3 = nr1Var.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    @Override // p000.ip4
    @q64(level = u64.f86867c, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @i2e(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo30257drawImage9jGpkUE(rs7 rs7Var, long j, long j2, long j3, long j4, @y46(from = 0.0d, m25645to = 1.0d) float f, rp4 rp4Var, b92 b92Var, int i) {
        this.f65895a.mo30257drawImage9jGpkUE(rs7Var, j, j2, j3, j4, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public void mo30258drawImageAZ2fEMs(@yfb rs7 rs7Var, long j, long j2, long j3, long j4, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i, int i2) {
        this.f65895a.mo30258drawImageAZ2fEMs(rs7Var, j, j2, j3, j4, f, rp4Var, b92Var, i, i2);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public void mo30259drawImagegbVJVH8(@yfb rs7 rs7Var, long j, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30259drawImagegbVJVH8(rs7Var, j, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public void mo30260drawLine1RTmtNc(@yfb he1 he1Var, long j, long j2, float f, int i, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i2) {
        this.f65895a.mo30260drawLine1RTmtNc(he1Var, j, j2, f, i, ajcVar, f2, b92Var, i2);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public void mo30261drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i2) {
        this.f65895a.mo30261drawLineNGM6Ib0(j, j2, j3, f, i, ajcVar, f2, b92Var, i2);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public void mo30262drawOvalAsUm42w(@yfb he1 he1Var, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30262drawOvalAsUm42w(he1Var, j, j2, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public void mo30263drawOvalnJ9OG0(long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30263drawOvalnJ9OG0(j, j2, j3, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public void mo30264drawPathGBMwjPU(@yfb vic vicVar, @yfb he1 he1Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30264drawPathGBMwjPU(vicVar, he1Var, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public void mo30265drawPathLG529CI(@yfb vic vicVar, long j, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30265drawPathLG529CI(vicVar, j, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public void mo30266drawPointsF8ZwMP8(@yfb List<izb> list, int i, long j, float f, int i2, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i3) {
        this.f65895a.mo30266drawPointsF8ZwMP8(list, i, j, f, i2, ajcVar, f2, b92Var, i3);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public void mo30267drawPointsGsft0Ws(@yfb List<izb> list, int i, @yfb he1 he1Var, float f, int i2, @gib ajc ajcVar, @y46(from = 0.0d, m25645to = 1.0d) float f2, @gib b92 b92Var, int i3) {
        this.f65895a.mo30267drawPointsGsft0Ws(list, i, he1Var, f, i2, ajcVar, f2, b92Var, i3);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public void mo30268drawRectAsUm42w(@yfb he1 he1Var, long j, long j2, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30268drawRectAsUm42w(he1Var, j, j2, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public void mo30269drawRectnJ9OG0(long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30269drawRectnJ9OG0(j, j2, j3, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public void mo30270drawRoundRectZuiqVtQ(@yfb he1 he1Var, long j, long j2, long j3, @y46(from = 0.0d, m25645to = 1.0d) float f, @yfb rp4 rp4Var, @gib b92 b92Var, int i) {
        this.f65895a.mo30270drawRoundRectZuiqVtQ(he1Var, j, j2, j3, f, rp4Var, b92Var, i);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public void mo30271drawRoundRectuAw5IA(long j, long j2, long j3, long j4, @yfb rp4 rp4Var, @y46(from = 0.0d, m25645to = 1.0d) float f, @gib b92 b92Var, int i) {
        this.f65895a.mo30271drawRoundRectuAw5IA(j, j2, j3, j4, rp4Var, f, b92Var, i);
    }

    @yfb
    public final nr1 getCanvasDrawScope() {
        return this.f65895a;
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public long mo30272getCenterF1C5BW0() {
        return this.f65895a.mo30272getCenterF1C5BW0();
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f65895a.getDensity();
    }

    @Override // p000.ip4
    @yfb
    public bp4 getDrawContext() {
        return this.f65895a.getDrawContext();
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f65895a.getFontScale();
    }

    @Override // p000.ip4
    @yfb
    public ov8 getLayoutDirection() {
        return this.f65895a.getLayoutDirection();
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public long mo30273getSizeNHjbRc() {
        return this.f65895a.mo30273getSizeNHjbRc();
    }

    public final void performDraw(@yfb fp4 fp4Var, @yfb vq1 vq1Var, @gib u97 u97Var) {
        heb hebVarM32852requireCoordinator64DMado = w34.m32852requireCoordinator64DMado(fp4Var, keb.m30687constructorimpl(4));
        hebVarM32852requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m31267drawDirecteZhPAX0$ui_release(vq1Var, s78.m32288toSizeozmzZPI(hebVarM32852requireCoordinator64DMado.mo30031getSizeYbymL2g()), hebVarM32852requireCoordinator64DMado, fp4Var, u97Var);
    }

    @Override // p000.ip4
    /* JADX INFO: renamed from: record-JVtK1S4 */
    public void mo30274recordJVtK1S4(@yfb u97 u97Var, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        this.f65895a.mo30274recordJVtK1S4(u97Var, j, qy6Var);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo27166roundToPxR2X_6o(long j) {
        return this.f65895a.mo27166roundToPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo27167roundToPx0680j_4(float f) {
        return this.f65895a.mo27167roundToPx0680j_4(f);
    }

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo27168toDpGaN1DYA(long j) {
        return this.f65895a.mo27168toDpGaN1DYA(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo27169toDpu2uoSUM(float f) {
        return this.f65895a.mo27169toDpu2uoSUM(f);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo27171toDpSizekrfVVM(long j) {
        return this.f65895a.mo27171toDpSizekrfVVM(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo27172toPxR2X_6o(long j) {
        return this.f65895a.mo27172toPxR2X_6o(j);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo27173toPx0680j_4(float f) {
        return this.f65895a.mo27173toPx0680j_4(f);
    }

    @Override // p000.c64
    @f0g
    @yfb
    public rud toRect(@yfb on4 on4Var) {
        return this.f65895a.toRect(on4Var);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo27174toSizeXkaWNTQ(long j) {
        return this.f65895a.mo27174toSizeXkaWNTQ(j);
    }

    @Override // p000.dp6
    @f0g
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo27175toSp0xMU5do(float f) {
        return this.f65895a.mo27175toSp0xMU5do(f);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo27176toSpkPz2Gy4(float f) {
        return this.f65895a.mo27176toSpkPz2Gy4(f);
    }

    public nw8(@yfb nr1 nr1Var) {
        this.f65895a = nr1Var;
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo27170toDpu2uoSUM(int i) {
        return this.f65895a.mo27170toDpu2uoSUM(i);
    }

    @Override // p000.c64
    @f0g
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo27177toSpkPz2Gy4(int i) {
        return this.f65895a.mo27177toSpkPz2Gy4(i);
    }

    public /* synthetic */ nw8(nr1 nr1Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new nr1() : nr1Var);
    }
}
