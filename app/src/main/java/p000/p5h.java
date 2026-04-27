package p000;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class p5h {

    /* JADX INFO: renamed from: a */
    public static final String f69755a = "Trace";

    /* JADX INFO: renamed from: b */
    public static long f69756b;

    /* JADX INFO: renamed from: c */
    public static Method f69757c;

    /* JADX INFO: renamed from: d */
    public static Method f69758d;

    /* JADX INFO: renamed from: e */
    public static Method f69759e;

    /* JADX INFO: renamed from: f */
    public static Method f69760f;

    private p5h() {
    }

    @igg({"NewApi"})
    public static void beginAsyncSection(@efb String str, int i) {
        try {
            if (f69758d == null) {
                s5h.beginAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        beginAsyncSectionFallback(str, i);
    }

    private static void beginAsyncSectionFallback(@efb String str, int i) {
        try {
            if (f69758d == null) {
                f69758d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f69758d.invoke(null, Long.valueOf(f69756b), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("asyncTraceBegin", e);
        }
    }

    public static void beginSection(@efb String str) {
        r5h.beginSection(str);
    }

    @igg({"NewApi"})
    public static void endAsyncSection(@efb String str, int i) {
        try {
            if (f69759e == null) {
                s5h.endAsyncSection(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        endAsyncSectionFallback(str, i);
    }

    private static void endAsyncSectionFallback(@efb String str, int i) {
        try {
            if (f69759e == null) {
                f69759e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f69759e.invoke(null, Long.valueOf(f69756b), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("asyncTraceEnd", e);
        }
    }

    public static void endSection() {
        r5h.endSection();
    }

    private static void handleException(@efb String str, @efb Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @igg({"NewApi"})
    public static boolean isEnabled() {
        try {
            if (f69757c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return isEnabledFallback();
    }

    private static boolean isEnabledFallback() {
        try {
            if (f69757c == null) {
                f69756b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f69757c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f69757c.invoke(null, Long.valueOf(f69756b))).booleanValue();
        } catch (Exception e) {
            handleException("isTagEnabled", e);
            return false;
        }
    }

    @igg({"NewApi"})
    public static void setCounter(@efb String str, int i) {
        try {
            if (f69760f == null) {
                s5h.setCounter(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        setCounterFallback(str, i);
    }

    private static void setCounterFallback(@efb String str, int i) {
        try {
            if (f69760f == null) {
                f69760f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f69760f.invoke(null, Long.valueOf(f69756b), str, Integer.valueOf(i));
        } catch (Exception e) {
            handleException("traceCounter", e);
        }
    }
}
