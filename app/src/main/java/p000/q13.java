package p000;

import java.lang.reflect.InvocationTargetException;
import p000.n13;

/* JADX INFO: loaded from: classes7.dex */
public final class q13 {

    /* JADX INFO: renamed from: q13$a */
    public static final class C11250a extends AbstractC13302u0 implements n13 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<e13, Throwable, bth> f72744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11250a(gz6<? super e13, ? super Throwable, bth> gz6Var, n13.C9643b c9643b) {
            super(c9643b);
            this.f72744b = gz6Var;
        }

        @Override // p000.n13
        public void handleException(e13 e13Var, Throwable th) {
            this.f72744b.invoke(e13Var, th);
        }
    }

    @yfb
    public static final n13 CoroutineExceptionHandler(@yfb gz6<? super e13, ? super Throwable, bth> gz6Var) {
        return new C11250a(gz6Var, n13.f62944t);
    }

    @la8
    public static final void handleCoroutineException(@yfb e13 e13Var, @yfb Throwable th) {
        try {
            n13 n13Var = (n13) e13Var.get(n13.f62944t);
            if (n13Var != null) {
                n13Var.handleException(e13Var, th);
            } else {
                p13.handleUncaughtCoroutineException(e13Var, th);
            }
        } catch (Throwable th2) {
            p13.handleUncaughtCoroutineException(e13Var, handlerException(th, th2));
        }
    }

    @yfb
    public static final Throwable handlerException(@yfb Throwable th, @yfb Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        a85.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
