package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@by4
public final class bzg {

    /* JADX INFO: renamed from: a */
    @jd7
    @yg8
    public static final String f15386a = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: b */
    @gdi
    @jd7
    @yg8
    public static final String f15387b = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: c */
    @wx1
    @jd7
    @yg8
    public static final Object f15388c;

    /* JADX INFO: renamed from: d */
    @wx1
    @jd7
    @yg8
    public static final Method f15389d;

    /* JADX INFO: renamed from: e */
    @wx1
    @jd7
    @yg8
    public static final Method f15390e;

    /* JADX INFO: renamed from: bzg$a */
    public class C2131a extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f15391a;

        public C2131a(final Throwable val$t) {
            this.f15391a = val$t;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = bzg.f15390e;
            Objects.requireNonNull(method);
            Object obj = bzg.f15388c;
            Objects.requireNonNull(obj);
            return ((Integer) bzg.invokeAccessibleNonThrowingMethod(method, obj, this.f15391a)).intValue();
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int n) {
            Method method = bzg.f15389d;
            Objects.requireNonNull(method);
            Object obj = bzg.f15388c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) bzg.invokeAccessibleNonThrowingMethod(method, obj, this.f15391a, Integer.valueOf(n));
        }
    }

    static {
        Object jla = getJLA();
        f15388c = jla;
        f15389d = jla == null ? null : getGetMethod();
        f15390e = jla != null ? getSizeMethod(jla) : null;
    }

    private bzg() {
    }

    public static List<Throwable> getCausalChain(Throwable throwable) {
        v7d.checkNotNull(throwable);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(throwable);
        boolean z = false;
        Throwable cause = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(throwable);
            if (throwable == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
        }
    }

    @wx1
    @jd7
    @yg8
    public static <X extends Throwable> X getCauseAs(Throwable throwable, Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (ClassCastException e) {
            e.initCause(throwable);
            throw e;
        }
    }

    @wx1
    @jd7
    @yg8
    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @wx1
    @jd7
    @yg8
    private static Object getJLA() {
        try {
            return Class.forName(f15387b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @wx1
    @jd7
    @yg8
    private static Method getJlaMethod(String name, Class<?>... parameterTypes) throws ThreadDeath {
        try {
            return Class.forName(f15386a, false, null).getMethod(name, parameterTypes);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable throwable) {
        boolean z = false;
        Throwable cause = throwable;
        while (true) {
            Throwable cause2 = throwable.getCause();
            if (cause2 == null) {
                return throwable;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            throwable = cause2;
        }
    }

    @wx1
    @jd7
    @yg8
    private static Method getSizeMethod(Object jla) {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(jla, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @jd7
    public static String getStackTraceAsString(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @jd7
    @yg8
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object receiver, Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    @jd7
    @yg8
    private static List<StackTraceElement> jlaStackTrace(Throwable t) {
        v7d.checkNotNull(t);
        return new C2131a(t);
    }

    @jd7
    @yg8
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable throwable) {
        return lazyStackTraceIsLazy() ? jlaStackTrace(throwable) : Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    @jd7
    @yg8
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (f15389d == null || f15390e == null) ? false : true;
    }

    @jd7
    @yg8
    @Deprecated
    @op1
    public static RuntimeException propagate(Throwable throwable) {
        throwIfUnchecked(throwable);
        throw new RuntimeException(throwable);
    }

    @jd7
    @yg8
    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(@wx1 Throwable throwable, Class<X> declaredType) throws Throwable {
        if (throwable != null) {
            throwIfInstanceOf(throwable, declaredType);
        }
    }

    @jd7
    @yg8
    @Deprecated
    public static void propagateIfPossible(@wx1 Throwable throwable) {
        if (throwable != null) {
            throwIfUnchecked(throwable);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @jd7
    @yg8
    public static <X extends Throwable> void throwIfInstanceOf(Throwable throwable, Class<X> declaredType) throws Throwable {
        v7d.checkNotNull(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    public static void throwIfUnchecked(Throwable throwable) {
        v7d.checkNotNull(throwable);
        if (throwable instanceof RuntimeException) {
            throw ((RuntimeException) throwable);
        }
        if (throwable instanceof Error) {
            throw ((Error) throwable);
        }
    }

    @jd7
    @yg8
    public static <X extends Throwable> void propagateIfPossible(@wx1 Throwable throwable, Class<X> declaredType) throws Throwable {
        propagateIfInstanceOf(throwable, declaredType);
        propagateIfPossible(throwable);
    }

    @jd7
    @yg8
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(@wx1 Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2) throws Throwable {
        v7d.checkNotNull(declaredType2);
        propagateIfInstanceOf(throwable, declaredType1);
        propagateIfPossible(throwable, declaredType2);
    }
}
