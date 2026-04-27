package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uvd {

    /* JADX INFO: renamed from: a */
    public final Class<?> f89236a;

    /* JADX INFO: renamed from: b */
    public final Object f89237b;

    /* JADX INFO: renamed from: uvd$a */
    public class C13742a implements Comparator<Constructor<?>> {
        public C13742a() {
        }

        @Override // java.util.Comparator
        public int compare(Constructor<?> constructor, Constructor<?> constructor2) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
            int length = parameterTypes.length;
            for (int i = 0; i < length; i++) {
                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                    return uvd.this.wrapper(parameterTypes[i]).isAssignableFrom(uvd.this.wrapper(parameterTypes2[i])) ? 1 : -1;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: uvd$b */
    public class C13743b implements Comparator<Method> {
        public C13743b() {
        }

        @Override // java.util.Comparator
        public int compare(Method method, Method method2) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            int length = parameterTypes.length;
            for (int i = 0; i < length; i++) {
                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                    return uvd.this.wrapper(parameterTypes[i]).isAssignableFrom(uvd.this.wrapper(parameterTypes2[i])) ? 1 : -1;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: uvd$c */
    public class C13744c implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f89240a;

        public C13744c(boolean z) {
            this.f89240a = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                return uvd.reflect(uvd.this.f89237b).method(name, objArr).get();
            } catch (C13746e e) {
                if (this.f89240a) {
                    Map map = (Map) uvd.this.f89237b;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith("get")) {
                        return map.get(uvd.property(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith("is")) {
                        return map.get(uvd.property(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(uvd.property(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: uvd$d */
    public static class C13745d {
        private C13745d() {
        }
    }

    /* JADX INFO: renamed from: uvd$e */
    public static class C13746e extends RuntimeException {
        private static final long serialVersionUID = 858774075258496016L;

        public C13746e(String str) {
            super(str);
        }

        public C13746e(String str, Throwable th) {
            super(str, th);
        }

        public C13746e(Throwable th) {
            super(th);
        }
    }

    private uvd(Class<?> cls) {
        this(cls, cls);
    }

    private <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    private Method exactMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsType = type();
        try {
            return clsType.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsType.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsType = clsType.getSuperclass();
                }
            } while (clsType != null);
            throw new NoSuchMethodException();
        }
    }

    private static Class<?> forName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new C13746e(e);
        }
    }

    private Field getAccessibleField(String str) {
        Class<?> clsType = type();
        try {
            return (Field) accessible(clsType.getField(str));
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) accessible(clsType.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsType = clsType.getSuperclass();
                    if (clsType == null) {
                        throw new C13746e(e);
                    }
                }
            } while (clsType == null);
            throw new C13746e(e);
        }
    }

    private Class<?>[] getArgsType(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? C13745d.class : obj.getClass();
        }
        return clsArr;
    }

    private Field getField(String str) throws IllegalAccessException {
        Field accessibleField = getAccessibleField(str);
        if ((accessibleField.getModifiers() & 16) == 16) {
            try {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(accessibleField, accessibleField.getModifiers() & (-17));
            } catch (NoSuchFieldException unused) {
                accessibleField.setAccessible(true);
            }
        }
        return accessibleField;
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && match(method.getParameterTypes(), clsArr);
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C13745d.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static uvd reflect(String str) throws C13746e {
        return reflect(forName(str));
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsType = type();
        ArrayList arrayList = new ArrayList();
        for (Method method : clsType.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                arrayList.add(method);
            }
        }
        if (!arrayList.isEmpty()) {
            sortMethods(arrayList);
            return arrayList.get(0);
        }
        do {
            for (Method method2 : clsType.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    arrayList.add(method2);
                }
            }
            if (!arrayList.isEmpty()) {
                sortMethods(arrayList);
                return arrayList.get(0);
            }
            clsType = clsType.getSuperclass();
        } while (clsType != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private void sortConstructors(List<Constructor<?>> list) {
        Collections.sort(list, new C13742a());
    }

    private void sortMethods(List<Method> list) {
        Collections.sort(list, new C13743b());
    }

    private Class<?> type() {
        return this.f89236a;
    }

    private Object unwrap(Object obj) {
        return obj instanceof uvd ? ((uvd) obj).get() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof uvd) && this.f89237b.equals(((uvd) obj).get());
    }

    public uvd field(String str) {
        try {
            Field field = getField(str);
            return new uvd(field.getType(), field.get(this.f89237b));
        } catch (IllegalAccessException e) {
            throw new C13746e(e);
        }
    }

    public <T> T get() {
        return (T) this.f89237b;
    }

    public int hashCode() {
        return this.f89237b.hashCode();
    }

    public uvd method(String str) throws C13746e {
        return method(str, new Object[0]);
    }

    public uvd newInstance() {
        return newInstance(new Object[0]);
    }

    public <P> P proxy(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C13744c(this.f89237b instanceof Map));
    }

    public String toString() {
        return this.f89237b.toString();
    }

    private uvd(Class<?> cls, Object obj) {
        this.f89236a = cls;
        this.f89237b = obj;
    }

    public static uvd reflect(String str, ClassLoader classLoader) throws C13746e {
        return reflect(forName(str, classLoader));
    }

    public uvd method(String str, Object... objArr) throws C13746e {
        Class<?>[] argsType = getArgsType(objArr);
        try {
            try {
                return method(exactMethod(str, argsType), this.f89237b, objArr);
            } catch (NoSuchMethodException unused) {
                return method(similarMethod(str, argsType), this.f89237b, objArr);
            }
        } catch (NoSuchMethodException e) {
            throw new C13746e(e);
        }
    }

    public uvd newInstance(Object... objArr) {
        Class<?>[] argsType = getArgsType(objArr);
        try {
            return newInstance(type().getDeclaredConstructor(argsType), objArr);
        } catch (NoSuchMethodException e) {
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), argsType)) {
                    arrayList.add(constructor);
                }
            }
            if (arrayList.isEmpty()) {
                throw new C13746e(e);
            }
            sortConstructors(arrayList);
            return newInstance(arrayList.get(0), objArr);
        }
    }

    private static Class<?> forName(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException e) {
            throw new C13746e(e);
        }
    }

    public static uvd reflect(Class<?> cls) throws C13746e {
        return new uvd(cls);
    }

    public static uvd reflect(Object obj) throws C13746e {
        return new uvd(obj == null ? Object.class : obj.getClass(), obj);
    }

    public uvd field(String str, Object obj) {
        try {
            getField(str).set(this.f89237b, unwrap(obj));
            return this;
        } catch (Exception e) {
            throw new C13746e(e);
        }
    }

    private uvd method(Method method, Object obj, Object... objArr) {
        try {
            accessible(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return reflect(obj);
            }
            return reflect(method.invoke(obj, objArr));
        } catch (Exception e) {
            throw new C13746e(e);
        }
    }

    private uvd newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return new uvd(constructor.getDeclaringClass(), ((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new C13746e(e);
        }
    }
}
