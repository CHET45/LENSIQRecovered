package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class k13 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f52361a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement artificialFrame(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f52361a + a18.f100c + str, p43.f69617m, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    @yfb
    public static final String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return f52361a;
    }
}
