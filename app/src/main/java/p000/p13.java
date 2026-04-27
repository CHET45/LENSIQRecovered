package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class p13 {
    public static final void handleUncaughtCoroutineException(@yfb e13 e13Var, @yfb Throwable th) {
        Iterator<n13> it = o13.getPlatformExceptionHandlers().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(e13Var, th);
            } catch (m75 unused) {
                return;
            } catch (Throwable th2) {
                o13.propagateExceptionFinalResort(q13.handlerException(th, th2));
            }
        }
        try {
            a85.addSuppressed(th, new x94(e13Var));
        } catch (Throwable unused2) {
        }
        o13.propagateExceptionFinalResort(th);
    }
}
