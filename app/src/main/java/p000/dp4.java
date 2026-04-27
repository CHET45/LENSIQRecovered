package p000;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class dp4 extends g58 implements ep4 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final C5454es f30314d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final yv4 f30315e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final u9c f30316f;

    public dp4(@yfb C5454es c5454es, @yfb yv4 yv4Var, @yfb u9c u9cVar, @yfb qy6<? super f58, bth> qy6Var) {
        super(qy6Var);
        this.f30314d = c5454es;
        this.f30315e = yv4Var;
        this.f30316f = u9cVar;
    }

    private final boolean drawBottomGlow(ip4 ip4Var, EdgeEffect edgeEffect, Canvas canvas) {
        return m28661drawWithRotationAndOffsetubNVwUQ(180.0f, mzb.Offset(-wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc()), (-wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc())) + ip4Var.mo27173toPx0680j_4(this.f30316f.getDrawPadding().mo32749calculateBottomPaddingD9Ej5fM())), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(ip4 ip4Var, EdgeEffect edgeEffect, Canvas canvas) {
        return m28661drawWithRotationAndOffsetubNVwUQ(270.0f, mzb.Offset(-wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()), ip4Var.mo27173toPx0680j_4(this.f30316f.getDrawPadding().mo32750calculateLeftPaddingu2uoSUM(ip4Var.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(ip4 ip4Var, EdgeEffect edgeEffect, Canvas canvas) {
        return m28661drawWithRotationAndOffsetubNVwUQ(90.0f, mzb.Offset(0.0f, (-p3a.roundToInt(wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc()))) + ip4Var.mo27173toPx0680j_4(this.f30316f.getDrawPadding().mo32751calculateRightPaddingu2uoSUM(ip4Var.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(ip4 ip4Var, EdgeEffect edgeEffect, Canvas canvas) {
        return m28661drawWithRotationAndOffsetubNVwUQ(0.0f, mzb.Offset(0.0f, ip4Var.mo27173toPx0680j_4(this.f30316f.getDrawPadding().mo32752calculateTopPaddingD9Ej5fM())), edgeEffect, canvas);
    }

    /* JADX INFO: renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m28661drawWithRotationAndOffsetubNVwUQ(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p000.ep4
    public void draw(@yfb ov2 ov2Var) {
        this.f30314d.m28854updateSizeuvyYCjk$foundation_release(ov2Var.mo30273getSizeNHjbRc());
        if (wpf.m33071isEmptyimpl(ov2Var.mo30273getSizeNHjbRc())) {
            ov2Var.drawContent();
            return;
        }
        ov2Var.drawContent();
        this.f30314d.getRedrawSignal$foundation_release().getValue();
        Canvas nativeCanvas = C5437eq.getNativeCanvas(ov2Var.getDrawContext().getCanvas());
        yv4 yv4Var = this.f30315e;
        boolean zDrawLeftGlow = yv4Var.isLeftAnimating() ? drawLeftGlow(ov2Var, yv4Var.getOrCreateLeftEffect(), nativeCanvas) : false;
        if (yv4Var.isTopAnimating()) {
            zDrawLeftGlow = drawTopGlow(ov2Var, yv4Var.getOrCreateTopEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (yv4Var.isRightAnimating()) {
            zDrawLeftGlow = drawRightGlow(ov2Var, yv4Var.getOrCreateRightEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (yv4Var.isBottomAnimating()) {
            zDrawLeftGlow = drawBottomGlow(ov2Var, yv4Var.getOrCreateBottomEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (zDrawLeftGlow) {
            this.f30314d.invalidateOverscroll$foundation_release();
        }
    }
}
