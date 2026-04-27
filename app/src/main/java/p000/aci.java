package p000;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "ViewTreeViewModelKt")
public final class aci {
    @q64(level = u64.f86867c, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @i2e(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final /* synthetic */ nai findViewTreeViewModelStoreOwner(View view) {
        md8.checkNotNullParameter(view, "view");
        return bci.get(view);
    }
}
