package p000;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class a85 {
    @jjf(version = "1.1")
    @xj7
    public static void addSuppressed(@yfb Throwable th, @yfb Throwable th2) throws IllegalAccessException, InvocationTargetException {
        md8.checkNotNullParameter(th, "<this>");
        md8.checkNotNullParameter(th2, "exception");
        if (th != th2) {
            dxc.f31254a.addSuppressed(th, th2);
        }
    }

    @yfb
    public static final StackTraceElement[] getStackTrace(@yfb Throwable th) {
        md8.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        md8.checkNotNull(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    @yfb
    public static final List<Throwable> getSuppressedExceptions(@yfb Throwable th) {
        md8.checkNotNullParameter(th, "<this>");
        return dxc.f31254a.getSuppressed(th);
    }

    @jjf(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }

    @t28
    private static final void printStackTrace(Throwable th) {
        md8.checkNotNullParameter(th, "<this>");
        th.printStackTrace();
    }

    @jjf(version = "1.4")
    @yfb
    public static final String stackTraceToString(@yfb Throwable th) {
        md8.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @t28
    private static final void printStackTrace(Throwable th, PrintWriter printWriter) {
        md8.checkNotNullParameter(th, "<this>");
        md8.checkNotNullParameter(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @t28
    private static final void printStackTrace(Throwable th, PrintStream printStream) {
        md8.checkNotNullParameter(th, "<this>");
        md8.checkNotNullParameter(printStream, "stream");
        th.printStackTrace(printStream);
    }
}
