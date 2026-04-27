package p000;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
@e0g(parameters = 0)
public final class aqg {

    /* JADX INFO: renamed from: g */
    public static final int f11616g = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final ny6<bth> f11617a;

    /* JADX INFO: renamed from: b */
    @yfb
    public rud f11618b;

    /* JADX INFO: renamed from: c */
    @gib
    public ny6<bth> f11619c;

    /* JADX INFO: renamed from: d */
    @gib
    public ny6<bth> f11620d;

    /* JADX INFO: renamed from: e */
    @gib
    public ny6<bth> f11621e;

    /* JADX INFO: renamed from: f */
    @gib
    public ny6<bth> f11622f;

    public aqg() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, gra graVar, ny6<bth> ny6Var) {
        if (ny6Var != null && menu.findItem(graVar.getId()) == null) {
            addMenuItem$ui_release(menu, graVar);
        } else {
            if (ny6Var != null || menu.findItem(graVar.getId()) == null) {
                return;
            }
            menu.removeItem(graVar.getId());
        }
    }

    public final void addMenuItem$ui_release(@yfb Menu menu, @yfb gra graVar) {
        menu.add(0, graVar.getId(), graVar.getOrder(), graVar.getTitleResource()).setShowAsAction(1);
    }

    @gib
    public final ny6<bth> getOnActionModeDestroy() {
        return this.f11617a;
    }

    @gib
    public final ny6<bth> getOnCopyRequested() {
        return this.f11619c;
    }

    @gib
    public final ny6<bth> getOnCutRequested() {
        return this.f11621e;
    }

    @gib
    public final ny6<bth> getOnPasteRequested() {
        return this.f11620d;
    }

    @gib
    public final ny6<bth> getOnSelectAllRequested() {
        return this.f11622f;
    }

    @yfb
    public final rud getRect() {
        return this.f11618b;
    }

    public final boolean onActionItemClicked(@gib ActionMode actionMode, @gib MenuItem menuItem) {
        md8.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == gra.Copy.getId()) {
            ny6<bth> ny6Var = this.f11619c;
            if (ny6Var != null) {
                ny6Var.invoke();
            }
        } else if (itemId == gra.Paste.getId()) {
            ny6<bth> ny6Var2 = this.f11620d;
            if (ny6Var2 != null) {
                ny6Var2.invoke();
            }
        } else if (itemId == gra.Cut.getId()) {
            ny6<bth> ny6Var3 = this.f11621e;
            if (ny6Var3 != null) {
                ny6Var3.invoke();
            }
        } else {
            if (itemId != gra.SelectAll.getId()) {
                return false;
            }
            ny6<bth> ny6Var4 = this.f11622f;
            if (ny6Var4 != null) {
                ny6Var4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f11619c != null) {
            addMenuItem$ui_release(menu, gra.Copy);
        }
        if (this.f11620d != null) {
            addMenuItem$ui_release(menu, gra.Paste);
        }
        if (this.f11621e != null) {
            addMenuItem$ui_release(menu, gra.Cut);
        }
        if (this.f11622f == null) {
            return true;
        }
        addMenuItem$ui_release(menu, gra.SelectAll);
        return true;
    }

    public final void onDestroyActionMode() {
        ny6<bth> ny6Var = this.f11617a;
        if (ny6Var != null) {
            ny6Var.invoke();
        }
    }

    public final boolean onPrepareActionMode(@gib ActionMode actionMode, @gib Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnCopyRequested(@gib ny6<bth> ny6Var) {
        this.f11619c = ny6Var;
    }

    public final void setOnCutRequested(@gib ny6<bth> ny6Var) {
        this.f11621e = ny6Var;
    }

    public final void setOnPasteRequested(@gib ny6<bth> ny6Var) {
        this.f11620d = ny6Var;
    }

    public final void setOnSelectAllRequested(@gib ny6<bth> ny6Var) {
        this.f11622f = ny6Var;
    }

    public final void setRect(@yfb rud rudVar) {
        this.f11618b = rudVar;
    }

    @fdi
    public final void updateMenuItems$ui_release(@yfb Menu menu) {
        addOrRemoveMenuItem(menu, gra.Copy, this.f11619c);
        addOrRemoveMenuItem(menu, gra.Paste, this.f11620d);
        addOrRemoveMenuItem(menu, gra.Cut, this.f11621e);
        addOrRemoveMenuItem(menu, gra.SelectAll, this.f11622f);
    }

    public aqg(@gib ny6<bth> ny6Var, @yfb rud rudVar, @gib ny6<bth> ny6Var2, @gib ny6<bth> ny6Var3, @gib ny6<bth> ny6Var4, @gib ny6<bth> ny6Var5) {
        this.f11617a = ny6Var;
        this.f11618b = rudVar;
        this.f11619c = ny6Var2;
        this.f11620d = ny6Var3;
        this.f11621e = ny6Var4;
        this.f11622f = ny6Var5;
    }

    public /* synthetic */ aqg(ny6 ny6Var, rud rudVar, ny6 ny6Var2, ny6 ny6Var3, ny6 ny6Var4, ny6 ny6Var5, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : ny6Var, (i & 2) != 0 ? rud.f79687e.getZero() : rudVar, (i & 4) != 0 ? null : ny6Var2, (i & 8) != 0 ? null : ny6Var3, (i & 16) != 0 ? null : ny6Var4, (i & 32) != 0 ? null : ny6Var5);
    }
}
