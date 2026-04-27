package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.AbstractC9640n1;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@qx4
public class pw7<V> implements ja9<V> {

    /* JADX INFO: renamed from: b */
    public static final ja9<?> f72262b = new pw7(null);

    /* JADX INFO: renamed from: c */
    public static final Logger f72263c = Logger.getLogger(pw7.class.getName());

    /* JADX INFO: renamed from: a */
    @agc
    public final V f72264a;

    /* JADX INFO: renamed from: pw7$a */
    public static final class C11147a<V> extends AbstractC9640n1.j<V> {

        /* JADX INFO: renamed from: F */
        @wx1
        public static final C11147a<Object> f72265F;

        static {
            f72265F = AbstractC9640n1.f62906d ? null : new C11147a<>();
        }

        public C11147a() {
            cancel(false);
        }
    }

    /* JADX INFO: renamed from: pw7$b */
    public static final class C11148b<V> extends AbstractC9640n1.j<V> {
        public C11148b(Throwable thrown) {
            setException(thrown);
        }
    }

    public pw7(@agc V value) {
        this.f72264a = value;
    }

    @Override // p000.ja9
    public void addListener(Runnable listener, Executor executor) {
        v7d.checkNotNull(listener, "Runnable was null.");
        v7d.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (RuntimeException e) {
            f72263c.log(Level.SEVERE, "RuntimeException while executing runnable " + listener + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @agc
    public V get() {
        return this.f72264a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f72264a + "]]";
    }

    @Override // java.util.concurrent.Future
    @agc
    public V get(long timeout, TimeUnit unit) throws ExecutionException {
        v7d.checkNotNull(unit);
        return get();
    }
}
