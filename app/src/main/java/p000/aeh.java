package p000;

/* JADX INFO: loaded from: classes.dex */
public interface aeh {

    /* JADX INFO: renamed from: aeh$a */
    public static final class C0197a {
    }

    static /* synthetic */ Object transform$default(aeh aehVar, j7b j7bVar, gz6 gz6Var, zy2 zy2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i & 1) != 0) {
            j7bVar = j7b.Default;
        }
        return aehVar.transform(j7bVar, gz6Var, zy2Var);
    }

    boolean isTransformInProgress();

    @gib
    Object transform(@yfb j7b j7bVar, @yfb gz6<? super zdh, ? super zy2<? super bth>, ? extends Object> gz6Var, @yfb zy2<? super bth> zy2Var);
}
