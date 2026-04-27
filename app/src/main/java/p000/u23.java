package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class u23 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final u23 f86578a = new u23();

    /* JADX INFO: renamed from: b */
    public static daf f86579b;

    private u23() {
    }

    @fdi
    /* JADX INFO: renamed from: getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations */
    public static /* synthetic */ void m23003x9ea6c4a6() {
    }

    @do8
    public static final void notifyCrashOccurred() {
        try {
            if (f86579b == null) {
                f86578a.setSharedSessionRepository$com_google_firebase_firebase_sessions(daf.f29111a.getInstance());
            }
            u23 u23Var = f86578a;
            if (u23Var.getSharedSessionRepository$com_google_firebase_firebase_sessions().isInForeground()) {
                u23Var.getSharedSessionRepository$com_google_firebase_firebase_sessions().appBackground();
            }
        } catch (Exception unused) {
        }
    }

    @yfb
    public final daf getSharedSessionRepository$com_google_firebase_firebase_sessions() {
        daf dafVar = f86579b;
        if (dafVar != null) {
            return dafVar;
        }
        md8.throwUninitializedPropertyAccessException("sharedSessionRepository");
        return null;
    }

    public final void setSharedSessionRepository$com_google_firebase_firebase_sessions(@yfb daf dafVar) {
        md8.checkNotNullParameter(dafVar, "<set-?>");
        f86579b = dafVar;
    }
}
