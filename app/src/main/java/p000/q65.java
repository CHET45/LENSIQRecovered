package p000;

import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
public class q65 implements jj9 {

    /* JADX INFO: renamed from: a */
    public String f73320a;

    /* JADX INFO: renamed from: b */
    public qdg f73321b;

    /* JADX INFO: renamed from: c */
    public Queue<sdg> f73322c;

    public q65(qdg qdgVar, Queue<sdg> queue) {
        this.f73321b = qdgVar;
        this.f73320a = qdgVar.getName();
        this.f73322c = queue;
    }

    private void recordEvent(k49 k49Var, String str, Object[] objArr, Throwable th) {
        recordEvent(k49Var, null, str, objArr, th);
    }

    @Override // p000.jj9
    public void debug(String str) {
        recordEvent(k49.TRACE, str, null, null);
    }

    @Override // p000.jj9
    public void error(String str) {
        recordEvent(k49.ERROR, str, null, null);
    }

    @Override // p000.jj9
    public String getName() {
        return this.f73320a;
    }

    @Override // p000.jj9
    public void info(String str) {
        recordEvent(k49.INFO, str, null, null);
    }

    @Override // p000.jj9
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // p000.jj9
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // p000.jj9
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // p000.jj9
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // p000.jj9
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // p000.jj9
    public void trace(String str) {
        recordEvent(k49.TRACE, str, null, null);
    }

    @Override // p000.jj9
    public void warn(String str) {
        recordEvent(k49.WARN, str, null, null);
    }

    private void recordEvent(k49 k49Var, du9 du9Var, String str, Object[] objArr, Throwable th) {
        sdg sdgVar = new sdg();
        sdgVar.setTimeStamp(System.currentTimeMillis());
        sdgVar.setLevel(k49Var);
        sdgVar.setLogger(this.f73321b);
        sdgVar.setLoggerName(this.f73320a);
        sdgVar.setMarker(du9Var);
        sdgVar.setMessage(str);
        sdgVar.setArgumentArray(objArr);
        sdgVar.setThrowable(th);
        sdgVar.setThreadName(Thread.currentThread().getName());
        this.f73322c.add(sdgVar);
    }

    @Override // p000.jj9
    public void debug(String str, Object obj) {
        recordEvent(k49.DEBUG, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void error(String str, Object obj) {
        recordEvent(k49.ERROR, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void info(String str, Object obj) {
        recordEvent(k49.INFO, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public boolean isDebugEnabled(du9 du9Var) {
        return true;
    }

    @Override // p000.jj9
    public boolean isErrorEnabled(du9 du9Var) {
        return true;
    }

    @Override // p000.jj9
    public boolean isInfoEnabled(du9 du9Var) {
        return true;
    }

    @Override // p000.jj9
    public boolean isTraceEnabled(du9 du9Var) {
        return true;
    }

    @Override // p000.jj9
    public boolean isWarnEnabled(du9 du9Var) {
        return true;
    }

    @Override // p000.jj9
    public void trace(String str, Object obj) {
        recordEvent(k49.TRACE, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void warn(String str, Object obj) {
        recordEvent(k49.WARN, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void debug(String str, Object obj, Object obj2) {
        recordEvent(k49.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void error(String str, Object obj, Object obj2) {
        recordEvent(k49.ERROR, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void info(String str, Object obj, Object obj2) {
        recordEvent(k49.INFO, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void trace(String str, Object obj, Object obj2) {
        recordEvent(k49.TRACE, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void warn(String str, Object obj, Object obj2) {
        recordEvent(k49.WARN, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void debug(String str, Object... objArr) {
        recordEvent(k49.DEBUG, str, objArr, null);
    }

    @Override // p000.jj9
    public void error(String str, Object... objArr) {
        recordEvent(k49.ERROR, str, objArr, null);
    }

    @Override // p000.jj9
    public void info(String str, Object... objArr) {
        recordEvent(k49.INFO, str, objArr, null);
    }

    @Override // p000.jj9
    public void trace(String str, Object... objArr) {
        recordEvent(k49.TRACE, str, objArr, null);
    }

    @Override // p000.jj9
    public void warn(String str, Object... objArr) {
        recordEvent(k49.WARN, str, objArr, null);
    }

    @Override // p000.jj9
    public void debug(String str, Throwable th) {
        recordEvent(k49.DEBUG, str, null, th);
    }

    @Override // p000.jj9
    public void error(String str, Throwable th) {
        recordEvent(k49.ERROR, str, null, th);
    }

    @Override // p000.jj9
    public void info(String str, Throwable th) {
        recordEvent(k49.INFO, str, null, th);
    }

    @Override // p000.jj9
    public void trace(String str, Throwable th) {
        recordEvent(k49.TRACE, str, null, th);
    }

    @Override // p000.jj9
    public void warn(String str, Throwable th) {
        recordEvent(k49.WARN, str, null, th);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str) {
        recordEvent(k49.DEBUG, du9Var, str, null, null);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str) {
        recordEvent(k49.ERROR, du9Var, str, null, null);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str) {
        recordEvent(k49.INFO, du9Var, str, null, null);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str) {
        recordEvent(k49.TRACE, du9Var, str, null, null);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str) {
        recordEvent(k49.WARN, str, null, null);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object obj) {
        recordEvent(k49.DEBUG, du9Var, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object obj) {
        recordEvent(k49.ERROR, du9Var, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object obj) {
        recordEvent(k49.INFO, du9Var, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object obj) {
        recordEvent(k49.TRACE, du9Var, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object obj) {
        recordEvent(k49.WARN, str, new Object[]{obj}, null);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object obj, Object obj2) {
        recordEvent(k49.DEBUG, du9Var, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object obj, Object obj2) {
        recordEvent(k49.ERROR, du9Var, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object obj, Object obj2) {
        recordEvent(k49.INFO, du9Var, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object obj, Object obj2) {
        recordEvent(k49.TRACE, du9Var, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object obj, Object obj2) {
        recordEvent(k49.WARN, du9Var, str, new Object[]{obj, obj2}, null);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Object... objArr) {
        recordEvent(k49.DEBUG, du9Var, str, objArr, null);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Object... objArr) {
        recordEvent(k49.ERROR, du9Var, str, objArr, null);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Object... objArr) {
        recordEvent(k49.INFO, du9Var, str, objArr, null);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Object... objArr) {
        recordEvent(k49.TRACE, du9Var, str, objArr, null);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Object... objArr) {
        recordEvent(k49.WARN, du9Var, str, objArr, null);
    }

    @Override // p000.jj9
    public void debug(du9 du9Var, String str, Throwable th) {
        recordEvent(k49.DEBUG, du9Var, str, null, th);
    }

    @Override // p000.jj9
    public void error(du9 du9Var, String str, Throwable th) {
        recordEvent(k49.ERROR, du9Var, str, null, th);
    }

    @Override // p000.jj9
    public void info(du9 du9Var, String str, Throwable th) {
        recordEvent(k49.INFO, du9Var, str, null, th);
    }

    @Override // p000.jj9
    public void trace(du9 du9Var, String str, Throwable th) {
        recordEvent(k49.TRACE, du9Var, str, null, th);
    }

    @Override // p000.jj9
    public void warn(du9 du9Var, String str, Throwable th) {
        recordEvent(k49.WARN, du9Var, str, null, th);
    }
}
