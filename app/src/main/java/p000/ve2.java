package p000;

import p000.a34;
import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = na8.class)
public interface ve2<T> extends a34<T> {

    /* JADX INFO: renamed from: ve2$a */
    public static final class C14013a {
        public static <T, R> R fold(@yfb ve2<T> ve2Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) a34.C0036a.fold(ve2Var, r, gz6Var);
        }

        @gib
        public static <T, E extends e13.InterfaceC5040b> E get(@yfb ve2<T> ve2Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) a34.C0036a.get(ve2Var, interfaceC5041c);
        }

        @yfb
        public static <T> e13 minusKey(@yfb ve2<T> ve2Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return a34.C0036a.minusKey(ve2Var, interfaceC5041c);
        }

        @yfb
        public static <T> e13 plus(@yfb ve2<T> ve2Var, @yfb e13 e13Var) {
            return a34.C0036a.plus(ve2Var, e13Var);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> jj8 plus(@yfb ve2<T> ve2Var, @yfb jj8 jj8Var) {
            return a34.C0036a.plus((a34) ve2Var, jj8Var);
        }
    }

    boolean complete(T t);

    boolean completeExceptionally(@yfb Throwable th);
}
