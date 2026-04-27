package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class j12 {

    /* JADX INFO: renamed from: a */
    public bde f49322a;

    /* JADX INFO: renamed from: b */
    public sog f49323b;

    /* JADX INFO: renamed from: c */
    public j74 f49324c;

    /* JADX INFO: renamed from: d */
    public final Runnable f49325d;

    public j12(bde bdeVar, sog sogVar, j74 j74Var, Runnable runnable) {
        this.f49322a = bdeVar;
        this.f49323b = sogVar;
        this.f49324c = j74Var;
        this.f49325d = runnable;
    }

    private void runAfters() {
        Iterator<Method> it = this.f49323b.m22164a().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(null, null);
            } catch (InvocationTargetException e) {
                m13671a(e.getTargetException());
            } catch (Throwable th) {
                m13671a(th);
            }
        }
    }

    private void runBefores() throws cp5 {
        try {
            try {
                Iterator<Method> it = this.f49323b.m22165b().iterator();
                while (it.hasNext()) {
                    it.next().invoke(null, null);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (g90 unused) {
            throw new cp5();
        } catch (Throwable th) {
            m13671a(th);
            throw new cp5();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13671a(Throwable th) {
        this.f49322a.fireTestFailure(new fp5(this.f49324c, th));
    }

    /* JADX INFO: renamed from: b */
    public void m13672b() {
        this.f49325d.run();
    }

    public void runProtected() {
        try {
            runBefores();
            m13672b();
        } catch (cp5 unused) {
        } catch (Throwable th) {
            runAfters();
            throw th;
        }
        runAfters();
    }
}
