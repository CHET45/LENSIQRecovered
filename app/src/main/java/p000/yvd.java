package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class yvd implements zk9 {

    /* JADX INFO: renamed from: b */
    public static final Logger f103150b = Logger.getLogger(yvd.class.getName());

    /* JADX INFO: renamed from: c */
    public static final Constructor<?> f103151c;

    /* JADX INFO: renamed from: d */
    public static final Method f103152d;

    /* JADX INFO: renamed from: e */
    public static final Method f103153e;

    /* JADX INFO: renamed from: f */
    public static final RuntimeException f103154f;

    /* JADX INFO: renamed from: g */
    public static final Object[] f103155g;

    /* JADX INFO: renamed from: a */
    public final Object f103156a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", null);
            } catch (Throwable th) {
                th = th;
                method2 = null;
            }
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
                f103150b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            f103151c = null;
            f103152d = null;
            f103153e = null;
            f103154f = new RuntimeException(th);
        } else {
            f103151c = constructor;
            f103152d = method;
            f103153e = method2;
            f103154f = null;
        }
        f103155g = new Object[]{1L};
    }

    public yvd() {
        RuntimeException runtimeException = f103154f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f103156a = f103151c.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m26369a() {
        return f103154f == null;
    }

    @Override // p000.zk9
    public void add(long j) {
        try {
            f103152d.invoke(this.f103156a, j == 1 ? f103155g : new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000.zk9
    public long value() {
        try {
            return ((Long) f103153e.invoke(this.f103156a, null)).longValue();
        } catch (IllegalAccessException unused) {
            throw new RuntimeException();
        } catch (InvocationTargetException unused2) {
            throw new RuntimeException();
        }
    }
}
