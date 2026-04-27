package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class qdg implements jj9 {

    /* JADX INFO: renamed from: a */
    public final String f74088a;

    /* JADX INFO: renamed from: b */
    public volatile jj9 f74089b;

    /* JADX INFO: renamed from: c */
    public Boolean f74090c;

    /* JADX INFO: renamed from: d */
    public Method f74091d;

    /* JADX INFO: renamed from: e */
    public q65 f74092e;

    /* JADX INFO: renamed from: f */
    public Queue<sdg> f74093f;

    /* JADX INFO: renamed from: m */
    public final boolean f74094m;

    public qdg(String str, Queue<sdg> queue, boolean z) {
        this.f74088a = str;
        this.f74093f = queue;
        this.f74094m = z;
    }

    private jj9 getEventRecordingLogger() {
        if (this.f74092e == null) {
            this.f74092e = new q65(this, this.f74093f);
        }
        return this.f74092e;
    }

    /* JADX INFO: renamed from: a */
    public jj9 m20267a() {
        return this.f74089b != null ? this.f74089b : this.f74094m ? i8b.f46043b : getEventRecordingLogger();
    }

    @Override // p000.jj9
    public void debug(String str) {
        m20267a().debug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f74088a.equals(((qdg) obj).f74088a);
    }

    @Override // p000.jj9
    public void error(String str) {
        m20267a().error(str);
    }

    @Override // p000.jj9
    public String getName() {
        return this.f74088a;
    }

    public int hashCode() {
        return this.f74088a.hashCode();
    }

    @Override // p000.jj9
    public void info(String str) {
        m20267a().info(str);
    }

    @Override // p000.jj9
    public boolean isDebugEnabled() {
        return m20267a().isDebugEnabled();
    }

    public boolean isDelegateEventAware() {
        Boolean bool = this.f74090c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f74091d = this.f74089b.getClass().getMethod("log", uj9.class);
            this.f74090c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f74090c = Boolean.FALSE;
        }
        return this.f74090c.booleanValue();
    }

    public boolean isDelegateNOP() {
        return this.f74089b instanceof i8b;
    }

    public boolean isDelegateNull() {
        return this.f74089b == null;
    }

    @Override // p000.jj9
    public boolean isErrorEnabled() {
        return m20267a().isErrorEnabled();
    }

    @Override // p000.jj9
    public boolean isInfoEnabled() {
        return m20267a().isInfoEnabled();
    }

    @Override // p000.jj9
    public boolean isTraceEnabled() {
        return m20267a().isTraceEnabled();
    }

    @Override // p000.jj9
    public boolean isWarnEnabled() {
        return m20267a().isWarnEnabled();
    }

    public void log(uj9 uj9Var) {
        if (isDelegateEventAware()) {
            try {
                this.f74091d.invoke(this.f74089b, uj9Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void setDelegate(jj9 jj9Var) {
        this.f74089b = jj9Var;
    }

    @Override // p000.jj9
    public void trace(String str) {
        m20267a().trace(str);
    }

    @Override // p000.jj9
    public void warn(String str) {
        m20267a().warn(str);
    }

    @Override // p000.jj9
    public void debug(String str, Object obj) {
        m20267a().debug(str, obj);
    }

    @Override // p000.jj9
    public void error(String str, Object obj) {
        m20267a().error(str, obj);
    }

    @Override // p000.jj9
    public void info(String str, Object obj) {
        m20267a().info(str, obj);
    }

    @Override // p000.jj9
    public boolean isDebugEnabled(du9 du9Var) {
        return m20267a().isDebugEnabled(du9Var);
    }

    @Override // p000.jj9
    public boolean isErrorEnabled(du9 du9Var) {
        return m20267a().isErrorEnabled(du9Var);
    }

    @Override // p000.jj9
    public boolean isInfoEnabled(du9 du9Var) {
        return m20267a().isInfoEnabled(du9Var);
    }

    @Override // p000.jj9
    public boolean isTraceEnabled(du9 du9Var) {
        return m20267a().isTraceEnabled(du9Var);
    }

    @Override // p000.jj9
    public boolean isWarnEnabled(du9 du9Var) {
        return m20267a().isWarnEnabled(du9Var);
    }

    @Override // p000.jj9
    public void trace(String str, Object obj) {
        m20267a().trace(str, obj);
    }

    @Override // p000.jj9
    public void warn(String str, Object obj) {
        m20267a().warn(str, obj);
    }

    @Override // p000.jj9
    public void debug(String str, Object obj, Object obj2) {
        m20267a().debug(str, obj, obj2);
    }

    @Override // p000.jj9
    public void error(String str, Object obj, Object obj2) {
        m20267a().error(str, obj, obj2);
    }

    @Override // p000.jj9
    public void info(String str, Object obj, Object obj2) {
        m20267a().info(str, obj, obj2);
    }

    @Override // p000.jj9
    public void trace(String str, Object obj, Object obj2) {
        m20267a().trace(str, obj, obj2);
    }

    @Override // p000.jj9
    public void warn(String str, Object obj, Object obj2) {
        m20267a().warn(str, obj, obj2);
    }

    @Override // p000.jj9
    public void debug(String str, Object... objArr) {
        m20267a().debug(str, objArr);
    }

    @Override // p000.jj9
    public void error(String str, Object... objArr) {
        m20267a().error(str, objArr);
    }

    @Override // p000.jj9
    public void info(String str, Object... objArr) {
        m20267a().info(str, objArr);
    }

    @Override // p000.jj9
    public void trace(String str, Object... objArr) {
        m20267a().trace(str, objArr);
    }

    @Override // p000.jj9
    public void warn(String str, Object... objArr) {
        m20267a().warn(str, objArr);
    }

    @Override // p000.jj9
    public void debug(String str, Throwable th) {
        m20267a().debug(str, th);
    }

    @Override // p000.jj9
    public void error(String str, Throwable th) {
        m20267a().error(str, th);
    }

    @Override // p000.jj9
    public void info(String str, Throwable th) {
        m20267a().info(str, th);
    }

    @Override // p000.jj9
    public void trace(String str, Throwable th) {
        m20267a().trace(str, th);
    }

    @Override // p000.jj9
    public void warn(String str, Throwable th) {
        m20267a().warn(str, th);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str) {
        m20267a().debug(du9Var, str);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str) {
        m20267a().error(du9Var, str);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str) {
        m20267a().info(du9Var, str);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str) {
        m20267a().trace(du9Var, str);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str) {
        m20267a().warn(du9Var, str);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object obj) {
        m20267a().debug(du9Var, str, obj);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object obj) {
        m20267a().error(du9Var, str, obj);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object obj) {
        m20267a().info(du9Var, str, obj);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object obj) {
        m20267a().trace(du9Var, str, obj);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object obj) {
        m20267a().warn(du9Var, str, obj);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object obj, Object obj2) {
        m20267a().debug(du9Var, str, obj, obj2);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object obj, Object obj2) {
        m20267a().error(du9Var, str, obj, obj2);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object obj, Object obj2) {
        m20267a().info(du9Var, str, obj, obj2);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object obj, Object obj2) {
        m20267a().trace(du9Var, str, obj, obj2);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object obj, Object obj2) {
        m20267a().warn(du9Var, str, obj, obj2);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object... objArr) {
        m20267a().debug(du9Var, str, objArr);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object... objArr) {
        m20267a().error(du9Var, str, objArr);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object... objArr) {
        m20267a().info(du9Var, str, objArr);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object... objArr) {
        m20267a().trace(du9Var, str, objArr);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object... objArr) {
        m20267a().warn(du9Var, str, objArr);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Throwable th) {
        m20267a().debug(du9Var, str, th);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Throwable th) {
        m20267a().error(du9Var, str, th);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Throwable th) {
        m20267a().info(du9Var, str, th);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Throwable th) {
        m20267a().trace(du9Var, str, th);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Throwable th) {
        m20267a().warn(du9Var, str, th);
    }
}
