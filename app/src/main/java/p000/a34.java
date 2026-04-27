package p000;

import p000.e13;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = na8.class)
public interface a34<T> extends jj8 {

    /* JADX INFO: renamed from: a34$a */
    public static final class C0036a {
        public static <T, R> R fold(@yfb a34<? extends T> a34Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) jj8.C7916a.fold(a34Var, r, gz6Var);
        }

        @gib
        public static <T, E extends e13.InterfaceC5040b> E get(@yfb a34<? extends T> a34Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) jj8.C7916a.get(a34Var, interfaceC5041c);
        }

        @yfb
        public static <T> e13 minusKey(@yfb a34<? extends T> a34Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return jj8.C7916a.minusKey(a34Var, interfaceC5041c);
        }

        @yfb
        public static <T> e13 plus(@yfb a34<? extends T> a34Var, @yfb e13 e13Var) {
            return jj8.C7916a.plus(a34Var, e13Var);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> jj8 plus(@yfb a34<? extends T> a34Var, @yfb jj8 jj8Var) {
            return jj8.C7916a.plus((jj8) a34Var, jj8Var);
        }
    }

    @gib
    Object await(@yfb zy2<? super T> zy2Var);

    @wg5
    T getCompleted();

    @gib
    @wg5
    Throwable getCompletionExceptionOrNull();

    @yfb
    jve<T> getOnAwait();
}
