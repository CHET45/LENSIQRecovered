package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class si0 {

    /* JADX INFO: renamed from: m */
    @yfb
    public static final C12600a f81895m = new C12600a(null);

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f81896n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* JADX INFO: renamed from: a */
    public xfg f81897a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Handler f81898b;

    /* JADX INFO: renamed from: c */
    @gib
    public Runnable f81899c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Object f81900d;

    /* JADX INFO: renamed from: e */
    public long f81901e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Executor f81902f;

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public int f81903g;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    public long f81904h;

    /* JADX INFO: renamed from: i */
    @gib
    @xc7("lock")
    public wfg f81905i;

    /* JADX INFO: renamed from: j */
    public boolean f81906j;

    /* JADX INFO: renamed from: k */
    @yfb
    public final Runnable f81907k;

    /* JADX INFO: renamed from: l */
    @yfb
    public final Runnable f81908l;

    /* JADX INFO: renamed from: si0$a */
    public static final class C12600a {
        public /* synthetic */ C12600a(jt3 jt3Var) {
            this();
        }

        private C12600a() {
        }
    }

    public si0(long j, @yfb TimeUnit timeUnit, @yfb Executor executor) {
        md8.checkNotNullParameter(timeUnit, "autoCloseTimeUnit");
        md8.checkNotNullParameter(executor, "autoCloseExecutor");
        this.f81898b = new Handler(Looper.getMainLooper());
        this.f81900d = new Object();
        this.f81901e = timeUnit.toMillis(j);
        this.f81902f = executor;
        this.f81904h = SystemClock.uptimeMillis();
        this.f81907k = new Runnable() { // from class: qi0
            @Override // java.lang.Runnable
            public final void run() {
                si0.executeAutoCloser$lambda$0(this.f74481a);
            }
        };
        this.f81908l = new Runnable() { // from class: ri0
            @Override // java.lang.Runnable
            public final void run() {
                si0.autoCloser$lambda$3(this.f78370a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(si0 si0Var) {
        bth bthVar;
        md8.checkNotNullParameter(si0Var, "this$0");
        synchronized (si0Var.f81900d) {
            try {
                if (SystemClock.uptimeMillis() - si0Var.f81904h < si0Var.f81901e) {
                    return;
                }
                if (si0Var.f81903g != 0) {
                    return;
                }
                Runnable runnable = si0Var.f81899c;
                if (runnable != null) {
                    runnable.run();
                    bthVar = bth.f14751a;
                } else {
                    bthVar = null;
                }
                if (bthVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                wfg wfgVar = si0Var.f81905i;
                if (wfgVar != null && wfgVar.isOpen()) {
                    wfgVar.close();
                }
                si0Var.f81905i = null;
                bth bthVar2 = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(si0 si0Var) {
        md8.checkNotNullParameter(si0Var, "this$0");
        si0Var.f81902f.execute(si0Var.f81908l);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.f81900d) {
            try {
                this.f81906j = true;
                wfg wfgVar = this.f81905i;
                if (wfgVar != null) {
                    wfgVar.close();
                }
                this.f81905i = null;
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.f81900d) {
            try {
                int i = this.f81903g;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i2 = i - 1;
                this.f81903g = i2;
                if (i2 == 0) {
                    if (this.f81905i == null) {
                        return;
                    } else {
                        this.f81898b.postDelayed(this.f81907k, this.f81901e);
                    }
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V executeRefCountingFunction(@yfb qy6<? super wfg, ? extends V> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        try {
            return qy6Var.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @gib
    public final wfg getDelegateDatabase$room_runtime_release() {
        return this.f81905i;
    }

    @yfb
    public final xfg getDelegateOpenHelper() {
        xfg xfgVar = this.f81897a;
        if (xfgVar != null) {
            return xfgVar;
        }
        md8.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.f81904h;
    }

    @gib
    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.f81899c;
    }

    public final int getRefCount$room_runtime_release() {
        return this.f81903g;
    }

    @fdi
    public final int getRefCountForTest$room_runtime_release() {
        int i;
        synchronized (this.f81900d) {
            i = this.f81903g;
        }
        return i;
    }

    @yfb
    public final wfg incrementCountAndEnsureDbIsOpen() {
        synchronized (this.f81900d) {
            this.f81898b.removeCallbacks(this.f81907k);
            this.f81903g++;
            if (this.f81906j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            wfg wfgVar = this.f81905i;
            if (wfgVar != null && wfgVar.isOpen()) {
                return wfgVar;
            }
            wfg writableDatabase = getDelegateOpenHelper().getWritableDatabase();
            this.f81905i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void init(@yfb xfg xfgVar) {
        md8.checkNotNullParameter(xfgVar, "delegateOpenHelper");
        setDelegateOpenHelper(xfgVar);
    }

    public final boolean isActive() {
        return !this.f81906j;
    }

    public final void setAutoCloseCallback(@yfb Runnable runnable) {
        md8.checkNotNullParameter(runnable, "onAutoClose");
        this.f81899c = runnable;
    }

    public final void setDelegateDatabase$room_runtime_release(@gib wfg wfgVar) {
        this.f81905i = wfgVar;
    }

    public final void setDelegateOpenHelper(@yfb xfg xfgVar) {
        md8.checkNotNullParameter(xfgVar, "<set-?>");
        this.f81897a = xfgVar;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j) {
        this.f81904h = j;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(@gib Runnable runnable) {
        this.f81899c = runnable;
    }

    public final void setRefCount$room_runtime_release(int i) {
        this.f81903g = i;
    }
}
