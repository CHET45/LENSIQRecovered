package p000;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = na8.class)
public interface dq1<T> extends zy2<T> {

    /* JADX INFO: renamed from: dq1$a */
    public static final class C4906a {
        public static /* synthetic */ boolean cancel$default(dq1 dq1Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return dq1Var.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(dq1 dq1Var, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return dq1Var.tryResume(obj, obj2);
        }
    }

    boolean cancel(@gib Throwable th);

    @la8
    void completeResume(@yfb Object obj);

    @la8
    void initCancellability();

    void invokeOnCancellation(@yfb qy6<? super Throwable, bth> qy6Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    <R extends T> void resume(R r, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var);

    @q64(level = u64.f86865a, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @i2e(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void resume(T t, @gib qy6<? super Throwable, bth> qy6Var);

    @wg5
    void resumeUndispatched(@yfb m13 m13Var, T t);

    @wg5
    void resumeUndispatchedWithException(@yfb m13 m13Var, @yfb Throwable th);

    @gib
    @la8
    Object tryResume(T t, @gib Object obj);

    @gib
    @la8
    <R extends T> Object tryResume(R r, @gib Object obj, @gib kz6<? super Throwable, ? super R, ? super e13, bth> kz6Var);

    @gib
    @la8
    Object tryResumeWithException(@yfb Throwable th);
}
