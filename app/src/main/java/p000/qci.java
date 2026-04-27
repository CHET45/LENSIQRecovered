package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@c5e(29)
public class qci extends pci {
    @Override // p000.ici, androidx.transition.C1466z
    public float getTransitionAlpha(@efb View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000.lci, androidx.transition.C1466z
    public void setAnimationMatrix(@efb View view, @hib Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p000.nci, androidx.transition.C1466z
    public void setLeftTopRightBottom(@efb View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.ici, androidx.transition.C1466z
    public void setTransitionAlpha(@efb View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.pci, androidx.transition.C1466z
    public void setTransitionVisibility(@efb View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.lci, androidx.transition.C1466z
    public void transformMatrixToGlobal(@efb View view, @efb Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.lci, androidx.transition.C1466z
    public void transformMatrixToLocal(@efb View view, @efb Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
