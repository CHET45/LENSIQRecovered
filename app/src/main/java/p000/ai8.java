package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class ai8 extends tde implements zu5, jvf {

    /* JADX INFO: renamed from: a */
    public final List<Method> f1647a = m606d();

    /* JADX INFO: renamed from: b */
    public sog f1648b;

    /* JADX INFO: renamed from: ai8$a */
    public class RunnableC0261a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bde f1649a;

        public RunnableC0261a(bde bdeVar) {
            this.f1649a = bdeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ai8.this.m609g(this.f1649a);
        }
    }

    /* JADX INFO: renamed from: ai8$b */
    public class C0262b implements Comparator<Method> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ svf f1651a;

        public C0262b(svf svfVar) {
            this.f1651a = svfVar;
        }

        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            return this.f1651a.compare(ai8.this.m608f(method), ai8.this.m608f(method2));
        }
    }

    public ai8(Class<?> cls) throws p18 {
        this.f1648b = new sog(cls);
        validate();
    }

    private void testAborted(bde bdeVar, j74 j74Var, Throwable th) {
        bdeVar.fireTestStarted(j74Var);
        bdeVar.fireTestFailure(new fp5(j74Var, th));
        bdeVar.fireTestFinished(j74Var);
    }

    /* JADX INFO: renamed from: a */
    public Annotation[] m603a() {
        return this.f1648b.getJavaClass().getAnnotations();
    }

    /* JADX INFO: renamed from: b */
    public String m604b() {
        return m605c().getName();
    }

    /* JADX INFO: renamed from: c */
    public sog m605c() {
        return this.f1648b;
    }

    public Object createTest() throws Exception {
        return m605c().getConstructor().newInstance(null);
    }

    /* JADX INFO: renamed from: d */
    public List<Method> m606d() {
        return this.f1648b.getTestMethods();
    }

    /* JADX INFO: renamed from: e */
    public void m607e(Method method, bde bdeVar) {
        j74 j74VarM608f = m608f(method);
        try {
            new vua(createTest(), m612j(method), bdeVar, j74VarM608f).run();
        } catch (InvocationTargetException e) {
            testAborted(bdeVar, j74VarM608f, e.getCause());
        } catch (Exception e2) {
            testAborted(bdeVar, j74VarM608f, e2);
        }
    }

    /* JADX INFO: renamed from: f */
    public j74 m608f(Method method) {
        return j74.createTestDescription(m605c().getJavaClass(), m611i(method), m610h(method));
    }

    @Override // p000.zu5
    public void filter(ru5 ru5Var) throws aeb {
        Iterator<Method> it = this.f1647a.iterator();
        while (it.hasNext()) {
            if (!ru5Var.shouldRun(m608f(it.next()))) {
                it.remove();
            }
        }
        if (this.f1647a.isEmpty()) {
            throw new aeb();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m609g(bde bdeVar) {
        Iterator<Method> it = this.f1647a.iterator();
        while (it.hasNext()) {
            m607e(it.next(), bdeVar);
        }
    }

    @Override // p000.tde, p000.g74
    public j74 getDescription() {
        j74 j74VarCreateSuiteDescription = j74.createSuiteDescription(m604b(), m603a());
        Iterator<Method> it = this.f1647a.iterator();
        while (it.hasNext()) {
            j74VarCreateSuiteDescription.addChild(m608f(it.next()));
        }
        return j74VarCreateSuiteDescription;
    }

    /* JADX INFO: renamed from: h */
    public Annotation[] m610h(Method method) {
        return method.getAnnotations();
    }

    /* JADX INFO: renamed from: i */
    public String m611i(Method method) {
        return method.getName();
    }

    /* JADX INFO: renamed from: j */
    public yog m612j(Method method) {
        return new yog(method, this.f1648b);
    }

    @Override // p000.tde
    public void run(bde bdeVar) {
        new j12(bdeVar, this.f1648b, getDescription(), new RunnableC0261a(bdeVar)).runProtected();
    }

    @Override // p000.jvf
    public void sort(svf svfVar) {
        Collections.sort(this.f1647a, new C0262b(svfVar));
    }

    public void validate() throws p18 {
        bva bvaVar = new bva(this.f1648b);
        bvaVar.validateMethodsForDefaultRunner();
        bvaVar.assertValid();
    }
}
