package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class qoe extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, mf4 {

    /* JADX INFO: renamed from: C */
    public static final int f75042C = 2;

    /* JADX INFO: renamed from: b */
    public static final Object f75043b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f75044c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f75045d = new Object();

    /* JADX INFO: renamed from: e */
    public static final Object f75046e = new Object();

    /* JADX INFO: renamed from: f */
    public static final int f75047f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f75048m = 1;
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a */
    public final Runnable f75049a;

    public qoe(Runnable runnable, tf4 tf4Var) {
        super(3);
        this.f75049a = runnable;
        lazySet(0, tf4Var);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p000.mf4
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f75046e || obj5 == (obj3 = f75044c) || obj5 == (obj4 = f75045d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f75046e || obj == (obj2 = f75043b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((tf4) obj).delete(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f75043b || obj == f75046e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        lazySet(2, Thread.currentThread());
        try {
            this.f75049a.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj5 = get(0);
        if (obj5 != f75043b && compareAndSet(0, obj5, f75046e) && obj5 != null) {
            ((tf4) obj5).delete(this);
        }
        do {
            obj4 = get(1);
            if (obj4 == f75044c || obj4 == f75045d) {
                return;
            }
        } while (!compareAndSet(1, obj4, f75046e));
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f75046e) {
                return;
            }
            if (obj == f75044c) {
                future.cancel(false);
                return;
            } else if (obj == f75045d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
