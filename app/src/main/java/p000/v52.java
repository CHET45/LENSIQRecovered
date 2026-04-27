package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class v52 {
    public static final <T extends p52, R> R use(@yfb T t, @yfb qy6<? super T, ? extends R> qy6Var) throws Throwable {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            R rInvoke = qy6Var.invoke(t);
            o28.finallyStart(1);
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th != null) {
                throw th;
            }
            o28.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th2) {
            o28.finallyStart(1);
            try {
                t.close();
            } catch (Throwable th3) {
                a85.addSuppressed(th2, th3);
            }
            throw th2;
        }
    }
}
