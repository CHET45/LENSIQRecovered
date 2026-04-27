package p000;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
@e0g(parameters = 0)
public final class r56 extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: b */
    public static final int f77076b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final aqg f77077a;

    public r56(@yfb aqg aqgVar) {
        this.f77077a = aqgVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@gib ActionMode actionMode, @gib MenuItem menuItem) {
        return this.f77077a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        return this.f77077a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@gib ActionMode actionMode) {
        this.f77077a.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@gib ActionMode actionMode, @gib View view, @gib Rect rect) {
        rud rect2 = this.f77077a.getRect();
        if (rect != null) {
            rect.set((int) rect2.getLeft(), (int) rect2.getTop(), (int) rect2.getRight(), (int) rect2.getBottom());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        return this.f77077a.onPrepareActionMode(actionMode, menu);
    }
}
