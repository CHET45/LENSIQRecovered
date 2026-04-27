package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
@e0g(parameters = 1)
public final class d10 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final d10 f28205a = new d10();

    /* JADX INFO: renamed from: b */
    public static final int f28206b = 0;

    private d10() {
    }

    @ih4
    public final void startStylusHandwriting(@yfb InputMethodManager inputMethodManager, @yfb View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
