package p000;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes8.dex */
public class wh8 extends tde implements zu5, jvf {

    /* JADX INFO: renamed from: a */
    public volatile pog f94261a;

    /* JADX INFO: renamed from: wh8$b */
    public static final class C14604b implements xog {

        /* JADX INFO: renamed from: a */
        public final bde f94262a;

        private j74 asDescription(pog pogVar) {
            return pogVar instanceof g74 ? ((g74) pogVar).getDescription() : j74.createTestDescription(getEffectiveClass(pogVar), getName(pogVar));
        }

        private Class<? extends pog> getEffectiveClass(pog pogVar) {
            return pogVar.getClass();
        }

        private String getName(pog pogVar) {
            return pogVar instanceof qog ? ((qog) pogVar).getName() : pogVar.toString();
        }

        @Override // p000.xog
        public void addError(pog pogVar, Throwable th) {
            this.f94262a.fireTestFailure(new fp5(asDescription(pogVar), th));
        }

        @Override // p000.xog
        public void addFailure(pog pogVar, t80 t80Var) {
            addError(pogVar, t80Var);
        }

        @Override // p000.xog
        public void endTest(pog pogVar) {
            this.f94262a.fireTestFinished(asDescription(pogVar));
        }

        @Override // p000.xog
        public void startTest(pog pogVar) {
            this.f94262a.fireTestStarted(asDescription(pogVar));
        }

        private C14604b(bde bdeVar) {
            this.f94262a = bdeVar;
        }
    }

    public wh8(Class<?> cls) {
        this(new npg(cls.asSubclass(qog.class)));
    }

    private static String createSuiteDescription(npg npgVar) {
        int iCountTestCases = npgVar.countTestCases();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iCountTestCases), iCountTestCases == 0 ? "" : String.format(" [example: %s]", npgVar.testAt(0)));
    }

    private static Annotation[] getAnnotations(qog qogVar) {
        try {
            return qogVar.getClass().getMethod(qogVar.getName(), null).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private pog getTest() {
        return this.f94261a;
    }

    private static j74 makeDescription(pog pogVar) {
        if (pogVar instanceof qog) {
            qog qogVar = (qog) pogVar;
            return j74.createTestDescription(qogVar.getClass(), qogVar.getName(), getAnnotations(qogVar));
        }
        if (!(pogVar instanceof npg)) {
            return pogVar instanceof g74 ? ((g74) pogVar).getDescription() : pogVar instanceof vog ? makeDescription(((vog) pogVar).getTest()) : j74.createSuiteDescription(pogVar.getClass());
        }
        npg npgVar = (npg) pogVar;
        j74 j74VarCreateSuiteDescription = j74.createSuiteDescription(npgVar.getName() == null ? createSuiteDescription(npgVar) : npgVar.getName(), new Annotation[0]);
        int iTestCount = npgVar.testCount();
        for (int i = 0; i < iTestCount; i++) {
            j74VarCreateSuiteDescription.addChild(makeDescription(npgVar.testAt(i)));
        }
        return j74VarCreateSuiteDescription;
    }

    private void setTest(pog pogVar) {
        this.f94261a = pogVar;
    }

    public xog createAdaptingListener(bde bdeVar) {
        return new C14604b(bdeVar);
    }

    @Override // p000.zu5
    public void filter(ru5 ru5Var) throws aeb {
        if (getTest() instanceof zu5) {
            ((zu5) getTest()).filter(ru5Var);
            return;
        }
        if (getTest() instanceof npg) {
            npg npgVar = (npg) getTest();
            npg npgVar2 = new npg(npgVar.getName());
            int iTestCount = npgVar.testCount();
            for (int i = 0; i < iTestCount; i++) {
                pog pogVarTestAt = npgVar.testAt(i);
                if (ru5Var.shouldRun(makeDescription(pogVarTestAt))) {
                    npgVar2.addTest(pogVarTestAt);
                }
            }
            setTest(npgVar2);
            if (npgVar2.testCount() == 0) {
                throw new aeb();
            }
        }
    }

    @Override // p000.tde, p000.g74
    public j74 getDescription() {
        return makeDescription(getTest());
    }

    @Override // p000.tde
    public void run(bde bdeVar) {
        epg epgVar = new epg();
        epgVar.addListener(createAdaptingListener(bdeVar));
        getTest().run(epgVar);
    }

    @Override // p000.jvf
    public void sort(svf svfVar) {
        if (getTest() instanceof jvf) {
            ((jvf) getTest()).sort(svfVar);
        }
    }

    public wh8(pog pogVar) {
        setTest(pogVar);
    }
}
