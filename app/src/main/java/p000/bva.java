package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class bva {

    /* JADX INFO: renamed from: a */
    public final List<Throwable> f14939a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public sog f14940b;

    public bva(sog sogVar) {
        this.f14940b = sogVar;
    }

    private void validateTestMethods(Class<? extends Annotation> cls, boolean z) {
        for (Method method : this.f14940b.getAnnotatedMethods(cls)) {
            if (Modifier.isStatic(method.getModifiers()) != z) {
                String str = z ? "should" : "should not";
                this.f14939a.add(new Exception("Method " + method.getName() + "() " + str + " be static"));
            }
            if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
                this.f14939a.add(new Exception("Class " + method.getDeclaringClass().getName() + " should be public"));
            }
            if (!Modifier.isPublic(method.getModifiers())) {
                this.f14939a.add(new Exception("Method " + method.getName() + " should be public"));
            }
            if (method.getReturnType() != Void.TYPE) {
                this.f14939a.add(new Exception("Method " + method.getName() + " should be void"));
            }
            if (method.getParameterTypes().length != 0) {
                this.f14939a.add(new Exception("Method " + method.getName() + " should have no parameters"));
            }
        }
    }

    public void assertValid() throws p18 {
        if (!this.f14939a.isEmpty()) {
            throw new p18(this.f14939a);
        }
    }

    public void validateInstanceMethods() {
        validateTestMethods(InterfaceC4798dj.class, false);
        validateTestMethods(kx0.class, false);
        validateTestMethods(oog.class, false);
        if (this.f14940b.getAnnotatedMethods(oog.class).size() == 0) {
            this.f14939a.add(new Exception("No runnable methods"));
        }
    }

    public List<Throwable> validateMethodsForDefaultRunner() {
        validateNoArgConstructor();
        validateStaticMethods();
        validateInstanceMethods();
        return this.f14939a;
    }

    public void validateNoArgConstructor() {
        try {
            this.f14940b.getConstructor();
        } catch (Exception e) {
            this.f14939a.add(new Exception("Test class should have public zero-argument constructor", e));
        }
    }

    public void validateStaticMethods() {
        validateTestMethods(lx0.class, true);
        validateTestMethods(InterfaceC5330ej.class, true);
    }
}
