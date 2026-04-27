package p000;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class a4e<R> implements s17<R>, e4e<R> {

    /* JADX INFO: renamed from: L */
    public static final C0056a f389L = new C0056a();

    /* JADX INFO: renamed from: C */
    @xc7("this")
    public boolean f390C;

    /* JADX INFO: renamed from: F */
    @xc7("this")
    public boolean f391F;

    /* JADX INFO: renamed from: H */
    @xc7("this")
    @hib
    public a77 f392H;

    /* JADX INFO: renamed from: a */
    public final int f393a;

    /* JADX INFO: renamed from: b */
    public final int f394b;

    /* JADX INFO: renamed from: c */
    public final boolean f395c;

    /* JADX INFO: renamed from: d */
    public final C0056a f396d;

    /* JADX INFO: renamed from: e */
    @xc7("this")
    @hib
    public R f397e;

    /* JADX INFO: renamed from: f */
    @xc7("this")
    @hib
    public q3e f398f;

    /* JADX INFO: renamed from: m */
    @xc7("this")
    public boolean f399m;

    /* JADX INFO: renamed from: a4e$a */
    @fdi
    public static class C0056a {
        /* JADX INFO: renamed from: a */
        public void m137a(Object obj) {
            obj.notifyAll();
        }

        /* JADX INFO: renamed from: b */
        public void m138b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public a4e(int i, int i2) {
        this(i, i2, true, f389L);
    }

    private synchronized R doGet(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.f395c && !isDone()) {
                v0i.assertBackgroundThread();
            }
            if (this.f399m) {
                throw new CancellationException();
            }
            if (this.f391F) {
                throw new ExecutionException(this.f392H);
            }
            if (this.f390C) {
                return this.f397e;
            }
            if (l == null) {
                this.f396d.m138b(this, 0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f396d.m138b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f391F) {
                throw new ExecutionException(this.f392H);
            }
            if (this.f399m) {
                throw new CancellationException();
            }
            if (!this.f390C) {
                throw new TimeoutException();
            }
            return this.f397e;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f399m = true;
                this.f396d.m137a(this);
                q3e q3eVar = null;
                if (z) {
                    q3e q3eVar2 = this.f398f;
                    this.f398f = null;
                    q3eVar = q3eVar2;
                }
                if (q3eVar != null) {
                    q3eVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return doGet(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.jmg
    @hib
    public synchronized q3e getRequest() {
        return this.f398f;
    }

    @Override // p000.jmg
    public void getSize(@efb gqf gqfVar) {
        gqfVar.onSizeReady(this.f393a, this.f394b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f399m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f399m     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f390C     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f391F     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a4e.isDone():boolean");
    }

    @Override // p000.e59
    public void onDestroy() {
    }

    @Override // p000.jmg
    public void onLoadCleared(@hib Drawable drawable) {
    }

    @Override // p000.jmg
    public synchronized void onLoadFailed(@hib Drawable drawable) {
    }

    @Override // p000.jmg
    public void onLoadStarted(@hib Drawable drawable) {
    }

    @Override // p000.jmg
    public synchronized void onResourceReady(@efb R r, @hib afh<? super R> afhVar) {
    }

    @Override // p000.e59
    public void onStart() {
    }

    @Override // p000.e59
    public void onStop() {
    }

    @Override // p000.jmg
    public void removeCallback(@efb gqf gqfVar) {
    }

    @Override // p000.jmg
    public synchronized void setRequest(@hib q3e q3eVar) {
        this.f398f = q3eVar;
    }

    public String toString() {
        q3e q3eVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                q3eVar = null;
                if (this.f399m) {
                    str = "CANCELLED";
                } else if (this.f391F) {
                    str = "FAILURE";
                } else if (this.f390C) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    q3eVar = this.f398f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (q3eVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + q3eVar + "]]";
    }

    public a4e(int i, int i2, boolean z, C0056a c0056a) {
        this.f393a = i;
        this.f394b = i2;
        this.f395c = z;
        this.f396d = c0056a;
    }

    @Override // p000.e4e
    public synchronized boolean onLoadFailed(@hib a77 a77Var, Object obj, jmg<R> jmgVar, boolean z) {
        this.f391F = true;
        this.f392H = a77Var;
        this.f396d.m137a(this);
        return false;
    }

    @Override // p000.e4e
    public synchronized boolean onResourceReady(R r, Object obj, jmg<R> jmgVar, hh3 hh3Var, boolean z) {
        this.f390C = true;
        this.f397e = r;
        this.f396d.m137a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @efb TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return doGet(Long.valueOf(timeUnit.toMillis(j)));
    }
}
