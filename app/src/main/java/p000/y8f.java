package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class y8f extends pr0 {

    /* JADX INFO: renamed from: H */
    public final pv2 f100763H;

    /* JADX INFO: renamed from: I */
    public final jn2 f100764I;

    public y8f(go9 go9Var, tu8 tu8Var, jn2 jn2Var) {
        super(go9Var, tu8Var);
        this.f100764I = jn2Var;
        pv2 pv2Var = new pv2(go9Var, this, new v8f("__container", tu8Var.m22861j(), false));
        this.f100763H = pv2Var;
        pv2Var.setContents(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p000.pr0
    public void drawLayer(@efb Canvas canvas, Matrix matrix, int i) {
        this.f100763H.draw(canvas, matrix, i);
    }

    @Override // p000.pr0
    /* JADX INFO: renamed from: f */
    public void mo14185f(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        this.f100763H.resolveKeyPath(fr8Var, i, list, fr8Var2);
    }

    @Override // p000.pr0
    @hib
    public w91 getBlurEffect() {
        w91 blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.f100764I.getBlurEffect();
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f100763H.getBounds(rectF, this.f71712o, z);
    }

    @Override // p000.pr0
    @hib
    public wr4 getDropShadowEffect() {
        wr4 dropShadowEffect = super.getDropShadowEffect();
        return dropShadowEffect != null ? dropShadowEffect : this.f100764I.getDropShadowEffect();
    }
}
