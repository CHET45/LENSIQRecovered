package p000;

import com.iflytek.aikit.core.AiHelper;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "AutoCloseableKt")
public final class pi0 {

    /* JADX INFO: renamed from: pi0$a */
    public static final class C10965a implements AutoCloseable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f70923a;

        public C10965a(ny6<bth> ny6Var) {
            this.f70923a = ny6Var;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f70923a.invoke();
        }
    }

    @jjf(version = AiHelper.f24011i)
    @t28
    private static final AutoCloseable AutoCloseable(ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "closeAction");
        return new C10965a(ny6Var);
    }

    @jjf(version = AiHelper.f24011i)
    public static /* synthetic */ void AutoCloseable$annotations() {
    }

    @jjf(version = "1.2")
    @yjd
    public static final void closeFinally(@gib AutoCloseable autoCloseable, @gib Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                a85.addSuppressed(th, th2);
            }
        }
    }

    @jjf(version = "1.2")
    @t28
    private static final <T extends AutoCloseable, R> R use(T t, qy6<? super T, ? extends R> qy6Var) throws Exception {
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            R rInvoke = qy6Var.invoke(t);
            o28.finallyStart(1);
            closeFinally(t, null);
            o28.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }
}
