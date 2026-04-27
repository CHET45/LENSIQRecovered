package p000;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p000.nr1;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,63:1\n546#2,17:64\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n54#1:64,17\n*E\n"})
@e0g(parameters = 1)
public final class gl2 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: d */
    public static final int f40124d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final c64 f40125a;

    /* JADX INFO: renamed from: b */
    public final long f40126b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<ip4, bth> f40127c;

    public /* synthetic */ gl2(c64 c64Var, long j, qy6 qy6Var, jt3 jt3Var) {
        this(c64Var, j, qy6Var);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@yfb Canvas canvas) {
        nr1 nr1Var = new nr1();
        c64 c64Var = this.f40125a;
        long j = this.f40126b;
        ov8 ov8Var = ov8.Ltr;
        vq1 vq1VarCanvas = C5437eq.Canvas(canvas);
        qy6<ip4, bth> qy6Var = this.f40127c;
        nr1.C10018a drawParams = nr1Var.getDrawParams();
        c64 c64VarComponent1 = drawParams.component1();
        ov8 ov8VarComponent2 = drawParams.component2();
        vq1 vq1VarComponent3 = drawParams.component3();
        long jM31196component4NHjbRc = drawParams.m31196component4NHjbRc();
        nr1.C10018a drawParams2 = nr1Var.getDrawParams();
        drawParams2.setDensity(c64Var);
        drawParams2.setLayoutDirection(ov8Var);
        drawParams2.setCanvas(vq1VarCanvas);
        drawParams2.m31199setSizeuvyYCjk(j);
        vq1VarCanvas.save();
        qy6Var.invoke(nr1Var);
        vq1VarCanvas.restore();
        nr1.C10018a drawParams3 = nr1Var.getDrawParams();
        drawParams3.setDensity(c64VarComponent1);
        drawParams3.setLayoutDirection(ov8VarComponent2);
        drawParams3.setCanvas(vq1VarComponent3);
        drawParams3.m31199setSizeuvyYCjk(jM31196component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@yfb Point point, @yfb Point point2) {
        c64 c64Var = this.f40125a;
        point.set(c64Var.mo27167roundToPx0680j_4(c64Var.mo27169toDpu2uoSUM(wpf.m33069getWidthimpl(this.f40126b))), c64Var.mo27167roundToPx0680j_4(c64Var.mo27169toDpu2uoSUM(wpf.m33066getHeightimpl(this.f40126b))));
        point2.set(point.x / 2, point.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private gl2(c64 c64Var, long j, qy6<? super ip4, bth> qy6Var) {
        this.f40125a = c64Var;
        this.f40126b = j;
        this.f40127c = qy6Var;
    }
}
