package p000;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class b4a {

    /* JADX INFO: renamed from: a */
    public static final Matrix f12675a = new C1736a();

    /* JADX INFO: renamed from: b4a$a */
    public static class C1736a extends Matrix {
        /* JADX INFO: renamed from: a */
        public void m2923a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f, float f2, float f3) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2, float f3, float f4) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2, float f3, float f4) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f, float f2, float f3) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2, float f3, float f4) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2, float f3, float f4) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f, float f2, float f3) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2, float f3, float f4) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2, float f3, float f4) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2, float f3, float f4) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f, float f2) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2) {
            m2923a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2) {
            m2923a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2) {
            m2923a();
        }
    }

    private b4a() {
    }
}
