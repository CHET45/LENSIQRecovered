package p000;

import android.view.View;
import androidx.transition.C1466z;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public class ici extends C1466z {

    /* JADX INFO: renamed from: h */
    public static boolean f46519h = true;

    @Override // androidx.transition.C1466z
    public void clearNonTransitionAlpha(@efb View view) {
    }

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public float getTransitionAlpha(@efb View view) {
        if (f46519h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f46519h = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.C1466z
    public void saveNonTransitionAlpha(@efb View view) {
    }

    @Override // androidx.transition.C1466z
    @igg({"NewApi"})
    public void setTransitionAlpha(@efb View view, float f) {
        if (f46519h) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f46519h = false;
            }
        }
        view.setAlpha(f);
    }
}
