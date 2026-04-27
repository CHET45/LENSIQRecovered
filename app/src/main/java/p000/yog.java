package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p000.oog;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class yog {

    /* JADX INFO: renamed from: a */
    public final Method f102455a;

    /* JADX INFO: renamed from: b */
    public sog f102456b;

    public yog(Method method, sog sogVar) {
        this.f102455a = method;
        this.f102456b = sogVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m26261a() {
        return m26264d() != null;
    }

    /* JADX INFO: renamed from: b */
    public List<Method> m26262b() {
        return this.f102456b.getAnnotatedMethods(InterfaceC4798dj.class);
    }

    /* JADX INFO: renamed from: c */
    public List<Method> m26263c() {
        return this.f102456b.getAnnotatedMethods(kx0.class);
    }

    /* JADX INFO: renamed from: d */
    public Class<? extends Throwable> m26264d() {
        oog oogVar = (oog) this.f102455a.getAnnotation(oog.class);
        if (oogVar == null || oogVar.expected() == oog.C10486a.class) {
            return null;
        }
        return oogVar.expected();
    }

    /* JADX INFO: renamed from: e */
    public boolean m26265e(Throwable th) {
        return !m26264d().isAssignableFrom(th.getClass());
    }

    public long getTimeout() {
        oog oogVar = (oog) this.f102455a.getAnnotation(oog.class);
        if (oogVar == null) {
            return 0L;
        }
        return oogVar.timeout();
    }

    public void invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f102455a.invoke(obj, null);
    }

    public boolean isIgnored() {
        return this.f102455a.getAnnotation(rr7.class) != null;
    }
}
