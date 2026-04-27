package p000;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class i3e {

    /* JADX INFO: renamed from: l */
    public static final int f45581l = 1000;

    /* JADX INFO: renamed from: m */
    public static final int f45582m = 60000;

    /* JADX INFO: renamed from: n */
    public static final int f45583n = 3600000;

    /* JADX INFO: renamed from: o */
    public static final int f45584o = 2000;

    /* JADX INFO: renamed from: a */
    public final double f45585a;

    /* JADX INFO: renamed from: b */
    public final double f45586b;

    /* JADX INFO: renamed from: c */
    public final long f45587c;

    /* JADX INFO: renamed from: d */
    public final long f45588d;

    /* JADX INFO: renamed from: e */
    public final int f45589e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<Runnable> f45590f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f45591g;

    /* JADX INFO: renamed from: h */
    public final zgh<z33> f45592h;

    /* JADX INFO: renamed from: i */
    public final n2c f45593i;

    /* JADX INFO: renamed from: j */
    public int f45594j;

    /* JADX INFO: renamed from: k */
    public long f45595k;

    /* JADX INFO: renamed from: i3e$b */
    public final class RunnableC7128b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final q43 f45596a;

        /* JADX INFO: renamed from: b */
        public final TaskCompletionSource<q43> f45597b;

        @Override // java.lang.Runnable
        public void run() {
            i3e.this.sendReport(this.f45596a, this.f45597b);
            i3e.this.f45593i.resetDroppedOnDemandExceptions();
            double dCalcDelay = i3e.this.calcDelay();
            ej9.getLogger().m10061d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dCalcDelay / 1000.0d)) + " s for report: " + this.f45596a.getSessionId());
            i3e.sleep(dCalcDelay);
        }

        private RunnableC7128b(q43 q43Var, TaskCompletionSource<q43> taskCompletionSource) {
            this.f45596a = q43Var;
            this.f45597b = taskCompletionSource;
        }
    }

    public i3e(zgh<z33> zghVar, a7f a7fVar, n2c n2cVar) {
        this(a7fVar.f580f, a7fVar.f581g, ((long) a7fVar.f582h) * 1000, zghVar, n2cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, (60000.0d / this.f45585a) * Math.pow(this.f45586b, calcStep()));
    }

    private int calcStep() {
        if (this.f45595k == 0) {
            this.f45595k = now();
        }
        int iNow = (int) ((now() - this.f45595k) / this.f45587c);
        int iMin = isQueueFull() ? Math.min(100, this.f45594j + iNow) : Math.max(0, this.f45594j - iNow);
        if (this.f45594j != iMin) {
            this.f45594j = iMin;
            this.f45595k = now();
        }
        return iMin;
    }

    private boolean isQueueAvailable() {
        return this.f45590f.size() < this.f45589e;
    }

    private boolean isQueueFull() {
        return this.f45590f.size() == this.f45589e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushScheduledReportsIfAble$0(CountDownLatch countDownLatch) {
        try {
            bq6.sendBlocking(this.f45592h, acd.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, boolean z, q43 q43Var, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(q43Var);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendReport(final q43 q43Var, final TaskCompletionSource<q43> taskCompletionSource) {
        ej9.getLogger().m10061d("Sending report through Google DataTransport: " + q43Var.getSessionId());
        final boolean z = SystemClock.elapsedRealtime() - this.f45588d < 2000;
        this.f45592h.schedule(p55.ofUrgent(q43Var.getReport()), new qhh() { // from class: h3e
            @Override // p000.qhh
            public final void onSchedule(Exception exc) {
                this.f42177a.lambda$sendReport$1(taskCompletionSource, z, q43Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    @igg({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: g3e
            @Override // java.lang.Runnable
            public final void run() {
                this.f38333a.lambda$flushScheduledReportsIfAble$0(countDownLatch);
            }
        }).start();
        f1i.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: g */
    public TaskCompletionSource<q43> m12760g(q43 q43Var, boolean z) {
        synchronized (this.f45590f) {
            try {
                TaskCompletionSource<q43> taskCompletionSource = new TaskCompletionSource<>();
                if (!z) {
                    sendReport(q43Var, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f45593i.incrementRecordedOnDemandExceptions();
                if (!isQueueAvailable()) {
                    calcStep();
                    ej9.getLogger().m10061d("Dropping report due to queue being full: " + q43Var.getSessionId());
                    this.f45593i.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(q43Var);
                    return taskCompletionSource;
                }
                ej9.getLogger().m10061d("Enqueueing report: " + q43Var.getSessionId());
                ej9.getLogger().m10061d("Queue size: " + this.f45590f.size());
                this.f45591g.execute(new RunnableC7128b(q43Var, taskCompletionSource));
                ej9.getLogger().m10061d("Closing task for report: " + q43Var.getSessionId());
                taskCompletionSource.trySetResult(q43Var);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @igg({"ThreadPoolCreation"})
    public i3e(double d, double d2, long j, zgh<z33> zghVar, n2c n2cVar) {
        this.f45585a = d;
        this.f45586b = d2;
        this.f45587c = j;
        this.f45592h = zghVar;
        this.f45593i = n2cVar;
        this.f45588d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f45589e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f45590f = arrayBlockingQueue;
        this.f45591g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f45594j = 0;
        this.f45595k = 0L;
    }
}
