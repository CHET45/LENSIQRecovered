package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v5h {
    public static final <T> T trace(@yfb String str, @yfb ny6<? extends T> ny6Var) {
        q5h q5hVar = q5h.f73293a;
        Object objBeginSection = q5hVar.beginSection(str);
        try {
            T tInvoke = ny6Var.invoke();
            o28.finallyStart(1);
            q5hVar.endSection(objBeginSection);
            o28.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th) {
            o28.finallyStart(1);
            q5h.f73293a.endSection(objBeginSection);
            o28.finallyEnd(1);
            throw th;
        }
    }
}
