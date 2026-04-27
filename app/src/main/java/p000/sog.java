package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class sog {

    /* JADX INFO: renamed from: a */
    public final Class<?> f82470a;

    public sog(Class<?> cls) {
        this.f82470a = cls;
    }

    private List<Class<?>> getSuperClasses(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private boolean isShadowed(Method method, List<Method> list) {
        Iterator<Method> it = list.iterator();
        while (it.hasNext()) {
            if (isShadowed(method, it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean runsTopToBottom(Class<? extends Annotation> cls) {
        return cls.equals(kx0.class) || cls.equals(lx0.class);
    }

    /* JADX INFO: renamed from: a */
    public List<Method> m22164a() {
        return getAnnotatedMethods(InterfaceC5330ej.class);
    }

    /* JADX INFO: renamed from: b */
    public List<Method> m22165b() {
        return getAnnotatedMethods(lx0.class);
    }

    public List<Method> getAnnotatedMethods(Class<? extends Annotation> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<?>> it = getSuperClasses(this.f82470a).iterator();
        while (it.hasNext()) {
            for (Method method : xua.getDeclaredMethods(it.next())) {
                if (method.getAnnotation(cls) != null && !isShadowed(method, arrayList)) {
                    arrayList.add(method);
                }
            }
        }
        if (runsTopToBottom(cls)) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public Constructor<?> getConstructor() throws NoSuchMethodException, SecurityException {
        return this.f82470a.getConstructor(null);
    }

    public Class<?> getJavaClass() {
        return this.f82470a;
    }

    public String getName() {
        return this.f82470a.getName();
    }

    public List<Method> getTestMethods() {
        return getAnnotatedMethods(oog.class);
    }

    private boolean isShadowed(Method method, Method method2) {
        if (!method2.getName().equals(method.getName()) || method2.getParameterTypes().length != method.getParameterTypes().length) {
            return false;
        }
        for (int i = 0; i < method2.getParameterTypes().length; i++) {
            if (!method2.getParameterTypes()[i].equals(method.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }
}
