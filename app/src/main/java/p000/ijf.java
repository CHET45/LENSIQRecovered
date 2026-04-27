package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.ijf;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class ijf implements d0h {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f47210a;

    /* JADX INFO: renamed from: ijf$a */
    public class C7322a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f47211a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f47212b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ TimeUnit f47213c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Set f47214d;

        public C7322a(final Object val$target, final long val$timeoutDuration, final TimeUnit val$timeoutUnit, final Set val$interruptibleMethods) {
            this.f47211a = val$target;
            this.f47212b = val$timeoutDuration;
            this.f47213c = val$timeoutUnit;
            this.f47214d = val$interruptibleMethods;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$invoke$0(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw ijf.throwCause(e, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @wx1
        public Object invoke(Object obj, final Method method, @wx1 final Object[] args) throws Throwable {
            final Object obj2 = this.f47211a;
            return ijf.this.callWithTimeout(new Callable() { // from class: hjf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ijf.C7322a.lambda$invoke$0(method, obj2, args);
                }
            }, this.f47212b, this.f47213c, this.f47214d.contains(method));
        }
    }

    private ijf(ExecutorService executor) {
        this.f47210a = (ExecutorService) v7d.checkNotNull(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @agc
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        Future future = (T) this.f47210a.submit(callable);
        try {
            future = z ? (T) future.get(j, timeUnit) : (T) vsh.getUninterruptibly(future, j, timeUnit);
            return (T) future;
        } catch (InterruptedException e) {
            future.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            throw throwCause(e2, true);
        } catch (TimeoutException e3) {
            future.cancel(true);
            throw new qrh(e3);
        }
    }

    private static void checkPositiveTimeout(long timeoutDuration) {
        v7d.checkArgument(timeoutDuration > 0, "timeout must be positive: %s", timeoutDuration);
    }

    public static ijf create(ExecutorService executor) {
        return new ijf(executor);
    }

    private static boolean declaresInterruptedEx(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> findInterruptibleMethods(Class<?> interfaceType) {
        HashSet hashSetNewHashSet = t6f.newHashSet();
        for (Method method : interfaceType.getMethods()) {
            if (declaresInterruptedEx(method)) {
                hashSetNewHashSet.add(method);
            }
        }
        return hashSetNewHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception throwCause(Exception e, boolean combineStackTraces) throws Exception {
        Throwable cause = e.getCause();
        if (cause == null) {
            throw e;
        }
        if (combineStackTraces) {
            cause.setStackTrace((StackTraceElement[]) pjb.concat(cause.getStackTrace(), e.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw e;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable cause) throws ExecutionException {
        if (cause instanceof Error) {
            throw new k85((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw new ExecutionException(cause);
        }
        throw new orh(cause);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new orh(cause);
        }
        throw new k85((Error) cause);
    }

    @Override // p000.d0h
    @op1
    @agc
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        Future<T> futureSubmit = this.f47210a.submit(callable);
        try {
            return (T) vsh.getUninterruptibly(futureSubmit, j, timeUnit);
        } catch (ExecutionException e) {
            wrapAndThrowExecutionExceptionOrError(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            futureSubmit.cancel(true);
            throw e2;
        }
    }

    @Override // p000.d0h
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        v7d.checkNotNull(t);
        v7d.checkNotNull(cls);
        v7d.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        v7d.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new C7322a(t, j, timeUnit, findInterruptibleMethods(cls)));
    }

    @Override // p000.d0h
    public void runUninterruptiblyWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException {
        v7d.checkNotNull(runnable);
        v7d.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        Future<?> futureSubmit = this.f47210a.submit(runnable);
        try {
            vsh.getUninterruptibly(futureSubmit, timeoutDuration, timeoutUnit);
        } catch (ExecutionException e) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            futureSubmit.cancel(true);
            throw e2;
        }
    }

    @Override // p000.d0h
    public void runWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws Throwable {
        v7d.checkNotNull(runnable);
        v7d.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        Future<?> futureSubmit = this.f47210a.submit(runnable);
        try {
            futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException e) {
            e = e;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    private static <T> T newProxy(Class<T> interfaceType, InvocationHandler handler) {
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }

    @Override // p000.d0h
    @op1
    @agc
    public <T> T callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws Throwable {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(timeoutUnit);
        checkPositiveTimeout(timeoutDuration);
        Future<T> futureSubmit = this.f47210a.submit(callable);
        try {
            return futureSubmit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException e) {
            e = e;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            wrapAndThrowExecutionExceptionOrError(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            futureSubmit.cancel(true);
            throw e;
        }
    }
}
