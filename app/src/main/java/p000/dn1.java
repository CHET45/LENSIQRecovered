package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 implements cn1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f30177a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final int[] f30178b;

    public /* synthetic */ dn1(float[] fArr, jt3 jt3Var) {
        this(fArr);
    }

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m28655preConcattUYjHk(float[] fArr, Matrix matrix) {
        C12773st.m32334setFromtUYjHk(this.f30177a, matrix);
        C8031jr.m30565preTransformJiSxe2E(fArr, this.f30177a);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m28656preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        C8031jr.m30566preTranslatecG2Xzmc(fArr, f, f2, this.f30177a);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m28657transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m28657transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m28656preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m28656preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f30178b);
            m28656preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m28656preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m28655preConcattUYjHk(fArr, matrix);
    }

    @Override // p000.cn1
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo28228calculateMatrixToWindowEL8BTi8(@yfb View view, @yfb float[] fArr) {
        x3a.m33192resetimpl(fArr);
        m28657transformMatrixToWindowEL8BTi8(view, fArr);
    }

    private dn1(float[] fArr) {
        this.f30177a = fArr;
        this.f30178b = new int[2];
    }
}
