package p000;

import android.view.View;
import androidx.savedstate.C1414a;

/* JADX INFO: loaded from: classes3.dex */
public final class t9i {
    @q64(level = u64.f86867c, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @i2e(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ bme findViewTreeSavedStateRegistryOwner(View view) {
        md8.checkNotNullParameter(view, "<this>");
        return C1414a.get(view);
    }
}
