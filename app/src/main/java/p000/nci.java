package p000;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@c5e(22)
public class nci extends lci {

    /* JADX INFO: renamed from: l */
    public static boolean f63973l = true;

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void setLeftTopRightBottom(@efb View view, int i, int i2, int i3, int i4) {
        if (f63973l) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f63973l = false;
            }
        }
    }
}
