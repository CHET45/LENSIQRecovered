package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a9f {

    /* JADX INFO: renamed from: j */
    public static final float f731j = 270.0f;

    /* JADX INFO: renamed from: k */
    public static final float f732k = 180.0f;

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f733a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f734b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f735c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f736d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f737e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f738f;

    /* JADX INFO: renamed from: g */
    public final List<AbstractC0114h> f739g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<AbstractC0116j> f740h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f741i;

    /* JADX INFO: renamed from: a9f$a */
    public class C0107a extends AbstractC0116j {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f742c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Matrix f743d;

        public C0107a(List list, Matrix matrix) {
            this.f742c = list;
            this.f743d = matrix;
        }

        @Override // p000.a9f.AbstractC0116j
        public void draw(Matrix matrix, i8f i8fVar, int i, Canvas canvas) {
            Iterator it = this.f742c.iterator();
            while (it.hasNext()) {
                ((AbstractC0116j) it.next()).draw(this.f743d, i8fVar, i, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: a9f$b */
    public static class C0108b extends AbstractC0116j {

        /* JADX INFO: renamed from: c */
        public final C0111e f745c;

        public C0108b(C0111e c0111e) {
            this.f745c = c0111e;
        }

        @Override // p000.a9f.AbstractC0116j
        public void draw(Matrix matrix, @efb i8f i8fVar, int i, @efb Canvas canvas) {
            i8fVar.drawCornerShadow(canvas, matrix, new RectF(this.f745c.getLeft(), this.f745c.getTop(), this.f745c.getRight(), this.f745c.getBottom()), i, this.f745c.getStartAngle(), this.f745c.getSweepAngle());
        }
    }

    /* JADX INFO: renamed from: a9f$c */
    public static class C0109c extends AbstractC0116j {

        /* JADX INFO: renamed from: c */
        public final C0113g f746c;

        /* JADX INFO: renamed from: d */
        public final C0113g f747d;

        /* JADX INFO: renamed from: e */
        public final float f748e;

        /* JADX INFO: renamed from: f */
        public final float f749f;

        public C0109c(C0113g c0113g, C0113g c0113g2, float f, float f2) {
            this.f746c = c0113g;
            this.f747d = c0113g2;
            this.f748e = f;
            this.f749f = f2;
        }

        /* JADX INFO: renamed from: a */
        public float m232a() {
            return (float) Math.toDegrees(Math.atan((this.f747d.f767c - this.f746c.f767c) / (this.f747d.f766b - this.f746c.f766b)));
        }

        /* JADX INFO: renamed from: b */
        public float m233b() {
            return (float) Math.toDegrees(Math.atan((this.f746c.f767c - this.f749f) / (this.f746c.f766b - this.f748e)));
        }

        /* JADX INFO: renamed from: c */
        public float m234c() {
            float fM232a = ((m232a() - m233b()) + 360.0f) % 360.0f;
            return fM232a <= 180.0f ? fM232a : fM232a - 360.0f;
        }

        @Override // p000.a9f.AbstractC0116j
        public void draw(Matrix matrix, i8f i8fVar, int i, Canvas canvas) {
            float fM234c = m234c();
            if (fM234c > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.f746c.f766b - this.f748e, this.f746c.f767c - this.f749f);
            double dHypot2 = Math.hypot(this.f747d.f766b - this.f746c.f766b, this.f747d.f767c - this.f746c.f767c);
            float fMin = (float) Math.min(i, Math.min(dHypot, dHypot2));
            double d = fMin;
            double dTan = Math.tan(Math.toRadians((-fM234c) / 2.0f)) * d;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.f774a.set(matrix);
                this.f774a.preTranslate(this.f748e, this.f749f);
                this.f774a.preRotate(m233b());
                i8fVar.drawEdgeShadow(canvas, this.f774a, rectF, i);
            }
            float f = 2.0f * fMin;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            this.f774a.set(matrix);
            this.f774a.preTranslate(this.f746c.f766b, this.f746c.f767c);
            this.f774a.preRotate(m233b());
            this.f774a.preTranslate((float) ((-dTan) - d), (-2.0f) * fMin);
            i8fVar.drawInnerCornerShadow(canvas, this.f774a, rectF2, (int) fMin, 450.0f, fM234c, new float[]{(float) (d + dTan), f});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.f774a.set(matrix);
                this.f774a.preTranslate(this.f746c.f766b, this.f746c.f767c);
                this.f774a.preRotate(m232a());
                this.f774a.preTranslate((float) dTan, 0.0f);
                i8fVar.drawEdgeShadow(canvas, this.f774a, rectF3, i);
            }
        }
    }

    /* JADX INFO: renamed from: a9f$d */
    public static class C0110d extends AbstractC0116j {

        /* JADX INFO: renamed from: c */
        public final C0113g f750c;

        /* JADX INFO: renamed from: d */
        public final float f751d;

        /* JADX INFO: renamed from: e */
        public final float f752e;

        public C0110d(C0113g c0113g, float f, float f2) {
            this.f750c = c0113g;
            this.f751d = f;
            this.f752e = f2;
        }

        /* JADX INFO: renamed from: a */
        public float m235a() {
            return (float) Math.toDegrees(Math.atan((this.f750c.f767c - this.f752e) / (this.f750c.f766b - this.f751d)));
        }

        @Override // p000.a9f.AbstractC0116j
        public void draw(Matrix matrix, @efb i8f i8fVar, int i, @efb Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f750c.f767c - this.f752e, this.f750c.f766b - this.f751d), 0.0f);
            this.f774a.set(matrix);
            this.f774a.preTranslate(this.f751d, this.f752e);
            this.f774a.preRotate(m235a());
            i8fVar.drawEdgeShadow(canvas, this.f774a, rectF, i);
        }
    }

    /* JADX INFO: renamed from: a9f$e */
    public static class C0111e extends AbstractC0114h {

        /* JADX INFO: renamed from: h */
        public static final RectF f753h = new RectF();

        /* JADX INFO: renamed from: b */
        @Deprecated
        public float f754b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f755c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f756d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f757e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f758f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f759g;

        public C0111e(float f, float f2, float f3, float f4) {
            setLeft(f);
            setTop(f2);
            setRight(f3);
            setBottom(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.f757e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.f754b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.f756d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.f758f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.f759g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.f755c;
        }

        private void setBottom(float f) {
            this.f757e = f;
        }

        private void setLeft(float f) {
            this.f754b = f;
        }

        private void setRight(float f) {
            this.f756d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f) {
            this.f758f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f) {
            this.f759g = f;
        }

        private void setTop(float f) {
            this.f755c = f;
        }

        @Override // p000.a9f.AbstractC0114h
        public void applyToPath(@efb Matrix matrix, @efb Path path) {
            Matrix matrix2 = this.f768a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f753h;
            rectF.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a9f$f */
    public static class C0112f extends AbstractC0114h {

        /* JADX INFO: renamed from: b */
        public float f760b;

        /* JADX INFO: renamed from: c */
        public float f761c;

        /* JADX INFO: renamed from: d */
        public float f762d;

        /* JADX INFO: renamed from: e */
        public float f763e;

        /* JADX INFO: renamed from: f */
        public float f764f;

        /* JADX INFO: renamed from: g */
        public float f765g;

        public C0112f(float f, float f2, float f3, float f4, float f5, float f6) {
            setControlX1(f);
            setControlY1(f2);
            setControlX2(f3);
            setControlY2(f4);
            setEndX(f5);
            setEndY(f6);
        }

        private float getControlX1() {
            return this.f760b;
        }

        private float getControlX2() {
            return this.f762d;
        }

        private float getControlY1() {
            return this.f761c;
        }

        private float getControlY2() {
            return this.f761c;
        }

        private float getEndX() {
            return this.f764f;
        }

        private float getEndY() {
            return this.f765g;
        }

        private void setControlX1(float f) {
            this.f760b = f;
        }

        private void setControlX2(float f) {
            this.f762d = f;
        }

        private void setControlY1(float f) {
            this.f761c = f;
        }

        private void setControlY2(float f) {
            this.f763e = f;
        }

        private void setEndX(float f) {
            this.f764f = f;
        }

        private void setEndY(float f) {
            this.f765g = f;
        }

        @Override // p000.a9f.AbstractC0114h
        public void applyToPath(@efb Matrix matrix, @efb Path path) {
            Matrix matrix2 = this.f768a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f760b, this.f761c, this.f762d, this.f763e, this.f764f, this.f765g);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a9f$g */
    public static class C0113g extends AbstractC0114h {

        /* JADX INFO: renamed from: b */
        public float f766b;

        /* JADX INFO: renamed from: c */
        public float f767c;

        @Override // p000.a9f.AbstractC0114h
        public void applyToPath(@efb Matrix matrix, @efb Path path) {
            Matrix matrix2 = this.f768a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f766b, this.f767c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a9f$h */
    public static abstract class AbstractC0114h {

        /* JADX INFO: renamed from: a */
        public final Matrix f768a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: a9f$i */
    public static class C0115i extends AbstractC0114h {

        /* JADX INFO: renamed from: b */
        @Deprecated
        public float f769b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f770c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f771d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f772e;

        private float getControlX() {
            return this.f769b;
        }

        private float getControlY() {
            return this.f770c;
        }

        private float getEndX() {
            return this.f771d;
        }

        private float getEndY() {
            return this.f772e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f) {
            this.f769b = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f) {
            this.f770c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f) {
            this.f771d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f) {
            this.f772e = f;
        }

        @Override // p000.a9f.AbstractC0114h
        public void applyToPath(@efb Matrix matrix, @efb Path path) {
            Matrix matrix2 = this.f768a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a9f$j */
    public static abstract class AbstractC0116j {

        /* JADX INFO: renamed from: b */
        public static final Matrix f773b = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Matrix f774a = new Matrix();

        public abstract void draw(Matrix matrix, i8f i8fVar, int i, Canvas canvas);

        public final void draw(i8f i8fVar, int i, Canvas canvas) {
            draw(f773b, i8fVar, i, canvas);
        }
    }

    public a9f() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f) {
        if (getCurrentShadowAngle() == f) {
            return;
        }
        float currentShadowAngle = ((f - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > 180.0f) {
            return;
        }
        C0111e c0111e = new C0111e(m228c(), m229d(), m228c(), m229d());
        c0111e.setStartAngle(getCurrentShadowAngle());
        c0111e.setSweepAngle(currentShadowAngle);
        this.f740h.add(new C0108b(c0111e));
        setCurrentShadowAngle(f);
    }

    private void addShadowCompatOperation(AbstractC0116j abstractC0116j, float f, float f2) {
        addConnectingShadowIfNecessary(f);
        this.f740h.add(abstractC0116j);
        setCurrentShadowAngle(f2);
    }

    private float getCurrentShadowAngle() {
        return this.f737e;
    }

    private float getEndShadowAngle() {
        return this.f738f;
    }

    private void setCurrentShadowAngle(float f) {
        this.f737e = f;
    }

    private void setEndShadowAngle(float f) {
        this.f738f = f;
    }

    private void setEndX(float f) {
        this.f735c = f;
    }

    private void setEndY(float f) {
        this.f736d = f;
    }

    private void setStartX(float f) {
        this.f733a = f;
    }

    private void setStartY(float f) {
        this.f734b = f;
    }

    /* JADX INFO: renamed from: a */
    public boolean m226a() {
        return this.f741i;
    }

    public void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        C0111e c0111e = new C0111e(f, f2, f3, f4);
        c0111e.setStartAngle(f5);
        c0111e.setSweepAngle(f6);
        this.f739g.add(c0111e);
        C0108b c0108b = new C0108b(c0111e);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(c0108b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        setEndX(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        setEndY(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f739g.size();
        for (int i = 0; i < size; i++) {
            this.f739g.get(i).applyToPath(matrix, path);
        }
    }

    @efb
    /* JADX INFO: renamed from: b */
    public AbstractC0116j m227b(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        return new C0107a(new ArrayList(this.f740h), new Matrix(matrix));
    }

    /* JADX INFO: renamed from: c */
    public float m228c() {
        return this.f735c;
    }

    @c5e(21)
    public void cubicToPoint(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f739g.add(new C0112f(f, f2, f3, f4, f5, f6));
        this.f741i = true;
        setEndX(f5);
        setEndY(f6);
    }

    /* JADX INFO: renamed from: d */
    public float m229d() {
        return this.f736d;
    }

    /* JADX INFO: renamed from: e */
    public float m230e() {
        return this.f733a;
    }

    /* JADX INFO: renamed from: f */
    public float m231f() {
        return this.f734b;
    }

    public void lineTo(float f, float f2) {
        C0113g c0113g = new C0113g();
        c0113g.f766b = f;
        c0113g.f767c = f2;
        this.f739g.add(c0113g);
        C0110d c0110d = new C0110d(c0113g, m228c(), m229d());
        addShadowCompatOperation(c0110d, c0110d.m235a() + 270.0f, c0110d.m235a() + 270.0f);
        setEndX(f);
        setEndY(f2);
    }

    @c5e(21)
    public void quadToPoint(float f, float f2, float f3, float f4) {
        C0115i c0115i = new C0115i();
        c0115i.setControlX(f);
        c0115i.setControlY(f2);
        c0115i.setEndX(f3);
        c0115i.setEndY(f4);
        this.f739g.add(c0115i);
        this.f741i = true;
        setEndX(f3);
        setEndY(f4);
    }

    public void reset(float f, float f2) {
        reset(f, f2, 270.0f, 0.0f);
    }

    public void reset(float f, float f2, float f3, float f4) {
        setStartX(f);
        setStartY(f2);
        setEndX(f);
        setEndY(f2);
        setCurrentShadowAngle(f3);
        setEndShadowAngle((f3 + f4) % 360.0f);
        this.f739g.clear();
        this.f740h.clear();
        this.f741i = false;
    }

    public a9f(float f, float f2) {
        reset(f, f2);
    }

    public void lineTo(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - m228c()) < 0.001f && Math.abs(f2 - m229d()) < 0.001f) || (Math.abs(f - f3) < 0.001f && Math.abs(f2 - f4) < 0.001f)) {
            lineTo(f3, f4);
            return;
        }
        C0113g c0113g = new C0113g();
        c0113g.f766b = f;
        c0113g.f767c = f2;
        this.f739g.add(c0113g);
        C0113g c0113g2 = new C0113g();
        c0113g2.f766b = f3;
        c0113g2.f767c = f4;
        this.f739g.add(c0113g2);
        C0109c c0109c = new C0109c(c0113g, c0113g2, m228c(), m229d());
        if (c0109c.m234c() > 0.0f) {
            lineTo(f, f2);
            lineTo(f3, f4);
        } else {
            addShadowCompatOperation(c0109c, c0109c.m233b() + 270.0f, c0109c.m232a() + 270.0f);
            setEndX(f3);
            setEndY(f4);
        }
    }
}
