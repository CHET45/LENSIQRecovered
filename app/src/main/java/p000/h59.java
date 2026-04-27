package p000;

import androidx.lifecycle.C1155o;

/* JADX INFO: loaded from: classes3.dex */
public final class h59 {
    @yfb
    public static final w49 getLifecycleScope(@yfb g59 g59Var) {
        md8.checkNotNullParameter(g59Var, "<this>");
        return C1155o.getCoroutineScope(g59Var.getLifecycle());
    }
}
