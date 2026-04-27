package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class hp5 implements d0h {
    @Override // p000.d0h
    @op1
    @agc
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException {
        return (T) callWithTimeout(callable, j, timeUnit);
    }

    @Override // p000.d0h
    @op1
    @agc
    public <T> T callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(timeoutUnit);
        try {
            return callable.call();
        } catch (Error e) {
            throw new k85(e);
        } catch (RuntimeException e2) {
            throw new orh(e2);
        } catch (Exception e3) {
            uwc.m23618b(e3);
            throw new ExecutionException(e3);
        }
    }

    @Override // p000.d0h
    @op1
    public <T> T newProxy(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit) {
        v7d.checkNotNull(target);
        v7d.checkNotNull(interfaceType);
        v7d.checkNotNull(timeoutUnit);
        return target;
    }

    @Override // p000.d0h
    public void runUninterruptiblyWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        runWithTimeout(runnable, timeoutDuration, timeoutUnit);
    }

    @Override // p000.d0h
    public void runWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        v7d.checkNotNull(runnable);
        v7d.checkNotNull(timeoutUnit);
        try {
            runnable.run();
        } catch (Error e) {
            throw new k85(e);
        } catch (RuntimeException e2) {
            throw new orh(e2);
        }
    }
}
