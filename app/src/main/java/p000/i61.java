package p000;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p000.oog;

/* JADX INFO: loaded from: classes8.dex */
public class i61 extends ehc<ow6> {

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap<ow6, j74> f45817f;

    /* JADX INFO: renamed from: i61$a */
    public class C7157a extends zvd {
        public C7157a() throws Exception {
        }

        @Override // p000.zvd
        /* JADX INFO: renamed from: a */
        public Object mo12819a() throws Throwable {
            return i61.this.createTest();
        }
    }

    public i61(Class<?> cls) throws o18 {
        super(cls);
        this.f45817f = new ConcurrentHashMap<>();
    }

    private boolean expectsException(oog oogVar) {
        return getExpectedException(oogVar) != null;
    }

    private Class<? extends Throwable> getExpectedException(oog oogVar) {
        if (oogVar == null || oogVar.expected() == oog.C10486a.class) {
            return null;
        }
        return oogVar.expected();
    }

    private List<wua> getMethodRules(Object obj) {
        return m12815w(obj);
    }

    private long getTimeout(oog oogVar) {
        if (oogVar == null) {
            return 0L;
        }
        return oogVar.timeout();
    }

    private boolean hasOneConstructor() {
        return getTestClass().getJavaClass().getConstructors().length == 1;
    }

    private void validateMethods(List<Throwable> list) {
        pce.f70335g.validate(getTestClass(), list);
    }

    private f3g withMethodRules(ow6 ow6Var, List<fpg> list, Object obj, f3g f3gVar) {
        for (wua wuaVar : getMethodRules(obj)) {
            if (!list.contains(wuaVar)) {
                f3gVar = wuaVar.apply(f3gVar, ow6Var, obj);
            }
        }
        return f3gVar;
    }

    private f3g withRules(ow6 ow6Var, Object obj, f3g f3gVar) {
        List<fpg> listM12811s = m12811s(obj);
        return withTestRules(ow6Var, listM12811s, withMethodRules(ow6Var, listM12811s, obj, f3gVar));
    }

    private f3g withTestRules(ow6 ow6Var, List<fpg> list, f3g f3gVar) {
        return list.isEmpty() ? f3gVar : new hde(f3gVar, list, mo9125g(ow6Var));
    }

    /* JADX INFO: renamed from: A */
    public void mo12800A(List<Throwable> list) {
        pce.f70333e.validate(getTestClass(), list);
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public void m12801B(List<Throwable> list) {
        m9987n(InterfaceC4798dj.class, false, list);
        m9987n(kx0.class, false, list);
        mo12804E(list);
        if (mo12809q().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m12802C(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass()) {
            list.add(new Exception("The inner class " + getTestClass().getName() + " is not static."));
        }
    }

    /* JADX INFO: renamed from: D */
    public void m12803D(List<Throwable> list) {
        if (hasOneConstructor()) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public constructor"));
    }

    /* JADX INFO: renamed from: E */
    public void mo12804E(List<Throwable> list) {
        m9987n(oog.class, false, list);
    }

    /* JADX INFO: renamed from: F */
    public void m12805F(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass() || !hasOneConstructor() || getTestClass().getOnlyConstructor().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    /* JADX INFO: renamed from: G */
    public f3g m12806G(ow6 ow6Var, Object obj, f3g f3gVar) {
        List<ow6> annotatedMethods = getTestClass().getAnnotatedMethods(InterfaceC4798dj.class);
        return annotatedMethods.isEmpty() ? f3gVar : new tce(f3gVar, annotatedMethods, obj);
    }

    /* JADX INFO: renamed from: H */
    public f3g m12807H(ow6 ow6Var, Object obj, f3g f3gVar) {
        List<ow6> annotatedMethods = getTestClass().getAnnotatedMethods(kx0.class);
        return annotatedMethods.isEmpty() ? f3gVar : new yce(f3gVar, annotatedMethods, obj);
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public f3g m12808I(ow6 ow6Var, Object obj, f3g f3gVar) {
        long timeout = getTimeout((oog) ow6Var.getAnnotation(oog.class));
        return timeout <= 0 ? f3gVar : bp5.builder().withTimeout(timeout, TimeUnit.MILLISECONDS).build(f3gVar);
    }

    public Object createTest() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(null);
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: e */
    public void mo9981e(List<Throwable> list) {
        super.mo9981e(list);
        m12802C(list);
        mo12818z(list);
        m12801B(list);
        mo12800A(list);
        validateMethods(list);
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: h */
    public List<ow6> mo9126h() {
        return mo12809q();
    }

    public f3g methodBlock(ow6 ow6Var) {
        try {
            Object objRun = new C7157a().run();
            return withRules(ow6Var, objRun, m12806G(ow6Var, objRun, m12807H(ow6Var, objRun, m12808I(ow6Var, objRun, m12814v(ow6Var, objRun, mo12813u(ow6Var, objRun))))));
        } catch (Throwable th) {
            return new ap5(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public List<ow6> mo12809q() {
        return getTestClass().getAnnotatedMethods(oog.class);
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j74 mo9125g(ow6 ow6Var) {
        j74 j74Var = this.f45817f.get(ow6Var);
        if (j74Var != null) {
            return j74Var;
        }
        j74 j74VarCreateTestDescription = j74.createTestDescription(getTestClass().getJavaClass(), mo12817y(ow6Var), ow6Var.getAnnotations());
        this.f45817f.putIfAbsent(ow6Var, j74VarCreateTestDescription);
        return j74VarCreateTestDescription;
    }

    /* JADX INFO: renamed from: s */
    public List<fpg> m12811s(Object obj) {
        List<fpg> annotatedMethodValues = getTestClass().getAnnotatedMethodValues(obj, nce.class, fpg.class);
        annotatedMethodValues.addAll(getTestClass().getAnnotatedFieldValues(obj, nce.class, fpg.class));
        return annotatedMethodValues;
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo9985k(ow6 ow6Var) {
        return ow6Var.getAnnotation(rr7.class) != null;
    }

    /* JADX INFO: renamed from: u */
    public f3g mo12813u(ow6 ow6Var, Object obj) {
        return new we8(ow6Var, obj);
    }

    /* JADX INFO: renamed from: v */
    public f3g m12814v(ow6 ow6Var, Object obj, f3g f3gVar) {
        oog oogVar = (oog) ow6Var.getAnnotation(oog.class);
        return expectsException(oogVar) ? new yf5(f3gVar, getExpectedException(oogVar)) : f3gVar;
    }

    /* JADX INFO: renamed from: w */
    public List<wua> m12815w(Object obj) {
        List<wua> annotatedMethodValues = getTestClass().getAnnotatedMethodValues(obj, nce.class, wua.class);
        annotatedMethodValues.addAll(getTestClass().getAnnotatedFieldValues(obj, nce.class, wua.class));
        return annotatedMethodValues;
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo9127l(ow6 ow6Var, bde bdeVar) {
        j74 j74VarMo9125g = mo9125g(ow6Var);
        if (mo9985k(ow6Var)) {
            bdeVar.fireTestIgnored(j74VarMo9125g);
        } else {
            m9986m(methodBlock(ow6Var), j74VarMo9125g, bdeVar);
        }
    }

    /* JADX INFO: renamed from: y */
    public String mo12817y(ow6 ow6Var) {
        return ow6Var.getName();
    }

    /* JADX INFO: renamed from: z */
    public void mo12818z(List<Throwable> list) {
        m12803D(list);
        m12805F(list);
    }
}
