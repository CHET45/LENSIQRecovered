package p000;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class t5h {

    /* JADX INFO: renamed from: a */
    public static final String f83767a = "TraceCompat";

    /* JADX INFO: renamed from: b */
    public static long f83768b;

    /* JADX INFO: renamed from: c */
    public static Method f83769c;

    /* JADX INFO: renamed from: d */
    public static Method f83770d;

    /* JADX INFO: renamed from: e */
    public static Method f83771e;

    /* JADX INFO: renamed from: f */
    public static Method f83772f;

    /* JADX INFO: renamed from: t5h$a */
    @c5e(29)
    public static class C12919a {
        private C12919a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m22379a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m22380b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m22381c() {
            return Trace.isEnabled();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m22382d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f83768b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f83769c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f83770d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f83771e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f83772f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i(f83767a, "Unable to initialize via reflection.", e);
            }
        }
    }

    private t5h() {
    }

    public static void beginAsyncSection(@efb String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12919a.m22379a(str, i);
        } else {
            try {
                f83770d.invoke(null, Long.valueOf(f83768b), str, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    public static void beginSection(@efb String str) {
        Trace.beginSection(str);
    }

    public static void endAsyncSection(@efb String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12919a.m22380b(str, i);
        } else {
            try {
                f83771e.invoke(null, Long.valueOf(f83768b), str, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C12919a.m22381c();
        }
        try {
            return ((Boolean) f83769c.invoke(null, Long.valueOf(f83768b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setCounter(@efb String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C12919a.m22382d(str, i);
        } else {
            try {
                f83772f.invoke(null, Long.valueOf(f83768b), str, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }
}
