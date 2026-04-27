package p000;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: qv */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C11707qv implements awg {

    /* JADX INFO: renamed from: e */
    public static final int f75852e = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f75853a;

    /* JADX INFO: renamed from: b */
    @gib
    public ActionMode f75854b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final aqg f75855c = new aqg(new a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public dwg f75856d = dwg.Hidden;

    /* JADX INFO: renamed from: qv$a */
    public static final class a extends tt8 implements ny6<bth> {
        public a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C11707qv.this.f75854b = null;
        }
    }

    public C11707qv(@yfb View view) {
        this.f75853a = view;
    }

    @Override // p000.awg
    @yfb
    public dwg getStatus() {
        return this.f75856d;
    }

    @Override // p000.awg
    public void hide() {
        this.f75856d = dwg.Hidden;
        ActionMode actionMode = this.f75854b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f75854b = null;
    }

    @Override // p000.awg
    public void showMenu(@yfb rud rudVar, @gib ny6<bth> ny6Var, @gib ny6<bth> ny6Var2, @gib ny6<bth> ny6Var3, @gib ny6<bth> ny6Var4) {
        this.f75855c.setRect(rudVar);
        this.f75855c.setOnCopyRequested(ny6Var);
        this.f75855c.setOnCutRequested(ny6Var3);
        this.f75855c.setOnPasteRequested(ny6Var2);
        this.f75855c.setOnSelectAllRequested(ny6Var4);
        ActionMode actionMode = this.f75854b;
        if (actionMode == null) {
            this.f75856d = dwg.Shown;
            this.f75854b = bwg.f15116a.startActionMode(this.f75853a, new r56(this.f75855c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
