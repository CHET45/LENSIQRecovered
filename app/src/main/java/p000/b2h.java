package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.dm6;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@qx4
public final class b2h<V> extends dm6.AbstractC4859a<V> {

    /* JADX INFO: renamed from: F */
    @wx1
    public ja9<V> f12496F;

    /* JADX INFO: renamed from: H */
    @wx1
    public ScheduledFuture<?> f12497H;

    /* JADX INFO: renamed from: b2h$b */
    public static final class RunnableC1709b<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        @wx1
        public b2h<V> f12498a;

        public RunnableC1709b(b2h<V> timeoutFuture) {
            this.f12498a = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ja9<? extends V> ja9Var;
            b2h<V> b2hVar = this.f12498a;
            if (b2hVar == null || (ja9Var = b2hVar.f12496F) == null) {
                return;
            }
            this.f12498a = null;
            if (ja9Var.isDone()) {
                b2hVar.setFuture(ja9Var);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = b2hVar.f12497H;
                b2hVar.f12497H = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                        }
                    } catch (Throwable th) {
                        b2hVar.setException(new C1710c(str));
                        throw th;
                    }
                }
                b2hVar.setException(new C1710c(str + ": " + ja9Var));
            } finally {
                ja9Var.cancel(true);
            }
        }
    }

    /* JADX INFO: renamed from: b2h$c */
    public static final class C1710c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private C1710c(String message) {
            super(message);
        }
    }

    private b2h(ja9<V> delegate) {
        this.f12496F = (ja9) v7d.checkNotNull(delegate);
    }

    /* JADX INFO: renamed from: s */
    public static <V> ja9<V> m2821s(ja9<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        b2h b2hVar = new b2h(delegate);
        RunnableC1709b runnableC1709b = new RunnableC1709b(b2hVar);
        b2hVar.f12497H = scheduledExecutor.schedule(runnableC1709b, time, unit);
        delegate.addListener(runnableC1709b, xya.directExecutor());
        return b2hVar;
    }

    @Override // p000.AbstractC9640n1
    /* JADX INFO: renamed from: k */
    public void mo2822k() {
        m17707m(this.f12496F);
        ScheduledFuture<?> scheduledFuture = this.f12497H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f12496F = null;
        this.f12497H = null;
    }

    @Override // p000.AbstractC9640n1
    @wx1
    /* JADX INFO: renamed from: n */
    public String mo2823n() {
        ja9<V> ja9Var = this.f12496F;
        ScheduledFuture<?> scheduledFuture = this.f12497H;
        if (ja9Var == null) {
            return null;
        }
        String str = "inputFuture=[" + ja9Var + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
