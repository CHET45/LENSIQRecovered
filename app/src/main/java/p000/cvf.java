package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class cvf extends pr0 {

    /* JADX INFO: renamed from: H */
    public final RectF f27896H;

    /* JADX INFO: renamed from: I */
    public final Paint f27897I;

    /* JADX INFO: renamed from: J */
    public final float[] f27898J;

    /* JADX INFO: renamed from: K */
    public final Path f27899K;

    /* JADX INFO: renamed from: L */
    public final tu8 f27900L;

    /* JADX INFO: renamed from: M */
    @hib
    public nr0<ColorFilter, ColorFilter> f27901M;

    public cvf(go9 go9Var, tu8 tu8Var) {
        super(go9Var, tu8Var);
        this.f27896H = new RectF();
        it8 it8Var = new it8();
        this.f27897I = it8Var;
        this.f27898J = new float[8];
        this.f27899K = new Path();
        this.f27900L = tu8Var;
        it8Var.setAlpha(0);
        it8Var.setStyle(Paint.Style.FILL);
        it8Var.setColor(tu8Var.m22862k());
    }

    @Override // p000.pr0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85479K) {
            if (bp9Var == null) {
                this.f27901M = null;
            } else {
                this.f27901M = new d2i(bp9Var);
            }
        }
    }

    @Override // p000.pr0
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f27900L.m22862k());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.f71721x.getOpacity() == null ? 100 : this.f71721x.getOpacity().getValue().intValue())) / 100.0f) * 255.0f);
        this.f27897I.setAlpha(iIntValue);
        nr0<ColorFilter, ColorFilter> nr0Var = this.f27901M;
        if (nr0Var != null) {
            this.f27897I.setColorFilter(nr0Var.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f27898J;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f27900L.m22864m();
            float[] fArr2 = this.f27898J;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f27900L.m22864m();
            this.f27898J[5] = this.f27900L.m22863l();
            float[] fArr3 = this.f27898J;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f27900L.m22863l();
            matrix.mapPoints(this.f27898J);
            this.f27899K.reset();
            Path path = this.f27899K;
            float[] fArr4 = this.f27898J;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f27899K;
            float[] fArr5 = this.f27898J;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f27899K;
            float[] fArr6 = this.f27898J;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f27899K;
            float[] fArr7 = this.f27898J;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f27899K;
            float[] fArr8 = this.f27898J;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f27899K.close();
            canvas.drawPath(this.f27899K, this.f27897I);
        }
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f27896H.set(0.0f, 0.0f, this.f27900L.m22864m(), this.f27900L.m22863l());
        this.f71712o.mapRect(this.f27896H);
        rectF.set(this.f27896H);
    }
}
