package p000;

import p000.e13;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
@la8
@q64(level = u64.f86866b, message = "This is internal API and may be removed in the future releases")
public interface yy1 extends jj8 {

    /* JADX INFO: renamed from: yy1$a */
    public static final class C15880a {
        public static <R> R fold(@yfb yy1 yy1Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) jj8.C7916a.fold(yy1Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb yy1 yy1Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) jj8.C7916a.get(yy1Var, interfaceC5041c);
        }

        @yfb
        public static e13 minusKey(@yfb yy1 yy1Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return jj8.C7916a.minusKey(yy1Var, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb yy1 yy1Var, @yfb e13 e13Var) {
            return jj8.C7916a.plus(yy1Var, e13Var);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static jj8 plus(@yfb yy1 yy1Var, @yfb jj8 jj8Var) {
            return jj8.C7916a.plus((jj8) yy1Var, jj8Var);
        }
    }

    @la8
    void parentCancelled(@yfb dhc dhcVar);
}
