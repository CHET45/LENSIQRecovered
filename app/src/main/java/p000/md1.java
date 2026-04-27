package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface md1 {
    static /* synthetic */ Object bringIntoView$default(md1 md1Var, rud rudVar, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i & 1) != 0) {
            rudVar = null;
        }
        return md1Var.bringIntoView(rudVar, zy2Var);
    }

    @gib
    Object bringIntoView(@gib rud rudVar, @yfb zy2<? super bth> zy2Var);
}
