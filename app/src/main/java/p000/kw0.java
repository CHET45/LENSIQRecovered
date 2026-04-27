package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
public interface kw0 {
    static /* synthetic */ Object show$default(kw0 kw0Var, j7b j7bVar, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return kw0Var.show(j7bVar, zy2Var);
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    @gib
    Object show(@yfb j7b j7bVar, @yfb zy2<? super bth> zy2Var);
}
