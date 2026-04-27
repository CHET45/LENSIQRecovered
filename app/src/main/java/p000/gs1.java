package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p000.obe;

/* JADX INFO: loaded from: classes.dex */
public class gs1 implements js1 {

    /* JADX INFO: renamed from: a */
    public final RectF f40880a = new RectF();

    /* JADX INFO: renamed from: gs1$a */
    public class C6481a implements obe.InterfaceC10290a {
        public C6481a() {
        }

        @Override // p000.obe.InterfaceC10290a
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float fWidth = (rectF.width() - f2) - 1.0f;
            float fHeight = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                gs1.this.f40880a.set(f4, f4, f3, f3);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(gs1.this.f40880a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(gs1.this.f40880a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(gs1.this.f40880a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(gs1.this.f40880a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f5 = (rectF.left + f3) - 1.0f;
                float f6 = rectF.top;
                canvas.drawRect(f5, f6, (rectF.right - f3) + 1.0f, f6 + f3, paint);
                float f7 = (rectF.left + f3) - 1.0f;
                float f8 = rectF.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF.right - f3) + 1.0f, f8, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    private obe createBackground(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new obe(context.getResources(), colorStateList, f, f2, f3);
    }

    private obe getShadowBackground(is1 is1Var) {
        return (obe) is1Var.getCardBackground();
    }

    @Override // p000.js1
    public ColorStateList getBackgroundColor(is1 is1Var) {
        return getShadowBackground(is1Var).m18555c();
    }

    @Override // p000.js1
    public float getElevation(is1 is1Var) {
        return getShadowBackground(is1Var).m18561i();
    }

    @Override // p000.js1
    public float getMaxElevation(is1 is1Var) {
        return getShadowBackground(is1Var).m18558f();
    }

    @Override // p000.js1
    public float getMinHeight(is1 is1Var) {
        return getShadowBackground(is1Var).m18559g();
    }

    @Override // p000.js1
    public float getMinWidth(is1 is1Var) {
        return getShadowBackground(is1Var).m18560h();
    }

    @Override // p000.js1
    public float getRadius(is1 is1Var) {
        return getShadowBackground(is1Var).m18556d();
    }

    @Override // p000.js1
    public void initStatic() {
        obe.f67078s = new C6481a();
    }

    @Override // p000.js1
    public void initialize(is1 is1Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        obe obeVarCreateBackground = createBackground(context, colorStateList, f, f2, f3);
        obeVarCreateBackground.m18562j(is1Var.getPreventCornerOverlap());
        is1Var.setCardBackground(obeVarCreateBackground);
        updatePadding(is1Var);
    }

    @Override // p000.js1
    public void onCompatPaddingChanged(is1 is1Var) {
    }

    @Override // p000.js1
    public void onPreventCornerOverlapChanged(is1 is1Var) {
        getShadowBackground(is1Var).m18562j(is1Var.getPreventCornerOverlap());
        updatePadding(is1Var);
    }

    @Override // p000.js1
    public void setBackgroundColor(is1 is1Var, @hib ColorStateList colorStateList) {
        getShadowBackground(is1Var).m18563k(colorStateList);
    }

    @Override // p000.js1
    public void setElevation(is1 is1Var, float f) {
        getShadowBackground(is1Var).m18566n(f);
    }

    @Override // p000.js1
    public void setMaxElevation(is1 is1Var, float f) {
        getShadowBackground(is1Var).m18565m(f);
        updatePadding(is1Var);
    }

    @Override // p000.js1
    public void setRadius(is1 is1Var, float f) {
        getShadowBackground(is1Var).m18564l(f);
        updatePadding(is1Var);
    }

    @Override // p000.js1
    public void updatePadding(is1 is1Var) {
        Rect rect = new Rect();
        getShadowBackground(is1Var).m18557e(rect);
        is1Var.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(is1Var)), (int) Math.ceil(getMinHeight(is1Var)));
        is1Var.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
