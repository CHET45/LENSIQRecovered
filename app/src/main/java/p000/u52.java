package p000;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "CloseableKt")
public final class u52 {
    @jjf(version = "1.1")
    @yjd
    public static final void closeFinally(@gib Closeable closeable, @gib Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a85.addSuppressed(th, th2);
            }
        }
    }

    @t28
    private static final <T extends Closeable, R> R use(T t, qy6<? super T, ? extends R> qy6Var) throws IOException {
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            R rInvoke = qy6Var.invoke(t);
            o28.finallyStart(1);
            if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                closeFinally(t, null);
            } else if (t != null) {
                t.close();
            }
            o28.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o28.finallyStart(1);
                if (dxc.apiVersionIsAtLeast(1, 1, 0)) {
                    closeFinally(t, th);
                } else if (t != null) {
                    try {
                        t.close();
                    } catch (Throwable unused) {
                    }
                }
                o28.finallyEnd(1);
                throw th2;
            }
        }
    }
}
