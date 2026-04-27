package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class yhb extends pr0 {
    public yhb(go9 go9Var, tu8 tu8Var) {
        super(go9Var, tu8Var);
    }

    @Override // p000.pr0
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
