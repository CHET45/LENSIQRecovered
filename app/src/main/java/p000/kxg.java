package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class kxg extends i61 {

    /* JADX INFO: renamed from: kxg$a */
    public static class C8550a extends f3g {

        /* JADX INFO: renamed from: b */
        public final ow6 f55599b;

        /* JADX INFO: renamed from: c */
        public final rog f55600c;

        /* JADX INFO: renamed from: a */
        public int f55598a = 0;

        /* JADX INFO: renamed from: d */
        public List<g90> f55601d = new ArrayList();

        /* JADX INFO: renamed from: kxg$a$a */
        public class a extends i61 {

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ b90 f55602g;

            /* JADX INFO: renamed from: kxg$a$a$a, reason: collision with other inner class name */
            public class C16462a extends f3g {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ f3g f55604a;

                public C16462a(f3g f3gVar) throws Throwable {
                    this.f55604a = f3gVar;
                }

                @Override // p000.f3g
                public void evaluate() throws Throwable {
                    try {
                        this.f55604a.evaluate();
                        C8550a.this.m15132d();
                    } catch (g90 e) {
                        C8550a.this.m15131c(e);
                    } catch (Throwable th) {
                        a aVar = a.this;
                        C8550a c8550a = C8550a.this;
                        c8550a.m15133e(th, aVar.f55602g.getArgumentStrings(c8550a.nullsOk()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Class cls, b90 b90Var) throws Throwable {
                super(cls);
                this.f55602g = b90Var;
            }

            @Override // p000.i61
            public Object createTest() throws Exception {
                Object[] constructorArguments = this.f55602g.getConstructorArguments();
                if (!C8550a.this.nullsOk()) {
                    f90.assumeNotNull(constructorArguments);
                }
                return getTestClass().getOnlyConstructor().newInstance(constructorArguments);
            }

            @Override // p000.i61, p000.ehc
            /* JADX INFO: renamed from: e */
            public void mo9981e(List<Throwable> list) {
            }

            @Override // p000.i61
            public f3g methodBlock(ow6 ow6Var) {
                return new C16462a(super.methodBlock(ow6Var));
            }

            @Override // p000.i61
            /* JADX INFO: renamed from: u */
            public f3g mo12813u(ow6 ow6Var, Object obj) {
                return C8550a.this.methodCompletesWithParameters(ow6Var, this.f55602g, obj);
            }
        }

        /* JADX INFO: renamed from: kxg$a$b */
        public class b extends f3g {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ b90 f55606a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ow6 f55607b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object f55608c;

            public b(b90 b90Var, ow6 ow6Var, Object obj) throws Throwable {
                this.f55606a = b90Var;
                this.f55607b = ow6Var;
                this.f55608c = obj;
            }

            @Override // p000.f3g
            public void evaluate() throws Throwable {
                Object[] methodArguments = this.f55606a.getMethodArguments();
                if (!C8550a.this.nullsOk()) {
                    f90.assumeNotNull(methodArguments);
                }
                this.f55607b.invokeExplosively(this.f55608c, methodArguments);
            }
        }

        public C8550a(ow6 ow6Var, rog rogVar) {
            this.f55599b = ow6Var;
            this.f55600c = rogVar;
        }

        private rog getTestClass() {
            return this.f55600c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f3g methodCompletesWithParameters(ow6 ow6Var, b90 b90Var, Object obj) {
            return new b(b90Var, ow6Var, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean nullsOk() {
            lxg lxgVar = (lxg) this.f55599b.getMethod().getAnnotation(lxg.class);
            if (lxgVar == null) {
                return false;
            }
            return lxgVar.nullsAccepted();
        }

        /* JADX INFO: renamed from: c */
        public void m15131c(g90 g90Var) {
            this.f55601d.add(g90Var);
        }

        /* JADX INFO: renamed from: d */
        public void m15132d() {
            this.f55598a++;
        }

        /* JADX INFO: renamed from: e */
        public void m15133e(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length != 0) {
                throw new pfc(th, this.f55599b.getName(), objArr);
            }
            throw th;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            m15134f(b90.allUnassigned(this.f55599b.getMethod(), getTestClass()));
            boolean z = this.f55599b.getAnnotation(lxg.class) != null;
            if (this.f55598a == 0 && z) {
                q80.fail("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.f55601d);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m15134f(b90 b90Var) throws Throwable {
            if (b90Var.isComplete()) {
                m15135g(b90Var);
            } else {
                m15136h(b90Var);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m15135g(b90 b90Var) throws Throwable {
            new a(getTestClass().getJavaClass(), b90Var).methodBlock(this.f55599b).evaluate();
        }

        /* JADX INFO: renamed from: h */
        public void m15136h(b90 b90Var) throws Throwable {
            Iterator<v5d> it = b90Var.potentialsForNextUnassigned().iterator();
            while (it.hasNext()) {
                m15134f(b90Var.assignNext(it.next()));
            }
        }
    }

    public kxg(Class<?> cls) throws o18 {
        super(cls);
    }

    private void validateDataPointFields(List<Throwable> list) {
        for (Field field : getTestClass().getJavaClass().getDeclaredFields()) {
            if (field.getAnnotation(xg3.class) != null || field.getAnnotation(zg3.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    private void validateDataPointMethods(List<Throwable> list) {
        for (Method method : getTestClass().getJavaClass().getDeclaredMethods()) {
            if (method.getAnnotation(xg3.class) != null || method.getAnnotation(zg3.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    private void validateParameterSupplier(Class<? extends nfc> cls, List<Throwable> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length == 0 || parameterTypes[0].equals(rog.class)) {
            return;
        }
        list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: E */
    public void mo12804E(List<Throwable> list) {
        for (ow6 ow6Var : mo12809q()) {
            if (ow6Var.getAnnotation(lxg.class) != null) {
                ow6Var.validatePublicVoid(false, list);
                ow6Var.validateNoTypeParametersOnArgs(list);
            } else {
                ow6Var.validatePublicVoidNoArg(false, list);
            }
            Iterator<mfc> it = mfc.signatures(ow6Var.getMethod()).iterator();
            while (it.hasNext()) {
                wfc wfcVar = (wfc) it.next().findDeepAnnotation(wfc.class);
                if (wfcVar != null) {
                    validateParameterSupplier(wfcVar.value(), list);
                }
            }
        }
    }

    @Override // p000.i61, p000.ehc
    /* JADX INFO: renamed from: e */
    public void mo9981e(List<Throwable> list) {
        super.mo9981e(list);
        validateDataPointFields(list);
        validateDataPointMethods(list);
    }

    @Override // p000.i61
    public f3g methodBlock(ow6 ow6Var) {
        return new C8550a(ow6Var, getTestClass());
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: q */
    public List<ow6> mo12809q() {
        ArrayList arrayList = new ArrayList(super.mo12809q());
        List<ow6> annotatedMethods = getTestClass().getAnnotatedMethods(lxg.class);
        arrayList.removeAll(annotatedMethods);
        arrayList.addAll(annotatedMethods);
        return arrayList;
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: z */
    public void mo12818z(List<Throwable> list) {
        m12803D(list);
    }
}
