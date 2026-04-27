package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class pce {

    /* JADX INFO: renamed from: d */
    public static final pce f70332d;

    /* JADX INFO: renamed from: e */
    public static final pce f70333e;

    /* JADX INFO: renamed from: f */
    public static final pce f70334f;

    /* JADX INFO: renamed from: g */
    public static final pce f70335g;

    /* JADX INFO: renamed from: a */
    public final Class<? extends Annotation> f70336a;

    /* JADX INFO: renamed from: b */
    public final boolean f70337b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC10913k> f70338c;

    /* JADX INFO: renamed from: pce$b */
    public static class C10904b {

        /* JADX INFO: renamed from: a */
        public final Class<? extends Annotation> f70339a;

        /* JADX INFO: renamed from: b */
        public boolean f70340b;

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC10913k> f70341c;

        /* JADX INFO: renamed from: d */
        public pce m19422d() {
            return new pce(this);
        }

        /* JADX INFO: renamed from: e */
        public C10904b m19423e() {
            this.f70340b = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C10904b m19424f(InterfaceC10913k interfaceC10913k) {
            this.f70341c.add(interfaceC10913k);
            return this;
        }

        private C10904b(Class<? extends Annotation> cls) {
            this.f70339a = cls;
            this.f70340b = false;
            this.f70341c = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: pce$c */
    public static final class C10905c implements InterfaceC10913k {
        private C10905c() {
        }

        private boolean isDeclaringClassPublic(nw6<?> nw6Var) {
            return Modifier.isPublic(nw6Var.getDeclaringClass().getModifiers());
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (isDeclaringClassPublic(nw6Var)) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must be declared in a public class."));
        }
    }

    /* JADX INFO: renamed from: pce$d */
    public static final class C10906d implements InterfaceC10913k {
        private C10906d() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (pce.isRuleType(nw6Var)) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must implement MethodRule or TestRule."));
        }
    }

    /* JADX INFO: renamed from: pce$e */
    public static final class C10907e implements InterfaceC10913k {
        private C10907e() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (pce.isTestRule(nw6Var)) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must implement TestRule."));
        }
    }

    /* JADX INFO: renamed from: pce$f */
    public static final class C10908f implements InterfaceC10913k {
        private C10908f() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean zIsMethodRule = pce.isMethodRule(nw6Var);
            boolean z = nw6Var.getAnnotation(k12.class) != null;
            if (nw6Var.isStatic()) {
                if (zIsMethodRule || !z) {
                    list.add(new z1i(nw6Var, cls, pce.isMethodRule(nw6Var) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
                }
            }
        }
    }

    /* JADX INFO: renamed from: pce$g */
    public static final class C10909g implements InterfaceC10913k {
        private C10909g() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (nw6Var.isPublic()) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must be public."));
        }
    }

    /* JADX INFO: renamed from: pce$h */
    public static final class C10910h implements InterfaceC10913k {
        private C10910h() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (nw6Var.isStatic()) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must be static."));
        }
    }

    /* JADX INFO: renamed from: pce$i */
    public static final class C10911i implements InterfaceC10913k {
        private C10911i() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (pce.isRuleType(nw6Var)) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must return an implementation of MethodRule or TestRule."));
        }
    }

    /* JADX INFO: renamed from: pce$j */
    public static final class C10912j implements InterfaceC10913k {
        private C10912j() {
        }

        @Override // p000.pce.InterfaceC10913k
        public void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list) {
            if (pce.isTestRule(nw6Var)) {
                return;
            }
            list.add(new z1i(nw6Var, cls, "must return an implementation of TestRule."));
        }
    }

    /* JADX INFO: renamed from: pce$k */
    public interface InterfaceC10913k {
        void validate(nw6<?> nw6Var, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        f70332d = classRuleValidatorBuilder().m19424f(new C10905c()).m19424f(new C10910h()).m19424f(new C10909g()).m19424f(new C10907e()).m19422d();
        f70333e = testRuleValidatorBuilder().m19424f(new C10908f()).m19424f(new C10909g()).m19424f(new C10906d()).m19422d();
        f70334f = classRuleValidatorBuilder().m19423e().m19424f(new C10905c()).m19424f(new C10910h()).m19424f(new C10909g()).m19424f(new C10912j()).m19422d();
        f70335g = testRuleValidatorBuilder().m19423e().m19424f(new C10908f()).m19424f(new C10909g()).m19424f(new C10911i()).m19422d();
    }

    public pce(C10904b c10904b) {
        this.f70336a = c10904b.f70339a;
        this.f70337b = c10904b.f70340b;
        this.f70338c = c10904b.f70341c;
    }

    private static C10904b classRuleValidatorBuilder() {
        return new C10904b(k12.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMethodRule(nw6<?> nw6Var) {
        return wua.class.isAssignableFrom(nw6Var.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRuleType(nw6<?> nw6Var) {
        return isMethodRule(nw6Var) || isTestRule(nw6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTestRule(nw6<?> nw6Var) {
        return fpg.class.isAssignableFrom(nw6Var.getType());
    }

    private static C10904b testRuleValidatorBuilder() {
        return new C10904b(nce.class);
    }

    private void validateMember(nw6<?> nw6Var, List<Throwable> list) {
        Iterator<InterfaceC10913k> it = this.f70338c.iterator();
        while (it.hasNext()) {
            it.next().validate(nw6Var, this.f70336a, list);
        }
    }

    public void validate(rog rogVar, List<Throwable> list) {
        Iterator it = (this.f70337b ? rogVar.getAnnotatedMethods(this.f70336a) : rogVar.getAnnotatedFields(this.f70336a)).iterator();
        while (it.hasNext()) {
            validateMember((nw6) it.next(), list);
        }
    }
}
