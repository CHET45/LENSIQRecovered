package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ow6 extends nw6<ow6> {

    /* JADX INFO: renamed from: a */
    public final Method f69012a;

    /* JADX INFO: renamed from: ow6$a */
    public class C10676a extends zvd {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f69013a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object[] f69014b;

        public C10676a(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            this.f69013a = obj;
            this.f69014b = objArr;
        }

        @Override // p000.zvd
        /* JADX INFO: renamed from: a */
        public Object mo12819a() throws Throwable {
            return ow6.this.f69012a.invoke(this.f69013a, this.f69014b);
        }
    }

    public ow6(Method method) {
        if (method == null) {
            throw new NullPointerException("FrameworkMethod cannot be created without an underlying method.");
        }
        this.f69012a = method;
    }

    private Class<?>[] getParameterTypes() {
        return this.f69012a.getParameterTypes();
    }

    @Override // p000.nw6
    /* JADX INFO: renamed from: a */
    public int mo18167a() {
        return this.f69012a.getModifiers();
    }

    public boolean equals(Object obj) {
        if (ow6.class.isInstance(obj)) {
            return ((ow6) obj).f69012a.equals(this.f69012a);
        }
        return false;
    }

    @Override // p000.InterfaceC7667iz
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f69012a.getAnnotation(cls);
    }

    @Override // p000.InterfaceC7667iz
    public Annotation[] getAnnotations() {
        return this.f69012a.getAnnotations();
    }

    @Override // p000.nw6
    public Class<?> getDeclaringClass() {
        return this.f69012a.getDeclaringClass();
    }

    public Method getMethod() {
        return this.f69012a;
    }

    @Override // p000.nw6
    public String getName() {
        return this.f69012a.getName();
    }

    public Class<?> getReturnType() {
        return this.f69012a.getReturnType();
    }

    @Override // p000.nw6
    public Class<?> getType() {
        return getReturnType();
    }

    public int hashCode() {
        return this.f69012a.hashCode();
    }

    public Object invokeExplosively(Object obj, Object... objArr) throws Throwable {
        return new C10676a(obj, objArr).run();
    }

    @Deprecated
    public boolean producesType(Type type) {
        return getParameterTypes().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.f69012a.getReturnType());
    }

    public String toString() {
        return this.f69012a.toString();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> list) {
        new jdb(this.f69012a).m14064a(list);
    }

    public void validatePublicVoid(boolean z, List<Throwable> list) {
        if (isStatic() != z) {
            list.add(new Exception("Method " + this.f69012a.getName() + "() " + (z ? "should" : "should not") + " be static"));
        }
        if (!isPublic()) {
            list.add(new Exception("Method " + this.f69012a.getName() + "() should be public"));
        }
        if (this.f69012a.getReturnType() != Void.TYPE) {
            list.add(new Exception("Method " + this.f69012a.getName() + "() should be void"));
        }
    }

    public void validatePublicVoidNoArg(boolean z, List<Throwable> list) {
        validatePublicVoid(z, list);
        if (this.f69012a.getParameterTypes().length != 0) {
            list.add(new Exception("Method " + this.f69012a.getName() + " should have no parameters"));
        }
    }

    @Override // p000.nw6
    public boolean isShadowedBy(ow6 ow6Var) {
        if (!ow6Var.getName().equals(getName()) || ow6Var.getParameterTypes().length != getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < ow6Var.getParameterTypes().length; i++) {
            if (!ow6Var.getParameterTypes()[i].equals(getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }
}
