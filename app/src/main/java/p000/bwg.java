package p000;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@e0g(parameters = 1)
public final class bwg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final bwg f15116a = new bwg();

    /* JADX INFO: renamed from: b */
    public static final int f15117b = 0;

    private bwg() {
    }

    @c5e(23)
    @ih4
    public final void invalidateContentRect(@yfb ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @c5e(23)
    @gib
    @ih4
    public final ActionMode startActionMode(@yfb View view, @yfb ActionMode.Callback callback, int i) {
        return view.startActionMode(callback, i);
    }
}
