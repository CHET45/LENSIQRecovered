package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    @yfb
    public final StackTraceElement coroutineBoundary() {
        return k13.artificialFrame(new Exception(), oui.class.getSimpleName());
    }

    @yfb
    public final StackTraceElement coroutineCreation() {
        return k13.artificialFrame(new Exception(), pui.class.getSimpleName());
    }
}
