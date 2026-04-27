package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
@dwf({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/DrawStretchOverscrollModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,875:1\n1#2:876\n317#3,27:877\n128#3,7:904\n345#3,10:911\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/DrawStretchOverscrollModifier\n*L\n253#1:877,27\n254#1:904,7\n253#1:911,10\n*E\n"})
public final class qp4 extends g58 implements ep4 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final C5454es f75061d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final yv4 f75062e;

    /* JADX INFO: renamed from: f */
    @gib
    public RenderNode f75063f;

    public qp4(@yfb C5454es c5454es, @yfb yv4 yv4Var, @yfb qy6<? super f58, bth> qy6Var) {
        super(qy6Var);
        this.f75061d = c5454es;
        this.f75062e = yv4Var;
    }

    private final boolean drawBottomStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(180.0f, edgeEffect, canvas);
    }

    private final boolean drawLeftStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(270.0f, edgeEffect, canvas);
    }

    private final boolean drawRightStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(90.0f, edgeEffect, canvas);
    }

    private final boolean drawTopStretch(EdgeEffect edgeEffect, Canvas canvas) {
        return drawWithRotation(0.0f, edgeEffect, canvas);
    }

    private final boolean drawWithRotation(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode getRenderNode() {
        RenderNode renderNode = this.f75063f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeM19675a = pp4.m19675a("AndroidEdgeEffectOverscrollEffect");
        this.f75063f = renderNodeM19675a;
        return renderNodeM19675a;
    }

    private final boolean shouldDrawHorizontalStretch() {
        yv4 yv4Var = this.f75062e;
        return yv4Var.isLeftAnimating() || yv4Var.isLeftNegationStretched() || yv4Var.isRightAnimating() || yv4Var.isRightNegationStretched();
    }

    private final boolean shouldDrawVerticalStretch() {
        yv4 yv4Var = this.f75062e;
        return yv4Var.isTopAnimating() || yv4Var.isTopNegationStretched() || yv4Var.isBottomAnimating() || yv4Var.isBottomNegationStretched();
    }

    @Override // p000.ep4
    public void draw(@yfb ov2 ov2Var) {
        boolean zDrawLeftStretch;
        float f;
        float f2;
        this.f75061d.m28854updateSizeuvyYCjk$foundation_release(ov2Var.mo30273getSizeNHjbRc());
        if (wpf.m33071isEmptyimpl(ov2Var.mo30273getSizeNHjbRc())) {
            ov2Var.drawContent();
            return;
        }
        this.f75061d.getRedrawSignal$foundation_release().getValue();
        float fMo27173toPx0680j_4 = ov2Var.mo27173toPx0680j_4(y42.getMaxSupportedElevation());
        Canvas nativeCanvas = C5437eq.getNativeCanvas(ov2Var.getDrawContext().getCanvas());
        yv4 yv4Var = this.f75062e;
        boolean zShouldDrawVerticalStretch = shouldDrawVerticalStretch();
        boolean zShouldDrawHorizontalStretch = shouldDrawHorizontalStretch();
        if (zShouldDrawVerticalStretch && zShouldDrawHorizontalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (zShouldDrawVerticalStretch) {
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth() + (p3a.roundToInt(fMo27173toPx0680j_4) * 2), nativeCanvas.getHeight());
        } else {
            if (!zShouldDrawHorizontalStretch) {
                ov2Var.drawContent();
                return;
            }
            getRenderNode().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (p3a.roundToInt(fMo27173toPx0680j_4) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = getRenderNode().beginRecording();
        if (yv4Var.isLeftNegationStretched()) {
            EdgeEffect orCreateLeftEffectNegation = yv4Var.getOrCreateLeftEffectNegation();
            drawRightStretch(orCreateLeftEffectNegation, recordingCanvasBeginRecording);
            orCreateLeftEffectNegation.finish();
        }
        if (yv4Var.isLeftAnimating()) {
            EdgeEffect orCreateLeftEffect = yv4Var.getOrCreateLeftEffect();
            zDrawLeftStretch = drawLeftStretch(orCreateLeftEffect, recordingCanvasBeginRecording);
            if (yv4Var.isLeftStretched()) {
                float fM30430getYimpl = izb.m30430getYimpl(this.f75061d.m28853displacementF1C5BW0$foundation_release());
                xv4 xv4Var = xv4.f99437a;
                xv4Var.onPullDistanceCompat(yv4Var.getOrCreateLeftEffectNegation(), xv4Var.getDistanceCompat(orCreateLeftEffect), 1 - fM30430getYimpl);
            }
        } else {
            zDrawLeftStretch = false;
        }
        if (yv4Var.isTopNegationStretched()) {
            EdgeEffect orCreateTopEffectNegation = yv4Var.getOrCreateTopEffectNegation();
            drawBottomStretch(orCreateTopEffectNegation, recordingCanvasBeginRecording);
            orCreateTopEffectNegation.finish();
        }
        if (yv4Var.isTopAnimating()) {
            EdgeEffect orCreateTopEffect = yv4Var.getOrCreateTopEffect();
            zDrawLeftStretch = drawTopStretch(orCreateTopEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (yv4Var.isTopStretched()) {
                float fM30429getXimpl = izb.m30429getXimpl(this.f75061d.m28853displacementF1C5BW0$foundation_release());
                xv4 xv4Var2 = xv4.f99437a;
                xv4Var2.onPullDistanceCompat(yv4Var.getOrCreateTopEffectNegation(), xv4Var2.getDistanceCompat(orCreateTopEffect), fM30429getXimpl);
            }
        }
        if (yv4Var.isRightNegationStretched()) {
            EdgeEffect orCreateRightEffectNegation = yv4Var.getOrCreateRightEffectNegation();
            drawLeftStretch(orCreateRightEffectNegation, recordingCanvasBeginRecording);
            orCreateRightEffectNegation.finish();
        }
        if (yv4Var.isRightAnimating()) {
            EdgeEffect orCreateRightEffect = yv4Var.getOrCreateRightEffect();
            zDrawLeftStretch = drawRightStretch(orCreateRightEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (yv4Var.isRightStretched()) {
                float fM30430getYimpl2 = izb.m30430getYimpl(this.f75061d.m28853displacementF1C5BW0$foundation_release());
                xv4 xv4Var3 = xv4.f99437a;
                xv4Var3.onPullDistanceCompat(yv4Var.getOrCreateRightEffectNegation(), xv4Var3.getDistanceCompat(orCreateRightEffect), fM30430getYimpl2);
            }
        }
        if (yv4Var.isBottomNegationStretched()) {
            EdgeEffect orCreateBottomEffectNegation = yv4Var.getOrCreateBottomEffectNegation();
            drawTopStretch(orCreateBottomEffectNegation, recordingCanvasBeginRecording);
            orCreateBottomEffectNegation.finish();
        }
        if (yv4Var.isBottomAnimating()) {
            EdgeEffect orCreateBottomEffect = yv4Var.getOrCreateBottomEffect();
            boolean z = drawBottomStretch(orCreateBottomEffect, recordingCanvasBeginRecording) || zDrawLeftStretch;
            if (yv4Var.isBottomStretched()) {
                float fM30429getXimpl2 = izb.m30429getXimpl(this.f75061d.m28853displacementF1C5BW0$foundation_release());
                xv4 xv4Var4 = xv4.f99437a;
                xv4Var4.onPullDistanceCompat(yv4Var.getOrCreateBottomEffectNegation(), xv4Var4.getDistanceCompat(orCreateBottomEffect), 1 - fM30429getXimpl2);
            }
            zDrawLeftStretch = z;
        }
        if (zDrawLeftStretch) {
            this.f75061d.invalidateOverscroll$foundation_release();
        }
        float f3 = zShouldDrawHorizontalStretch ? 0.0f : fMo27173toPx0680j_4;
        if (zShouldDrawVerticalStretch) {
            fMo27173toPx0680j_4 = 0.0f;
        }
        ov8 layoutDirection = ov2Var.getLayoutDirection();
        vq1 vq1VarCanvas = C5437eq.Canvas(recordingCanvasBeginRecording);
        long jMo30273getSizeNHjbRc = ov2Var.mo30273getSizeNHjbRc();
        c64 density = ov2Var.getDrawContext().getDensity();
        ov8 layoutDirection2 = ov2Var.getDrawContext().getLayoutDirection();
        vq1 canvas = ov2Var.getDrawContext().getCanvas();
        long jMo28019getSizeNHjbRc = ov2Var.getDrawContext().mo28019getSizeNHjbRc();
        u97 graphicsLayer = ov2Var.getDrawContext().getGraphicsLayer();
        bp4 drawContext = ov2Var.getDrawContext();
        drawContext.setDensity(ov2Var);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(vq1VarCanvas);
        drawContext.mo28020setSizeuvyYCjk(jMo30273getSizeNHjbRc);
        drawContext.setGraphicsLayer(null);
        vq1VarCanvas.save();
        try {
            ov2Var.getDrawContext().getTransform().translate(f3, fMo27173toPx0680j_4);
            try {
                ov2Var.drawContent();
                vq1VarCanvas.restore();
                bp4 drawContext2 = ov2Var.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
                getRenderNode().endRecording();
                int iSave = nativeCanvas.save();
                nativeCanvas.translate(f, f2);
                nativeCanvas.drawRenderNode(getRenderNode());
                nativeCanvas.restoreToCount(iSave);
            } finally {
                ov2Var.getDrawContext().getTransform().translate(-f3, -fMo27173toPx0680j_4);
            }
        } catch (Throwable th) {
            vq1VarCanvas.restore();
            bp4 drawContext3 = ov2Var.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }
}
