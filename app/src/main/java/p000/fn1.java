package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class fn1 implements cn1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Matrix f37143a = new Matrix();

    /* JADX INFO: renamed from: b */
    @yfb
    public final int[] f37144b = new int[2];

    @Override // p000.cn1
    @ih4
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo28228calculateMatrixToWindowEL8BTi8(@yfb View view, @yfb float[] fArr) {
        this.f37143a.reset();
        view.transformMatrixToGlobal(this.f37143a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f37144b);
        int[] iArr = this.f37144b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f37144b;
        this.f37143a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        C12773st.m32334setFromtUYjHk(fArr, this.f37143a);
    }
}
