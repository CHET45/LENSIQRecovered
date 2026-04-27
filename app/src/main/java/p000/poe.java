package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class poe extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, lf4 {

    /* JADX INFO: renamed from: C */
    public static final int f71564C = 2;

    /* JADX INFO: renamed from: b */
    public static final Object f71565b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f71566c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f71567d = new Object();

    /* JADX INFO: renamed from: e */
    public static final Object f71568e = new Object();

    /* JADX INFO: renamed from: f */
    public static final int f71569f = 0;

    /* JADX INFO: renamed from: m */
    public static final int f71570m = 1;
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: a */
    public final Runnable f71571a;

    public poe(Runnable actual, sf4 parent) {
        super(3);
        this.f71571a = actual;
        lazySet(0, parent);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p000.lf4
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f71568e || obj5 == (obj3 = f71566c) || obj5 == (obj4 = f71567d)) {
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
            if (obj == f71568e || obj == (obj2 = f71565b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((sf4) obj).delete(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f71565b || obj == f71568e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f71571a.run();
            Object obj3 = get(0);
            if (obj3 != f71565b && compareAndSet(0, obj3, f71568e) && obj3 != null) {
                ((sf4) obj3).delete(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f71566c || obj2 == f71567d) {
                    break;
                }
            } while (!compareAndSet(1, obj2, f71568e));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                ofe.onError(th);
                throw th;
            } catch (Throwable th2) {
                Object obj4 = get(0);
                if (obj4 != f71565b && compareAndSet(0, obj4, f71568e) && obj4 != null) {
                    ((sf4) obj4).delete(this);
                }
                do {
                    obj = get(1);
                    if (obj == f71566c || obj == f71567d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f71568e));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    public void setFuture(Future<?> f) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f71568e) {
                return;
            }
            if (obj == f71566c) {
                f.cancel(false);
                return;
            } else if (obj == f71567d) {
                f.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, f));
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        Object obj = get(1);
        if (obj == f71568e) {
            str = "Finished";
        } else if (obj == f71566c) {
            str = "Disposed(Sync)";
        } else if (obj == f71567d) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return poe.class.getSimpleName() + "[" + str + "]";
    }
}
