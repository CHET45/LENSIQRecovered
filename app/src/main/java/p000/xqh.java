package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class xqh extends AbstractC14853x<lw8> {

    /* JADX INFO: renamed from: e */
    public static final int f99008e = 0;

    public xqh(@yfb lw8 lw8Var) {
        super(lw8Var);
    }

    @Override // p000.AbstractC14853x
    /* JADX INFO: renamed from: b */
    public void mo2892b() {
        getRoot().removeAll$ui_release();
    }

    @Override // p000.p40
    public void move(int i, int i2, int i3) {
        getCurrent().move$ui_release(i, i2, i3);
    }

    @Override // p000.p40
    public void onEndChanges() {
        super.onEndChanges();
        z9c owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // p000.p40
    public void remove(int i, int i2) {
        getCurrent().removeAt$ui_release(i, i2);
    }

    @Override // p000.p40
    public void insertBottomUp(int i, @yfb lw8 lw8Var) {
        getCurrent().insertAt$ui_release(i, lw8Var);
    }

    @Override // p000.p40
    public void insertTopDown(int i, @yfb lw8 lw8Var) {
    }
}
