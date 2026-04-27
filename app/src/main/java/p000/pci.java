package p000;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public class pci extends nci {

    /* JADX INFO: renamed from: m */
    public static boolean f70402m = true;

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void setTransitionVisibility(@efb View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i);
        } else if (f70402m) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f70402m = false;
            }
        }
    }
}
