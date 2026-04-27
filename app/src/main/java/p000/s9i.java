package p000;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "ViewKt")
public final class s9i {
    @q64(level = u64.f86867c, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @i2e(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ g59 findViewTreeLifecycleOwner(View view) {
        md8.checkNotNullParameter(view, "view");
        return zbi.get(view);
    }
}
