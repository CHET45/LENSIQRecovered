package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class mv7 extends pr0 {

    /* JADX INFO: renamed from: H */
    public final Paint f62376H;

    /* JADX INFO: renamed from: I */
    public final Rect f62377I;

    /* JADX INFO: renamed from: J */
    public final Rect f62378J;

    /* JADX INFO: renamed from: K */
    @hib
    public final jo9 f62379K;

    /* JADX INFO: renamed from: L */
    @hib
    public nr0<ColorFilter, ColorFilter> f62380L;

    /* JADX INFO: renamed from: M */
    @hib
    public nr0<Bitmap, Bitmap> f62381M;

    public mv7(go9 go9Var, tu8 tu8Var) {
        super(go9Var, tu8Var);
        this.f62376H = new it8(3);
        this.f62377I = new Rect();
        this.f62378J = new Rect();
        this.f62379K = go9Var.getLottieImageAssetForId(tu8Var.m22860i());
    }

    @hib
    private Bitmap getBitmap() {
        Bitmap value;
        nr0<Bitmap, Bitmap> nr0Var = this.f62381M;
        if (nr0Var != null && (value = nr0Var.getValue()) != null) {
            return value;
        }
        Bitmap bitmapForId = this.f71713p.getBitmapForId(this.f71714q.m22860i());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        jo9 jo9Var = this.f62379K;
        if (jo9Var != null) {
            return jo9Var.getBitmap();
        }
        return null;
    }

    @Override // p000.pr0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85479K) {
            if (bp9Var == null) {
                this.f62380L = null;
                return;
            } else {
                this.f62380L = new d2i(bp9Var);
                return;
            }
        }
        if (t == to9.f85482N) {
            if (bp9Var == null) {
                this.f62381M = null;
            } else {
                this.f62381M = new d2i(bp9Var);
            }
        }
    }

    @Override // p000.pr0
    public void drawLayer(@efb Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmap = getBitmap();
        if (bitmap == null || bitmap.isRecycled() || this.f62379K == null) {
            return;
        }
        float fDpScale = e1i.dpScale();
        this.f62376H.setAlpha(i);
        nr0<ColorFilter, ColorFilter> nr0Var = this.f62380L;
        if (nr0Var != null) {
            this.f62376H.setColorFilter(nr0Var.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f62377I.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (this.f71713p.getMaintainOriginalImageBounds()) {
            this.f62378J.set(0, 0, (int) (this.f62379K.getWidth() * fDpScale), (int) (this.f62379K.getHeight() * fDpScale));
        } else {
            this.f62378J.set(0, 0, (int) (bitmap.getWidth() * fDpScale), (int) (bitmap.getHeight() * fDpScale));
        }
        canvas.drawBitmap(bitmap, this.f62377I, this.f62378J, this.f62376H);
        canvas.restore();
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        if (this.f62379K != null) {
            float fDpScale = e1i.dpScale();
            rectF.set(0.0f, 0.0f, this.f62379K.getWidth() * fDpScale, this.f62379K.getHeight() * fDpScale);
            this.f71712o.mapRect(rectF);
        }
    }
}
