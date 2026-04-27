package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ehc<T> extends tde implements zu5, jvf {

    /* JADX INFO: renamed from: e */
    public static final List<tog> f33041e = Arrays.asList(new C14843wz(), new ijd());

    /* JADX INFO: renamed from: b */
    public final rog f33043b;

    /* JADX INFO: renamed from: a */
    public final Object f33042a = new Object();

    /* JADX INFO: renamed from: c */
    public volatile Collection<T> f33044c = null;

    /* JADX INFO: renamed from: d */
    public volatile vde f33045d = new C5314a();

    /* JADX INFO: renamed from: ehc$a */
    public class C5314a implements vde {
        public C5314a() {
        }

        @Override // p000.vde
        public void finished() {
        }

        @Override // p000.vde
        public void schedule(Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ehc$b */
    public class C5315b extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bde f33047a;

        public C5315b(bde bdeVar) {
            this.f33047a = bdeVar;
        }

        @Override // p000.f3g
        public void evaluate() {
            ehc.this.runChildren(this.f33047a);
        }
    }

    /* JADX INFO: renamed from: ehc$c */
    public class RunnableC5316c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f33049a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bde f33050b;

        public RunnableC5316c(Object obj, bde bdeVar) {
            this.f33049a = obj;
            this.f33050b = bdeVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            ehc.this.mo9127l(this.f33049a, this.f33050b);
        }
    }

    /* JADX INFO: renamed from: ehc$d */
    public class C5317d implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ svf f33052a;

        public C5317d(svf svfVar) {
            this.f33052a = svfVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return this.f33052a.compare(ehc.this.mo9125g(t), ehc.this.mo9125g(t2));
        }
    }

    public ehc(Class<?> cls) throws o18 {
        this.f33043b = m9982f(cls);
        validate();
    }

    private void applyValidators(List<Throwable> list) {
        if (getTestClass().getJavaClass() != null) {
            Iterator<tog> it = f33041e.iterator();
            while (it.hasNext()) {
                list.addAll(it.next().validateTestClass(getTestClass()));
            }
        }
    }

    private boolean areAllChildrenIgnored() {
        Iterator<T> it = getFilteredChildren().iterator();
        while (it.hasNext()) {
            if (!mo9985k(it.next())) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> comparator(svf svfVar) {
        return new C5317d(svfVar);
    }

    private Collection<T> getFilteredChildren() {
        if (this.f33044c == null) {
            synchronized (this.f33042a) {
                try {
                    if (this.f33044c == null) {
                        this.f33044c = Collections.unmodifiableCollection(mo9126h());
                    }
                } finally {
                }
            }
        }
        return this.f33044c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runChildren(bde bdeVar) {
        vde vdeVar = this.f33045d;
        try {
            Iterator<T> it = getFilteredChildren().iterator();
            while (it.hasNext()) {
                vdeVar.schedule(new RunnableC5316c(it.next(), bdeVar));
            }
        } finally {
            vdeVar.finished();
        }
    }

    private boolean shouldRun(ru5 ru5Var, T t) {
        return ru5Var.shouldRun(mo9125g(t));
    }

    private void validate() throws o18 {
        ArrayList arrayList = new ArrayList();
        mo9981e(arrayList);
        if (!arrayList.isEmpty()) {
            throw new o18(arrayList);
        }
    }

    private void validateClassRules(List<Throwable> list) {
        pce.f70332d.validate(getTestClass(), list);
        pce.f70334f.validate(getTestClass(), list);
    }

    private f3g withClassRules(f3g f3gVar) {
        List<fpg> listM9980d = m9980d();
        return listM9980d.isEmpty() ? f3gVar : new hde(f3gVar, listM9980d, getDescription());
    }

    /* JADX INFO: renamed from: b */
    public f3g m9978b(bde bdeVar) {
        return new C5315b(bdeVar);
    }

    /* JADX INFO: renamed from: c */
    public f3g mo9979c(bde bdeVar) {
        f3g f3gVarM9978b = m9978b(bdeVar);
        return !areAllChildrenIgnored() ? withClassRules(m9988o(m9989p(f3gVarM9978b))) : f3gVarM9978b;
    }

    /* JADX INFO: renamed from: d */
    public List<fpg> m9980d() {
        List<fpg> annotatedMethodValues = this.f33043b.getAnnotatedMethodValues(null, k12.class, fpg.class);
        annotatedMethodValues.addAll(this.f33043b.getAnnotatedFieldValues(null, k12.class, fpg.class));
        return annotatedMethodValues;
    }

    /* JADX INFO: renamed from: e */
    public void mo9981e(List<Throwable> list) {
        m9987n(lx0.class, true, list);
        m9987n(InterfaceC5330ej.class, true, list);
        validateClassRules(list);
        applyValidators(list);
    }

    /* JADX INFO: renamed from: f */
    public rog m9982f(Class<?> cls) {
        return new rog(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zu5
    public void filter(ru5 ru5Var) throws aeb {
        synchronized (this.f33042a) {
            ArrayList arrayList = new ArrayList(getFilteredChildren());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (shouldRun(ru5Var, next)) {
                    try {
                        ru5Var.apply(next);
                    } catch (aeb unused) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.f33044c = Collections.unmodifiableCollection(arrayList);
            if (this.f33044c.isEmpty()) {
                throw new aeb();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract j74 mo9125g(T t);

    @Override // p000.tde, p000.g74
    public j74 getDescription() {
        j74 j74VarCreateSuiteDescription = j74.createSuiteDescription(mo9983i(), mo9984j());
        Iterator<T> it = getFilteredChildren().iterator();
        while (it.hasNext()) {
            j74VarCreateSuiteDescription.addChild(mo9125g(it.next()));
        }
        return j74VarCreateSuiteDescription;
    }

    public final rog getTestClass() {
        return this.f33043b;
    }

    /* JADX INFO: renamed from: h */
    public abstract List<T> mo9126h();

    /* JADX INFO: renamed from: i */
    public String mo9983i() {
        return this.f33043b.getName();
    }

    /* JADX INFO: renamed from: j */
    public Annotation[] mo9984j() {
        return this.f33043b.getAnnotations();
    }

    /* JADX INFO: renamed from: k */
    public boolean mo9985k(T t) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo9127l(T t, bde bdeVar);

    /* JADX INFO: renamed from: m */
    public final void m9986m(f3g f3gVar, j74 j74Var, bde bdeVar) {
        fv4 fv4Var = new fv4(bdeVar, j74Var);
        fv4Var.fireTestStarted();
        try {
            try {
                try {
                    f3gVar.evaluate();
                } finally {
                }
            } catch (g90 e) {
                fv4Var.addFailedAssumption(e);
            }
            fv4Var.fireTestFinished();
        } catch (Throwable th) {
            fv4Var.fireTestFinished();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9987n(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        Iterator<ow6> it = getTestClass().getAnnotatedMethods(cls).iterator();
        while (it.hasNext()) {
            it.next().validatePublicVoidNoArg(z, list);
        }
    }

    /* JADX INFO: renamed from: o */
    public f3g m9988o(f3g f3gVar) {
        List<ow6> annotatedMethods = this.f33043b.getAnnotatedMethods(InterfaceC5330ej.class);
        return annotatedMethods.isEmpty() ? f3gVar : new tce(f3gVar, annotatedMethods, null);
    }

    /* JADX INFO: renamed from: p */
    public f3g m9989p(f3g f3gVar) {
        List<ow6> annotatedMethods = this.f33043b.getAnnotatedMethods(lx0.class);
        return annotatedMethods.isEmpty() ? f3gVar : new yce(f3gVar, annotatedMethods, null);
    }

    @Override // p000.tde
    public void run(bde bdeVar) {
        fv4 fv4Var = new fv4(bdeVar, getDescription());
        try {
            mo9979c(bdeVar).evaluate();
        } catch (c5g e) {
            throw e;
        } catch (g90 e2) {
            fv4Var.addFailedAssumption(e2);
        } catch (Throwable th) {
            fv4Var.addFailure(th);
        }
    }

    public void setScheduler(vde vdeVar) {
        this.f33045d = vdeVar;
    }

    @Override // p000.jvf
    public void sort(svf svfVar) {
        synchronized (this.f33042a) {
            try {
                Iterator<T> it = getFilteredChildren().iterator();
                while (it.hasNext()) {
                    svfVar.apply(it.next());
                }
                ArrayList arrayList = new ArrayList(getFilteredChildren());
                Collections.sort(arrayList, comparator(svfVar));
                this.f33044c = Collections.unmodifiableCollection(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
