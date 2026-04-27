package p000;

import java.util.concurrent.CancellationException;
import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
@jcg(markerClass = na8.class)
public interface jj8 extends e13.InterfaceC5040b {

    /* JADX INFO: renamed from: A */
    @yfb
    public static final C7917b f50715A = C7917b.f50716a;

    /* JADX INFO: renamed from: jj8$a */
    public static final class C7916a {
        public static /* synthetic */ void cancel$default(jj8 jj8Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            jj8Var.cancel(cancellationException);
        }

        public static <R> R fold(@yfb jj8 jj8Var, R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) e13.InterfaceC5040b.a.fold(jj8Var, r, gz6Var);
        }

        @gib
        public static <E extends e13.InterfaceC5040b> E get(@yfb jj8 jj8Var, @yfb e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) e13.InterfaceC5040b.a.get(jj8Var, interfaceC5041c);
        }

        @wg5
        public static /* synthetic */ void getParent$annotations() {
        }

        public static /* synthetic */ yf4 invokeOnCompletion$default(jj8 jj8Var, boolean z, boolean z2, qy6 qy6Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return jj8Var.invokeOnCompletion(z, z2, qy6Var);
        }

        @yfb
        public static e13 minusKey(@yfb jj8 jj8Var, @yfb e13.InterfaceC5041c<?> interfaceC5041c) {
            return e13.InterfaceC5040b.a.minusKey(jj8Var, interfaceC5041c);
        }

        @yfb
        public static e13 plus(@yfb jj8 jj8Var, @yfb e13 e13Var) {
            return e13.InterfaceC5040b.a.plus(jj8Var, e13Var);
        }

        public static /* synthetic */ boolean cancel$default(jj8 jj8Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return jj8Var.cancel(th);
        }

        @yfb
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static jj8 plus(@yfb jj8 jj8Var, @yfb jj8 jj8Var2) {
            return jj8Var2;
        }
    }

    /* JADX INFO: renamed from: jj8$b */
    public static final class C7917b implements e13.InterfaceC5041c<jj8> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C7917b f50716a = new C7917b();

        private C7917b() {
        }
    }

    @la8
    @yfb
    wy1 attachChild(@yfb yy1 yy1Var);

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@gib CancellationException cancellationException);

    @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(Throwable th);

    @la8
    @yfb
    CancellationException getCancellationException();

    @yfb
    vye<jj8> getChildren();

    @yfb
    hve getOnJoin();

    @gib
    jj8 getParent();

    @yfb
    yf4 invokeOnCompletion(@yfb qy6<? super Throwable, bth> qy6Var);

    @la8
    @yfb
    yf4 invokeOnCompletion(boolean z, boolean z2, @yfb qy6<? super Throwable, bth> qy6Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @gib
    Object join(@yfb zy2<? super bth> zy2Var);

    @yfb
    @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    jj8 plus(@yfb jj8 jj8Var);

    boolean start();
}
