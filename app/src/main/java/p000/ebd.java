package p000;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ebd implements ActionMode.Callback {

    /* JADX INFO: renamed from: b */
    public static final int f32536b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final aqg f32537a;

    public ebd(@yfb aqg aqgVar) {
        this.f32537a = aqgVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@gib ActionMode actionMode, @gib MenuItem menuItem) {
        return this.f32537a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        return this.f32537a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@gib ActionMode actionMode) {
        this.f32537a.onDestroyActionMode();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        return this.f32537a.onPrepareActionMode(actionMode, menu);
    }
}
