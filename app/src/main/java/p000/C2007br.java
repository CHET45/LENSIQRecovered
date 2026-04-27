package p000;

import android.view.View;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public final class C2007br {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C2007br f14524a = new C2007br();

    private C2007br() {
    }

    @c5e(24)
    @ih4
    public final boolean startDragAndDrop(@yfb View view, @yfb eo4 eo4Var, @yfb gl2 gl2Var) {
        return view.startDragAndDrop(eo4Var.getClipData(), gl2Var, eo4Var.getLocalState(), eo4Var.getFlags());
    }
}
