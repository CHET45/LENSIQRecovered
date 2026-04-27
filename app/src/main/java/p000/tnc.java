package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tnc {

    /* JADX INFO: renamed from: a */
    public static final xy7 f85383a;

    static {
        Object obj;
        Class<?> cls;
        xy7 xy7Var;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                xy7Var = (xy7) cls.asSubclass(xy7.class).getConstructor(plg.class).newInstance(xy7.f99659d);
            } catch (Throwable th2) {
                obj = th2;
                xy7Var = null;
            }
        } else {
            xy7Var = null;
        }
        if (xy7Var != null) {
            f85383a = xy7Var;
        } else {
            f85383a = new xy7(xy7.f99659d);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, tnc.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private tnc() {
    }

    public static void attachTag(plg plgVar) {
        f85383a.m25536a(plgVar);
    }

    public static plg createTag() {
        return xy7.f99659d;
    }

    public static void event(String str, plg plgVar) {
        f85383a.m25543h(str, plgVar);
    }

    @hh4
    @Deprecated
    public static a79 link() {
        return xy7.f99660e;
    }

    public static void linkIn(a79 a79Var) {
        f85383a.m25545j(a79Var);
    }

    public static a79 linkOut() {
        return f85383a.m25546k();
    }

    @op1
    public static boolean setEnabled(boolean z) {
        return f85383a.m25548o(z, false);
    }

    public static void startTask(String str, plg plgVar) {
        f85383a.m25551r(str, plgVar);
    }

    public static void stopTask() {
        f85383a.m25553t();
    }

    @i4b
    public static nng traceTask(String str) {
        f85383a.m25550q(str);
        return nng.f65123a;
    }

    public static void attachTag(String str, String str2) {
        f85383a.m25540e(str, str2);
    }

    public static plg createTag(long j) {
        return f85383a.m25541f("", j);
    }

    public static void event(String str) {
        f85383a.m25542g(str);
    }

    public static void startTask(String str) {
        f85383a.m25550q(str);
    }

    public static void stopTask(String str, plg plgVar) {
        f85383a.m25555v(str, plgVar);
    }

    public static void attachTag(String str, long j) {
        f85383a.m25537b(str, j);
    }

    public static plg createTag(String str) {
        return f85383a.m25541f(str, Long.MIN_VALUE);
    }

    public static void event(String str, String str2) {
        f85383a.m25544i(str, str2);
    }

    public static <T> void startTask(T t, s7g<? super T> s7gVar) {
        f85383a.m25549p(t, s7gVar);
    }

    public static void stopTask(String str) {
        f85383a.m25554u(str);
    }

    @i4b
    public static <T> nng traceTask(T t, s7g<? super T> s7gVar) {
        f85383a.m25549p(t, s7gVar);
        return nng.f65123a;
    }

    public static void attachTag(String str, long j, long j2) {
        f85383a.m25538c(str, j, j2);
    }

    public static plg createTag(String str, long j) {
        return f85383a.m25541f(str, j);
    }

    public static void startTask(String str, String str2) {
        f85383a.m25552s(str, str2);
    }

    public static void stopTask(String str, String str2) {
        f85383a.m25556w(str, str2);
    }

    public static <T> void attachTag(String str, T t, s7g<? super T> s7gVar) {
        f85383a.m25539d(str, t, s7gVar);
    }
}
