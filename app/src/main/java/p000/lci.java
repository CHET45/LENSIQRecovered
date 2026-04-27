package p000;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@c5e(21)
public class lci extends ici {

    /* JADX INFO: renamed from: i */
    public static boolean f57201i = true;

    /* JADX INFO: renamed from: j */
    public static boolean f57202j = true;

    /* JADX INFO: renamed from: k */
    public static boolean f57203k = true;

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void setAnimationMatrix(@efb View view, @hib Matrix matrix) {
        if (f57201i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f57201i = false;
            }
        }
    }

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void transformMatrixToGlobal(@efb View view, @efb Matrix matrix) {
        if (f57202j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f57202j = false;
            }
        }
    }

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void transformMatrixToLocal(@efb View view, @efb Matrix matrix) {
        if (f57203k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f57203k = false;
            }
        }
    }
}
