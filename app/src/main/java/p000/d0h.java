package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use FakeTimeLimiter")
@jd7
@yg8
@qx4
public interface d0h {
    @op1
    @agc
    <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, TimeoutException;

    @op1
    @agc
    <T> T callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException, InterruptedException, TimeoutException;

    <T> T newProxy(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit);

    void runUninterruptiblyWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException;

    void runWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws InterruptedException, TimeoutException;
}
