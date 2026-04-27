package p000;

import android.view.View;
import p000.ng7;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class zwc implements lg7 {

    /* JADX INFO: renamed from: b */
    public static final int f106209b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f106210a;

    public zwc(@yfb View view) {
        this.f106210a = view;
    }

    @Override // p000.lg7
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public void mo30866performHapticFeedbackCdsT49E(int i) {
        ng7.C9868a c9868a = ng7.f64462b;
        if (ng7.m31150equalsimpl0(i, c9868a.m31154getLongPress5zf0vsI())) {
            this.f106210a.performHapticFeedback(0);
        } else if (ng7.m31150equalsimpl0(i, c9868a.m31155getTextHandleMove5zf0vsI())) {
            this.f106210a.performHapticFeedback(9);
        }
    }
}
