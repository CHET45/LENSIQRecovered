package p000;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class a27 {

    /* JADX INFO: renamed from: a */
    public static final s7c<List<Class<?>>> f168a;

    /* JADX INFO: renamed from: b */
    public static final s7c<Constructor<?>> f169b;

    /* JADX INFO: renamed from: a27$a */
    @gdi
    public interface InterfaceC0014a {
        void validateClass(Class<? extends Exception> exceptionClass);
    }

    /* JADX INFO: renamed from: a27$b */
    @gdi
    public static class C0015b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC0014a f170a = m59a();

        /* JADX INFO: renamed from: a27$b$a */
        public enum a implements InterfaceC0014a {
            INSTANCE;


            /* JADX INFO: renamed from: b */
            public static final Set<WeakReference<Class<? extends Exception>>> f172b = new CopyOnWriteArraySet();

            @Override // p000.a27.InterfaceC0014a
            public void validateClass(Class<? extends Exception> exceptionClass) {
                Iterator<WeakReference<Class<? extends Exception>>> it = f172b.iterator();
                while (it.hasNext()) {
                    if (exceptionClass.equals(it.next().get())) {
                        return;
                    }
                }
                a27.m53d(exceptionClass);
                Set<WeakReference<Class<? extends Exception>>> set = f172b;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(exceptionClass));
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0014a m59a() {
            return a27.m58i();
        }
    }

    static {
        s7c<List<Class<?>>> s7cVarReverse = s7c.natural().onResultOf(new lz6() { // from class: x17
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return a27.lambda$static$0((List) obj);
            }
        }).compound(s7c.natural().onResultOf(new lz6() { // from class: y17
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return a27.lambda$static$1((List) obj);
            }
        })).reverse();
        f168a = s7cVarReverse;
        f169b = s7cVarReverse.onResultOf(new lz6() { // from class: z17
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return a27.lambda$static$2((Constructor) obj);
            }
        });
    }

    private a27() {
    }

    private static InterfaceC0014a bestGetCheckedTypeValidator() {
        return C0015b.f170a;
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static void m53d(Class<? extends Exception> exceptionClass) {
        v7d.checkArgument(m57h(exceptionClass), "Futures.getChecked exception type (%s) must not be a RuntimeException", exceptionClass);
        v7d.checkArgument(hasConstructorUsableByGetChecked(exceptionClass), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", exceptionClass);
    }

    @gdi
    @op1
    @agc
    /* JADX INFO: renamed from: e */
    public static <V, X extends Exception> V m54e(InterfaceC0014a validator, Future<V> future, Class<X> exceptionClass) throws Exception {
        validator.validateClass(exceptionClass);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw newWithCause(exceptionClass, e);
        } catch (ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), exceptionClass);
            throw new AssertionError();
        }
    }

    @op1
    @agc
    /* JADX INFO: renamed from: f */
    public static <V, X extends Exception> V m55f(Future<V> future, Class<X> cls) throws Exception {
        return (V) m54e(bestGetCheckedTypeValidator(), future, cls);
    }

    @op1
    @agc
    /* JADX INFO: renamed from: g */
    public static <V, X extends Exception> V m56g(Future<V> future, Class<X> exceptionClass, long timeout, TimeUnit unit) throws Exception {
        bestGetCheckedTypeValidator().validateClass(exceptionClass);
        try {
            return future.get(timeout, unit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw newWithCause(exceptionClass, e);
        } catch (ExecutionException e2) {
            wrapAndThrowExceptionOrError(e2.getCause(), exceptionClass);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw newWithCause(exceptionClass, e3);
        }
    }

    @gdi
    /* JADX INFO: renamed from: h */
    public static boolean m57h(Class<? extends Exception> type) {
        return !RuntimeException.class.isAssignableFrom(type);
    }

    private static boolean hasConstructorUsableByGetChecked(Class<? extends Exception> exceptionClass) {
        try {
            newWithCause(exceptionClass, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public static InterfaceC0014a m58i() {
        return C0015b.a.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$0(List list) {
        return Boolean.valueOf(list.contains(String.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Comparable lambda$static$1(List list) {
        return Boolean.valueOf(list.contains(Throwable.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$2(Constructor constructor) {
        return Arrays.asList(constructor.getParameterTypes());
    }

    @wx1
    private static <X> X newFromConstructor(Constructor<X> constructor, Throwable cause) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = cause.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = cause;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static <X extends Exception> X newWithCause(Class<X> exceptionClass, Throwable cause) {
        Iterator it = preferringStringsThenThrowables(Arrays.asList(exceptionClass.getConstructors())).iterator();
        while (it.hasNext()) {
            X x = (X) newFromConstructor((Constructor) it.next(), cause);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(cause);
                }
                return x;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + exceptionClass + " in response to chained exception", cause);
    }

    private static <X extends Exception> List<Constructor<X>> preferringStringsThenThrowables(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f169b.sortedCopy(list);
    }

    private static <X extends Exception> void wrapAndThrowExceptionOrError(Throwable cause, Class<X> exceptionClass) throws Exception {
        if (cause instanceof Error) {
            throw new k85((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw newWithCause(exceptionClass, cause);
        }
        throw new orh(cause);
    }
}
