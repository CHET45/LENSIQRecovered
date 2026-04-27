package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p000.b3a;

/* JADX INFO: loaded from: classes5.dex */
public class me3 extends b3a {

    /* JADX INFO: renamed from: k2 */
    @efb
    public C9328b f60744k2;

    /* JADX INFO: renamed from: me3$c */
    public static class C9329c extends me3 {

        /* JADX INFO: renamed from: l2 */
        public Paint f60746l2;

        /* JADX INFO: renamed from: m2 */
        public int f60747m2;

        public C9329c(@efb C9328b c9328b) {
            super(c9328b);
        }

        private Paint getCutoutPaint() {
            if (this.f60746l2 == null) {
                Paint paint = new Paint(1);
                this.f60746l2 = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.f60746l2.setColor(-1);
                this.f60746l2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.f60746l2;
        }

        private void postDraw(@efb Canvas canvas) {
            if (useHardwareLayer(getCallback())) {
                return;
            }
            canvas.restoreToCount(this.f60747m2);
        }

        private void preDraw(@efb Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (!useHardwareLayer(callback)) {
                saveCanvasLayer(canvas);
                return;
            }
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }

        private void saveCanvasLayer(@efb Canvas canvas) {
            this.f60747m2 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private boolean useHardwareLayer(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // p000.b3a, android.graphics.drawable.Drawable
        public void draw(@efb Canvas canvas) {
            preDraw(canvas);
            super.draw(canvas);
            postDraw(canvas);
        }

        @Override // p000.b3a
        /* JADX INFO: renamed from: h */
        public void mo2881h(@efb Canvas canvas) {
            super.mo2881h(canvas);
            canvas.drawRect(this.f60744k2.f60745w, getCutoutPaint());
        }
    }

    /* JADX INFO: renamed from: me3$d */
    @omg(18)
    public static class C9330d extends me3 {
        public C9330d(@efb C9328b c9328b) {
            super(c9328b);
        }

        @Override // p000.b3a
        /* JADX INFO: renamed from: h */
        public void mo2881h(@efb Canvas canvas) {
            if (this.f60744k2.f60745w.isEmpty()) {
                super.mo2881h(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f60744k2.f60745w);
            super.mo2881h(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static me3 create(@efb C9328b c9328b) {
        return new C9330d(c9328b);
    }

    /* JADX INFO: renamed from: k */
    public static me3 m17270k(@hib n8f n8fVar) {
        if (n8fVar == null) {
            n8fVar = new n8f();
        }
        return create(new C9328b(n8fVar, new RectF()));
    }

    /* JADX INFO: renamed from: l */
    public boolean m17271l() {
        return !this.f60744k2.f60745w.isEmpty();
    }

    /* JADX INFO: renamed from: m */
    public void m17272m() {
        m17273n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p000.b3a, android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        this.f60744k2 = new C9328b(this.f60744k2);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void m17273n(float f, float f2, float f3, float f4) {
        if (f == this.f60744k2.f60745w.left && f2 == this.f60744k2.f60745w.top && f3 == this.f60744k2.f60745w.right && f4 == this.f60744k2.f60745w.bottom) {
            return;
        }
        this.f60744k2.f60745w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: o */
    public void m17274o(@efb RectF rectF) {
        m17273n(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: me3$b */
    public static final class C9328b extends b3a.C1723d {

        /* JADX INFO: renamed from: w */
        @efb
        public final RectF f60745w;

        @Override // p000.b3a.C1723d, android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            me3 me3VarCreate = me3.create(this);
            me3VarCreate.invalidateSelf();
            return me3VarCreate;
        }

        private C9328b(@efb n8f n8fVar, @efb RectF rectF) {
            super(n8fVar, null);
            this.f60745w = rectF;
        }

        private C9328b(@efb C9328b c9328b) {
            super(c9328b);
            this.f60745w = c9328b.f60745w;
        }
    }

    private me3(@efb C9328b c9328b) {
        super(c9328b);
        this.f60744k2 = c9328b;
    }
}
