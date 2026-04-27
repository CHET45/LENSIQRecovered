package p000;

/* JADX INFO: loaded from: classes7.dex */
@ihi(markerClass = {rh5.class})
@jjf(version = "1.7")
@u7e
public abstract class km3<T, R> {
    public /* synthetic */ km3(jt3 jt3Var) {
        this();
    }

    @gib
    public abstract <U, S> Object callRecursive(@yfb im3<U, S> im3Var, U u, @yfb zy2<? super S> zy2Var);

    @gib
    public abstract Object callRecursive(T t, @yfb zy2<? super R> zy2Var);

    @yfb
    @q64(level = u64.f86866b, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @i2e(expression = "this.callRecursive(value)", imports = {}))
    public final Void invoke(@yfb im3<?, ?> im3Var, @gib Object obj) {
        md8.checkNotNullParameter(im3Var, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    private km3() {
    }
}
