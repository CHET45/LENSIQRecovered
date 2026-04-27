package p000;

import androidx.lifecycle.C1127b;
import androidx.lifecycle.C1129c;
import androidx.lifecycle.C1131d;
import androidx.lifecycle.C1132d0;
import androidx.lifecycle.C1165u;
import androidx.lifecycle.InterfaceC1138g;
import androidx.lifecycle.InterfaceC1154n;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class p59 {

    /* JADX INFO: renamed from: b */
    public static final int f69728b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f69729c = 2;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final p59 f69727a = new p59();

    /* JADX INFO: renamed from: d */
    @yfb
    public static final Map<Class<?>, Integer> f69730d = new HashMap();

    /* JADX INFO: renamed from: e */
    @yfb
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC1138g>>> f69731e = new HashMap();

    private p59() {
    }

    private final InterfaceC1138g createGeneratedAdapter(Constructor<? extends InterfaceC1138g> constructor, Object obj) {
        try {
            InterfaceC1138g interfaceC1138gNewInstance = constructor.newInstance(obj);
            md8.checkNotNullExpressionValue(interfaceC1138gNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return interfaceC1138gNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends InterfaceC1138g> generatedConstructor(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            md8.checkNotNullExpressionValue(name, "fullPackage");
            if (name.length() != 0) {
                md8.checkNotNullExpressionValue(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                md8.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            md8.checkNotNullExpressionValue(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + a18.f100c + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            md8.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @do8
    @yfb
    public static final String getAdapterName(@yfb String str) {
        md8.checkNotNullParameter(str, "className");
        return h9g.replace$default(str, ".", p43.f69617m, false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = f69730d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && f59.class.isAssignableFrom(cls);
    }

    @do8
    @yfb
    public static final InterfaceC1154n lifecycleEventObserver(@yfb Object obj) {
        md8.checkNotNullParameter(obj, "object");
        boolean z = obj instanceof InterfaceC1154n;
        boolean z2 = obj instanceof kw3;
        if (z && z2) {
            return new C1131d((kw3) obj, (InterfaceC1154n) obj);
        }
        if (z2) {
            return new C1131d((kw3) obj, null);
        }
        if (z) {
            return (InterfaceC1154n) obj;
        }
        Class<?> cls = obj.getClass();
        p59 p59Var = f69727a;
        if (p59Var.getObserverConstructorType(cls) != 2) {
            return new C1165u(obj);
        }
        List<Constructor<? extends InterfaceC1138g>> list = f69731e.get(cls);
        md8.checkNotNull(list);
        List<Constructor<? extends InterfaceC1138g>> list2 = list;
        if (list2.size() == 1) {
            return new C1132d0(p59Var.createGeneratedAdapter(list2.get(0), obj));
        }
        int size = list2.size();
        InterfaceC1138g[] interfaceC1138gArr = new InterfaceC1138g[size];
        for (int i = 0; i < size; i++) {
            interfaceC1138gArr[i] = f69727a.createGeneratedAdapter(list2.get(i), obj);
        }
        return new C1129c(interfaceC1138gArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1138g> constructorGeneratedConstructor = generatedConstructor(cls);
        if (constructorGeneratedConstructor != null) {
            f69731e.put(cls, k82.listOf(constructorGeneratedConstructor));
            return 2;
        }
        if (C1127b.f7775c.m1615b(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            md8.checkNotNullExpressionValue(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC1138g>> list = f69731e.get(superclass);
            md8.checkNotNull(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        md8.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (isLifecycleParent(cls2)) {
                md8.checkNotNullExpressionValue(cls2, "intrface");
                if (getObserverConstructorType(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC1138g>> list2 = f69731e.get(cls2);
                md8.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f69731e.put(cls, arrayList);
        return 2;
    }
}
