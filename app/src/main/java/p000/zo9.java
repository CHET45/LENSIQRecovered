package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class zo9<T> {

    /* JADX INFO: renamed from: e */
    public static Executor f105595e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a */
    public final Set<oo9<T>> f105596a;

    /* JADX INFO: renamed from: b */
    public final Set<oo9<Throwable>> f105597b;

    /* JADX INFO: renamed from: c */
    public final Handler f105598c;

    /* JADX INFO: renamed from: d */
    @hib
    public volatile xo9<T> f105599d;

    /* JADX INFO: renamed from: zo9$a */
    public class C16200a extends FutureTask<xo9<T>> {
        public C16200a(Callable<xo9<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                zo9.this.setResult(get());
            } catch (InterruptedException | ExecutionException e) {
                zo9.this.setResult(new xo9(e));
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public zo9(Callable<xo9<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyListeners$0() {
        xo9<T> xo9Var = this.f105599d;
        if (xo9Var == null) {
            return;
        }
        if (xo9Var.getValue() != null) {
            notifySuccessListeners(xo9Var.getValue());
        } else {
            notifyFailureListeners(xo9Var.getException());
        }
    }

    private synchronized void notifyFailureListeners(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f105597b);
        if (arrayList.isEmpty()) {
            dj9.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((oo9) it.next()).onResult(th);
        }
    }

    private void notifyListeners() {
        this.f105598c.post(new Runnable() { // from class: yo9
            @Override // java.lang.Runnable
            public final void run() {
                this.f102410a.lambda$notifyListeners$0();
            }
        });
    }

    private synchronized void notifySuccessListeners(T t) {
        Iterator it = new ArrayList(this.f105596a).iterator();
        while (it.hasNext()) {
            ((oo9) it.next()).onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(@hib xo9<T> xo9Var) {
        if (this.f105599d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f105599d = xo9Var;
        notifyListeners();
    }

    public synchronized zo9<T> addFailureListener(oo9<Throwable> oo9Var) {
        try {
            xo9<T> xo9Var = this.f105599d;
            if (xo9Var != null && xo9Var.getException() != null) {
                oo9Var.onResult(xo9Var.getException());
            }
            this.f105597b.add(oo9Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized zo9<T> addListener(oo9<T> oo9Var) {
        try {
            xo9<T> xo9Var = this.f105599d;
            if (xo9Var != null && xo9Var.getValue() != null) {
                oo9Var.onResult(xo9Var.getValue());
            }
            this.f105596a.add(oo9Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized zo9<T> removeFailureListener(oo9<Throwable> oo9Var) {
        this.f105597b.remove(oo9Var);
        return this;
    }

    public synchronized zo9<T> removeListener(oo9<T> oo9Var) {
        this.f105596a.remove(oo9Var);
        return this;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public zo9(Callable<xo9<T>> callable, boolean z) {
        this.f105596a = new LinkedHashSet(1);
        this.f105597b = new LinkedHashSet(1);
        this.f105598c = new Handler(Looper.getMainLooper());
        this.f105599d = null;
        if (!z) {
            f105595e.execute(new C16200a(callable));
            return;
        }
        try {
            setResult(callable.call());
        } catch (Throwable th) {
            setResult(new xo9<>(th));
        }
    }
}
