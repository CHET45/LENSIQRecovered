package p000;

/* JADX INFO: loaded from: classes.dex */
@ah5
public interface qo4 {
    static /* synthetic */ Object drag$default(qo4 qo4Var, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return qo4Var.drag(j7bVar, gz6Var, zy2Var);
    }

    /* JADX INFO: renamed from: dispatchRawDelta-k-4lQ0M, reason: not valid java name */
    void mo31959dispatchRawDeltak4lQ0M(long j);

    @gib
    Object drag(@yfb j7b j7bVar, @yfb gz6<? super sn4, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var);
}
