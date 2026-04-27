package p000;

import p000.e13;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = na8.class)
public interface jg2 extends jj8 {

    /* JADX INFO: renamed from: jg2$a */
    public static final class C7894a {
        public static <R> R fold(@yfb jg2 jg2Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) jj8.C7916a.fold(jg2Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb jg2 jg2Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) jj8.C7916a.get(jg2Var, interfaceC5041c);
        }

        @yfb
        public static e13 minusKey(@yfb jg2 jg2Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return jj8.C7916a.minusKey(jg2Var, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb jg2 jg2Var, @yfb e13 e13Var) {
            return jj8.C7916a.plus(jg2Var, e13Var);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static jj8 plus(@yfb jg2 jg2Var, @yfb jj8 jj8Var) {
            return jj8.C7916a.plus((jj8) jg2Var, jj8Var);
        }
    }

    boolean complete();

    boolean completeExceptionally(@yfb Throwable th);
}
