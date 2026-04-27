package p000;

import java.util.concurrent.CancellationException;
import p000.e13;
import p000.jj8;

/* JADX INFO: loaded from: classes7.dex */
@la8
@q64(level = u64.f86866b, message = "This is internal API and may be removed in the future releases")
public interface dhc extends jj8 {

    /* JADX INFO: renamed from: dhc$a */
    public static final class C4788a {
        public static <R> R fold(@yfb dhc dhcVar, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) jj8.C7916a.fold(dhcVar, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb dhc dhcVar, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) jj8.C7916a.get(dhcVar, interfaceC5041c);
        }

        @yfb
        public static e13 minusKey(@yfb dhc dhcVar, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return jj8.C7916a.minusKey(dhcVar, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb dhc dhcVar, @yfb e13 e13Var) {
            return jj8.C7916a.plus(dhcVar, e13Var);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static jj8 plus(@yfb dhc dhcVar, @yfb jj8 jj8Var) {
            return jj8.C7916a.plus((jj8) dhcVar, jj8Var);
        }
    }

    @la8
    @yfb
    CancellationException getChildJobCancellationCause();
}
