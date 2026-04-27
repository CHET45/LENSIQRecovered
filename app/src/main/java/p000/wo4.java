package p000;

/* JADX INFO: loaded from: classes.dex */
public interface wo4 {

    /* JADX INFO: renamed from: wo4$a */
    public static final class C14717a {
    }

    static /* synthetic */ Object drag$default(wo4 wo4Var, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return wo4Var.drag(j7bVar, gz6Var, zy2Var);
    }

    void dispatchRawDelta(float f);

    @gib
    Object drag(@yfb j7b j7bVar, @yfb gz6<? super ko4, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var);
}
